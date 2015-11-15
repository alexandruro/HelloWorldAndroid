package alexr.helloworld;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by Alex on 15.11.2015.
 */
public class Ore extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ore);
        Intent whichDayWas = getIntent();
        int day = whichDayWas.getIntExtra("whichDay", 0);

        String[][] toateMateriile = {
                {"", "Optional workshop", "Optional workshop", "FC", "", "", "AI", "Logic"},
                {"Soft", "Soft", "", "FC", "", "", "", ""},
                {"","","Tutore (:30)","","","","FC Tutorial 1","FC Tutorial 2"},
                {"Eco","Logic","Eco seminar (doar pe 26)","","","Optional workshop","Optional workshop","AI"},
                {"Eco","","Optional workshop","Optional workshop","Soft lecture","Optional workshop","",""}
        };
        String[] materii = toateMateriile[day];

        String[][] toateLocatiile = {
                {"","UG04","UG04","Poynting","","","Poynting","Arts LT02"},
                {"UG04","UG04","","Mechanical G31","","","",""},
                {"","","132","","","","??","Learning UG05"},
                {"Haworth 101","Arts LT02","UNIH G06","","","UG04","UG04","Poynting"},
                {"w7-9 Haworth101\nw10-11 - EDUC 135","","UG04","UG04","Mechanical G31","UG04","",""}
        };
        final String[] locatii = toateLocatiile[day];

        Button nine = (Button)findViewById(R.id.button9);
        Button ten = (Button)findViewById(R.id.button10);
        Button eleven = (Button)findViewById(R.id.button11);
        Button twelve = (Button)findViewById(R.id.button12);
        Button thirteen = (Button)findViewById(R.id.button13);
        Button fourteen = (Button)findViewById(R.id.button14);
        Button fifteen = (Button)findViewById(R.id.button15);
        Button sixteen = (Button)findViewById(R.id.button16);

        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);

        Button[] buttons = {nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen};
        int count = 0;
        for(Button i:buttons) {
            i.setText(materii[count]);
            if (i.getText() == "Optional workshop" || i.getText()=="FC Tutorial 1" || i.getText()=="FC Tutorial 2")
                i.setTextColor(Color.GRAY);
            if(hour==count+9)
                i.setBackgroundColor(ContextCompat.getColor(this,R.color.dayColor));
            final int countt = count;
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(locatii[countt]!="") {
                        Toast toast = Toast.makeText(getApplicationContext(), locatii[countt], Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            });
            count++;
        }
    }
}
