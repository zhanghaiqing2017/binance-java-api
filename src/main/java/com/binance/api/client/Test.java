package com.binance.api.client;

import com.binance.api.client.domain.account.MarginTransaction;

public class Test {
    public static BinanceApiRestClient createBinanceApiRestClient(String apiKey,String secret){
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance(apiKey, secret);
        BinanceApiRestClient client = factory.newRestClient();
        return client;
    }
    public static BinanceApiMarginRestClient creatBinanceApiMarginRestClient(String apiKey,String secret){
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance(apiKey, secret);
        BinanceApiMarginRestClient client = factory.newMarginRestClient();
        return client;
    }
    public static void main(String[] args) {

    }
}
