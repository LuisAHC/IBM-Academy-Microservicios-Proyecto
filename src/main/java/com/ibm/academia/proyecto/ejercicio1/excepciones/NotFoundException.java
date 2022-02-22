package com.ibm.academia.proyecto.ejercicio1.excepciones;

public class NotFoundException extends RuntimeException {
	public NotFoundException(String mensaje)
	{
		super(mensaje);
	}
}