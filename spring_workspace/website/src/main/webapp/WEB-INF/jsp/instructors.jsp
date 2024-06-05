<%@page import="java.util.HashMap" %>
<%@page import="java.util.ArrayList" %>
<h1>The instructors are here:</h1>
<% 
	ArrayList<HashMap<String,Object>> listOfInstructors  = (ArrayList<HashMap<String,Object>>) request.getAttribute("instructors");
	for(HashMap<String,Object> instructor: listOfInstructors){
		%>
		name: <%=instructor.get("name")%>
		<a href="profile/<%=instructor.get("id")%>"> Profile</a>
		<%
	}


%>