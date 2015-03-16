<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax Test</title>
</head>
<body>

<p>Ajax Test</p>
<button id="message-ajax">Say Hello</button>
<div id="message"></div>

<script src="/assets/js/jquery.js" ></script>
<script>
    $(document).ready(function(){
       $("#message-ajax").click(function(){
           $.ajax("/ajax", {
               type:'post',
               contenttype: 'application/json',
               datatype: 'json',
               success: function(result){
                    $('#message').html(result.information);
              }
           });
       });
    });
</script>
</body>
</html>
