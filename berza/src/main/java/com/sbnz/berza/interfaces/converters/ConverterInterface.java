package com.sbnz.berza.interfaces.converters;

public interface ConverterInterface <D , E> {
	
	public D entityToDto(E entity);

	public E DtoToEntity(D dto);


}
