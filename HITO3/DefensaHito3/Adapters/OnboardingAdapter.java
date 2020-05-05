package com.example.hito3onboarningcalcu.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.hito3onboarningcalcu.Onboarding.pantallados;
import com.example.hito3onboarningcalcu.Onboarding.pantallatres;
import com.example.hito3onboarningcalcu.Onboarding.pantallauno;


public class OnboardingAdapter extends FragmentPagerAdapter {

    public OnboardingAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new pantallauno();
            case 1:
                return new pantallados();
            case 2:
                return new pantallatres();

                //para agregar mas pantallas aumentar aquiii
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;//y obvio aqui
    }
}
