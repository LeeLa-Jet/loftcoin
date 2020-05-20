package com.loftschool.android.loftcoin;


import android.content.Context;

import com.loftschool.android.loftcoin.data.CoinsRepo;
import com.loftschool.android.loftcoin.data.CurrencyRepo;
import com.loftschool.android.loftcoin.util.ImageLoader;

public interface BaseComponent {
    Context context();
    CoinsRepo coinsRepo();
    CurrencyRepo currencyRepo();
    ImageLoader imageLoader();
}