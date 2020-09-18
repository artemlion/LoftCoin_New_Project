package com.asolomkin.loftcoin.data;

import androidx.annotation.NonNull;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

@Singleton
class WalletsRepoImpl implements WalletsRepo {

    @Inject
    WalletsRepoImpl() {
    }

    @NonNull
    @Override
    public Observable<List<Wallet>> wallets(@NonNull Currency currency) {
        return Observable.empty();
    }

    @NonNull
    @Override
    public Observable<List<Transaction>> transactions(@NonNull Wallet wallet) {
        return Observable.empty();
    }
}
