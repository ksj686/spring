package com.spring.myapp.Service;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

import com.spring.myapp.dao.MemberDAO;
import com.spring.myapp.vo.MemberVO;

@Service
public class MemberService implements MemberServiceImple{
	@Inject
	private MemberDAO dao;

	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

	public MemberVO selectMember() throws Exception {
		return dao.selectMember();
	}
}
