package com.example.facet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.facet.model.FacetCategoryModel;
import com.example.facet.service.FacetCategoryService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("asset")
public class FacetCategoryController {

	@Autowired
	private FacetCategoryService testService;
	
	@GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Find all categories", notes = "Just hit \"send\" button",response=FacetCategoryController.class)
	public List<FacetCategoryModel> getFacetCategory() {
		return testService.getFacetCategory();
	}
	
	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean saveFacetCategory(@RequestBody FacetCategoryModel testModel) {
		return testService.saveFacetCategory(testModel);
	}
	
	@PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean updateFacetCategory(@RequestBody FacetCategoryModel testModel) {
		return testService.updateFacetCategory(testModel);
	}
	
	@DeleteMapping(value = "/delete")
	public boolean deleteFacetCategory(@RequestParam Long id) {
		return testService.deleteFacetCategory(id);
	}
	
	@GetMapping(value = "/getOne", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FacetCategoryModel> getSpecificCategory(@RequestParam String name) {
		return testService.getSpecificCategory(name);
	}
	
}
