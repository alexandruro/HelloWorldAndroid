package alexr.helloworld;

import android.app.Activity;
import android.content.Context;
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
                {"w7-9 Haworth101\nw10-11 - EDUC 135","UG04","UG04","Mechanical G31","UG04","",""}
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

        nine.setText(materii[0]);
        ten.setText(materii[1]);
        eleven.setText(materii[2]);
        twelve.setText(materii[3]);
        thirteen.setText(materii[4]);
        fourteen.setText(materii[5]);
        fifteen.setText(materii[6]);
        sixteen.setText(materii[7]);



        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);

        if(hour==9)
            nine.setBackgroundColor(ContextCompat.getColor(this, R.color.dayColor));
        else if(hour==10)
            ten.setBackgroundColor(ContextCompat.getColor(this, R.color.dayColor));
        else if(hour==11)
            eleven.setBackgroundColor(ContextCompat.getColor(this, R.color.dayColor));
        else if(hour==12)
            twelve.setBackgroundColor(ContextCompat.getColor(this, R.color.dayColor));
        else if(hour==13)
            thirteen.setBackgroundColor(ContextCompat.getColor(this, R.color.dayColor));
        else if(hour==14)
            fourteen.setBackgroundColor(ContextCompat.getColor(this, R.color.dayColor));
        else if(hour==15)
            fifteen.setBackgroundColor(ContextCompat.getColor(this, R.color.dayColor));
        else if(hour==16)
            sixteen.setBackgroundColor(ContextCompat.getColor(this, R.color.dayColor));

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(locatii[0]!="") {
                    Toast toast = Toast.makeText(getApplicationContext(), locatii[0], Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(locatii[1]!="") {
                    Toast toast = Toast.makeText(getApplicationContext(), locatii[1], Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(locatii[2]!="") {
                    Toast toast = Toast.makeText(getApplicationContext(), locatii[2], Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(locatii[3]!="") {
                    Toast toast = Toast.makeText(getApplicationContext(), locatii[3], Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(locatii[4]!="") {
                    Toast toast = Toast.makeText(getApplicationContext(), locatii[4], Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(locatii[5]!="") {
                    Toast toast = Toast.makeText(getApplicationContext(), locatii[5], Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(locatii[6]!="") {
                    Toast toast = Toast.makeText(getApplicationContext(), locatii[6], Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(locatii[7]!="") {
                    Toast toast = Toast.makeText(getApplicationContext(), locatii[7], Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }
}
