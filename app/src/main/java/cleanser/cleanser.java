package cleanser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yourskin.ListProduct;
import com.example.yourskin.R;

public class cleanser extends AppCompatActivity {
    private Button Blowph;
    private Button Borg;
    private Button Bbioderma;
    private Button Bcalsbutton;
    private Button Balpha;
    private Button Bthebody;
    private Button Bnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleanser);
        Blowph = (Button) findViewById(R.id.lowphbutton);
        Blowph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLowpH();

            }
        });

        Borg = (Button)findViewById(R.id.orgbutton);
        Borg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToORG();

            }
        });

        Bbioderma = (Button)findViewById(R.id.biodermabutton);
        Bbioderma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBioderma();

            }
        });

        Bcalsbutton = (Button)findViewById(R.id.ceuticalsbutton);
        Bcalsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCeuticals();

            }
        });

        Balpha = (Button)findViewById(R.id.alphabutton);
        Balpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAlpha();

            }
        });

        Bthebody = (Button)findViewById(R.id.thebodybutton);
        Bthebody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToThebody();

            }
        });

        Bnext = (Button)findViewById(R.id.cleansernext);
        Bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNext();

            }
        });
    }
    public void goToThebody() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","6");
        startActivity(intent);
    }
    public void goToAlpha() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","5");
        startActivity(intent);
    }

    public void goToCeuticals() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","4");
        startActivity(intent);
    }

    public void goToLowpH() {
//        HttpClient httpclient = new DefaultHttpClient();
//        int skin = 1;
//        HttpsTrustManager.allowAllSSL();
//        HttpPost httppost = new HttpPost("http://172.20.10.6/fetch/fetch_skincare.php?skin=" +skin);
//        try {
//            HttpResponse response = httpclient.execute(httppost);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","1");
        startActivity(intent);
    }

    public void goToORG() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","2");
        startActivity(intent);
    }
    public void goToBioderma() {
        Intent intent = new Intent(this, fetchData.class);
        intent.putExtra("id_skin","3");
        startActivity(intent);
    }
    public void goToNext(){
        Intent intent = new Intent(this, ListProduct.class);
        intent.putExtra("id_category","101");
        startActivity(intent);
    }


}