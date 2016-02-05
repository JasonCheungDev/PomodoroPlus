package com.bcit.pomodoro.pomodoroplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onViewTaskClick(View view) {
        Intent intent = new Intent(getApplicationContext(), TaskViewerActivity.class);
        startActivity(intent);
    }

    public void onCreateTaskClick(View view) {
        Intent intent = new Intent(getApplicationContext(), DateSelectActivity.class);
        startActivity(intent);
    }
}
