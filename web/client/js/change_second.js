var interval;

window.onload = function() {
	interval = window.setInterval("changeSecond()", 1000);
};
function changeSecond() {
    var second = document.getElementById('second');
    var svalue = parseInt(second.innerHTML);
    svalue = svalue - 1;
    if (svalue !== 0) {
        second.innerHTML = svalue;
    } else {
        window.clearInterval(interval);
        // 获取目录名，例如：client
        var pathName = window.location.pathname.substring(1);
        var webName = pathName === '' ? '' : pathName.split('/', 1)[0];
        // 获取完整的用于访问的url，例如：http://localhost:8080/bookstore/index.jsp
        location.href = window.location.protocol + '//' + window.location.host + '/' + webName + '/index.jsp';
    }
}
