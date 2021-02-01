/*
Hyobin Im s991526068
This is assignment 1 to demonstrate the use of activities and how to invoke 3rd party app
 */
package hyobin.im.s991526068;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class HyobinActivity extends AppCompatActivity {
    public static final String userInput="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callIntent(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.buttonToast:
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.toast_label);
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(getString(R.string.site_label)));
                startActivity(intent);
                break;
            case R.id.buttonSnackbar:
                Context contextTwo = getApplicationContext();
                CharSequence textTwo = getString(R.string.snackbar_label);
                Snackbar.make(view, textTwo, Snackbar.LENGTH_LONG)
                        .setAction(R.string.action_text, null).show();
                intent = new Intent(this, ImActivity.class);
                EditText editText = (EditText) findViewById(R.id.editText);
                String message =editText.getText().toString();
                intent.putExtra(userInput, message);
                startActivity(intent);
            default:
                break;
        }
    }
}