package essence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yourskin.ListProduct;
import com.example.yourskin.R;

import cleanser.fetchData;

public class essence extends AppCompatActivity {
    private Button Bpower;
    private Button Bstore;
    private Button Bandrew;
    private Button Bnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essence);

        Bpower = (Button) findViewById(R.id.powerbutton);
        Bpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPower();

            }
        });

        Bstore = (Button) findViewById(R.id.storebutton);
        Bstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToStore();

            }
        });

        Bandrew = (Button) findViewById(R.id.andrewbutton);
        Bandrew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAndrew();

            }
        });

        Bnext = (Button) findViewById(R.id.essencenext);
        Bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNext();

            }
        });
    }

    public void goToPower() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","11");
        startActivity(intent);
    }

    public void goToStore() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","12");
        startActivity(intent);
    }
    public void goToAndrew() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","13");
        startActivity(intent);
    }
    public void goToNext(){
        Intent intent = new Intent(this, ListProduct.class);
        intent.putExtra("id_category","103");
        startActivity(intent);
    }

}