package admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yourskin.ListURL;
import com.example.yourskin.R;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

public class Update extends AppCompatActivity {
    EditText name,ingredient,cate,linkpic;
    Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        name = (EditText) findViewById(R.id.ed_name);
        ingredient = (EditText) findViewById(R.id.ed_ingre);
        cate = (EditText) findViewById(R.id.ed_cate);
        linkpic = (EditText) findViewById(R.id.ed_pic);
        update = (Button) findViewById(R.id.ed_update);
        StrictMode.enableDefaults();

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String n = name.getText().toString();
                    String i = ingredient.getText().toString();
                    String c = cate.getText().toString();
                    String p = linkpic.getText().toString();

                    HttpClient httpclient = new DefaultHttpClient();
                    HttpPost httppost = new HttpPost(ListURL.UPDATE_URL +n+"&ingredient="+i+"&id_category="+c+"&link_picture="+p);

                    HttpResponse response = httpclient.execute(httppost);
                    Toast.makeText(getApplicationContext(), "Update Success", Toast.LENGTH_LONG).show();
                    Log.e("pass 1", "connection success ");
                } catch (Exception e) {
                    Log.e("Fail 1", e.toString());
                    Toast.makeText(getApplicationContext(), e.toString(),
                            Toast.LENGTH_LONG).show();
                }

            }


        });

    }
}