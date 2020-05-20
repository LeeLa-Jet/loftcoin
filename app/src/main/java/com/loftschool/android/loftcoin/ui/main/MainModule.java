package com.loftschool.android.loftcoin.ui.main;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;

import com.loftschool.android.loftcoin.ui.converter.ConverterFragment;
import com.loftschool.android.loftcoin.ui.currency.CurrencyDialog;
import com.loftschool.android.loftcoin.ui.rates.RatesFragment;
import com.loftschool.android.loftcoin.ui.wallets.WalletsFragment;
import com.loftschool.android.loftcoin.util.LoftFragmentFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module
abstract class MainModule {

    @Binds
    abstract FragmentFactory fragmentFactory(LoftFragmentFactory impl);

    @Binds
    @IntoMap
    @ClassKey(RatesFragment.class)
    abstract Fragment ratesFragment(RatesFragment impl);

    @Binds
    @IntoMap
    @ClassKey(WalletsFragment.class)
    abstract Fragment walletsFragment(WalletsFragment impl);

    @Binds
    @IntoMap
    @ClassKey(ConverterFragment.class)
    abstract Fragment converterFragment(ConverterFragment impl);

    @Binds
    @IntoMap
    @ClassKey(CurrencyDialog.class)
    abstract Fragment currencyDialog(CurrencyDialog impl);

}
