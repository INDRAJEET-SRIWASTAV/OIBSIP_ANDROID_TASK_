package com.example.oibsip_android_task_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    TextView text1, text2, text3, text4;
    EditText EditTxt1;
    Button ConvertBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        text1 = findViewById(R.id.text11);
        text2 = findViewById(R.id.text12);
        text3 = findViewById(R.id.text13);
        text4 = findViewById(R.id.text14);
        EditTxt1 = findViewById(R.id.EditTxt11);
        ConvertBtn = findViewById(R.id.ConvertBtn);


        ConvertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EditTxt1.getText().toString() == ""){
                    text4.setText("0");
                }else{
                    ConvertGramToKiloGrams();
                }


            }
        });

    }

    private void ConvertGramToKiloGrams() {

        String GramValue = EditTxt1.getText().toString();

        Double Grams = Double.parseDouble(GramValue);


        Double KiloGrams = Grams / 1000;
        text4.setText(""  + KiloGrams);
    }
}