package org.sudaPro.web.board.service;

import java.util.List;

import org.sudaPro.web.board.vo.BoardAll;
import org.sudaPro.web.board.vo.BoardOne;
import org.sudaPro.web.board.vo.ChildComm;
import org.sudaPro.web.board.vo.Comments;

public interface BoardService {
	public List<BoardAll> getBoardAll();
	public BoardOne getBoardOne(int b_code);
	public List<Comments> getComments(int b_code);
	public List<String> getImges(int b_code);
	public List<ChildComm> getChildComments(int cm_group);
}
