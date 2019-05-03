package com.example.nz.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton1,radioButton2,radioButton3;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 = (RadioButton) findViewById(R.id.btnOne);
        radioButton2 = (RadioButton) findViewById(R.id.btnTwo);
        radioButton3 = (RadioButton) findViewById(R.id.btnThree);
        button = (Button)findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButton1.isChecked()){
                    String string = radioButton1.getText().toString();
                    textView.setText("Selected Gender is "+string);
                }
                if(radioButton2.isChecked()){
                    String string = radioButton2.getText().toString();
                    textView.setText("Selected Gender is "+string);
                }
                if(radioButton3.isChecked()){
                    String string = radioButton3.getText().toString();
                    textView.setText("Selected Gender is "+string);
                }
            }
        });

    }
}
