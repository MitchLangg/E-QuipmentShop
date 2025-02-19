package mitchell.lang.e_quipmentshop.ui.settings;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import mitchell.lang.e_quipmentshop.R;

/**
 * @author Mitch Todd/Mitch Lang
 * @date Week 12-14
 * @description Fragment for making the settings activity.
 */

public class settingsFragment extends Fragment {
    FragmentManager fm;
    SharedPreferences sharedPreferences;

    public settingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //externalize the view into a view
        FragmentManager fm = getFragmentManager();
        //create a new fragment transaction
        FragmentTransaction transaction= fm.beginTransaction();

        //externalize the view into a view
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        //replace what is on the screen
        transaction.replace(R.id.settingsFragment, new PreferenceFragment()).commit();


        //return the view
        return view;
        }

    }



