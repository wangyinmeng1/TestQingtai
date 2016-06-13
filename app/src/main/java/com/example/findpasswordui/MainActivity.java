package com.example.findpasswordui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /******************测试代码*****************************/
    private Button button;

    /******************测试代码*****************************/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /******************测试代码*****************************/
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);

        /******************测试代码*****************************/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent intent=new Intent("com.example.findpasswordui.ACTION_START");
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
