package com.example.wyborkoloru;

import static android.graphics.Color.*;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void onClickButton(View view){
      TextView tekstView=(TextView) findViewById(R.id.textView1);
      tekstView.setTextColor(rgb(100,12,12));
    Spinner obiektKolor=(Spinner) findViewById(R.id.spinner1);
      //pobieramy wartości
    String tekstZListy= String.valueOf(obiektKolor.getSelectedItem());
    //i zapisujemy do odpowiedniego miejsca
    tekstView.setText(tekstZListy);
   // tekstView.setBackgroundColor(Color.parseColor("#ff0000"));
    //tekstView.setTextColor(parseColor("#00ff00"));
    //tekstView.setTextColor(parseColor("purple"));
    String kolorB;
   if(tekstZListy.equals("biały")) kolorB="#ffffff";
   else if(tekstZListy.equals("czerwony"))  kolorB="#ff0000";
    else if(tekstZListy.equals("niebieski"))  kolorB="#0000ff";
     else kolorB="#00ff00";
    tekstView.setBackgroundColor(Color.parseColor(kolorB));
    }
}

