package com.example.hybrisarchitecture.facade.converter;

/**
 * This its a Generic Class we must implement in our Converters and override methods
 * @author KC
 *
 * @param <J> its represent the Data Object the source
 * @param <K> it represent the Model Object the target
 */
public interface  GenericConverter <J, K>
{
	public K convert(final J source, final  K target);
	
	public K convert(final J source);

}
