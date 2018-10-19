package charusat.ac.in.firebasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    private Button Login;
    private Button Register;
    private TextView Wel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        getSupportActionBar().setTitle("Voting Online");

        Login    = (Button) findViewById(R.id.btnLogin);
        Register = (Button) findViewById(R.id.btnRegister);
        Wel      = (TextView) findViewById(R.id.tvWel);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this , SecondActivity.class);
                startActivity(intent);
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this , ThirdActivity.class);
                startActivity(intent);
            }
        });

    }
}
