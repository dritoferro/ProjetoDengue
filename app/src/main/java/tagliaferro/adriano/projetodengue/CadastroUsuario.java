package tagliaferro.adriano.projetodengue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Adriano on 30/04/2016.
 */
public class CadastroUsuario extends AppCompatActivity implements View.OnClickListener{

    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cadastro_usuario);

        ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        btnSave = (Button) findViewById(R.id.btnSalvarPerfil);
        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, Focos.class);
        Toast.makeText(this, "Incluído com sucesso !", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
}
