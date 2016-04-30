package tagliaferro.adriano.projetodengue;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Adriano on 30/04/2016.
 */
public class Notify extends AppCompatActivity implements View.OnClickListener{

    int REQUEST_IMAGE_OPEN = 1;
    Button btnGaleria, btnEnviar;
    ImageView imageView;
    int at;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_notify);

        ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        btnGaleria = (Button) findViewById(R.id.btnGaleria);
        imageView = (ImageView) findViewById(R.id.imgWarning);
        btnEnviar = (Button) findViewById(R.id.btnSent);

        Intent atual = getIntent();
        Bundle b = new Bundle();
        b = atual.getExtras();
        at = b.getInt("cont");

        btnGaleria.setOnClickListener(this);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Focos.class);
                at++;
                i.putExtra("cont", at);
                Toast.makeText(getApplicationContext(), "Enviado com sucesso !", Toast.LENGTH_SHORT).show();
                setResult(RESULT_OK, i);
                finish();
            }
        });

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.setType("image/*");
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(intent, REQUEST_IMAGE_OPEN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_OPEN && resultCode == RESULT_OK) {
            Uri fullPhotoUri = data.getData();
        }
        switch (at){

            case 1:
                imageView.setImageResource(R.drawable.foco1);
                break;

            case 2:
                imageView.setImageResource(R.drawable.foco2);
                break;

            case 3:
                imageView.setImageResource(R.drawable.foco3);
                break;

            case 4:
                imageView.setImageResource(R.drawable.foco4);
                break;
        }
        imageView.setVisibility(View.VISIBLE);
    }
}
