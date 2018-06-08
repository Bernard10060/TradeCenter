package com.bernard.tradeSet;

import com.bernard.tradeOrder.BuyOrder;
import com.bernard.tradeOrder.SellOrder;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentSkipListSet;

public class BuyOrderSet {
    private static ConcurrentSkipListSet<BuyOrder> buySet = new ConcurrentSkipListSet();


    public static void main(String[] args) {
        BuyOrder sellOrder = new BuyOrder();
        sellOrder.setPrice(new BigDecimal(0));
        sellOrder.setCreateTime(10000);
        BuyOrder sellOrder1 = new BuyOrder();
        sellOrder1.setPrice(new BigDecimal(1));
        sellOrder1.setCreateTime(10000);
        BuyOrder sellOrder2 = new BuyOrder();
        sellOrder2.setPrice(new BigDecimal(1));
        sellOrder2.setCreateTime(1020);
        BuyOrder sellOrder3 = new BuyOrder();
        sellOrder3.setPrice(new BigDecimal(1));
        sellOrder3.setCreateTime(100020);
        BuyOrder sellOrder4 = new BuyOrder();
        sellOrder4.setPrice(new BigDecimal(3));
        sellOrder4.setCreateTime(100020);
        BuyOrder sellOrder5 = new BuyOrder();
        sellOrder5.setPrice(new BigDecimal(2));
        sellOrder5.setCreateTime(100020);
        buySet.add(sellOrder);

        buySet.add(sellOrder1);
        buySet.add(sellOrder2);
        buySet.add(sellOrder3);
        buySet.add(sellOrder4);
        buySet.add(sellOrder5);
        //System.out.println(buySet.first().toString());
        System.out.println(buySet.pollFirst().toString());
        System.out.println(buySet.pollFirst().toString());
        System.out.println(buySet.pollFirst().toString());
        System.out.println(buySet.pollFirst().toString());
        System.out.println(buySet.pollFirst().toString());
        System.out.println(buySet.pollFirst().toString());



    }
}
