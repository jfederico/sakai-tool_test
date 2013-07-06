package org.sakaiproject.test.logic;

import java.util.List;

import org.sakaiproject.test.model.Thing;

/**
 * An example logic interface
 * 
 * @author Steve Swinsburg (steve.swinsburg@anu.edu.au)
 *
 */
public interface ProjectLogic {

	/**
	 * Get a Thing
	 * @return
	 */
	public Thing getThing(long id);
	
	/**
	 * Get all Things
	 * @return
	 */
	public List<Thing> getThings();
	
	/**
	 * Add a new Thing
	 * @param t	Thing
	 * @return boolean if success, false if not
	 */
	public boolean addThing(Thing t);
}
