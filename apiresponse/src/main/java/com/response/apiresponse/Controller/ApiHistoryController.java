package com.response.apiresponse.Controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.response.apiresponse.Entity.ApiResponse;
import com.response.apiresponse.Service.ApiResponseService;

@RestController
@RequestMapping("api/history")
@CrossOrigin(origins = "http://localhost:3000")
public class ApiHistoryController {

@Autowired
   private ApiResponseService apiResponseService;

    @GetMapping
    public ResponseEntity<List<ApiResponse>> getAllApiResponses() {
        try {
            List<ApiResponse> history = apiResponseService.getAllApiResponses();
            return ResponseEntity.ok(history);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApiResponse(@PathVariable Long id) {
    try {
      apiResponseService.deleteApiResponse(id);
      return ResponseEntity.noContent().build();
    } catch (Exception e) {
      e.printStackTrace();
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }
}
