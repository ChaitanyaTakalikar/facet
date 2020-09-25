package com.example.facet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facet.model.FacetModel;

@Repository
public interface FacetRepo extends JpaRepository<FacetModel, Long> {}
