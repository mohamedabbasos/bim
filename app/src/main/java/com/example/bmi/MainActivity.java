package com.example.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.view.View;
import  android.widget.Button;
import  android.widget.EditText;
import  android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText h = findViewById(R.id.height);
        final EditText w = findViewById(R.id.weight);
        final TextView r = findViewById(R.id.resut);
        Button b = findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(h.getText().length() != 0 && w.getText().length() != 0){
                    Float height = Float.parseFloat(h.getText().toString());
                    Float weight = Float.parseFloat(w.getText().toString());

                    Float bmi = weight/ (height * height);
                    r.setText("Your BMI is:"+ bmi+"\n");

                    if (bmi < 18.5){
                        String message = getString(R.string.normal);
                        r.append(message);
                    }else if (bmi <25){
                        String message = getString(R.string.normal);
                        r.append(message);
                    }else if (bmi <30){
                        String message = getString(R.string.overweight);
                        r.append(message);
                    }else {
                        String message = getString(R.string.obese);
                        r.append(message);
                    }
                }
                else {
                    r.setText("Invalid values !");
                }
            }
        });

}
}