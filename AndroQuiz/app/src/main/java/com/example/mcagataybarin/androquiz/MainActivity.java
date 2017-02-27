package com.example.mcagataybarin.androquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void usernameEntered(View view) {

        EditText username = (EditText) findViewById(R.id.editText);
        User usr = new User(username.getText().toString());
        QuestionData.getInstance().initialize();
        QuestionData.getInstance().setUser(usr);
        Intent intent = new Intent(this, CategoryActivity.class);
        MainActivity.this.startActivity(intent);

    }
}