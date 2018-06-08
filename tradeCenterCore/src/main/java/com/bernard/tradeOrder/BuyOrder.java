package com.bernard.tradeOrder;

public class BuyOrder extends Order implements Comparable<BuyOrder>{
    public BuyOrder(){
        super();
        this.setSide(OrderSide.BUY);
    }


    @Override
    public int compareTo(BuyOrder o) {
        int result =o.price.compareTo(this.price);
        if(result ==0){
            return (int)(this.createTime - o.createTime);
        }
        return result;
    }
}
