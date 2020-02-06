package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button buttonA;
    private Button buttonB;
    private Button buttonC;
    private Button buttonD;
    private Button buttonE;

    private Button buttonPrev;
    private Button buttonNext;
    private Button buttonSubmit;

    private TextView questionTextView;
    private TextView score_reveal;

    private ArrayList<Question> questions = new ArrayList<>();      //ArrayList w/ all Java-related questions
    private int currentQuestionIndex = 0;
    private static String QUESTION_INDEX_KEY = "question_index";    //String key to retrieve question index from saved instance state


    private int score = 0;
    private Button[] buttonPressed = new Button[10];    //array to keep track of what buttons were pressed at which index

    //this method allows the app to save the bundled state of the app upon exiting or rotating the screen
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(QUESTION_INDEX_KEY, currentQuestionIndex);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null)
            currentQuestionIndex = savedInstanceState.getInt(QUESTION_INDEX_KEY, 0);

        //assigns all button and textview variables to their corresponding components
        buttonA = findViewById(R.id.buttonA);
        buttonB = findViewById(R.id.buttonB);
        buttonC = findViewById(R.id.buttonC);
        buttonD = findViewById(R.id.buttonD);
        buttonE = findViewById(R.id.buttonE);

        buttonPrev = findViewById(R.id.buttonPrev);
        buttonNext = findViewById(R.id.buttonNext);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        questionTextView = findViewById(R.id.question_text_view);
        score_reveal = findViewById(R.id.score_reveal);

        questions.add(new Question(getString(R.string.question_1)));
        questions.add(new Question(getString(R.string.question_2)));
        questions.add(new Question(getString(R.string.question_3)));
        questions.add(new Question(getString(R.string.question_4)));
        questions.add(new Question(getString(R.string.question_5)));
        questions.add(new Question(getString(R.string.question_6)));
        questions.add(new Question(getString(R.string.question_7)));
        questions.add(new Question(getString(R.string.question_8)));
        questions.add(new Question(getString(R.string.question_9)));
        questions.add(new Question(getString(R.string.question_10)));

        //sets the current question to the textview
        questionTextView.setText(questions.get(currentQuestionIndex).getQuestion());


        //if prev Button is pressed
        buttonPrev.setOnClickListener(v -> {
            //hides the score reveal
            score_reveal.setText(null);

            //allows user to jump from first question to last
            if (currentQuestionIndex == 0)
                currentQuestionIndex = 9;
            else
                currentQuestionIndex--;

            //uncolors all buttons colors the pressed button
            buttonA.getBackground().setColorFilter(null);
            buttonB.getBackground().setColorFilter(null);
            buttonC.getBackground().setColorFilter(null);
            buttonD.getBackground().setColorFilter(null);
            buttonE.getBackground().setColorFilter(null);

            //colors the pressed button
            if (buttonPressed[currentQuestionIndex] != null) {
                buttonPressed[currentQuestionIndex].getBackground().setColorFilter(new LightingColorFilter(0x008577, 0xFFAA0000));
            }

            questionTextView.setText(questions.get(currentQuestionIndex).getQuestion());
        });

        //if Next button is clicked
        buttonNext.setOnClickListener(v -> {
            //hides score reveal
            score_reveal.setText(null);

            //allows user to jump from last question to first
            if (currentQuestionIndex == 9)
                currentQuestionIndex = 0;
            else
                currentQuestionIndex++;

            //uncolors all buttons colors the pressed button
            buttonA.getBackground().setColorFilter(null);
            buttonB.getBackground().setColorFilter(null);
            buttonC.getBackground().setColorFilter(null);
            buttonD.getBackground().setColorFilter(null);
            buttonE.getBackground().setColorFilter(null);

            //colors the pressed button
            if (buttonPressed[currentQuestionIndex] != null) {
                buttonPressed[currentQuestionIndex].getBackground().setColorFilter(new LightingColorFilter(0x008577, 0xFFAA0000));
            }
            questionTextView.setText(questions.get(currentQuestionIndex).getQuestion());
        });

        //if button A is pressed
        buttonA.setOnClickListener(v -> {
            score_reveal.setText(null);

            buttonA.getBackground().setColorFilter(null);
            buttonB.getBackground().setColorFilter(null);
            buttonC.getBackground().setColorFilter(null);
            buttonD.getBackground().setColorFilter(null);
            buttonE.getBackground().setColorFilter(null);

            //records that this button was pressed to the buttonPressed array and colors it
            buttonPressed[currentQuestionIndex] = buttonA;
            buttonA.getBackground().setColorFilter(new LightingColorFilter(0x008577, 0xFFAA0000));
        });

        //if button B is pressed
        buttonB.setOnClickListener(v -> {
            score_reveal.setText(null);

            buttonA.getBackground().setColorFilter(null);
            buttonB.getBackground().setColorFilter(null);
            buttonC.getBackground().setColorFilter(null);
            buttonD.getBackground().setColorFilter(null);
            buttonE.getBackground().setColorFilter(null);

            //records that this button was pressed to the buttonPressed array and colors it

            buttonPressed[currentQuestionIndex] = buttonB;
            buttonB.getBackground().setColorFilter(new LightingColorFilter(0x008577, 0xFFAA0000));
        });

        //if button C is pressed
        buttonC.setOnClickListener(v -> {
            score_reveal.setText(null);

            buttonA.getBackground().setColorFilter(null);
            buttonB.getBackground().setColorFilter(null);
            buttonC.getBackground().setColorFilter(null);
            buttonD.getBackground().setColorFilter(null);
            buttonE.getBackground().setColorFilter(null);

            //records that this button was pressed to the buttonPressed array and colors it
            buttonPressed[currentQuestionIndex] = buttonC;
            buttonC.getBackground().setColorFilter(new LightingColorFilter(0x008577, 0xFFAA0000));
        });

        //if button D is pressed
        buttonD.setOnClickListener(v -> {
            score_reveal.setText(null);

            buttonA.getBackground().setColorFilter(null);
            buttonB.getBackground().setColorFilter(null);
            buttonC.getBackground().setColorFilter(null);
            buttonD.getBackground().setColorFilter(null);
            buttonE.getBackground().setColorFilter(null);

            //records that this button was pressed to the buttonPressed array and colors it
            buttonPressed[currentQuestionIndex] = buttonD;
            buttonD.getBackground().setColorFilter(new LightingColorFilter(0x008577, 0xFFAA0000));


        });

        //if button E is pressed
        buttonE.setOnClickListener(v -> {
            score_reveal.setText(null);

            buttonA.getBackground().setColorFilter(null);
            buttonB.getBackground().setColorFilter(null);
            buttonC.getBackground().setColorFilter(null);
            buttonD.getBackground().setColorFilter(null);
            buttonE.getBackground().setColorFilter(null);

            //records that this button was pressed to the buttonPressed array and colors it
            buttonPressed[currentQuestionIndex] = buttonE;
            buttonE.getBackground().setColorFilter(new LightingColorFilter(0x008577, 0xFFAA0000));


        });

        //if submit button is pressed
        buttonSubmit.setOnClickListener(v -> {

            //for loop runs through the button pressed array
            for (int i = 0; i < 10; i++) {

                if (buttonPressed[i] == null)   //if there is not buttonObject at the ith index, or there is no answer, don't add to the score
                    continue;
                if (buttonPressed[i].getText().equals(questions.get(i).getAnswer())) { //if buttonPressed matches answer add one to the score.
                    score += 1;
                }
            }
            //returns score to the user
            if (score >= 7) {
                score_reveal.setText("Congratulations! Your score is " + score + " out of 10!");
            } else {
                score_reveal.setText("Uh oh! Your score is " + score + " out of 10!");
            }
            buttonA.getBackground().setColorFilter(null);
            buttonB.getBackground().setColorFilter(null);
            buttonC.getBackground().setColorFilter(null);
            buttonD.getBackground().setColorFilter(null);
            buttonE.getBackground().setColorFilter(null);

            //resets score and buttonPressed array
            score = 0;
            for (int i = 0; i < 10; i++) {
                buttonPressed[i] = null;
            }
        });


    }
}
