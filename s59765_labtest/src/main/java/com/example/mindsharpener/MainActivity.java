package com.example.mindsharpener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    int randomNumber = random.nextInt(9);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void radio_button_click1(View view){
        Toast.makeText(this,"This level is easy", Toast.LENGTH_SHORT).show();
    }
    public void radio_button_click2(View view){
        Toast.makeText(this,"This level is medium", Toast.LENGTH_SHORT).show();
    }
    public void radio_button_click3(View view){
        Toast.makeText(this,"This level is hard", Toast.LENGTH_SHORT).show();
    }
}