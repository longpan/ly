package org.xhome.ly.common;



/**
 * @author Rick  E-mail: maodai1990@163.com
 * @version 创建时间：2014-5-16 上午10:43:46
 * 类说明
 */

public class Response {
	protected int status;
	protected Object body;

	public Response(){}
	
	public Response(int status) {
		this.status = status;
	}
	public Response(int status, Object body) {
		this(status);
		this.body = body;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Object getBody() {
		return body;
	}
	public void setBody(Object body) {
		this.body = body;
	}
}
 