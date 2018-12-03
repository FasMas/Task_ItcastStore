/**
 * 表单验证的Js脚本
 */

var userName;
var email;
var password;
var rePassword;
var userNameMsg;
var emailMsg;
var passwordMsg;
var rePasswordMsg;

$(function() {
	userName = $("#userName");
    email = $("#email");
	password = $("#password");
    rePassword = $("#rePassword");
    userNameMsg = $("#userNameMsg");
    emailMsg = $("#emailMsg");
    passwordMsg = $("#passwordMsg");
    rePasswordMsg = $("#rePasswordMsg");
});

/**
 * //验证整个表单。返回false后, 事件将被取消。
 * @returns {boolean}
 */
function checkForm() {
	return checkEmail() && checkUserName() && checkPassword() && checkRePassword();
}

/**
 * 验证用户名。
 * @returns {boolean}
 */
function checkUserName() {
    //字母数字下划线1到10位, 不能是数字开头
    var regex = /^[a-zA-Z_]\w{0,9}$/;
    var value = userName.val();
    var msg = "";

    if(!value) {
        msg = "用户名必须填写：";
    } else if(!regex.test(value)) {
        msg = "用户名不合法：";
    }
    //将提示消息放入SPAN
    userNameMsg.text(msg);
    //根据消息结果改变tr的颜色，并返回验证结果
    userName.parent().parent().css("color", msg === "" ? "black" : "red");
    return msg==="";
}

/**
 * 验证邮箱。
 * @returns {boolean}
 */
function checkEmail() {
    var regex = /^[\w-]+@([\w-]+\.)+[a-zA-Z]{2,4}$/;
    var value = email.value;
    var msg = "";

    if(!value) {
        msg = "邮箱必须填写：";
    } else if(!regex.test(value)) {
        msg = "邮箱格式不合法：";
    }
    //将提示消息放入SPAN
    emailMsg.text(msg);
    //根据消息结果改变tr的颜色，并返回验证结果
    email.parent().parent().css("color", msg === "" ? "black" : "red");
    return msg==="";
}

/**
 * 验证密码。
 * @returns {boolean}
 */
function checkPassword() {
    //任意字符, 6到16位
    var regex = /^.{6,16}$/;
    var value = password.val();
    var msg = "";

    if(!value) {
        msg = "密码必须填写：";
    } else if(!regex.test(value)) {
        msg = "密码不合法：";
    }
    //将提示消息放入SPAN
    passwordMsg.text(msg);
    //根据消息结果改变tr的颜色，并返回验证结果
    password.parent().parent().css("color", msg === "" ? "black" : "red");
    return msg==="";
}

/**
 * 验证确认密码
 * @returns {boolean}
 */
function checkRePassword() {
    var value = password.val();
    var reValue = rePassword.val();
    var msg = "";

    if(!reValue) {
        msg = "确认密码必须填写";
    } else if(value !== reValue) {
        msg = "密码必须保持一致";
    }
    //将提示消息放入SPAN
    rePassword.text(msg);
    //根据消息结果改变tr的颜色，并返回验证结果
    rePassword.parent().parent().css("color", msg === "" ? "black" : "red");
    return msg==="";
}

/**
 * 根据正则验证参数
 * @param elem
 * @param regex {RegExp}
 * @param nullMsg {string}
 * @param illegalMsg {string}
 * @param tColor {string}
 * @param fColor {string}
 */
function checkByRegex(elem,regex,nullMsg,illegalMsg,tColor,fColor) {
    tColor = tColor || "black";

    var value = elem.val();
    var msg = "";

    if(!value) {
        msg = nullMsg;
    } else if(!regex.test(value)) {
        msg = illegalMsg;
    }
    //将提示消息放入SPAN
    elem.text(msg);
    //根据消息结果改变tr的颜色，并返回验证结果
    elem.parent().parent().css("color", msg === "" ? "black" : "red");
    return msg === "";
}

