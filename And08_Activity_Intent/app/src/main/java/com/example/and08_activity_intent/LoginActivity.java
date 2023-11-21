package com.example.and08_activity_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edt_id;
    EditText edt_pw;
    Button btn_login;
    TextView tv_join;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_id = findViewById(R.id.edt_id);
        edt_pw = findViewById(R.id.edt_pw);
        btn_login = findViewById(R.id.btn_login);
        //setOnclickListener.

        tv_join = findViewById(R.id.tv_join);



        tv_join.setOnClickListener(v ->


        Toast.makeText(this, "나는 컨", Toast.LENGTH_SHORT).show();








        btn_login.setOnClickListener(v -> {




            Log.d("로그인", edt_id.getText()+"");
            Log.d("로그인", edt_pw.getText()+"");
            if("admin".equals(edt_id.getText()+"") && "admin1234".equals(edt_pw.getText()+"")) {
                Log.d("로그인 성공", edt_id.getText()+"");
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }else{
                Log.d("로그인 실패", edt_pw.getText()+"");
            }

        });



    }
}