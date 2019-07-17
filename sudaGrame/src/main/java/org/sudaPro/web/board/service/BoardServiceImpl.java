package org.sudaPro.web.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sudaPro.web.board.dao.BoardDao;
import org.sudaPro.web.board.vo.BoardAll;
import org.sudaPro.web.board.vo.BoardOne;
import org.sudaPro.web.board.vo.ChildComm;
import org.sudaPro.web.board.vo.Comments;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDao boardDao;
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	@Override
	public List<BoardAll> getBoardAll(String sort) {
		return this.boardDao.getBoardAll(sort);
	}
	@Override
	public BoardOne getBoardOne(int b_code) {
		return this.boardDao.getBoardOne(b_code);
	}
	@Override
	public List<Comments> getComments(int b_code) {
		List<Comments> buffer = this.boardDao.getComments(b_code);
		List<Comments> list = new ArrayList<>();
		for (int i = 0; i < buffer.size(); i++) {
			Comments comm = buffer.get(i);
			comm.setChildComm(this.boardDao.getChildComm(comm.getCm_code()));
			list.add(comm);
		}
		return list;
	}
	@Override
	public List<String> getImges(int b_code) {
		return this.boardDao.getImges(b_code);
	}

	@Override
	public List<ChildComm> getChildComments(int cm_group) {
		return this.boardDao.getChildComm(cm_group);
	}
	
}
