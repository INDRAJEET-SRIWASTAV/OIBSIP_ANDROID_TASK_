package com.example.oibsip_android_task_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView text2_1, text2_2, text2_3, text2_4;
    Button ConvertBtn2;
    EditText EditTxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text2_1 = findViewById(R.id.text2_1);
        text2_2 = findViewById(R.id.text2_2);
        text2_3 = findViewById(R.id.text2_3);
        text2_4 = findViewById(R.id.text2_4);
        EditTxt2 = findViewById(R.id.EditTxt2);
        ConvertBtn2 = findViewById(R.id.ConvertBtn2);


        ConvertBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConvertKilloToGrams();
            }
        });
    }
    private void ConvertKilloToGrams() {

        String Killovalue = EditTxt2.getText().toString();

        Double Killo = Double.parseDouble(Killovalue);


        Double Grams1 = Killo * 1000;
        text2_4.setText(""  + Grams1);
    }
}