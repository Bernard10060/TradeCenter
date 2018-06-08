package com.bernard.tradeOrder;

import java.io.Serializable;
import java.math.BigDecimal;

public class Order implements Serializable{
    protected BigDecimal price;
    protected BigDecimal amount;
    protected long createTime;
    protected long timeTolive;
    protected OrderSide side;
    protected User user;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getTimeTolive() {
        return timeTolive;
    }

    public void setTimeTolive(long timeTolive) {
        this.timeTolive = timeTolive;
    }

    public OrderSide getSide() {
        return side;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", createTime=" + createTime +
                ", timeTolive=" + timeTolive +
                '}';
    }


}
