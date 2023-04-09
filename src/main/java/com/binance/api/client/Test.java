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
        BinanceApiMarginRestClient client =creatBinanceApiMarginRestClient("SFSQmJ3Gw9QGt4dY4hOU73xHTSp6pNrJVvoD0TCpw2jvO2mK6llIN50AERQwkUcm",
                "SFSQmJ3Gw9QGt4dY4hOU73xHTSp6pNrJVvoD0TCpw2jvO2mK6llIN50AERQwkUcm");
//        MarginTransaction usdt = client.subToMaster("USDT", "1");


        System.out.println(usdt.getTranId());

    }
}
