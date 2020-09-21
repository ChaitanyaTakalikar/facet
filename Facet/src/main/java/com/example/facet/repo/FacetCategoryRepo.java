package com.example.facet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facet.model.FacetCategoryModel;

@Repository
public interface FacetCategoryRepo extends JpaRepository<FacetCategoryModel, Long> {}
