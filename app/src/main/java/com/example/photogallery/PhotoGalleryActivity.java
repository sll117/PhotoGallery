package com.example.photogallery;



import android.os.Bundle;

import androidx.fragment.app.Fragment;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment(){
        return PhotoGalleryFragment.newInstance();
    }
}