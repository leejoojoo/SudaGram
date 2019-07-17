package org.sudaPro.web.board.vo;

import java.util.Date;
import java.util.List;

public class Comments {
	private String cm_content;
	private Date cm_date;
	private String m_id;
	private List<ChildComm> childComm;
	private int cm_code;
	
	public String getCm_content() {
		return cm_content;
	}
	public void setCm_content(String cm_content) {
		this.cm_content = cm_content;
	}
	public Date getCm_date() {
		return cm_date;
	}
	public void setCm_date(Date cm_date) {
		this.cm_date = cm_date;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public List<ChildComm> getChildComm() {
		return childComm;
	}
	public void setChildComm(List<ChildComm> childComm) {
		this.childComm = childComm;
	}
	public int getCm_code() {
		return cm_code;
	}
	public void setCm_code(int cm_code) {
		this.cm_code = cm_code;
	}
}
