package act3.app.com.actividad3_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("Datos Persona");


        Intent intetn = getIntent();
        String Persona = intent.getParcelableArrayListExtra("Persona");

        ((TextView)findViewById(R.id.txt_1)).setText(Persona.getNombre());
        ((TextView)findViewById(R.id.txt_2)).setText(Persona.getApellidoP());
        ((TextView)findViewById(R.id.txt_3)).setText(Persona.getApellidoM());
        ((TextView)findViewById(R.id.txt_4)).setText(Persona.getEdad() + " años de Edad");
    }
}
