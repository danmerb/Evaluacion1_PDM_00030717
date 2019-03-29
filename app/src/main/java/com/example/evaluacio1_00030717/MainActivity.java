package com.example.evaluacio1_00030717;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private int cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont_productos;
    private LinearLayout ly_prod1,ly_prod2,ly_prod3,ly_prod4,ly_prod5,ly_prod6,ly_prod7,ly_prod8,ly_prod9;
    private TextView tv_pro1,tv_pro2,tv_pro3,tv_pro4,tv_pro5,tv_pro6,tv_pro7,tv_pro8,tv_pro9;
    private EditText et_username,et_email;
    private Button btn_enviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ly_prod1=findViewById(R.id.ly_pro1);
        ly_prod2=findViewById(R.id.ly_pro2);
        ly_prod3=findViewById(R.id.ly_pro3);
        ly_prod4=findViewById(R.id.ly_pro4);
        ly_prod5=findViewById(R.id.ly_pro5);
        ly_prod6=findViewById(R.id.ly_pro6);
        ly_prod7=findViewById(R.id.ly_pro7);
        ly_prod8=findViewById(R.id.ly_pro8);
        ly_prod9=findViewById(R.id.ly_pro9);


        tv_pro1=findViewById(R.id.et_pro1);
        tv_pro2=findViewById(R.id.et_pro2);
        tv_pro3=findViewById(R.id.et_pro3);
        tv_pro4=findViewById(R.id.et_pro4);
        tv_pro5=findViewById(R.id.et_pro5);
        tv_pro6=findViewById(R.id.et_pro6);
        tv_pro7=findViewById(R.id.et_pro7);
        tv_pro8=findViewById(R.id.et_pro8);
        tv_pro9=findViewById(R.id.et_pro9);

        et_username=findViewById(R.id.et_usuario);
        et_email=findViewById(R.id.et_email);
        btn_enviar=findViewById(R.id.btn_send);


        ly_prod1.setOnClickListener(this);
        ly_prod2.setOnClickListener(this);
        ly_prod3.setOnClickListener(this);
        ly_prod4.setOnClickListener(this);
        ly_prod5.setOnClickListener(this);
        ly_prod6.setOnClickListener(this);
        ly_prod7.setOnClickListener(this);
        ly_prod8.setOnClickListener(this);
        ly_prod9.setOnClickListener(this);
        btn_enviar.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.ly_pro1:
                cont1++;
                cont_productos++;
                tv_pro1.setText(Integer.toString(cont1));
                break;
            case R.id.ly_pro2:
                cont2++;
                cont_productos++;
                tv_pro2.setText(Integer.toString(cont2));
                break;
            case R.id.ly_pro3:
                cont3++;
                cont_productos++;
                tv_pro3.setText(Integer.toString(cont3));
                break;
            case R.id.ly_pro4:
                cont4++;
                cont_productos++;
                tv_pro4.setText(Integer.toString(cont4));
                break;

            case R.id.ly_pro5:
                cont5++;
                cont_productos++;
                tv_pro5.setText(Integer.toString(cont5));
                break;
            case R.id.ly_pro6:
                cont6++;
                cont_productos++;
                tv_pro6.setText(Integer.toString(cont6));
                break;
            case R.id.ly_pro7:
                cont7++;
                cont_productos++;
                tv_pro7.setText(Integer.toString(cont7));
                break;

            case R.id.ly_pro8:
                cont8++;
                cont_productos++;
                tv_pro8.setText(Integer.toString(cont8));
                break;
            case R.id.ly_pro9:
                cont9++;
                cont_productos++;
                tv_pro9.setText(Integer.toString(cont9));
                break;
            case R.id.btn_send:
                Intent mIntend= new Intent(MainActivity.this,Main2Activity.class);
                mIntend.putExtra("NameKey",et_username.getText().toString());
                mIntend.putExtra("emailKey",et_email.getText().toString());
                mIntend.putExtra("TotKey",Integer.toString(cont_productos));
                mIntend.putExtra("P1Key",tv_pro1.getText().toString());
                mIntend.putExtra("P2Key",tv_pro2.getText().toString());
                mIntend.putExtra("P3Key",tv_pro3.getText().toString());
                mIntend.putExtra("P4Key",tv_pro4.getText().toString());
                mIntend.putExtra("P5Key",tv_pro5.getText().toString());
                mIntend.putExtra("P6Key",tv_pro6.getText().toString());
                mIntend.putExtra("P7Key",tv_pro7.getText().toString());
                mIntend.putExtra("P8Key",tv_pro8.getText().toString());
                mIntend.putExtra("P9Key",tv_pro9.getText().toString());
                startActivity(mIntend);




        }




    }
}
