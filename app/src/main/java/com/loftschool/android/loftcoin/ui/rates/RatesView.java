package com.loftschool.android.loftcoin.ui.rates;

import androidx.annotation.NonNull;

import com.loftschool.android.loftcoin.data.Coin;

import java.util.List;

public interface RatesView {

    void showCoins(@NonNull List<? extends Coin> list);

    void showError(@NonNull String error);

}
