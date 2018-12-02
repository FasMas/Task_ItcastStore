$(function(){
    var pathName = "client/method";
    var webName = pathName === '' ? '' : pathName.split('/',1)[0];
    $("#num").text(webName);
});
