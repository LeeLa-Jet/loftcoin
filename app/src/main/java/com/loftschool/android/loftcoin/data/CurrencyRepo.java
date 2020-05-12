package com.loftschool.android.loftcoin.data;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public interface CurrencyRepo {

    @NonNull
    MutableLiveData<List<Currency>> availableCurrencies();

    @NonNull
    CurrencyRepoImpl.CurrencyLiveData currency();

    void updateCurrency(@NonNull Currency currency);

    void updateCurrency(java.util.Currency item);
}