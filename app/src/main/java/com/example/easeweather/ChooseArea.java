package com.example.easeweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChooseArea extends AppCompatActivity {
    private String weatherId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_area);
    }
  public void returnWeatherId(String weatherId){
      Intent intent=new Intent();
      intent.putExtra("weather_id",weatherId);
      setResult(RESULT_OK,intent);
}

}
