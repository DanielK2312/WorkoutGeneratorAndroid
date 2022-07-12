package edu.dayton.workoutgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    private static final long DELAY = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();

                Intent intent = new Intent(SplashActivity.this, MainActivity.class);

                startActivity(intent);
            }
        };

        Timer opening = new Timer();
        opening.schedule(task, DELAY);
    }
}