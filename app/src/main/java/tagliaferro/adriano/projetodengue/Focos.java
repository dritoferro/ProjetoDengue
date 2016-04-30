package tagliaferro.adriano.projetodengue;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Adriano on 30/04/2016.
 */
public class Focos extends AppCompatActivity{

    int at = 1;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_focos);

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        img = (ImageView) findViewById(R.id.imgMap);
    }

    public void notificar(View view){
        Intent i = new Intent(this, Notify.class);
        i.putExtra("cont", at);
        startActivityForResult(i, 1);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1 && resultCode == RESULT_OK){
            if(data != null){
                Bundle bundle = data.getExtras();
                at = bundle.getInt("cont");
                switch (at){
                    case 2:
                        img.setImageResource(R.drawable.img1);
                        break;

                    case 3:
                        img.setImageResource(R.drawable.img2);
                        break;

                    case 4:
                        img.setImageResource(R.drawable.img3);
                        break;

                    case 5:
                        img.setImageResource(R.drawable.img4);
                        break;
                }
            }
        }
    }

    public void lembretes(View view){
        Intent i = new Intent(this, Lembrete.class);
        startActivity(i);
    }

    public void perfil(View view){
        Intent i = new Intent(this, CadastroUsuario.class);
        startActivity(i);
    }
}
