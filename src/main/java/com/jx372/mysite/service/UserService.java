package com.jx372.mysite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jx372.mysite.repository.UserDao;
import com.jx372.mysite.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void join( UserVo userVo ) {
		//1.DB에 사용정보 저장
		userDao.insert( userVo );
		
		//2. 인증 메일 보내기
	}
}
