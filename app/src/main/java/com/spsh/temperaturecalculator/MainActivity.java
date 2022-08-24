package com.spsh.temperaturecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //object declaration
    EditText edt_Getvalue;
    RadioButton rb_Celcius;
    RadioButton rb_Fahrenhite;
    Button btn_Calc;
    TextView tv_Output;
    Calculations calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialising the objects
        edt_Getvalue=findViewById(R.id.edt_Getvalue);
        rb_Celcius=findViewById(R.id.rb_Celcius);
        rb_Fahrenhite=findViewById(R.id.rb_Fahrenhite);
        btn_Calc=findViewById(R.id.btn_Calc);
        tv_Output=findViewById(R.id.tv_Output);
        calc=new Calculations();
    }

//    public void CalcCelcius(View view){
//
//        if(!edt_Getvalue.getText().toString().isEmpty()){
//            double ans = Double.parseDouble(edt_Getvalue.getText().toString());
//            tv_Output.setText("Temperature :"+((ans * 9/5) + 32)) ;
//
//
//        }else {
//            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
//        }
//
//    }
//
//    public void CalcFarenhites(View view){
//
//        if(!edt_Getvalue.getText().toString().isEmpty()){
//            double ans = Double.parseDouble(edt_Getvalue.getText().toString());
//            tv_Output.setText("Temperature :"+((ans - 32) * 5/9)) ;
//
//
//        }else {
//            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
//        }
//
//    }

    public void calculate (View view){
        if (!edt_Getvalue.getText().toString().isEmpty()){
            if (rb_Celcius.isChecked()){
                tv_Output.setText("Temperature :"+calc.convertCelciusToFahrenheit(Double.parseDouble(edt_Getvalue.getText().toString())));
            }else {
                tv_Output.setText("Temperature :"+calc.convertFahrenheitToCelcius(Double.parseDouble(edt_Getvalue.getText().toString())));
            }

        }
        else{
            edt_Getvalue.setError("Enter a number");
        }
    }
}
