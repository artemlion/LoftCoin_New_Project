package com.asolomkin.loftcoin;

import android.content.Context;

import com.asolomkin.loftcoin.data.CoinsRepo;
import com.asolomkin.loftcoin.data.CurrencyRepo;
import com.asolomkin.loftcoin.util.ImageLoader;

public interface BaseComponent {
    Context context();
    CoinsRepo coinsRepo();
    CurrencyRepo currencyRepo();
    ImageLoader imageLoader();
}
