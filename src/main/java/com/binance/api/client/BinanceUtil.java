package com.binance.api.client;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiMarginRestClient;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.account.MarginAccount;
import com.binance.api.client.domain.account.MarginAssetBalance;
import com.binance.api.client.domain.account.Order;
import com.binance.api.client.domain.account.request.AllOrderListRequest;
import com.binance.api.client.domain.account.request.AllOrdersRequest;

import java.util.List;

public class BinanceUtil {
    private  BinanceApiRestClient client;

    public BinanceUtil(BinanceApiRestClient client){
        this.client=client;
    }
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
        MarginAccount account = client.getAccount();
        List<MarginAssetBalance> userAssets = account.getUserAssets();
        System.out.println(account);
    }
    public static void test1(){
        BinanceApiRestClient cli = createBinanceApiRestClient("66dLHliynTUBTTPymeoZkUXQQMJWMT2mZ4hc4jeEg7hksgPjEC6NLGshrlrRfqZG",
                "9b32ni7aI2qTGK32g51hvLK1vkekGZAKrVET1vOZvHWJ3JwyDqQDOmJq0UStZdOl");
        List<Order> trxusdt = cli.getAllOrders(new AllOrdersRequest("TRXUSDT"));
        
    }
}
