package com.asolomkin.loftcoin.ui.wallets;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import com.asolomkin.loftcoin.data.CurrencyRepo;
import com.asolomkin.loftcoin.data.Wallet;
import com.asolomkin.loftcoin.data.WalletsRepo;
import com.asolomkin.loftcoin.util.RxSchedulers;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

class WalletsViewModel extends ViewModel {

    private final Observable<List<Wallet>> wallets;

    private RxSchedulers schedulers;

    @Inject
    WalletsViewModel(WalletsRepo walletsRepo, CurrencyRepo currencyRepo, RxSchedulers schedulers) {
        wallets = currencyRepo.currency().switchMap(walletsRepo::wallets);
        this.schedulers = schedulers;
    }

    @NonNull
    Observable<List<Wallet>> wallets() {
        return wallets.observeOn(schedulers.main());
    }
}