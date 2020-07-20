package com.dev.tp3q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addFragmentToActivity();
    }

    private void addFragmentToActivity() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_activity_layout, new MainFragment())
                .commit();
    }
}
