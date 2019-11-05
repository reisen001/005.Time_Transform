package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Month;
import java.time.Year;

public class Calender extends AppCompatActivity {
    private Button math;
    private EditText year, month, day, hour, min, sec;
    private TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_main);
        year = (EditText) findViewById(R.id.editText_year);
        month = (EditText) findViewById(R.id.editText_month);
        day = (EditText) findViewById(R.id.editText_day);
        hour = (EditText) findViewById(R.id.editText_hour);
        min = (EditText) findViewById(R.id.editText_day);
        sec = (EditText) findViewById(R.id.editText_sec);
        math = (Button) findViewById(R.id.button_math);
        show = (TextView) findViewById(R.id.textView_show);
        math.setOnClickListener(mathOnClick);


    }
    private View.OnClickListener mathOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String Year = year.getText().toString();
            String Month = month.getText().toString();
            String Day = day.getText().toString();
            String Hour = hour.getText().toString();
            String Min = min.getText().toString();
            String  Sec = sec.getText().toString();
        show.setText(Year+"/"+Month+"/"+Day+'\n'+Hour+":"+Min+":"+Sec);
        }
    };
}
