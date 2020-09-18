package com.asolomkin.loftcoin.ui.main;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;

import com.asolomkin.loftcoin.ui.converter.ConverterFragment;
import com.asolomkin.loftcoin.ui.currency.CurrencyDialog;
import com.asolomkin.loftcoin.ui.rates.RatesFragment;
import com.asolomkin.loftcoin.ui.wallets.WalletsFragment;
import com.asolomkin.loftcoin.util.LoftFragmentFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainModule {

    @Binds
    abstract FragmentFactory fragmentFactory(LoftFragmentFactory impl);

    @Binds
    @IntoMap
    @ClassKey(RatesFragment.class)
    abstract Fragment ratesFragment(RatesFragment impl);

    @IntoMap
    @ClassKey(WalletsFragment.class)
    @Binds
    abstract Fragment walletsFragment(WalletsFragment impl);

    @IntoMap
    @ClassKey(ConverterFragment.class)
    @Binds
    abstract Fragment converterFragment(ConverterFragment impl);

    @Binds
    @IntoMap
    @ClassKey(CurrencyDialog.class)
    abstract Fragment currencyDialog(CurrencyDialog impl);
}
