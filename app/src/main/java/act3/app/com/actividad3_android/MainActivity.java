package act3.app.com.actividad3_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import act3.app.com.actividad3_android.Models.Persona;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Favor de ingresar datos del cliente");
        ((Editext)findViewById(R.idEdadEditText)).setTransformationMethod(null);
    }


    public void AddPersona() {
        String Nombre, ApellidoP, ApellidoM;
        int Edad;

        Nombre =((EditText)findViewById(R.id.txt_1)).getText().toString();
        ApellidoP = ((EditText)findViewById(R.id.txt_2)).getText().toString();
        ApellidoM = ((EditText)findViewById(R.id.txt_3)).getText().toString();
        String Edadst = ((EditText)findViewById(R.id.txt_4)).getText().toString();
        Edad = Integer.parseInt(Edadst);

        Persona persona = new Persona(Nombre, ApellidoP, ApellidoM, Edad);

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("Persona", Persona);
        startActivity(intent);
    }
}
