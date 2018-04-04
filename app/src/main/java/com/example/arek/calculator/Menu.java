package com.example.arek.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void moveToSimpleCalc(View view) {
        Intent intent = new Intent(this, SimpleModeActivity.class);
        startActivity(intent);
    }

    public void moveToAdvanceCacl(View view) {
        Intent intent = new Intent(this, AdvancedModeActivity.class);
        startActivity(intent);
    }

    public void moveToAbout(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void moveToExit(View view) {
        finishAndRemoveTask();
    }
}
