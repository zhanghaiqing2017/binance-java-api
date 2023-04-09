package com.binance.api.client;

import com.binance.api.client.domain.account.Account;
import com.binance.api.client.domain.account.MarginTransaction;
import com.binance.api.client.domain.account.SubAccountTransfer;

import java.util.List;

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
        BinanceApiRestClient client =createBinanceApiRestClient("",
                "");
//      Account account = client.getAccount();
      List<SubAccountTransfer> subAccountTransfers = client.getSubAccountTransfers();
      System.out.println(subAccountTransfers.toString());
//      MarginTransaction usdt = client.subToMaster("USDT", "1");
//      System.out.println(usdt.getTranId());

    }
}
