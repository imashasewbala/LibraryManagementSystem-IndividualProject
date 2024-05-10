package com.example.librarysystem;

import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;

        import androidx.activity.EdgeToEdge;
        import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_splash);

            // Ensure action bar is not null before hiding it
            if (getSupportActionBar() != null) {
                getSupportActionBar().hide();
            }

            final Intent i = new Intent(SplashActivity.this, LoginActivity.class);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(i);
                    finish();
                }
            }, 4000);
        }
    }