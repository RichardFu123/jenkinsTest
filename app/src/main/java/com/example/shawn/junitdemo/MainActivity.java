package com.example.shawn.junitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView tv = null;
    PhoneNumberCheckUtils pNcheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView2);
        Button testButton = (Button) findViewById(R.id.button);
        final EditText editText = (EditText) findViewById(R.id.editText2);

        testButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String pN=editText.getText().toString();
                if (pNcheck.isPhoneLegal(pN)){
                    if (pNcheck.isChinaPhoneLegal(pN)) {
                        tv.setText("is a chinese phone number");}
                    else {
                        tv.setText("is a HK's phone number");
                    }
                }else{
                    tv.setText("is not a phone number");
                }
            }
        });
    }
}
