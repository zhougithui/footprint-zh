package com.lanmao.data.sync.http.async;

public interface NotifyObserver {
	
	void onRetry(String lastError);
	
	void onSuccess(String lastError);
	
	void onFail(String lastError);
}
