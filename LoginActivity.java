package com.example.myteacher;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class LoginActivity extends AppCompatActivity {
    EditText username,pass;
    Button login,register;
    Databeas db;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=findViewById(R.id.input_name);
        pass=findViewById(R.id.input_password);
        register=findViewById(R.id.signup1);
        login=findViewById(R.id.login);


        db=new Databeas(this);




        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=username.getText().toString();
                String password=pass.getText().toString();
                Boolean Chkemailpass=db.emailpassword(email,password);
                if (Chkemailpass==true) {
                    Toast.makeText(LoginActivity.this, "Successfully Login", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(getApplicationContext(), Educational_level_activity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(LoginActivity.this, "Wrong email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


}