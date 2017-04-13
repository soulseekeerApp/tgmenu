package com.example.hybrisarchitecture.facade.populator;

/**
 * This class its a Populator interface we must implement it and override methods on it
 * it will take care of setting values for the target
 * @author KC
 *
 * @param <J> represents the Model Object in other words the source
 * @param <K> represent the Data Object in other words the target
 */
public interface GenericPopulator<J, K>
{
	public void populate(final J source,final  K target);

}
