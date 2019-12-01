package mitchell.lang.e_quipmentshop.ui.settings;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;


import android.preference.PreferenceFragment;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import mitchell.lang.e_quipmentshop.MainActivity;
import mitchell.lang.e_quipmentshop.R;
import mitchell.lang.e_quipmentshop.ui.stickpick.stickPickFragment;


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
        View view = inflater.inflate(R.layout.settings_activity, container, false);

        //return the view
            return view;
        }

    }



