package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.dao.MemberDAO;
import kr.co.ch05.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;
	
	public List<MemberVO> selectMembers() {
		return dao.selectMembers();
	}
	
	public void insertMember(MemberVO vo) {
		dao.insertMember(vo);
	}
	
	public MemberVO selectMember(String id) {
		return dao.selectMember(id);
	}
	
	public void updateMember(MemberVO vo) {
		dao.updateMember(vo);
	}
	
	public void deleteMember(String id) {
		dao.deleteMember(id);
	}
}
