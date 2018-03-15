<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
    //request.getServletPath()
    String host = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
    pageContext.setAttribute("host", host,PageContext.REQUEST_SCOPE);
    pageContext.setAttribute("context", request.getContextPath(), PageContext.REQUEST_SCOPE);

%>
<!DOCTYPE html>
<html>
<head>
    <title>任务列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport">
    <script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-1.11.2.min.js"></script>
    <script type="text/javascript">
        function startJob() {
            if(jobById){
                $("#jobAddress").attr("href", "${host}${context}/manager/job/" + $(".jobName")[0].value + "/" + $("#startDay").val() + "/" + $("#days").val());
                $("#addInfo").html("${host}${context}/manager/job/" + $(".jobName")[0].value + "/" + $("#startDay").val() + "/" + $("#days").val());
            }else{
                $("#jobAddress").attr("href", "${host}${context}/task/job/" + $(".jobName")[0].value + "/" + $("#startDay").val() + "/" + $("#days").val());
                $("#addInfo").html("${host}${context}/task/job/" + $(".jobName")[0].value + "/" + $("#startDay").val() + "/" + $("#days").val());
            }
        }

        function chooseJob(radio){
            $(".jobName").val(radio.value);
            $("#failJob").attr("href", "${host}${context}/manager/failJobList/" + radio.value);
            $("#jobStatusAddress").attr("href", "${host}${context}/manager/status/" + $(".jobName")[0].value);
            $("#checkCount").attr("href", "${host}${context}/manager/checkCount/" + $(".jobName")[0].value);
        }

        function adjustPoolSize(){
            $("#adjustPool").attr("href", "${host}${context}/pool/adjust/" + $("input[name='poolSize']").filter(':checked').val() + "/" + $("#size").val());
        }

        var jobById = false;
        function obtainInit(){
            $.ajax({
                url: '${context}/manager/minMaxId/' + $(".jobName")[0].value,
                type: 'post',
                success: function (data) {
                    jobById = true;
                    if(data == ''){
                        alert('恭喜，空表，无需同步！');
                    }else {
                        $('#init').html('DB2-数据库最小ID：' + data.minId + '/数据库最大ID：' + data.maxId + '/相差ID数：' + data.idDiff);
                    }
                },
                error: function(e){
                    $.ajax({
                        url: '${context}/manager/minMaxDay/' + $(".jobName")[0].value,
                        type: 'post',
                        success: function (data) {
                            jobById = false;
                            if(data == ''){
                                alert('恭喜，空表，无需同步！');
                            }else{
                                $('#init').html('DB2-数据库最小日期：' + data.minDay + '/数据库最大日期：' + data.maxDay + '/相差天数：' + data.daysDiff);
                            }
                        },
                        error: function(e){

                        }
                    });
                }
            });
        }
    </script>
</head>
<body>
    <h3>任务列表</h3>
    <c:forEach var="jobName" items="${jobNameSet}" varStatus="status">
        <input type="radio" id="${jobName}" name="jobName" value="${jobName}" onclick="chooseJob(this)"/><label for="${jobName}">${jobName}</label>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <c:if test="${(status.index + 1) % 4 == 0 }">
            <br/>
        </c:if>
    </c:forEach>

    <h3>操作</h3>
    <h4>执行任务</h4>
    任务名称：<input type="text" class="jobName" >
    开始节点：<input type="text" id="startDay">
    执行偏移：<input type="text" id="days">
    <input type="button" value="确认" onclick="startJob()">
    <input type="button" value="获取初始化信息" onclick="obtainInit()">
    <div id="init"></div>
    <div id="addInfo"></div>
    <a id="jobAddress" href="#" target="_blank">执行</a>

    <h4>任务状态</h4>
    任务名称：<input type="text" class="jobName" >
    <a id="jobStatusAddress" href="#" target="_blank">查看状态</a>
    <a id="checkCount" href="#" target="_blank">查看发送接收</a>

    <h4>失败任务列表</h4>
    任务名称：<input type="text" class="jobName" >
    <a href="#" id="failJob" target="_blank">查看失败任务列表</a>

    <h4>线程池管理</h4>
    <a href="${host}${context}/pool/monitor/c" target="_blank">客户端</a><br/>
    <a href="${host}${context}/pool/monitor/s" target="_blank">服务端</a><br/>
    <input type="radio" id="data-sync-producer" name="poolSize" value="data-sync-producer"><label for="data-sync-producer">数据查询池</label><br/>
    <input type="radio" id="data-sync-sender" name="poolSize" value="data-sync-sender"><label for="data-sync-sender">数据发送池</label><br/>
    <input type="radio" id="data-sync-consumer" name="poolSize" value="data-sync-consumer"><label for="data-sync-consumer">数据存储池</label><br/>
    <input type="text" id="size" /><input type="button" onclick="adjustPoolSize()" value="设置">
    <a id="adjustPool" href="#" target="_blank">调整</a>
</body>
</html>
