* src
	* dao&emsp;与数据库进行交互的类。
	* domain&emsp;实体类。
	* exception&emsp;自定义异常。
	* service&emsp;编写业务逻辑，并调用dao操作数据库。
	* tag&emsp;自定义标签类。
	* utils&emsp;工具类。
	* web.filter&emsp;过滤器类，分别用于过滤全站编码和判断用户权限。
	* web.servlet.client&emsp;项目前台的servlet类。
	* web.servlet.manager&emsp;项目后台的servlet类。
	- `c3p0-config.xml`&emsp;数据库连接配置文件。
	- `merchantInfo.properties`
	
&emsp;

* web
	* admin&emsp;包括后台管理平台的所有页面以及css、js和图片等。
	* bookcover&emsp;存放了图书（产品）封面的图片。
	* client&emsp;包含了前台的所有页面和js代码。
	* error&emsp;包含了所有错误页面。
	* META-INF
	* productImg&emsp;上传的图书图片存储目录。
	* temp
	* WEB-INF
		* lib
		- `new_words.txt`
		- `userPrivilegeTag.tld`
		- `web.xml`
	- `index.jsp`
