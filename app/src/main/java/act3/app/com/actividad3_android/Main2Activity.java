package act3.app.com.actividad3_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intetn = getIntent();
        String text1 = intent.getStringExtra(MainActivity.EXTRA_TEXT1);
        String text2 = intent.getStringExtra(MainActivity.EXTRA_TEXT2);
        String text3 = intent.getStringExtra(MainActivity.EXTRA_TEXT3);
        int number = intetn.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        TextView textView1 = (TextView) findViewById(R.id.txt_1);
        TextView textView2 = (TextView) findViewById(R.id.txt_2);
        TextView textView3 = (TextView) findViewById(R.id.txt_3);
        TextView textView4 = (TextView) findViewById(R.id.txt_4);

        textView1.setText(text);
        textView2.setText(text);
        textView3.setText(text);
        textView4.setText(" " + number);
    }
}
