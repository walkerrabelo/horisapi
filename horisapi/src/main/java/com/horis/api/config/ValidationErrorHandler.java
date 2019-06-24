package com.horis.api.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.horis.api.dto.ValidationErrorMessageDto;

@RestControllerAdvice
public class ValidationErrorHandler {
	
	@Autowired
	private MessageSource messageSource;
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)	
	public List<ValidationErrorMessageDto> errorHandler(MethodArgumentNotValidException expection) {
		
		List<ValidationErrorMessageDto> errorMessageDtos = new ArrayList<ValidationErrorMessageDto>();
		
		List<FieldError> fieldErrors = expection.getBindingResult().getFieldErrors();
		
		fieldErrors.forEach(error -> {
			String message = messageSource.getMessage(error, LocaleContextHolder.getLocale());
			ValidationErrorMessageDto errorMessageDto = new ValidationErrorMessageDto(error.getField(), message);
			errorMessageDtos.add(errorMessageDto);
		});
		
		return errorMessageDtos;
	}

}
