package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
        exit = (Button) findViewById(R.id.exit);
        reset = (Button) findViewById(R.id.reset);
        count = (Button) findViewById(R.id.count);
    }

    private void getCount(){
        
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.exit:
                finish();
            case R.id.reset:
                edt_cgjg.setText("");
                edt_zxl.setText("");
                edt_cgjg.setText("");
                edt_yzf.setText("");
                edt_zjlx.setText("");
                edt_txlx.setText("");
                edt_mblr.setText("");
                edt_cgxj.setText("");
            case R.id.count:
                getCount();
        }
    }
}
