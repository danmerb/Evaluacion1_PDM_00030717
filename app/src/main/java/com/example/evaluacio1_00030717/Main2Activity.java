package com.example.evaluacio1_00030717;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tv_pro1,tv_pro2,tv_pro3,tv_pro4,tv_pro5,tv_pro6,tv_pro7,tv_pro8,tv_pro9,tv_user,tv_email,tv_productos;
    private Button btn_share;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_pro1=findViewById(R.id.et_pro1);
        tv_pro2=findViewById(R.id.et_pro2);
        tv_pro3=findViewById(R.id.et_pro3);
        tv_pro4=findViewById(R.id.et_pro4);
        tv_pro5=findViewById(R.id.et_pro5);
        tv_pro6=findViewById(R.id.et_pro6);
        tv_pro7=findViewById(R.id.et_pro7);
        tv_pro8=findViewById(R.id.et_pro8);
        tv_pro9=findViewById(R.id.et_pro9);
        tv_user=findViewById(R.id.usuario);
        tv_email=findViewById(R.id.email);
        tv_productos=findViewById(R.id.productos);
        btn_share=findViewById(R.id.btn_send);

        Intent mIntent= this.getIntent();
        if (mIntent!=null){
            tv_user.setText(mIntent.getStringExtra("NameKey"));
            tv_email.setText(mIntent.getStringExtra("emailKey"));
            tv_productos.setText(mIntent.getStringExtra("TotKey"));
            tv_pro1.setText(mIntent.getStringExtra("P1Key"));
            tv_pro2.setText(mIntent.getStringExtra("P2Key"));
            tv_pro3.setText(mIntent.getStringExtra("P3Key"));
            tv_pro4.setText(mIntent.getStringExtra("P4Key"));
            tv_pro5.setText(mIntent.getStringExtra("P5Key"));
            tv_pro6.setText(mIntent.getStringExtra("P6Key"));
            tv_pro7.setText(mIntent.getStringExtra("P7Key"));
            tv_pro8.setText(mIntent.getStringExtra("P8Key"));
            tv_pro9.setText(mIntent.getStringExtra("P9Key"));

        }


        }



}
