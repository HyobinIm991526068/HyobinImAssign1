/*
Hyobin Im s991526068
This is assignment 1 to demonstrate the use of activities and how to invoke 3rd party app
 */
package hyobin.im.s991526068;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ImActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im);

        Intent intent = getIntent();
        String message = intent.getStringExtra(HyobinActivity.userInput);

        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);
    }

}