package com.example.root.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*final SQLiteDatabase namedb = openOrCreateDatabase("name.db",MODE_PRIVATE,null);
                EditText editText2 = (EditText)findViewById(R.id.editText2);
                String result = editText2.getText().toString();
                namedb.execSQL("CREATE TABLE IF NOT EXISTS tb(name TEXT);");
                //namedb.execSQL("INSERT INTO tb(name) VALUES(result);");
                namedb.close();*/
                Toast.makeText(getBaseContext(),"Successfully Saved.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}