package charusat.ac.in.firebasedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {

    private TextView Name1;
    private TextView Result1;
    private TextView Name2;
    private TextView Result2;
    private TextView Name3;
    private TextView Result3;
    private Button Vote1;
    private Button Vote2;
    private Button Vote3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        getSupportActionBar().setTitle("CE DEPARTMENT");

        Name1 = (TextView) findViewById(R.id.tvName1);
        Result1 = (TextView) findViewById(R.id.tvResult1);
        Name2 = (TextView) findViewById(R.id.tvName2);
        Result2 = (TextView) findViewById(R.id.tvResult2);
        Name3 = (TextView) findViewById(R.id.tvName3);
        Result3 = (TextView) findViewById(R.id.tvResult3);
        Vote1 = (Button) findViewById(R.id.btnVote1);
        Vote2 = (Button) findViewById(R.id.btnVote2);
        Vote3 = (Button) findViewById(R.id.btnVote3);

        Vote1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FifthActivity.this , EleventhActivity.class);
                startActivity(intent);
            }
        });
        Vote2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FifthActivity.this , EleventhActivity.class);
                startActivity(intent);
            }
        });
        Vote3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FifthActivity.this , EleventhActivity.class);
                startActivity(intent);
            }
        });

    }
}
