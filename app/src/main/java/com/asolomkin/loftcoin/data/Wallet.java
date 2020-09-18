package com.asolomkin.loftcoin.data;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Wallet {

    public abstract String uid();

    public abstract Coin coin();

    public abstract double balance();
}
