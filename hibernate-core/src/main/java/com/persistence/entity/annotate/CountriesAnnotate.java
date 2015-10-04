/**
 * 
 */
package com.persistence.entity.annotate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRIES")
public class CountriesAnnotate implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "country_id")
	private String countryId;

	@Column(name = "country_name")
	private String countryName;

	@Column(name = "region_id")
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
		return "CountriesAnnotate [countryId=" + countryId + ", countryName=" + countryName + ", regionId=" + regionId
				+ "]";
	}
	
	
}
