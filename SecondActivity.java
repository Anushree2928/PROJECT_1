package charusat.ac.in.firebasedemo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity {

    private FirebaseAuth fbAuth;
    private EditText EmailId;
    private EditText Password;
    private Button Login;
    private TextView Info;
    private TextView SignUp;
    private int counter=5;

    private ProgressDialog progressDialog;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setTitle("Login");

//        progressDialog.setMessage("Signing In...");
//        progressDialog.show();

        EmailId = (EditText) findViewById(R.id.etEmailId);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);
        Info = (TextView) findViewById(R.id.tvInfo);
        SignUp = (TextView) findViewById(R.id.tvSignUp);

        Info.setText("No. of attempts remaining : 5");

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                validate(EmailId.getText().toString().trim(), Password.getText().toString().trim());
            }
        });
        SignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this , ThirdActivity.class));
            }

        });

    }

    private void validate(String userEmailId , String userPassword)
    {
        Log.d("Name",userEmailId);
        if((userEmailId.equals("sheenashah132@gmail.com")) && (userPassword.equals("1234")))
        {

            Intent intent = new Intent(SecondActivity.this , FourthActivity.class);

            startActivity(intent);
        }

        else if(TextUtils.isEmpty(userEmailId) || TextUtils.isEmpty(userPassword) )
        {
            Toast.makeText(this ,"Please enter all the details", Toast.LENGTH_SHORT).show();

        }

        else {
            counter --;
            Info.setText("No. of attempts remaining : " + String.valueOf(counter));

            if(counter == 0 ) {
                Login.setEnabled(false);
            }

        }//else ends
    } //validate ends

//    //when user wants to reset password..
//    public void sendemail(View view)
//    {
//        forresetemail = cardemail.getText().toString().trim();
//
//
//        if(TextUtils.isEmpty(forresetemail))
//        {
//            Toast.makeText(getApplicationContext(),"Enter Email first..",Toast.LENGTH_SHORT).show();
//            return;
//        }
//        progressDialog.setTitle("Reset Password");
//        progressDialog.setMessage("sending link for reset Password");
//        progressDialog.show();
//
//        FirebaseAuth.getInstance().sendPasswordResetEmail(forresetemail)
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//                        if (task.isSuccessful()) {
//
//
//                            cardView.setVisibility(View.INVISIBLE);
//                            Toast.makeText(getApplicationContext(),"link sent successfuly to your Email...",Toast.LENGTH_SHORT).show();
//                        }else
//                        {
//                            try
//                            {
//                                throw task.getException();
//                            }catch(Exception e)
//                            {
//                                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                        progressDialog.cancel();
//                    }
//                });
//    }
} //class ends
