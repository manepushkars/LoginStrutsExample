<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<!DOCTYPE html>
<html>
	<body>
		<h1>Java Learning Center</h1>
	<h2>Login Form</h2>
	<font color="red" size="5">${EMSG }</font>
	<html:form action="/LoginSubmit">
		<table>
			<tr>
				<td>
					<bean:message key="label.login.un"/>
				</td>
				<td>
					<html:text property="Username"/>
				</td>
				<td>
					<bean:message key="label.login.pw"/>
				</td>
				<td>
					<html:text property="Password"/>
				</td>
			</tr>
			<tr>
				<td><html:submit value="Login Now"/></td>
			</tr>
		</table>
	</body>
</html>