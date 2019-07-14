package org.sudaPro.web.board.dao;

import java.util.List;

import org.sudaPro.web.board.vo.BoardAll;
import org.sudaPro.web.board.vo.BoardOne;
import org.sudaPro.web.board.vo.ChildComm;
import org.sudaPro.web.board.vo.Comments;

public interface BoardDao {
	public List<BoardAll> getBoardAll(String sort);
	public BoardOne getBoardOne(int b_code);
	public List<Comments> getComments(int b_code);
	public List<String> getImges(int b_code);
	public List<ChildComm> getChildComm(int cm_group);
}
