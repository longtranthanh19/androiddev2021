package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;


public class WeatherActivity extends AppCompatActivity {
    private final String tag = "status";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        Log.i(tag, "on create...");

//        ForecastActivity firstFragment = new ForecastActivity();
//        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();

        PagerAdapter adapter = new HomeFragmentPagerAdapter(
                getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        Log.i(tag, "on start");
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag, "on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag, "on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag, "on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag, "on destroy");
    }

    public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
        private final int PAGE_COUNT = 3;
        public HomeFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return PAGE_COUNT; // number of pages for a ViewPager
        }

        @Override
        public Fragment getItem(int page) {
            switch (page) {
                case 0:
                    return new WeatherAndForecastFragment();
                case 1:
                    return new WeatherAndForecastFragment();
                case 2:
                    return new WeatherAndForecastFragment();
            }
            return new Fragment();
        }
    }
}