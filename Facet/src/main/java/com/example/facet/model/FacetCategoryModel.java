package com.example.facet.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FacetCategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String categoryDisplayName;
	private String facetType;
	private String status;
	private String displayOrder;
	private String rangeStart;
	private String rangeEnd;
	private String rangeGap;
	private List<FacetModel> facetModel;

	public FacetCategoryModel() {}
	
	public FacetCategoryModel(Long id, String categoryDisplayName, String facetType, String status, String displayOrder,
			String rangeStart, String rangeEnd, String rangeGap) {
		super();
		this.id = id;
		this.categoryDisplayName = categoryDisplayName;
		this.facetType = facetType;
		this.status = status;
		this.displayOrder = displayOrder;
		this.rangeStart = rangeStart;
		this.rangeEnd = rangeEnd;
		this.rangeGap = rangeGap;
	}

	public FacetCategoryModel(Long id, String categoryDisplayName, String facetType, String status, String displayOrder,
			String rangeStart, String rangeEnd, String rangeGap, List<FacetModel> facetModel) {
		super();
		this.id = id;
		this.categoryDisplayName = categoryDisplayName;
		this.facetType = facetType;
		this.status = status;
		this.displayOrder = displayOrder;
		this.rangeStart = rangeStart;
		this.rangeEnd = rangeEnd;
		this.rangeGap = rangeGap;
		this.facetModel = facetModel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryDisplayName() {
		return categoryDisplayName;
	}

	public void setCategoryDisplayName(String categoryDisplayName) {
		this.categoryDisplayName = categoryDisplayName;
	}

	public String getFacetType() {
		return facetType;
	}

	public void setFacetType(String facetType) {
		this.facetType = facetType;
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

	public String getRangeStart() {
		return rangeStart;
	}

	public void setRangeStart(String rangeStart) {
		this.rangeStart = rangeStart;
	}

	public String getRangeEnd() {
		return rangeEnd;
	}

	public void setRangeEnd(String rangeEnd) {
		this.rangeEnd = rangeEnd;
	}

	public String getRangeGap() {
		return rangeGap;
	}

	public void setRangeGap(String rangeGap) {
		this.rangeGap = rangeGap;
	}
	
	public List<FacetModel> getFacetModel() {
		return facetModel;
	}

	public void setFacetModel(List<FacetModel> facetModel) {
		this.facetModel = facetModel;
	}

	@Override
	public String toString() {
		return "FacetCategoryModel [id=" + id + ", categoryDisplayName=" + categoryDisplayName + ", facetType="
				+ facetType + ", status=" + status + ", displayOrder=" + displayOrder + ", rangeStart=" + rangeStart
				+ ", rangeEnd=" + rangeEnd + ", rangeGap=" + rangeGap + ", facetModel=" + facetModel + "]";
	}

}
