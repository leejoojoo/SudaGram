package org.sudaPro.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	@RequestMapping("boardAll")
	public String findPerson() {
		return "board.boardAll";
	}
}
