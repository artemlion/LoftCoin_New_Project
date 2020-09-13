package com.asolomkin.loftcoin;

import android.app.Application;

import com.asolomkin.loftcoin.data.DataModule;
import com.asolomkin.loftcoin.util.UtilModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
    AppModule.class,
    DataModule.class,
    UtilModule.class
})
abstract class AppComponent implements BaseComponent {

    @Component.Builder
    static abstract class Builder {
        @BindsInstance
        abstract Builder application(Application app);

        abstract AppComponent build();
    }

}
