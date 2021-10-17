package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        WeatherFragmentAdapter adapter = new WeatherFragmentAdapter(this);
        pager.setAdapter(adapter);

        Log.i("Weather", "onCreate() called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather", "onStart() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather", "onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather", "onDestroy() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather", "onPause() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather", "onResume() called");
    }

    }
