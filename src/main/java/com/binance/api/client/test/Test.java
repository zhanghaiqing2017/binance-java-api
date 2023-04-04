package com.binance.api.client.test;

import com.binance.api.client.*;
import com.binance.api.client.domain.account.Account;
import com.binance.api.client.domain.account.MarginAccount;
import com.binance.api.client.domain.account.Order;
import com.binance.api.client.domain.account.OrderList;
import com.binance.api.client.domain.account.request.AllOrderListRequest;
import com.binance.api.client.domain.account.request.AllOrdersRequest;
import com.binance.api.client.domain.general.Asset;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.List;

public class Test {
  public static void main(String[] args) {

    BinanceApiClientFactory factory=BinanceApiClientFactory.newInstance(
      "66dLHliynTUBTTPymeoZkUXQQMJWMT2mZ4hc4jeEg7hksgPjEC6NLGshrlrRfqZG",
      "9b32ni7aI2qTGK32g51hvLK1vkekGZAKrVET1vOZvHWJ3JwyDqQDOmJq0UStZdOl");
    BinanceApiMarginRestClient client = factory.newMarginRestClient();
    MarginAccount account = client.getAccount();
    System.out.printf(account.getTotalNetAssetOfBtc());


  }
}
