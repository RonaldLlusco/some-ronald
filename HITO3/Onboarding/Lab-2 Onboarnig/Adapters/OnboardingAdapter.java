package com.example.onboarningapp.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.onboarningapp.Onboarding.FaceDetectionFragment;
import com.example.onboarningapp.Onboarding.LoginFragment;
import com.example.onboarningapp.Onboarding.TextRecognitionFragment;
import com.example.onboarningapp.Onboarding.WelcomeFragment;

public class OnboardingAdapter extends FragmentPagerAdapter {

    public OnboardingAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new WelcomeFragment();
            case 1:
                return new FaceDetectionFragment();
            case 2:
                return new TextRecognitionFragment();
            case 3:
                return new LoginFragment();
                //para agregar mas pantallas aumentar aquiii
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 4;//y obvio aqui
    }
}
