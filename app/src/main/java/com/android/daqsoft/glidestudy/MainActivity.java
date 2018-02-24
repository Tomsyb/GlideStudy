package com.android.daqsoft.glidestudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {
    private ImageView mImg;
    private Button btn;
    private String imgUrl = "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3736398904,3705920538&fm=27&gp=0.jpg";
    private String gifUrl = "http://p1.pstatp.com/large/166200019850062839d3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mImg = findViewById(R.id.img);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                method1();
            }
        });
    }

    /**
     * 加载图片
     */
    public void method1(){
        Glide.with(this)
                .load(gifUrl)//图片加载地址
                .asBitmap()//格式限制（只能显示静态图）即使是gif地址加了这个就是只能显示其第一帧静态图，对应asGif( );
                .placeholder(R.mipmap.ic_launcher)//占位图
                .error(R.mipmap.ic_launcher)//异常占位图
                .diskCacheStrategy(DiskCacheStrategy.NONE)//禁用缓存
                .override(100, 100)//指定图片大小
                .into(mImg);//view
    }

}



