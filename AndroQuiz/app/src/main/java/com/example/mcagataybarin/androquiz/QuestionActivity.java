package com.example.mcagataybarin.androquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Intent intent = getIntent();

        // Here, we get category and question number from intent extra context.
        // Do what you want to do with Question object.
        int categoryNumber = intent.getIntExtra("category", 0);
        int questionNumber = intent.getIntExtra("question", 0);
        Category c = QuestionData.getInstance().getCategories()[categoryNumber];
        Question q = c.questions[questionNumber];

        TextView question = (TextView) findViewById(R.id.question);
        question.setText(q.question);

        /*
        String category = array[0];
        Integer number = Integer.parseInt(array[1]);

        if(number == 5){
            Log.d("r", "YEPP IT IS 5 number");
        }

        if(category.equalsIgnoreCase("s")){
            Log.d("r", "YEPP IT IS S category");
        }

        for(int z = 0; z < array.length; z++)
            Log.d("myTag", array[z]);
        */

    }

    public void onClickA(View view){
        Intent intent = new Intent();
        intent.putExtra("result", 2);
        setResult(RESULT_OK, intent);
        finish();

    }

}