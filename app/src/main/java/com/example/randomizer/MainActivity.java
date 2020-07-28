package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    TextView randText,progressText;
    SeekBar seekBar;
    Button rollButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randText = findViewById(R.id.rand);
        progressText = findViewById(R.id.progress);
        seekBar = findViewById(R.id.seekBar);
        rollButton = findViewById(R.id.rollit);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rand = new Random().nextInt(seekBar.getProgress());
                if(rand <= 0) {
                    randText.setText(1 + "");
                }
                randText.setText(rand + "");
                progressText.setText(seekBar.getProgress() + "");
            }
        });
    }
}