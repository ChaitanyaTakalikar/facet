package com.example.facet.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facet.model.FacetModel;
import com.example.facet.repo.FacetRepo;

@Service
public class FacetService {
	
	@Autowired
	private FacetRepo facetRepo;
	
	private Logger LOGGER=Logger.getLogger(FacetService.class.toString()); 
	
	private boolean status=false;

	public List<FacetModel> getFacet() {
		LOGGER.info("Inside getFacet");
		return facetRepo.findAll();
	}

	public boolean saveFacet(FacetModel testModel) {
		LOGGER.info("Inside saveFacet");
		if(testModel!=null) {
			try {
				FacetModel test=new FacetModel();
				test.setFacetCode(testModel.getFacetCode());
				facetRepo.save(test);
				status = true;
			} catch (Exception e) {
				System.out.println("Exception occured in saving facet"+e);
			}		
		}
		return status;
	}

	public boolean updateFacet(FacetModel testModel) {
		LOGGER.info("Inside updateFacet");
		if(testModel!=null) {
			try {
				facetRepo.save(testModel);
				status = true;
			} catch (Exception e) {
				System.out.println("Exception occured in updating facet category"+e);
			}			
		}
		return status;
	}

	public boolean deleteFacet(Long id) {
		LOGGER.info("Inside deleteFacet");
		try {
			facetRepo.deleteById(id);
			status=true;
		} catch (Exception e) {
			System.out.println("Exception occured in deleting facet category"+e);
		}
		return status;
	}

}
