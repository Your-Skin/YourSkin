package serum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yourskin.ListProduct;
import com.example.yourskin.R;

import cleanser.fetchData;

public class serum extends AppCompatActivity {
    private Button Bsarah;
    private Button Bkylie;
    private Button Bkypris;
    private Button Bniod;
    private Button Bnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serum);

        Bsarah = (Button) findViewById(R.id.sarahbutton);
        Bsarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSarah();

            }
        });

        Bkylie = (Button) findViewById(R.id.kyliebutton);
        Bkylie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToKylie();

            }
        });

        Bkypris = (Button) findViewById(R.id.kyprisbutton);
        Bkypris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToKypris();

            }
        });

        Bniod = (Button) findViewById(R.id.niodbutton);
        Bniod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNiod();

            }
        });

        Bnext = (Button) findViewById(R.id.serumnext);
        Bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNext();

            }
        });
    }

    public void goToSarah() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","14");
        startActivity(intent);
    }
    public void goToKylie() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","15");
        startActivity(intent);
    }
    public void goToKypris() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","16");
        startActivity(intent);
    }
    public void goToNiod() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","17");
        startActivity(intent);
    }
    public void goToNext(){
        Intent intent = new Intent(this, ListProduct.class);
        intent.putExtra("id_category","104");
        startActivity(intent);
    }




}