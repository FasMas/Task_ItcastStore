/**
 * 工具脚本
 */

/**
 * 根据正则验证某个jQuery对象对应的参数。
 * @param jQueryObj
 * @param regex {RegExp}
 * @param nullMsg {string}
 * @param illegalMsg {string}
 * @param tColor {string}
 * @param fColor {string}
 */
function checkByRegex(parameters) {
    var jQueryObj = parameters.jQueryObj;
    var regex = parameters.regex;
    var nullMsg = parameters.nullMsg;
    var illegalMsg = parameters.illegalMsg;
    var tColor = parameters.tColor;
    var fColor = parameters.fColor;
    tColor = tColor || "black";
    fColor = fColor || "red";

    var value = jQueryObj.val();
    var msg = "";

    if(!value) {
        msg = nullMsg;
    } else if(!regex.test(value)) {
        msg = illegalMsg;
    }
    //将提示消息放入SPAN
    jQueryObj.text(msg);
    //根据消息结果改变tr的颜色，并返回验证结果
    jQueryObj.parent().parent().css("color", msg === "" ? tColor : fColor);
    return msg === "";
}
