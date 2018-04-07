package com.nav.target.exception.mapper;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.nav.target.exception.OffensiveCommentException;
@Component
public class OffensiveCommentHandler {

	@ResponseStatus(value=HttpStatus.NOT_ACCEPTABLE, reason="Offensive Comment")
	@ExceptionHandler(OffensiveCommentException.class)
	public void exceptionHandler() 
	{
		System.out.println("OFFENSIVE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
