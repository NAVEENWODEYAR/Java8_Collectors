package com.collectors.exception;

import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler
	public Map<String,String> invalidArgumentHandler(MethodArgumentNotValidException exception){
		Map<String,String> errorMap = new HashMap<>();
		exception.getBindingResult()
			.getAllErrors()
				.forEach(err->{
					errorMap.put(err.getCode(), err.getDefaultMessage());
					});
		return errorMap;
	}
	
}
