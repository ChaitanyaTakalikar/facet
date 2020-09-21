package com.example.facet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.facet.model.FacetModel;
import com.example.facet.service.FacetService;

@RestController
@RequestMapping("facet")
public class FacetController {

	@Autowired
	private FacetService facetService;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FacetModel> getFacet() {
		return facetService.getFacet();
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean saveFacet(@RequestBody FacetModel testModel) {
		return facetService.saveFacet(testModel);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean updateFacet(@RequestBody FacetModel testModel) {
		return facetService.updateFacet(testModel);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public boolean deleteFacet(@RequestParam Long id) {
		return facetService.deleteFacet(id);
	}
	
}
