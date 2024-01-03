package com.response.apiresponse.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.response.apiresponse.Entity.ApiResponse;
import com.response.apiresponse.Service.ApiResponseService;

@RestController
@RequestMapping("/api/response")
@CrossOrigin
public class ApiResponseController {

   @Autowired
   private ApiResponseService apiResponseService;

   @PostMapping
   public ResponseEntity<ApiResponse> saveApiResponse(@RequestBody ApiResponse apiResponse){
        try {
            ApiResponse savedResponse = apiResponseService.saveApiResponse(apiResponse);
            return ResponseEntity.ok(savedResponse); 
        } catch (Exception e) {
            e.printStackTrace();
             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse("Error saving ApiResponse", HttpStatus.INTERNAL_SERVER_ERROR.value()));
        }
   }
}

