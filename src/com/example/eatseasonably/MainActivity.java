package com.example.eatseasonably;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    // Get today's date
    Calendar today = Calendar.getInstance();
    // Retrieve the month
    int month = today.get(Calendar.MONTH) + 1;
    Date time = today.getTime();
    
    String df = DateFormat.getDateInstance().format(time);
    
    // DateFormat df = new SimpleDateFormat("L");
    
    // Retrieve food data from database/array
    // Display foods in season
    // Selecting food gives detail in a fragment
    
}
