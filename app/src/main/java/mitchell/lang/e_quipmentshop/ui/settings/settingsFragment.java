package mitchell.lang.e_quipmentshop.ui.settings;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import mitchell.lang.e_quipmentshop.R;


public class settingsFragment extends Fragment {


    public settingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

            Button tipsButton = view.findViewById(R.id.tipsButton);
            tipsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new settingsFragment();
                }
            });
            return view;
        }
    }


