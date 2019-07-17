package org.sudaPro.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sudaPro.web.board.service.BoardService;
import org.sudaPro.web.board.vo.BoardAll;
import org.sudaPro.web.board.vo.ChildComm;
import org.sudaPro.web.board.vo.Comments;


@RestController
public class BoardAjaxController {
	@Autowired
	private BoardService boardService;
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@RequestMapping("boardSort")
	public List<BoardAll> getBoardSort(String sort){
		return this.boardService.getBoardAll(sort);
	}
	
	@RequestMapping("childComments")
	public List<ChildComm> getChildComm(int cm_group){
		return this.boardService.getChildComments(cm_group);
	}
	
	@RequestMapping("insertComm")
	public int insertComm(String pm_id, String content, int b_code, int group){
		System.out.printf("pm_id : %s, content: %s, b_code: %d, group: %d\n", pm_id, content, b_code, group);
		return this.boardService.insertComm(content, group, b_code, 4, pm_id);
	}
	
	@RequestMapping("printComm")
	public List<Comments> printComm(int b_code){
		return this.boardService.getComments(b_code);
	}
}
