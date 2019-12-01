package mitchell.lang.e_quipmentshop.ui.stickpick;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mitchell.lang.e_quipmentshop.R;


public class stickPickFragment extends Fragment {


    public stickPickFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stick_pick, container, false);
    }

}