package com.ibm.academia.proyecto.ejercicio1.excepciones;

public class BadRequestException extends RuntimeException {
	public BadRequestException(String mensaje)
	{
		super(mensaje);
	}
}