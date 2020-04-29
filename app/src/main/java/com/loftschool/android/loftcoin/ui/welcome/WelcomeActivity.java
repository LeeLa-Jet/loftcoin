package com.loftschool.android.loftcoin.ui.welcome;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.loftschool.android.loftcoin.R;
import com.loftschool.android.loftcoin.databinding.ActivityWelcomeBinding;
import com.loftschool.android.loftcoin.ui.main.MainActivity;

public class WelcomeActivity extends AppCompatActivity {

    public static final String KEY_SHOW_WELCOME = "show_welcome";

    private SnapHelper helper;
    private ActivityWelcomeBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.recycler.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        binding.recycler.setAdapter(new WelcomeAdapter());
        helper = new PagerSnapHelper();
        helper.attachToRecyclerView(binding.recycler);

        binding.btnStart.setOnClickListener((v) -> {
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                    .putBoolean(KEY_SHOW_WELCOME, false)
                    .apply();
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });
    }

    @Override
    protected void onDestroy() {
        helper.attachToRecyclerView(null);
        binding.recycler.setAdapter(null);
        super.onDestroy();
    }
}
