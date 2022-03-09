package com.niftem2.app.exception;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {
    // error handle for @Valid
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status, WebRequest request) {
        Map<String, Object> body = new LinkedHashMap<>();
      //  body.put("timestamp", new Date());
        body.put("status", "2");
        //Get all errors
        List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(x -> x.getDefaultMessage())
                .collect(Collectors.toList());
        		
        body.put("message", errors.get(0));
        return new ResponseEntity<>(body, headers, status);

        //Map<String, String> fieldErrors = ex.getBindingResult().getFieldErrors().stream().collect(
        //        Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));

    }
   @ExceptionHandler(ConstraintViolationException.class)
   protected ResponseEntity<Object> handleConstraintViolation(ConstraintViolationException ex,HttpHeaders headers,
            HttpStatus status,
    WebRequest request) {
    	Map<String, Object> body = new LinkedHashMap<>();
          body.put("status", "2");
          //Get all errors
          BaseStream<Object,Stream<Object>> errors = ex.getConstraintViolations()
        		  .stream()
        		  .map(x -> x.getRootBeanClass());
        		//  .collect(Collectors.toList()));
         // .stream().collect(Collectors.toList());
                 	
          body.put("message", errors);
          return new ResponseEntity<>(body, headers, status);
      }
    
	/*
	 * @Override protected ResponseEntity<Object>
	 * handleMissingServletRequestParameter( MissingServletRequestParameterException
	 * ex, HttpHeaders headers, HttpStatus status, WebRequest request) { String
	 * error = ex.getParameterName() + " parameter is missing";
	 * 
	 * Map<String, Object> body = new LinkedHashMap<>(); body.put("status", "2");
	 * //Get all errors String errors = ex.getLocalizedMessage();
	 * 
	 * body.put("message", errors.toString()); return new ResponseEntity<Object>(
	 * body,new HttpHeaders(), status); }
	 */
    }


