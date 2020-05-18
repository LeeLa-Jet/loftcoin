package com.loftschool.android.loftcoin.ui.currency;

import androidx.lifecycle.ViewModelProvider;

import com.loftschool.android.loftcoin.BaseComponent;
import com.loftschool.android.loftcoin.util.ViewModelModule;

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
