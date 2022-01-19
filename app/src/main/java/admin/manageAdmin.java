package admin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.yourskin.MainActivity;
import com.example.yourskin.R;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import cleanser.fetchData;

public class manageAdmin extends AppCompatActivity {
    private Button Binsert;
    private Button Bdelete;
    private Button Bupdate;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_admin);

        Binsert = (Button)findViewById(R.id.buttoninsert);
        Binsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToInsert();

            }
        });

        Bdelete = (Button)findViewById(R.id.buttondelete);
        Bdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDelete();

            }
        });

        Bupdate = (Button)findViewById(R.id.buttonupdate);
        Bupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUpdate();

            }
        });

        logout = (Button) findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(manageAdmin.this);
                builder.setTitle("Logout");
                builder.setMessage("Do you want to Logout?");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                        finish();

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "cancel", Toast.LENGTH_LONG).show();
                    }
                });
                builder.show();
            }
        });
    }

    private void goToDelete() {
        Intent intent = new Intent(this, Delete.class);
        startActivity(intent);
    }

    private void goToInsert() {
        Intent intent = new Intent(this, Insert.class);
        startActivity(intent);
    }
    private void goToUpdate() {
        Intent intent = new Intent(this, Update.class);
        startActivity(intent);
    }
}