package com.horis.api.dto;

public class ValidationErrorMessageDto {

	private String field;
	private String error;
	
	/**
	 * @param field
	 * @param error
	 */
	public ValidationErrorMessageDto(String field, String error) {
		this.field = field;
		this.error = error;
	}
	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}
	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}
	
}
