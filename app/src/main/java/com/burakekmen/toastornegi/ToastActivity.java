package com.burakekmen.toastornegi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        Toast.makeText(this, "Merhaba Dünyalı :)", Toast.LENGTH_SHORT).show();
    }
}
