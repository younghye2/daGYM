<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
    <%@ include file="../common/header.jsp"%>
    <div class="row my-5">
        <%@ include file="sideMenu.jsp"%>
        <div class="col-sm-5">
            <form action="${contextPath}/member/purchase.do" method="POST"
                onsubmit="return validate();">
                    <h1>마이페이지</h1>
                    <div class="row mb-3 form-row">
                <table class="table table-hover">
                    	<tr>
                        </tr>
                	</table>
                </div>
            </form>
        </div>
    </div>
    <script>
    	
    </script>
    <%@ include file="../common/footer.jsp"%><br>
</body>
</html>