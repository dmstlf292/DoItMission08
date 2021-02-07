package org.techtown.doitmission08;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CustomerActivity extends AppCompatActivity {
    TextView titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        titleText = (TextView) findViewById(R.id.titleText);

        //process received intent
        Intent receivedIntent = getIntent();
        String titleMsg = receivedIntent.getStringExtra("titleMsg");
        Toast.makeText(this, "titlemsg : " + titleMsg, Toast.LENGTH_LONG).show();

        if (titleMsg!=null){
            titleText.setText(titleMsg);
        }

        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                receivedIntent.putExtra("message", "result message is oK!");
                setResult(Activity.RESULT_OK, receivedIntent);
                finish();
            }
        });




    }
}