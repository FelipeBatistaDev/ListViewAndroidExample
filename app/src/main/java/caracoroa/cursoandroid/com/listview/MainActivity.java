package caracoroa.cursoandroid.com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private ListView lista;

    private String[] itens = {"São Paulo","Parana", "Santa Catarina",
    "Minas gerais", "São Joaquim", "Liberdade", "Agusta", "Texas", "Disorder", "Inferno", "higienopolis", "paraisopolis", "Sao judas"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int valorClicado = position;
                String valor = (String) lista.getItemAtPosition(valorClicado);
                Toast.makeText(getApplicationContext(), valor , Toast.LENGTH_LONG).show();
            }
        });
    }

}
