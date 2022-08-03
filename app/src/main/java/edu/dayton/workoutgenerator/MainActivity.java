package edu.dayton.workoutgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Generate Workout reference button
        Button btnWorkout = (Button) findViewById(R.id.genWorkoutBtn);
        View.OnClickListener btnWorkoutListener = new View.OnClickListener() {

            RadioButton beginner = (RadioButton) findViewById(R.id.beginner);
            RadioButton intermediate = (RadioButton) findViewById(R.id.intermediate);
            RadioButton advanced = (RadioButton) findViewById(R.id.advanced);
            RadioButton three = (RadioButton) findViewById(R.id.three);
            RadioButton four = (RadioButton) findViewById(R.id.four);
            RadioButton five = (RadioButton) findViewById(R.id.five);
            RadioButton six = (RadioButton) findViewById(R.id.six);

            @Override
            public void onClick(View view) {

                // generate valid workout
                try {

                    String url = null;

                    if (beginner.isChecked() && three.isChecked()) {

                        url = "https://docs.google.com/spreadsheets/d/1EncYsVjWyyxsKc4m6ekuvNO2O0gPXctEKvWS6Ie0A10/edit#gid=0";

                    } else if (beginner.isChecked() && four.isChecked()) {

                        url = "https://docs.google.com/spreadsheets/d/1Ek9sMHImFHvKeDneKsyf0GC9eC4QmeHJVLFMvgPOVVo/edit#gid=0";

                    } else if (intermediate.isChecked() && three.isChecked()) {

                        url = "https://docs.google.com/spreadsheets/d/1ULqwv9q8Wnqj8dvYm7pPqRjrNV9XBvka4lZCXQ760Tg/edit#gid=0";

                    } else if (intermediate.isChecked() && four.isChecked()) {

                        url = "https://docs.google.com/spreadsheets/d/15qSBfnbz__H_VIfqGhWq2p2vuNrehMCFFcablnHkezk/edit#gid=0";

                    } else if (intermediate.isChecked() && five.isChecked()) {

                        url = "https://docs.google.com/spreadsheets/d/1WninD89_ScInedEFEkUVwBRY8ozoPsKnwllHxuDEHKc/edit#gid=0";

                    } else if (advanced.isChecked() && five.isChecked()) {

                        url = "https://docs.google.com/spreadsheets/d/1rZv2BxOkEqvlLJxjSA68YEupx73gQLvIhsAN7tQwm6E/edit#gid=0";

                    } else if (advanced.isChecked() && six.isChecked()) {

                        url = "https://docs.google.com/spreadsheets/d/1AwOi92LKQ64tgs1a0V4e2dYWckfxQO7xFThLkQWpoXo/edit#gid=0";

                    } else {
                        Toast myToast = Toast.makeText(MainActivity.this,
                                "Invalid Selection, too many or few days chosen for workout" +
                                        " level. Beginner 3-4 days, Intermediate 3-5 days, " +
                                        "Advanced 5-6 days",
                                Toast.LENGTH_LONG);
                        myToast.show();
                    }
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                } catch (Exception e) {
                    Toast myToast = Toast.makeText(MainActivity.this, e.toString(),
                            Toast.LENGTH_LONG);
                    myToast.show();
                }
            }
        };
        btnWorkout.setOnClickListener(btnWorkoutListener);
    }
}