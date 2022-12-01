package com.forhad.convartingdatatype204;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edbye,edseal;
    Button total;
    TextView tvdisplay1;
    String saling,bying;
    Float byeprice,saleprice,profit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edbye= findViewById(R.id.edbye);
        edseal = findViewById(R.id.edseal);
        total = findViewById(R.id.total);
        tvdisplay1 = findViewById(R.id.tvdisplay1);
        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               saling = edbye.getText().toString();
               byeprice = Float.parseFloat(saling);




               bying = edseal.getText().toString();
               saleprice = Float.parseFloat(bying);

               profit =  saleprice-byeprice;
               if (saleprice>byeprice){
                   tvdisplay1.setText("আপনার লাভ হয়েছে=" +profit+"টাকা" );

               }else tvdisplay1.setText("আপনার লোকসান হয়েছে=" +profit +"টাকা" );



            }
        });



    }
}