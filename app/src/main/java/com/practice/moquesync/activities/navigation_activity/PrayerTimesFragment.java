package com.practice.moquesync.activities.navigation_activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.practice.moquesync.R;

/*
    This class implements the Fragment that works with the Prayer Times button in the
    bottom navigation view. This Fragment holds all the views that must be shown when the
    Prayer Times Navigation button is selected.
 */

public class PrayerTimesFragment extends Fragment {

    private ImageView fajar_time_card_imageView;
    private ImageView duhur_time_card_imageView;
    private ImageView asar_time_card_imageView;
    private ImageView maghrib_time_image_view;
    private ImageView isha_time_image_view;
    private ImageView jumma_time_image_view;


    public PrayerTimesFragment() {
        // Required empty public constructor
    }


    /*
        This method is invoked when the view is about to be created.
        Overriding this method is necessary to ensure that our xml file
        for this layout gets inflated and shown in the view.
        If this method is not called, the fragment will not have any view.
     */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prayer_times, container, false);
    }

    /*
        This method is invoked when the fragment view is created.
        It is necessary that the views declared in the xml file of the
        fragment should only be accessed and modified here. Any views in the fragment xml file will
        not be accessible until the view has been created.
     */

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        try {

            //Load the images into the image containers
            loadWithGlide(R.drawable.fajar_prayer_time_card_image, R.id.fajar_image_holder );
            loadWithGlide(R.drawable.duhur_sun_image, R.id.duhur_image_holder);
            loadWithGlide(R.drawable.asar_afternoon_sun, R.id.asar_image_holder);
            loadWithGlide(R.drawable.maghrib_sunset_image, R.id.maghrib_image_holder);
            loadWithGlide(R.drawable.isha_night_image, R.id.isha_image_holder);
            loadWithGlide(R.drawable.jumma_noon_view, R.id.jumma_image_holder);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    /*
        This method loads the provided image into the given container with Glide.
     */
    private void loadWithGlide(int imageId, int imageContainerId) throws NullPointerException{

        ImageView imageView = getActivity().findViewById(imageContainerId);
        Glide.with(this)
                .load(imageId)
                .override(929, 200)
                .into(imageView);
    }
}
