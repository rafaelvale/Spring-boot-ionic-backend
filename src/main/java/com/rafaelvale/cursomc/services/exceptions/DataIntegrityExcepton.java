package com.rafaelvale.cursomc.services.exceptions;

public class DataIntegrityExcepton extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DataIntegrityExcepton(String msg) {
		super(msg);
	}
	
	public DataIntegrityExcepton(String msg, Throwable cause) {
		super(msg, cause);
	}

}
