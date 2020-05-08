package com.a.sugarcode.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

public class PreferencesHelper {
    private SharedPreferences sharedPreferences;

    public PreferencesHelper(Context context) {
        sharedPreferences=context.getSharedPreferences("user", Context.MODE_PRIVATE);
    }

    public void setLogin(String login){
        sharedPreferences.edit()
                .putString("login",login)
                .apply();
    }

    @android.support.annotation.RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
    public void setNama(String nama){
        sharedPreferences.edit()
                .putString("nama",nama)
                .apply();
    }

    public String getLogin(){
        return sharedPreferences.getString("login","false");
    }
}
