package com.example.facet.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facet.model.FacetCategoryModel;
import com.example.facet.model.FacetModel;
import com.example.facet.repo.FacetCategoryRepo;

@Service
public class FacetCategoryService {

	@Autowired
	private FacetCategoryRepo testRepo;
	
	private boolean status = false;
	
	private final static Logger LOGGER=Logger.getLogger(FacetCategoryService.class.toString());
	
	public List<FacetCategoryModel> getFacetCategory() {
		LOGGER.info("Inside getFacetCategory");
		return testRepo.findAll();
	}

	public boolean saveFacetCategory(FacetCategoryModel testModel) {
		LOGGER.info("Inside saveFacetCategory");
		if (testModel != null) {
			try {
				FacetCategoryModel test = new FacetCategoryModel();
				test.setId(testModel.getId());
				test.setCategoryDisplayName(testModel.getCategoryDisplayName());
				test.setFacetType(testModel.getFacetType());
				test.setStatus(testModel.getStatus());
				test.setDisplayOrder(testModel.getDisplayOrder());
				test.setRangeStart(testModel.getRangeStart());
				test.setRangeEnd(testModel.getRangeEnd());
				test.setRangeGap(testModel.getRangeGap());

				FacetModel facetModel = new FacetModel("P123", "Prospectus", "Active", "1", "user", "permission1",
						"permission2", "permission3");
				test.getFacetModel().add(facetModel);

				FacetModel facetModel2 = new FacetModel("A123", "Amenities", "Active", "2", "user", "permission1",
						"permission2", "permission3");
				test.getFacetModel().add(facetModel2);

				testRepo.save(test);
				status = true;
			} catch (Exception e) {
				System.out.println("Exception occured in saving facet category" + e);
			}
		}
		return status;
	}

	public boolean updateFacetCategory(FacetCategoryModel testModel) {
		LOGGER.info("Inside updateFacetCategory");
		if (testModel != null) {
			try {
				testRepo.save(testModel);
				status = true;
			} catch (Exception e) {
				System.out.println("Exception occured in updating facet category" + e);
			}
		}
		return status;
	}

	public boolean deleteFacetCategory(Long id) {
		LOGGER.info("Inside deleteFacetCategory");
		try {
			testRepo.deleteById(id);
			status = true;
		} catch (Exception e) {
			System.out.println("Exception occured in deleting facet category" + e);
		}
		return status;
	}

	public List<FacetCategoryModel> getSpecificCategory(String name) {
		LOGGER.info("Getting specific cateory");
		return testRepo.selectByCategoryName(name);
	}
	
}
