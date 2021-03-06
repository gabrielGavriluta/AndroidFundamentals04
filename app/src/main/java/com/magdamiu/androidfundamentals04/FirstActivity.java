package com.magdamiu.androidfundamentals04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.magdamiu.androidfundamentals04.custom_spinner.SpinnerActivity;
import com.magdamiu.androidfundamentals04.recycler_view.EventsActivity;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void loginOnClick(View view) {
        startActivity(new Intent(FirstActivity.this, LoginActivity.class));
    }

    public void eventsOnClick(View view) {
        startActivity(new Intent(FirstActivity.this, EventsActivity.class));
    }

    public void spinnerOnClick(View view) {
        startActivity(new Intent(FirstActivity.this, SpinnerActivity.class));
    }

    public void mainOnClick(View view) {
        startActivity(new Intent(FirstActivity.this, MainActivity.class));
    }
}
