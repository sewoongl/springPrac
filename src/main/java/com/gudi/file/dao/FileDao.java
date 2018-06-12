package com.gudi.file.dao;

import java.util.HashMap;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.SessionAttribute;

@Repository
public class FileDao implements FileDaoInterface {
	
	@Resource(name="sqlSession")
	SqlSession Session;
	
	@Override
	public int insert(HashMap<String, Object> param) {
		
		
		return Session.insert("file.insert", param);
	}

}
