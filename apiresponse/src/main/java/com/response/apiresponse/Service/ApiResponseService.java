package com.response.apiresponse.Service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.response.apiresponse.Entity.ApiResponse;
import com.response.apiresponse.Entity.ApiResponseRepository;

@Service
public class ApiResponseService {
 
    @Autowired
    private ApiResponseRepository apiResponseRepository;

    public ApiResponse saveApiResponse(ApiResponse apiResponse) {
        return apiResponseRepository.save(apiResponse);
    }

    public List<ApiResponse> getAllApiResponses() {
        return apiResponseRepository.findAll();
    }
    
    public void deleteApiResponse(Long id) {
        apiResponseRepository.deleteById(id);
    }
}
