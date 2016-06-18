package com.coffee.kaffeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button dbButton;
    DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference childRef = rootRef.child("Tst");
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbButton = (Button) findViewById(R.id.db);

        dbButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                childRef.setValue(count++);
            }
        });

    }



}
