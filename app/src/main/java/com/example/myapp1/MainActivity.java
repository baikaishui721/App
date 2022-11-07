package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.util.Log;//Alt+回车自动添加的引用。
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private  TextView textViewHelloWorld;//私有成员

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*        textViewHelloWorld = this.findViewById(R.id.text_hello_world);
        if(null!=textViewHelloWorld){
            textViewHelloWorld.setText("test");
        }
        else{
            Log.i("MainActivity","the control is null");
        }//必须要在setContentView后面执行
*/
        setContentView(R.layout.activity_main);//根据设计图生成窗口上的控件。访问资源的三种方式

        textViewHelloWorld = this.findViewById(R.id.text_hello_world);

        String strHelloWorld=textViewHelloWorld.getText().toString();
        Log.i("MainActivity",strHelloWorld);//获得控件的属性

        textViewHelloWorld.setText("test");//1、直接定义

        textViewHelloWorld.setText(R.string.string_hello_world2);//2、传递参数

        String strHelloWorld2=this.getResources().getText(R.string.string_hello_world2).toString();
        textViewHelloWorld.setText(strHelloWorld2);
        //Log.i("MainActivity",strHelloWorld2);//红色Log表明需要添加引用。
        //textViewHelloWorld.setText(strHelloWorld2);
    }
}

