package com.jxanyway.aegir.dao;

import com.jxanyway.aegir.model.UserDetailsModel;

public interface UserDetailsDao {
	
	public UserDetailsModel FindUserDetails(String userLogin_guid);

}
