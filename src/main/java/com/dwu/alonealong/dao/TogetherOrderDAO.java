package com.dwu.alonealong.dao;

import org.springframework.dao.DataAccessException;

import com.dwu.alonealong.domain.TogetherOrder;

public interface TogetherOrderDAO {
	
	void insertTogetherOrder(TogetherOrder togetherOrder) throws DataAccessException;
	
	void removeTogetherOrder(TogetherOrder togetherOrder) throws DataAccessException;
	
}
