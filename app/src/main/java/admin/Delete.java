package admin;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.yourskin.ListURL;
import com.example.yourskin.R;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

public class Delete extends AppCompatActivity {

    EditText id;
    Button delete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);


        id = (EditText) findViewById(R.id.editText1);
        delete = (Button) findViewById(R.id.button1);
        StrictMode.enableDefaults();

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Delete.this);
                builder.setTitle("Delete");
                builder.setMessage("Do you want to delete?");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {

                        try {
                            String m = id.getText().toString();

                            HttpClient httpclient = new DefaultHttpClient();
                            HttpPost httppost = new HttpPost(ListURL.DELETE_URL +m);

                            HttpResponse response = httpclient.execute(httppost);
                            Toast.makeText(getApplicationContext(), "Delete Success", Toast.LENGTH_LONG).show();

                        } catch (Exception e) {
                            Log.e("Fail 1", e.toString());
                            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();

                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Cancel", Toast.LENGTH_LONG).show();
                    }
                });
                builder.show();

            }
        });
    }
}
