package com.sbnz.berza.interfaces.services;

import java.util.List;

public interface ServiceInterface<T> {
	
	public T Create(T dto);
	public T Read(long id);
	public List<T> ReadAll();
	public T Update(T dto);
	public T Delete(long id);
	

}
