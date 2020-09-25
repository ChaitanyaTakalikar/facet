package com.example.facet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FacetModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String facetCode;
	private String facetDisplayName;
	private String status;
	private String displayOrder;
	private String roles;
	private String permission1;
	private String permission2;
	private String permission3;

	public FacetModel() {}
	
	public FacetModel(String facetCode, String facetDisplayName, String status, String displayOrder,
			String roles, String permission1, String permission2, String permission3) {
		super();
		this.facetCode = facetCode;
		this.facetDisplayName = facetDisplayName;
		this.status = status;
		this.displayOrder = displayOrder;
		this.roles = roles;
		this.permission1 = permission1;
		this.permission2 = permission2;
		this.permission3 = permission3;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFacetCode() {
		return facetCode;
	}

	public void setFacetCode(String facetCode) {
		this.facetCode = facetCode;
	}
	
	public String getFacetDisplayName() {
		return facetDisplayName;
	}

	public void setFacetDisplayName(String facetDisplayName) {
		this.facetDisplayName = facetDisplayName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(String displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getPermission1() {
		return permission1;
	}

	public void setPermission1(String permission1) {
		this.permission1 = permission1;
	}

	public String getPermission2() {
		return permission2;
	}

	public void setPermission2(String permission2) {
		this.permission2 = permission2;
	}

	public String getPermission3() {
		return permission3;
	}

	public void setPermission3(String permission3) {
		this.permission3 = permission3;
	}
	
}
