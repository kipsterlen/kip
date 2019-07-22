package com.example.lterer.alcphase1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button2);
        button.setBackgroundColor(Color.YELLOW);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),Main2Activity.class));
           /* if you want to finish the first activity then just call
            finish(); */
            }
        });
        Button button1=(Button)findViewById(R.id.button);
        button.setBackgroundColor(Color.YELLOW);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),Main3Activity.class));
    }
});
    }
}
