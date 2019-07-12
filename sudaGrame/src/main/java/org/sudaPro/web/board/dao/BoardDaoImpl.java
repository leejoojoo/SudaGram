package org.sudaPro.web.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.sudaPro.web.board.vo.BoardAll;
import org.sudaPro.web.board.vo.BoardOne;
import org.sudaPro.web.board.vo.ChildComm;
import org.sudaPro.web.board.vo.Comments;

@Repository
public class BoardDaoImpl implements BoardDao{
	@Inject
	private SqlSession session;
	
	private static String namespace = "org.suda.mapper.BoardMapper";
	
	@Override
	public List<BoardAll> getBoardAll() {
		return session.selectList(namespace+".boardAll");
	}
	@Override
	public BoardOne getBoardOne(int b_code) {
		return session.selectOne(namespace+".boardOne", b_code);
	}
	@Override
	public List<Comments> getComments(int b_code) {
		return session.selectList(namespace+".boardComments", b_code);
	}
	@Override
	public List<String> getImges(int b_code) {
		return session.selectList(namespace+".boardImg", b_code);
	}
	@Override
	public List<ChildComm> getChildComm(int cm_group) {
		return session.selectList(namespace + ".childComment", cm_group);
	}
}
