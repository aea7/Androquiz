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

    Question q;
    int categoryNumber, questionNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Intent intent = getIntent();

        // Here, we get category and question number from intent extra context.
        // Do what you want to do with Question object.
        categoryNumber = intent.getIntExtra("category", 0);
        questionNumber = intent.getIntExtra("question", 0);
        Category c = QuestionData.getInstance().getCategories()[categoryNumber];
        q = c.questions[questionNumber];

        TextView question = (TextView) findViewById(R.id.question);
        question.setText(q.question);


        Button buttonA = (Button) findViewById(R.id.buttonA);
        Button buttonB = (Button) findViewById(R.id.buttonB);
        Button buttonC = (Button) findViewById(R.id.buttonC);
        Button buttonD = (Button) findViewById(R.id.buttonD);

        buttonA.setText(q.choices[0]);
        buttonB.setText(q.choices[1]);
        buttonC.setText(q.choices[2]);
        buttonD.setText(q.choices[3]);

    }

    public void onClickA (View view){
        Intent intent = new Intent();
        int status = q.makeChoice(0);
        setResult(RESULT_OK, intent);
        intent.putExtra("result", status);
        intent.putExtra("category", categoryNumber);
        intent.putExtra("question", questionNumber);
        finish();

    }

    public void onClickB(View view){
        Intent intent = new Intent();
        int status = q.makeChoice(1);
        setResult(RESULT_OK, intent);
        intent.putExtra("result", status);
        intent.putExtra("category", categoryNumber);
        intent.putExtra("question", questionNumber);
        finish();
    }

    public void onClickC(View view) {
        Intent intent = new Intent();
        int status = q.makeChoice(2);
        setResult(RESULT_OK, intent);
        intent.putExtra("result", status);
        intent.putExtra("category", categoryNumber);
        intent.putExtra("question", questionNumber);
        finish();
    }

    public void onClickD(View view){
        Intent intent = new Intent();
        int status = q.makeChoice(3);
        setResult(RESULT_OK, intent);
        intent.putExtra("result", status);
        intent.putExtra("category", categoryNumber);
        intent.putExtra("question", questionNumber);
        finish();
    }
}
