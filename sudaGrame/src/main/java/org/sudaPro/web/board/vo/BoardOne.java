package org.sudaPro.web.board.vo;

import java.util.Date;

public class BoardOne {
	private String m_id;
	private String b_content;
	private String m_name;
	private Date b_regdate;
	private int g_cnt;
	
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public Date getB_regdate() {
		return b_regdate;
	}
	public void setB_regdate(Date b_regdate) {
		this.b_regdate = b_regdate;
	}
	public int getG_cnt() {
		return g_cnt;
	}
	public void setG_cnt(int g_cnt) {
		this.g_cnt = g_cnt;
	}
}
