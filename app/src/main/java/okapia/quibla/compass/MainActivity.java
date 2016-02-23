package okapia.quibla.compass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import okapia.quibla.compass.Compass.Compass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Compass compass = new Compass();
        float angle = compass.getAngle(this);
        Log.e("Check Angle", angle + "");
    }

}
