package com.example.yura.programlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        TextView label = new TextView(this);
        label.setText(R.string.my_text_label);
        label.setTextSize(20);
        label.setHeight(200);
        label.setGravity(Gravity.CENTER);

        ImageView pic = new ImageView(this);
        pic.setImageResource(R.drawable.matterhorn);
        pic.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        pic.setAdjustViewBounds(true);
        pic.setScaleType(ScaleType.FIT_CENTER);


        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        ll.setGravity(Gravity.CENTER);

        ll.addView(label);
        ll.addView(pic);
        setContentView(ll); // все готово, можно подключать компоновку
    }
}

