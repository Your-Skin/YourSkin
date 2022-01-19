package cream;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yourskin.ListProduct;
import com.example.yourskin.R;

import cleanser.fetchData;

public class cream extends AppCompatActivity {
    private Button Bpaula;
    private Button Bmay;
    private Button Binfused;
    private Button Bsoon;
    private Button Bnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cream);

        Bpaula = (Button) findViewById(R.id.tangobutton);
        Bpaula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPaula();

            }
        });

        Bmay = (Button) findViewById(R.id.maybutton);
        Bmay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMay();

            }
        });

        Binfused = (Button) findViewById(R.id.infusedbutton);
        Binfused.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToInfused();

            }
        });

        Bsoon = (Button) findViewById(R.id.soonbutton);
        Bsoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSoon();

            }
        });

        Bnext = (Button) findViewById(R.id.creamnext);
        Bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNext();

            }
        });
    }
    public void goToPaula() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","20");
        startActivity(intent);
    }
    public void goToMay() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","21");
        startActivity(intent);
    }
    public void goToInfused() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","22");
        startActivity(intent);
    }
    public void goToSoon() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","23");
        startActivity(intent);
    }
    public void goToNext(){
        Intent intent = new Intent(this, ListProduct.class);
        intent.putExtra("id_category","106");
        startActivity(intent);
    }
}