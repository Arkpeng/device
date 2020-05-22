package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public EditText edt_xsjg;
    public EditText edt_zxl;
    public EditText edt_cgjg;
    public EditText edt_yzf;
    public EditText edt_zjlx;
    public EditText edt_txlx;
    public EditText edt_mblr;
    public EditText edt_cgxj;
    public Button exit;
    public Button reset;
    public Button count;
    public String xsjg;
    public String zxl;
    public String cgjg;
    public String yzf;
    public String zjlx;
    public String txlx;
    public String mblr;
    public String cgxj;
    public Float f_xsjg;
    public Float f_zxl;
    public Float f_cgjg;
    public Float f_yzf;
    public Float f_zjlx;
    public Float f_txlx;
    public Float f_mblr;
    public Float f_cgxj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        exit.setOnClickListener(this);
        reset.setOnClickListener(this);
        count.setOnClickListener(this);
    }

    private void init() {
        edt_cgjg = (EditText) findViewById(R.id.edt_cgjg);
        edt_zxl = (EditText) findViewById(R.id.edt_zxl);
        edt_cgjg = (EditText) findViewById(R.id.edt_cgjg);
        edt_yzf = (EditText) findViewById(R.id.edt_yzf);
        edt_zjlx = (EditText) findViewById(R.id.edt_zjlx);
        edt_txlx = (EditText) findViewById(R.id.edt_txlx);
        edt_mblr = (EditText) findViewById(R.id.edt_mblr);
        edt_cgxj = (EditText) findViewById(R.id.edt_cgxj);
        edt_xsjg = findViewById(R.id.edt_xsjg);
        exit = (Button) findViewById(R.id.exit);
        reset = (Button) findViewById(R.id.reset);
        count = (Button) findViewById(R.id.count);
        /*edt_xsjg.setText("");
        edt_zxl.setText("");
        edt_cgjg.setText("");
        edt_yzf.setText("");
        edt_zjlx.setText("");
        edt_txlx.setText("");
        edt_mblr.setText("");*/
    }

    private void getCount(){
        //String a = edt_xsjg.getText().toString().trim();
        if(edt_xsjg.getText().toString().trim().length()==0){
            Toast.makeText(MainActivity.this,"请输入销售价格",Toast.LENGTH_SHORT).show();
            return;
        } else {
            xsjg = edt_xsjg.getText().toString();
            f_xsjg = Float.valueOf(xsjg);
        }
        //String b =edt_zxl.getText().toString().trim();
        if(edt_zxl.getText().toString().trim().length()==0){
            Toast.makeText(MainActivity.this,"请输入折现率",Toast.LENGTH_SHORT).show();
            return;
        } else {
            zxl = edt_zxl.getText().toString();
            f_zxl = Float.valueOf(zxl);
        }
        //String c =edt_cgjg.getText().toString().trim();
        if(edt_cgjg.getText().toString().trim().length()==0){
            Toast.makeText(MainActivity.this,"请输入采购价格",Toast.LENGTH_SHORT).show();
            return;
        } else {
            cgjg = edt_cgjg.getText().toString();
            f_cgjg = Float.valueOf(cgjg);
        }
        //String d = edt_yzf.getText().toString().trim();
        if(edt_yzf.getText().toString().trim().length()==0){
            Toast.makeText(MainActivity.this,"请输入运杂费",Toast.LENGTH_SHORT).show();
            return;
        } else {
            yzf = edt_yzf.getText().toString();
            f_yzf = Float.valueOf(yzf);
        }
        //String e = edt_zjlx.getText().toString().trim();
        if(edt_zjlx.getText().toString().trim().length()==0){
            Toast.makeText(MainActivity.this,"请输入资金利息",Toast.LENGTH_SHORT).show();
            return;
        } else {
            zjlx = edt_zjlx.getText().toString();
            f_zjlx = Float.valueOf(zjlx);
        }
        //String f = edt_txlx.getText().toString().trim();
        if(edt_txlx.getText().toString().trim().length()==0){
            Toast.makeText(MainActivity.this,"请输入贴现利息",Toast.LENGTH_SHORT).show();
            return;
        } else {
            txlx = edt_txlx.getText().toString();
            f_txlx = Float.valueOf(txlx);
        }
        //String g = edt_mblr.getText().toString().trim();
        if(edt_mblr.getText().toString().trim().length()==0){
            Toast.makeText(MainActivity.this,"请输入目标利润",Toast.LENGTH_SHORT).show();
            return;
        } else {
            mblr = edt_mblr.getText().toString();
            f_mblr = Float.valueOf(mblr);
        }
        f_cgxj = f_xsjg*f_zxl/100-f_yzf-(f_cgjg*f_zjlx/100/30*45)-f_xsjg*f_txlx/100/2-f_mblr;
        cgxj = String.valueOf(f_cgxj);
        edt_cgxj.setText(cgxj);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.exit:
                finish();
                break;
            case R.id.reset:
                edt_xsjg.setText("");
                edt_zxl.setText("");
                edt_cgjg.setText("");
                edt_yzf.setText("");
                edt_zjlx.setText("");
                edt_txlx.setText("");
                edt_mblr.setText("");
                edt_cgxj.setText("");
                break;
            case R.id.count:
                getCount();
                break;
        }
    }
}
