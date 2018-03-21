package com.lanmao.data.sync.http.async;

/**
 * @author hui.zhou 9:53 2018/3/15
 */
public class DefaultNotifyObserver implements NotifyObserver {
    @Override
    public void onRetry(String lastError) {
        System.out.println("-----------retry error------------");
    }

    @Override
    public void onSuccess(String lastError) {
        //System.out.println("----------success---------");
    }

    @Override
    public void onFail(String lastError) {
        System.out.println("---------error----------");
    }
}
