package com.lanmao.data.sync.http.async;

import java.net.URL;
import java.util.Collections;
import java.util.Map;

public class Notify {
	
	private String id;

	private URL url;
	
	private String method;
	
	private Map<String, String> param;
	
	private String bizNo;
	
	public Notify(String id, URL url, String method, Map<String, String> param, String bizNo) {
		this.id = id;
		this.url = url;
		this.method = method;
		if (param != null) {
			this.param = Collections.unmodifiableMap(param);
		}
		this.bizNo = bizNo;
	}

	public String getId() {
		return id;
	}

	public URL getUrl() {
		return url;
	}

	public String getMethod() {
		return method;
	}

	public Map<String, String> getParam() {
		return param;
	}

	public String getBizNo() {
		return bizNo;
	}
	
	@Override
	public String toString() {
		return "Notify [id=" + id + ", url=" + url + ", bizNo=" + bizNo + "]";
	}
}
