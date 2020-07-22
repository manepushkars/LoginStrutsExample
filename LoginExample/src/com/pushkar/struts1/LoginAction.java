package com.pushkar.struts1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action{
	String result = "";
	@Override
	public ActionForward execute(ActionMapping am, ActionForm af, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		LoginForm lf = (LoginForm) af;
		String un = lf.getUsername();
		String pw = lf.getPassword();
		if(un.equals(pw)) {
			result = "success";
		}
		ActionForward forward = am.findForward(result);
				return forward;
		
	}
}
