package com.bernard.tradeOrder;

import scala.tools.cmd.gen.AnyVals;

import java.math.BigDecimal;

public class SellOrder extends Order implements Comparable<SellOrder>{
    public SellOrder(){
        super();
        this.setSide(OrderSide.SELL);
    }


    @Override
    public int compareTo(SellOrder o) {
        int result =this.price.compareTo(o.price);
        if(result ==0){
            return (int)(o.createTime - this.createTime);
        }
        return result;

    }


}
