<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザー登録画面</title>
</head>
<body>
    <h1>ユーザー登録</h1>
    <form method="get" action="UserInsServlet">
        <table>
            <tr>
                <th>名前 :</th>
                <th><input type="text" size="20" name="name"
                    <%if (null != request.getSession().getAttribute("getName")) {%>
                    value="<%=request.getSession().getAttribute("getName")%>"
                    <%}%>> </text></th>
            </tr>
            <br>
            <tr>
                <th>ニックネーム :</th>
                <th><input type="text" size="20" name="nikk"
                    <%if (null != request.getSession().getAttribute("getNikk")) {%>
                    value="<%=request.getSession().getAttribute("getNikk")%>
                    <%}%>
                     ">
                    </text></th>
            </tr>
            <br>
            <th>メールアドレス :</th>
            <th><input type="text" size="20" name="mail"
                <%if (null != request.getSession().getAttribute("getMail")) {%>
                value="<%=request.getSession().getAttribute("getMail")%>
                    <%}%>
                    ">
                </text></th>
            </tr>
            <br>
            <tr>
                <th>パスワード :</th>
                <th><input type="text" size="20" name="pass"
                    <%if (null != request.getSession().getAttribute("getPass")) {%>
                    value="<%=request.getSession().getAttribute("getPass")%>
                    <%}%>
                    ">
                    </text></th>
            </tr>
            <br>
        </table>
        <input type="submit" value="確認">
    </form>

</body>
</html>