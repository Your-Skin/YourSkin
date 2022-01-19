package toner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yourskin.ListProduct;
import com.example.yourskin.R;

import cleanser.fetchData;

public class toner extends AppCompatActivity {
    private Button Bkiehl;
    private Button Bthayers;
    private Button Banua;
    private Button Bpixi;
    private Button Bnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toner);

        Bkiehl = (Button) findViewById(R.id.kiehlbutton);
        Bkiehl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToKiehl();

            }
        });

        Bthayers = (Button) findViewById(R.id.thayersbutton);
        Bthayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToThayers();

            }
        });

        Banua = (Button) findViewById(R.id.anuabutton);
        Banua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAnua();

            }
        });

        Bpixi = (Button) findViewById(R.id.pixibutton);
        Bpixi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPixi();

            }
        });

        Bnext = (Button) findViewById(R.id.tonerrnext);
        Bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNext();

            }
        });


    }

    public void goToKiehl() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","7");
        startActivity(intent);
    }

    public void goToThayers() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","8");
        startActivity(intent);
    }
    public void goToAnua() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","9");
        startActivity(intent);
    }
    public void goToPixi() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","10");
        startActivity(intent);
    }
    public void goToNext(){
        Intent intent = new Intent(this, ListProduct.class);
        intent.putExtra("id_category","102");
        startActivity(intent);
    }
}