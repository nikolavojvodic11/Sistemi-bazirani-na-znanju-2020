package com.sbnz.berza.interfaces.services;

import com.sbnz.berza.DTO.QualityParamDTO;

public interface QualityParamServiceInterface extends ServiceInterface<QualityParamDTO> {
	
	
	public QualityParamDTO getZitariceStandardQualityParam();
	public QualityParamDTO getByCode(String code);
	

}
