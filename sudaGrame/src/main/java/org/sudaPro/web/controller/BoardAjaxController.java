package org.sudaPro.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sudaPro.web.board.service.BoardService;
import org.sudaPro.web.board.vo.ChildComm;


@RestController
public class BoardAjaxController {
	@Autowired
	private BoardService boardService;
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@RequestMapping("board/ChildComment")
	public List<ChildComm> getChildComment(int cm_group){
		return this.boardService.getChildComments(cm_group);
	}
}
