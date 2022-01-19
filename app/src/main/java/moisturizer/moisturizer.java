package moisturizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yourskin.ListProduct;
import com.example.yourskin.R;

import cleanser.fetchData;

public class moisturizer extends AppCompatActivity {
    private Button Bam;
    private Button Bsurge;
    private Button Bnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moisturizer);

        Bam = (Button) findViewById(R.id.ambutton);
        Bam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAm();

            }
        });

        Bsurge = (Button) findViewById(R.id.surgebutton);
        Bsurge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSurge();

            }
        });

        Bnext = (Button) findViewById(R.id.moisrnext);
        Bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNext();

            }
        });
    }

    public void goToAm() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","19");
        startActivity(intent);
    }
    public void goToSurge() {
        Intent intent = new Intent(this,fetchData.class);
        intent.putExtra("id_skin","18");
        startActivity(intent);
    }
    public void goToNext(){
        Intent intent = new Intent(this, ListProduct.class);
        intent.putExtra("id_category","105");
        startActivity(intent);
    }

}