package com.pedropalma.handin_week17_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

/**
 *
 */
public class MainActivity extends AppCompatActivity {

    FragmentDetailsActivity fd = new FragmentDetailsActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment2, fd);
        ft.commit();
    }


}
