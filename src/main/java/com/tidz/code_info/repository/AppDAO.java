package com.tidz.code_info.repository;

import com.tidz.code_info.model.Programmer;

public interface AppDAO {
	
	Programmer findProgrammerById(Long id);

	void save(Programmer programmer);
	
	void update(Programmer programmer);

}
