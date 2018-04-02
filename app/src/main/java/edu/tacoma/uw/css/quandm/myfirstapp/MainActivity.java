package edu.tacoma.uw.css.quandm.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "edu.tacoma.uw.css.quandm.myfirstapp.MESSAGE";
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /**creates intent to move to the DisplayMessageActivity
     * Binds the intended data with the intent for the next activity to use*/
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
