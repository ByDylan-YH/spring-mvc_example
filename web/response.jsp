<%--
  Created by IntelliJ IDEA.
  User: BY
  Date: 2020/4/1
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        <%--        页面加载--%>
        $(function () {
            $("#btn").click(
                function () {
                    // alert("Hello btn");
                    //    发送ajax请求
                    $.ajax({
                        //    编写json格式,设置属性和值
                        url: "user/textAjax",
                        contextType: "application/json;charset=UTF-8",
                        data: '{"uname":"by","age":"24","date":"19960122"}',
                        dateType: "json",
                        type: "post",
                        success.function(data)
                    {
                        //        data服务器端响应json数据,进行解析
                        alert(data);
                        alert(data.uname);
                    }
                })
                }
            )

        });
    </script>
</head>
<body>
<a href="return/testString">testString</a>
<br>
<a href="return/testVoid">testVoid</a>
<br>
<a href="return/testModelAndView">testModelAndView</a>

<br>
<a href="return/testForwardOrRedirect">testForwardOrRedirect</a>

<br>
<button id="btn">发送ajax请求</button>

</body>
</html>
