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
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class HyobinActivity extends AppCompatActivity {

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
                Snackbar.make(view, "The snackbar was clicked", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                intent = new Intent(this, ImActivity.class);
                startActivity(intent);
            default:
                break;

        }
    }
}