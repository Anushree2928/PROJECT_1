package charusat.ac.in.firebasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import charusat.ac.in.firebasedemo.EighthActivity;
import charusat.ac.in.firebasedemo.FifthActivity;
import charusat.ac.in.firebasedemo.NinthActivity;
import charusat.ac.in.firebasedemo.SeventhActivity;
import charusat.ac.in.firebasedemo.SixthActivity;
import charusat.ac.in.firebasedemo.TenthActivity;


public class FourthActivity extends AppCompatActivity {

    private Button CE;
    private Button IT;
    private Button EC;
    private Button EE;
    private Button ME;
    private Button CL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        setTitle("CR SELECTION");

        CE = (Button) findViewById(R.id.btnCE);
        IT = (Button) findViewById(R.id.btnIT);
        EC = (Button) findViewById(R.id.btnEC);
        EE = (Button) findViewById(R.id.btnEE);
        ME = (Button) findViewById(R.id.btnME);
        CL = (Button) findViewById(R.id.btnCL);

        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FourthActivity.this , FifthActivity.class);
                startActivity(intent);
            }
        });
        IT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FourthActivity.this , SixthActivity.class);
                startActivity(intent);
            }
        });
        EC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FourthActivity.this , SeventhActivity.class);
                startActivity(intent);
            }
        });
        EE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FourthActivity.this , EighthActivity.class);
                startActivity(intent);
            }
        });
        ME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FourthActivity.this , NinthActivity.class);
                startActivity(intent);
            }
        });
        CL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FourthActivity.this , TenthActivity.class);
                startActivity(intent);
            }
        });


    }

}
