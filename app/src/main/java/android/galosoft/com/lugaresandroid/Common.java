package android.galosoft.com.lugaresandroid;

import android.galosoft.com.lugaresandroid.Remote.IGoogleAPIService;
import android.galosoft.com.lugaresandroid.Remote.RetrofitClient;

public class Common {

    private  static  final String GOOGLE_API_URL = "https://maps.googleapi.com/";

    public static IGoogleAPIService getGoogleAPIService() {
        return  RetrofitClient.getclient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
 }
