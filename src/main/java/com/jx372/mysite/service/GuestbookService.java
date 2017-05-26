package com.jx372.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jx372.mysite.repository.GuestbookDao;
import com.jx372.mysite.vo.GuestbookVo;
import com.jx372.mysite.vo.UserVo;

@Service
public class GuestbookService {
	
	@Autowired
	private GuestbookDao guestbookDao;
	
	public List<GuestbookVo> getList( ) {
		return guestbookDao.getList();
	}
	
	
	
	public void  insert(GuestbookVo guestbookVo ){
		guestbookDao.insert(guestbookVo);
	}
	
}
