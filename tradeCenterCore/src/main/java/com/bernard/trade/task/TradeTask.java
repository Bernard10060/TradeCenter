package com.bernard.trade.task;

import com.alibaba.fastjson.JSONObject;
import com.bernard.tradeOrder.Order;
import com.bernard.tradeOrder.OrderSide;
import com.bernard.tradeOrder.SellOrder;
import com.bernard.tradeSet.SellOrderSet;
import com.sun.tools.corba.se.idl.constExpr.Or;
import io.netty.channel.ChannelHandlerContext;
import org.apache.log4j.Logger;

import java.util.concurrent.Callable;

public class TradeTask implements Callable<Integer>{
    private static Logger logger = Logger.getLogger(TradeTask.class);
    private Order order;

    public TradeTask(Order order){
        this.order=order;
    }

    @Override
    public Integer call() throws Exception {
        if(order.getSide()== OrderSide.BUY){
            SellOrder sellOrder =SellOrderSet.getSellSet().first();


        }else if(order.getSide() ==OrderSide.SELL){

        }else {
            logger.error("订单类别错误");
        }
        return null;
    }
}


