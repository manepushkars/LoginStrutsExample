package com.jlcindia.struts1;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm{
	private String username ="Srinivas";
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public void reset(ActionMapping am, HttpServletRequest req) {
		this.username = "jlcindia";
		this.password = null;
	}
	@Override
	public ActionErrors validate(ActionMapping am, HttpServletRequest req) {
		ActionErrors errors = new ActionErrors();
		if(username == null || username.length() ==0) {
		}
		return errors;
	}
	
}
