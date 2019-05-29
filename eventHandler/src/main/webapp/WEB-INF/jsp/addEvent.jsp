<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.errorText{
color: #ff0000;
}

.errorBanner{
color:#000000;
background-color: #ffeeee;
}
</style>
</head>
<body>

	<form:form commandName="event">
		<div>
			<h1>Add Event</h1>
		</div>
		<div>Enter event Name</div>
		<div>
			<form:input path="eventName" />
		</div>
	</form:form>
</body>
</html>