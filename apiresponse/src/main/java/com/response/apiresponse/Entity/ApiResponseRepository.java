package com.response.apiresponse.Entity;

import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiResponseRepository extends CrudRepository<ApiResponse, Long>{
  
    List<ApiResponse> findAll();
}
