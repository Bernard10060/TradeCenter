package com.bernard.tradeSet;

import com.bernard.tradeOrder.SellOrder;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentSkipListSet;

public class SellOrderSet {
    private static ConcurrentSkipListSet<SellOrder> sellSet = new ConcurrentSkipListSet();


    public static void main(String[] args) {
        SellOrder sellOrder = new SellOrder();
        sellOrder.setPrice(new BigDecimal(0));
        sellOrder.setCreateTime(10000);
        SellOrder sellOrder1 = new SellOrder();
        sellOrder1.setPrice(new BigDecimal(1));
        sellOrder1.setCreateTime(10000);
        SellOrder sellOrder2 = new SellOrder();
        sellOrder2.setPrice(new BigDecimal(1));
        sellOrder2.setCreateTime(1020);
        SellOrder sellOrder3 = new SellOrder();
        sellOrder3.setPrice(new BigDecimal(1));
        sellOrder3.setCreateTime(100020);
        SellOrder sellOrder4 = new SellOrder();
        sellOrder4.setPrice(new BigDecimal(3));
        sellOrder4.setCreateTime(100020);
        SellOrder sellOrder5 = new SellOrder();
        sellOrder5.setPrice(new BigDecimal(2));
        sellOrder5.setCreateTime(100020);
        sellSet.add(sellOrder);

        sellSet.add(sellOrder1);
        sellSet.add(sellOrder2);
        sellSet.add(sellOrder3);
        sellSet.add(sellOrder4);
        sellSet.add(sellOrder5);
        System.out.println(sellSet.first().toString());
        System.out.println(sellSet.pollFirst().toString());
        System.out.println(sellSet.pollFirst().toString());
        System.out.println(sellSet.pollFirst().toString());
        System.out.println(sellSet.pollFirst().toString());
        System.out.println(sellSet.pollFirst().toString());
        System.out.println(sellSet.pollFirst().toString());



    }
}
