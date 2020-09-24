package com.asolomkin.loftcoin;

import android.content.Context;

import com.asolomkin.loftcoin.data.CoinsRepo;
import com.asolomkin.loftcoin.data.CurrencyRepo;
import com.asolomkin.loftcoin.data.WalletsRepo;
import com.asolomkin.loftcoin.util.ImageLoader;
import com.asolomkin.loftcoin.util.Notifier;
import com.asolomkin.loftcoin.util.RxSchedulers;

public interface BaseComponent {
    Context context();

    CoinsRepo coinsRepo();

    CurrencyRepo currencyRepo();

    WalletsRepo walletsRepo();

    ImageLoader imageLoader();

    RxSchedulers schedulers();

    Notifier notifier();
}
