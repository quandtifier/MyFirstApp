package edu.tacoma.uw.css.quandm.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    public static final String TAG = "DisplayMessageActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the extra content
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
        Log.e(TAG, "onCreate");
    }


    /**Called from user tap of the Send button
     * Makes the activity visible to the user
     * We may register a BroadcastReceiver here
     * Once callback finishes the system invokes onResume()*/
    @Override public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    /**State in which the app interacts with the user
     * Stays in this state until focus is taken away
     * An interruption send the activity into Pause state by invoking onPause()
     * Implement onResume() to initialize components released during onPause()*/
    @Override public void onResume() {
        super.onResume();

        Log.i(TAG, "onResume");
    }

    /**Called whenever user leaves an activity
     * Can be used to release resources in order to save energy or performance
     * If activity visibility reduces to invisible then onStop() is invoked*/
    @Override public void onPause() {
        super.onPause();
        Log.w(TAG, "onPause");
    }

    /**Activity is no longer visible or is completed running and is about to terminate
     * Release nearly all resources here
     * Perform CPU intensive shutdown operations here*/
    @Override public void onStop() {
        super.onStop();
        Log.v(TAG, "onStop");
    }

    /**Final call that an activity receives
     * only called by someone has called finish() or system my temporarily destroy to save space
     * Can distinguish between the two cases by calling isFinishing()
     * Orientation changes also call this method then onCreate() to recreate the process*/
    @Override public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }
}
