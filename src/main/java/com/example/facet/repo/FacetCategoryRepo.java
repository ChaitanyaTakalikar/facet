package com.example.facet.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.facet.model.FacetCategoryModel;

@Repository
public interface FacetCategoryRepo extends JpaRepository<FacetCategoryModel, Long> {
	
	@Query("from FacetCategoryModel where categoryDisplayName=:name") 
	List<FacetCategoryModel> selectByCategoryName(@Param("name") String name);
	
}
