package alexr.helloworld;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);


        final Button buttonLu = (Button)findViewById(R.id.buttonLu);
        Button buttonMa = (Button)findViewById(R.id.buttonMa);
        Button buttonMi = (Button)findViewById(R.id.buttonMi);
        Button buttonJo = (Button)findViewById(R.id.buttonJo);
        Button buttonVi = (Button)findViewById(R.id.buttonVi);

        if (Calendar.MONDAY == dayOfWeek)
            buttonLu.setBackgroundColor(ContextCompat.getColor(this, R.color.dayColor));

        else if (Calendar.TUESDAY == dayOfWeek)
            buttonMa.setBackgroundColor(ContextCompat.getColor(this, R.color.dayColor));
         else if (Calendar.WEDNESDAY == dayOfWeek)
            buttonMi.setBackgroundColor(ContextCompat.getColor(this, R.color.dayColor));
         else if (Calendar.THURSDAY == dayOfWeek)
            buttonJo.setBackgroundColor(ContextCompat.getColor(this, R.color.dayColor));
         else if (Calendar.FRIDAY == dayOfWeek)
        buttonVi.setBackgroundColor(ContextCompat.getColor(this, R.color.dayColor));


        buttonLu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent getOre = new Intent(view.getContext(),Ore.class);
                final int result = 1;
                getOre.putExtra("whichDay",0);
                startActivity(getOre);
            }
        });

        buttonMa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent getOre = new Intent(view.getContext(),Ore.class);
                final int result = 1;
                getOre.putExtra("whichDay",1);
                startActivity(getOre);
            }
        });
        buttonMi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent getOre = new Intent(view.getContext(),Ore.class);
                final int result = 1;
                getOre.putExtra("whichDay",2);
                startActivity(getOre);
            }
        });
        buttonJo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent getOre = new Intent(view.getContext(),Ore.class);
                final int result = 1;
                getOre.putExtra("whichDay",3);
                startActivity(getOre);
            }
        });
        buttonVi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent getOre = new Intent(view.getContext(),Ore.class);
                final int result = 1;
                getOre.putExtra("whichDay",4);
                startActivity(getOre);
            }
        });

    }

}
