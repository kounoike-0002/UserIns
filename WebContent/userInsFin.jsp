<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>ユーザー登録完了</h1>
    以下の内容で登録が完了しました！
    <br>
    <form method="get" action="UserInsServlet3">
        <table>
            <tr>
                <th>名前 :</th>
                <th><%=request.getSession().getAttribute("getName")%>
                    </text></th>
            </tr>
            <br>
            <tr>
                <th>ニックネーム :</th>
                <th><%=request.getSession().getAttribute("getNikk")%>
                    </text></th>
            </tr>
            <br>
            <th>メールアドレス :</th>
            <th><%=request.getSession().getAttribute("getMail")%>
                </text></th>
            </tr>
            <br>
            <tr>
                <th>パスワード :</th>
                <th><%=request.getSession().getAttribute("getPass")%>
                    </text></th>
            </tr>
            <br>
        </table>

        <input type="submit" value="トップページ">
    </form>

</body>
</html>