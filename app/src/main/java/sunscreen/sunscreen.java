package sunscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yourskin.ListProduct;
import com.example.yourskin.R;

import cleanser.fetchData;

public class sunscreen extends AppCompatActivity {
    private Button Bboat;
    private Button Bspf;
    private Button Bmilk;
    private Button Boil;
    private Button Bnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunscreen);

        Bboat = (Button) findViewById(R.id.boatbutton);
        Bboat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBoat();

            }
        });

        Bspf = (Button) findViewById(R.id.spfbutton);
        Bspf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSpf();

            }
        });

        Bmilk = (Button) findViewById(R.id.milkbutton);
        Bmilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMilk();

            }
        });

        Boil = (Button) findViewById(R.id.oilbutton);
        Boil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToOil();

            }
        });

        Bnext = (Button) findViewById(R.id.sunnext);
        Bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNext();

            }
        });
    }
    public void goToBoat() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","24");
        startActivity(intent);
    }
    public void goToSpf() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","25");
        startActivity(intent);
    }
    public void goToMilk() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","26");
        startActivity(intent);
    }
    public void goToOil() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","27");
        startActivity(intent);
    }
    public void goToNext(){
        Intent intent = new Intent(this, ListProduct.class);
        intent.putExtra("id_category","107");
        startActivity(intent);
    }
}