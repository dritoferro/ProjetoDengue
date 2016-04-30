package tagliaferro.adriano.projetodengue;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Adriano on 30/04/2016.
 */
public class Lembrete extends AppCompatActivity {

    Spinner spTipo;
    ListView listAlarms;
    Button btnAgend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lembrete);

        ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        spTipo = (Spinner) findViewById(R.id.spTipo);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.tipos, android.R.layout.simple_spinner_item);
        spTipo.setAdapter(adapter);
        listAlarms = (ListView) findViewById(R.id.listLemb);
        ArrayAdapter alarms = ArrayAdapter.createFromResource(this, R.array.ListaLemb, android.R.layout.simple_list_item_1);
        listAlarms.setAdapter(alarms);
        btnAgend = (Button) findViewById(R.id.btnAgendAlarm);

        btnAgend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Alarme incluído com sucesso !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
