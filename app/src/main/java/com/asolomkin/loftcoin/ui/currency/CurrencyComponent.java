package com.asolomkin.loftcoin.ui.currency;

import androidx.lifecycle.ViewModelProvider;

import com.asolomkin.loftcoin.util.ViewModelModule;
import com.asolomkin.loftcoin.BaseComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        CurrencyModule.class,
        ViewModelModule.class
}, dependencies = {
        BaseComponent.class
})
abstract class CurrencyComponent {

    abstract ViewModelProvider.Factory viewModelFactory();

}
