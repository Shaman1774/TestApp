package ru.bstu.vt41.gin.testapp;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "MainActivity onCreate", Toast.LENGTH_SHORT).show();
        Button btnDetail = (Button) findViewById(R.id.btn_open_detail);
        Button btnWeb = (Button) findViewById(R.id.btn_open_google);

        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                startActivity(intent);
            }
        });

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(browserIntent);
            }
        });

        //fill news data

        //fill first
        View itemNews = findViewById(R.id.item_news1);
        TextView title = (TextView)itemNews.findViewById(R.id.tv_title);
        TextView text = (TextView)itemNews.findViewById(R.id.tv_text);
        ImageView image = (ImageView)itemNews.findViewById(R.id.imageView);

        title.setText("UX Disign for Developers");
        text.setText("Открытое Участников : 2055");
        image.setImageResource(R.drawable.fst);

        //fill second
        itemNews = findViewById(R.id.item_news2);
        title = (TextView)itemNews.findViewById(R.id.tv_title);
        text = (TextView)itemNews.findViewById(R.id.tv_text);
        image = (ImageView)itemNews.findViewById(R.id.imageView);

        title.setText("Android Studio");
        text.setText("Открытое Участников : 3040");
        image.setImageResource(R.drawable.scnd);

        //fill third
        itemNews = findViewById(R.id.item_news3);
        title = (TextView)itemNews.findViewById(R.id.tv_title);
        text = (TextView)itemNews.findViewById(R.id.tv_text);
        image = (ImageView)itemNews.findViewById(R.id.imageView);

        title.setText("Square Open Sourse");
        text.setText("Открытое Участников : 2420");
        image.setImageResource(R.drawable.thrd);

        //fill fours
        itemNews = findViewById(R.id.item_news4);
        title = (TextView)itemNews.findViewById(R.id.tv_title);
        text = (TextView)itemNews.findViewById(R.id.tv_text);
        image = (ImageView)itemNews.findViewById(R.id.imageView);

        title.setText("LinkenGoApp");
        text.setText("Открытое Участников : 55");
        image.setImageResource(R.drawable.frs);

        //fill fives
        itemNews = findViewById(R.id.item_news5);
        title = (TextView)itemNews.findViewById(R.id.tv_title);
        text = (TextView)itemNews.findViewById(R.id.tv_text);
        image = (ImageView)itemNews.findViewById(R.id.imageView);

        title.setText("LoreumImsun");
        text.setText("Открытое Участников : none");
        image.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "MainActivity onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "MainActivity onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "MainActivity onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "MainActivity onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "MainActivity onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "MainActivity onDestroy", Toast.LENGTH_SHORT).show();
    }

}
