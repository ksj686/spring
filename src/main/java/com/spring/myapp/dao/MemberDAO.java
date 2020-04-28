package com.spring.myapp.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.myapp.vo.MemberVO;

@Repository
public class MemberDAO implements MemberDAOImple{
	@Autowired
	private SqlSession sqlSession;
	
	public MemberVO selectMember() throws Exception {
		return sqlSession.selectOne("memMapper.selectMember");
	}
}
