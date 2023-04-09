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
        BinanceApiMarginRestClient client =creatBinanceApiMarginRestClient("66dLHliynTUBTTPymeoZkUXQQMJWMT2mZ4hc4jeEg7hksgPjEC6NLGshrlrRfqZG",
                "9b32ni7aI2qTGK32g51hvLK1vkekGZAKrVET1vOZvHWJ3JwyDqQDOmJq0UStZdOl");
        MarginTransaction usdt = client.subToMaster("USDT", "1");
        System.out.println(usdt.getTranId());

    }
}
