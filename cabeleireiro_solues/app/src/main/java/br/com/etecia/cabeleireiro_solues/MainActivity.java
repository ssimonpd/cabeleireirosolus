package br.com.etecia.cabeleireiro_solues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
            @Override
            protected void onCreate (Bundle savedInstance){
                super.onCreate(savedInstance);
                setContentView(R.layout.activity_main);

                getSupportActionBar().hide();
                getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(getBaseContext(), LoginActivity.class));
                        finish();
                    }
                },2000);


            }

    }
