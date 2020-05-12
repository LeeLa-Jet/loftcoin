package com.loftschool.android.loftcoin.util;

import androidx.annotation.NonNull;

public interface Formatter<T> {
    @NonNull
    String format(@NonNull T value);
}