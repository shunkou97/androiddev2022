package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        //change to viewpager2 because viewpager1 doesn't even work lol and it's fricking bothersome to debug
        TabLayout hero_overview_tab_layout = findViewById(R.id.activity_weather_tab_layout);
        ViewPager2 hero_overview_view_pager = findViewById(R.id.activity_weather_view_pager);

        WeatherFragmentAdapter overview_adapter = new WeatherFragmentAdapter(this);
        activity_weather_view_pager.setAdapter(overview_adapter);

        new TabLayoutMediator(hero_overview_tab_layout, hero_overview_view_pager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("HANOI, VIETNAM");
                    break;
                case 1:
                    tab.setText("PARIS, FRANCE");
                    break;
                case 2:
                    tab.setText("TOULOUISE, FRANCE");
                    break;
            }
        }).attach();


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
