package com.example.facet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.facet.model.FacetModel;

public interface FacetRepo extends JpaRepository<FacetModel, Long> {}
