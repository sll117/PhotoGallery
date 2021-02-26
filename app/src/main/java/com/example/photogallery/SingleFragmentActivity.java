package com.example.photogallery;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public abstract  class SingleFragmentActivity extends FragmentActivity {
    protected abstract Fragment createFragment();

    public void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm=getSupportFragmentManager();
        Fragment fragment=fm.findFragmentById(R.id.fragment_photo_gallery);

        if (fragment==null){
            fragment=createFragment();
            fm.beginTransaction().add(R.id.fragment_photo_gallery,fragment).commit();
        }
    }


}
