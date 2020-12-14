package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;


public class WeatherActivity extends AppCompatActivity {
    private final String tag = "status";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        Log.i(tag, "on create...");

        ForecastActivity firstFragment = new ForecastActivity();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
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