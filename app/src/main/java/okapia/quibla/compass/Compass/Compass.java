package okapia.quibla.compass.Compass;

import android.content.Context;
import android.location.Location;
import android.util.Log;

/**
 * Created by Md.Zahidul on 12-Feb-16.
 */
public class Compass {

    private static final String TAG = "Compass";
    private static final double QUIBLA_LONGITUDE = 39.8579118;
    private static final double QUIBLA_LATITUDE = 21.3890824;

    public float getAngle(Context context){
        Location quibla = getQuiblasLocation();
        Location mylocation;
        GpsTracker gps = new GpsTracker(context);
        if(gps.getLocation() != null) {
            mylocation = gps.getLocation();
            float angle = quibla.bearingTo(mylocation);
            return angle;
        }else {
            gps.showSettingsAlert();
            return 0.00f;
        }
    }

    private Location getQuiblasLocation(){
        Location quiblaLocation = new Location("");
        quiblaLocation.setLatitude(QUIBLA_LATITUDE);
        quiblaLocation.setLongitude(QUIBLA_LONGITUDE);
        return quiblaLocation;
    }

}
