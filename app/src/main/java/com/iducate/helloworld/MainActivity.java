package com.iducate.helloworld;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        System.out.println("piotr");

        Person person = new Person("Piotr", 25);
        System.out.println(person.toString());

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("James", 48));
        persons.add(new Person("Larry", 61));
        persons.add(new Person("Tom", 38));
        persons.add(new Person("Lacy", 54));
        for (Person p : persons) {
            System.out.println(p.toString());
        }


        final Button button = (Button) findViewById(R.id.btnNew);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Toast
                Toast t = Toast.makeText(MainActivity.this, "Hello, Piotr", Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                t.show();
            }
        });
    }

    public void sayHello(View view) {

        Dialog dialog = new Dialog(this);

        dialog.setTitle("Greetings");

        TextView textView = new TextView(this);
        textView.setText("Hello World");
        textView.setPadding(20, 20, 20, 20);

        dialog.setContentView(textView);

        dialog.show();
    }

}
