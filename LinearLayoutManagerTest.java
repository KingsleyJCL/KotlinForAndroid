package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LinearLayoutManagerTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);
        LinearLayout myLinearLayout = new LinearLayout(this);   // 创建线性布局
        super.setContentView(myLinearLayout);                            // 加载线性布局管理器
        // 在线性布局管理器中垂直布局控件
        myLinearLayout.setOrientation(LinearLayout.VERTICAL);
        final TextView myTextView = new TextView(this);         // 添加TextView控件
        myTextView.setText("Hello,world!");                             // 设置TextView控件的文本
        myTextView.setTextSize(20);                                     // 设置TextView控件的字体大小
        Button myButton = new Button(this);                    // 添加Button控件
        myButton.setText("刷新内容");                                   // 设置Button控件的文本
        myButton.setTextSize(20);                                      // 设置Button空间的字体大小
        // 为Button控件添加Click单击事件响应方法
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                myTextView.setText("当前日期："+new java.util.Date());
            }
        });
        myLinearLayout.addView(myTextView);                         // 在线性布局管理器中添加TextView控件
        myLinearLayout.addView(myButton);                           // 在线性布局管理器中添加Button控件
    }
}