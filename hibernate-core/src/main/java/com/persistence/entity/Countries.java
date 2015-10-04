/**
 * 
 */
package com.persistence.entity;

import java.io.Serializable;

public class Countries implements Serializable {
	
	private String countryId;
	private String countryName;
	private Integer regionId;
	
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Integer getRegionId() {
		return regionId;
	}
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	@Override
	public String toString() {
		return "Countries [countryId=" + countryId + ", countryName=" + countryName + ", regionId=" + regionId + "]";
	}
	
	
}
