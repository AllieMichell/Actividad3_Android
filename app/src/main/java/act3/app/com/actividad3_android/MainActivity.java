package act3.app.com.actividad3_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT1 = "com.extra.application.example.EXTRA_TEXT1";
    public static final String EXTRA_TEXT2 = "com.extra.application.example.EXTRA_TEXT2";
    public static final String EXTRA_TEXT3 = "com.extra.application.example.EXTRA_TEXT3";
    public static final String EXTRA_NUMBER = "com.extra.application.example.EXTRA_NUMBER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn_EN);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openMain2Activity();
            }
        });
    }

    public void openMain2Activity() {
        EditText editText1 = (EditText) findViewById(R.id.txt_1);
        String text1 = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.txt_2);
        String text2 = editText2.getText().toString();

        EditText editText3 = (EditText) findViewById(R.id.txt_3);
        String text3 = editText3.getText().toString();

        EditText editText4 = (EditText) findViewById(R.id.txt_4);
        int number = Integer.parseInt(editText4.getText().toString());

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra(EXTRA_TEXT1, text1);
        intent.putExtra(EXTRA_TEXT2, text2);
        intent.putExtra(EXTRA_TEXT3, text3);
        intetn.putExtra(EXTRA_NUMBER, number);
        startActivity(intent);
    }
}
