package com.corejsf;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class AutoComplete implements Serializable {

	private static final long serialVersionUID = 1L;

	public String[] getLocations() {
		return new String[] { 
				"Arvada", "Colorado Springs", "Baltimore",
				"Brittany", "Bahamas", "Belgrade", "Boulder", "Bayou",
				"Brighton", "Buffalo", "Denver", "Dixie", "Evergreen",
				"Ft. Collins", "Los Angeles", "Los Lobos", "Las Vegas",
				"Loveland", "Vail" 
		};
	}
}
