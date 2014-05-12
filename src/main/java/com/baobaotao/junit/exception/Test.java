package com.baobaotao.junit.exception;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 10:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static final void main(String[] args) {

    }


    private static final int MAX_PRE_TRANSFER_COIN = 500;

    /*public void transferCoin(int coin) throws CoinNotEnoughExcetion{
        if (!hasEnoughCoin())
            throw new CoinNotEnoughExcetion(coin);
    // do transfering coin
    }*/

    public boolean isCoinExceedTransferLimits(int coin) {
        return coin > MAX_PRE_TRANSFER_COIN;
    }

    public void transferCoin(int coin){
        if (coin > MAX_PRE_TRANSFER_COIN)
            throw new IllegalArgumentException(coin+" is exceed tranfer limits:500");
    // do transfering coin
    }
}
