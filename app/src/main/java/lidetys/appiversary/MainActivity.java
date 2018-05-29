package lidetys.appiversary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtMessage;
    Button btnSurprise;
    TextView txtAnni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMessage = (TextView) findViewById(R.id.txt_message);
        txtAnni= (TextView) findViewById(R.id.txt_anni);
        btnSurprise = (Button) findViewById(R.id.btn_surprise);


        btnSurprise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magicHappen(v);
            }
        });
    }

    public void magicHappen(View view){

        txtMessage.setText("អូនស្រលាញ់បង");
        txtAnni.setText("5 years");
    }
}



