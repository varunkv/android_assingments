package com.example.hashimmusthafa.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  Button add,sub,mul,div ;
  EditText no1,no2;
  String num1="",num2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no1=(EditText)findViewById(R.id.editText);
        no2=(EditText)findViewById(R.id.editText2);
        add=(Button)findViewById(R.id.button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=no1.getText().toString();
                num2=no2.getText().toString();
                float a=Float.parseFloat(num1);
                float b=Float.parseFloat(num2);
                float sum=a+b;
                Toast.makeText(getBaseContext(), "Your answer is" + sum, Toast.LENGTH_LONG).show();
            }
        });
        sub=(Button)findViewById(R.id.button2);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=no1.getText().toString();
                num2=no2.getText().toString();
                float a=Float.parseFloat(num1);
                float b=Float.parseFloat(num2);
                float sub=a-b;
                Toast.makeText(getBaseContext(), "Your answer is" + sub, Toast.LENGTH_LONG).show();
            }
        });
        mul=(Button)findViewById(R.id.button3);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=no1.getText().toString();
                num2=no2.getText().toString();
                float a=Float.parseFloat(num1);
                float b=Float.parseFloat(num2);
                float mul=a*b;
                Toast.makeText(getBaseContext(), "Your answer is" + mul, Toast.LENGTH_LONG).show();
            }
        });
        div=(Button)findViewById(R.id.button4);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=no1.getText().toString();
                num2=no2.getText().toString();
                float a=Float.parseFloat(num1);
                float b=Float.parseFloat(num2);
                float div=a/b;
                Toast.makeText(getBaseContext(), "Your answer is" + div, Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
