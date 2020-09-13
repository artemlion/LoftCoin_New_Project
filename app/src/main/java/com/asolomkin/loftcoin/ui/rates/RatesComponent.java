package com.asolomkin.loftcoin.ui.rates;

import androidx.lifecycle.ViewModelProvider;

import com.asolomkin.loftcoin.util.ViewModelModule;
import com.asolomkin.loftcoin.BaseComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        RatesModule.class,
        ViewModelModule.class
}, dependencies = {
        BaseComponent.class
})
abstract class RatesComponent {

    abstract ViewModelProvider.Factory viewModelFactory();

    abstract RatesAdapter ratesAdapter();

}
