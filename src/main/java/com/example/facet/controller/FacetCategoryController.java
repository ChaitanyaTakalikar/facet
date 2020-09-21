package com.example.facet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.facet.model.FacetCategoryModel;
import com.example.facet.service.FacetCategoryService;

@RestController
@RequestMapping("asset")
public class FacetCategoryController {

	@Autowired
	private FacetCategoryService testService;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FacetCategoryModel> getFacetCategory() {
		return testService.getFacetCategory();
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean saveFacetCategory(@RequestBody FacetCategoryModel testModel) {
		return testService.saveFacetCategory(testModel);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean updateFacetCategory(@RequestBody FacetCategoryModel testModel) {
		return testService.updateFacetCategory(testModel);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public boolean deleteFacetCategory(@RequestParam Long id) {
		return testService.deleteFacetCategory(id);
	}
	
}
