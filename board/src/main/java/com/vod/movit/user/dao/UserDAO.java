package com.vod.movit.user.dao;

import com.vod.movit.user.vo.UserVO;

public interface UserDAO {

	UserVO selectByEmail(String u_email);

	UserVO selectById(String u_id);

	UserVO selectByName(String u_name);

	UserVO selectByPhone(String u_phone);

	void insertUser(UserVO user);

	boolean loginCheck(UserVO user);

	UserVO viewUser(UserVO user);

}
