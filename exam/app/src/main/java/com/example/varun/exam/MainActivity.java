package com.example.varun.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    Button button1,button2,button3;
    Helper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        button2 = (Button) findViewById(R.id.sgnup);
        button1 = (Button) findViewById(R.id.lgn);



        button2.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main23Activity.class);
                startActivity(i);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = editText1.getText().toString();
                String password = editText2.getText().toString();
                String stored = db.getEntry(email);
                if (password.equals(stored)) {
                   Intent i = new Intent(MainActivity.this, Main22Activity.class);
                   startActivity(i);
               } else {

                    Toast.makeText(getApplicationContext(), "Email or password does not match", Toast.LENGTH_LONG).show();

                }
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
