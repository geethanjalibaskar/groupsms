package com.example.anjali.ssms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button sendSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        sendSms = (Button) findViewById( R.id.sendsms );
        sendSms.setOnClickListener( new View.OnClickListener()  {

            @Override
                    public void onClick(View view) {
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:+91 9787407865,+91 9944640451,+91 9952099983,+91 8838903759"));
                smsIntent.putExtra( "sms_body", "Your child reach the school safely!" );

                startActivity(smsIntent);
            }
            });


    }
}
