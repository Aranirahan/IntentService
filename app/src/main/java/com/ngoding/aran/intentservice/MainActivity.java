package com.ngoding.aran.intentservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button btnMulaiIntetService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMulaiIntetService = findViewById(R.id.btn_intent_service);
        btnMulaiIntetService.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent mStartIntentService = new Intent(MainActivity.this, AranIntentService.class);
        mStartIntentService.putExtra(AranIntentService.EXTRA_DURASI, 5000);
        startService(mStartIntentService);
    }
}
