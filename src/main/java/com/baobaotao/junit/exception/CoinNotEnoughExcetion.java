package com.baobaotao.junit.exception;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */
//金币不够的异常类
public class CoinNotEnoughExcetion extends Exception {
    private static final long serialVersionUID = -7867713004171563795L;
    private int coin;
    public CoinNotEnoughExcetion() {
    }

    public CoinNotEnoughExcetion(int coin) {
        this.coin = coin;
    }

    public int getCoin() {
        return coin;
    }

    @Override
    public String getMessage() {
        return coin + " is exceed transfer limit:500";
    }
}

