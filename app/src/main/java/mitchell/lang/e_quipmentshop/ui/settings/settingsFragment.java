package mitchell.lang.e_quipmentshop.ui.settings;

import android.content.Context;
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
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        transaction.replace(R.id.fragment_setting, new PreferenceFragment()).commit();
        return view;
    }
}


