package com.loftschool.android.loftcoin.util;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class UtilModule {

    @Binds
    abstract ImageLoader imageLoader(PicassoImageLoader impl);

}
