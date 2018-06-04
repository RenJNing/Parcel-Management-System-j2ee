<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="static/js/jquery.js"></script>
<script type="text/javascript">  
     $(document).ready(function(){			         
			$.ajax({
				type:"POST",
				url:"mvc/getJson", 
	            dataType:"json",      
	            contentType:"application/json",               
	            data:'[{"name":"bill","age":"101"}, {"name":"adams","age":"202"}]', 
	            success:function(data){ 
	            	$.each(data,function(index, entity) {
	            		alert(entity.name + ", " + entity.age);
	            	});
	            },
	            error: function (jqXHR, textStatus, errorThrown) {
	                alert(jqXHR.responseText);
	            }
         	});
			console.log("123");
    }); 
</script>
</head>
<body>
Hello Again!
</body>
</html>