package vn.edu.usth.weather;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    private final String tag = "status";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, firstFragment).commit();
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

    }



