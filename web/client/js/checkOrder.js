/**
 * 订单验证的Js脚本
 */

var receiverName;
var receiverAddress;
var receiverPhone;
var receiverNameMsg;
var receiverAddressMsg;
var receiverPhoneMsg;

$(function() {
    receiverName = $("#receiverName");
    receiverAddress = $("#receiverAddress");
    receiverPhone = $("#receiverPhone");
    receiverNameMsg = $("#receiverNameMsg");
    receiverAddressMsg = $("#receiverAddressMsg");
    receiverPhoneMsg = $("#receiverPhoneMsg");
});

/**
 * 验证整个表单。如果验证成功，则提交。
 */
function checkOnSubmit() {
	if(checkReceiverName() && checkReceiverAddress() && checkReceiverPhone()){
		$("#orderForm").submit();
	}else{
	   return "";
	}
}

/**
 * 验证收货地址
 * @returns {boolean}
 */
function checkReceiverAddress() {
	var value =receiverAddress.value;
	var msg = "";
	if (!value)
		msg = "收获地址必须填写";
	receiverAddressMsg.innerHTML = msg;
	receiverAddress.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
	return msg == "";
}

function checkReceiverName() {		//验证收货人
	var value =receiverName.value;
	var msg = "";
	if (!value)
		msg = "收获人必须填写";
	receiverNameMsg.innerHTML = msg;
	receiverName.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
	return msg == "";
}

function checkReceiverPhone() {		//验证联系方式
	var regex =/^1[358]\d{9}$/;	//以13、15、18开头的手机号
	var value =receiverPhone.value;
	var msg = "";
	if (!value)
		msg = "联系方式必须填写";
	else if (!regex.test(value))
		msg = "手机号码不合法：";
	receiverPhoneMsg.innerHTML = msg;
	receiverPhone.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
	return msg == "";
}
