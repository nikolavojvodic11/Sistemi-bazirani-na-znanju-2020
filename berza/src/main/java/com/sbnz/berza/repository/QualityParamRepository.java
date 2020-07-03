package com.sbnz.berza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.berza.model.Qualityparam;

public interface QualityParamRepository extends JpaRepository<Qualityparam , Long> {
	
	public Qualityparam getQualityParamByParamCode(String code);

}
