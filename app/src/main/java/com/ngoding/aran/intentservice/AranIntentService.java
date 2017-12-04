package com.ngoding.aran.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


public class AranIntentService extends IntentService {
    public static String EXTRA_DURASI = "extra_durasi";
    public static final String TAG = "AranIntentService";

    public AranIntentService() {
        super("AranIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Log.d(TAG, "onHandleIntent()");
        if (intent != null) {
            int durasi = intent.getIntExtra(EXTRA_DURASI, 0);
            try {
                Thread.sleep(durasi);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }
}
