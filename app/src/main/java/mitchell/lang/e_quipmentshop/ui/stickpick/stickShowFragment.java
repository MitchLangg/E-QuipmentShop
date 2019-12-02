package mitchell.lang.e_quipmentshop.ui.stickpick;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import mitchell.lang.e_quipmentshop.R;


public class stickShowFragment extends Fragment {
    FragmentManager fm;
    public stickShowFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_stick_show, container, false);
        fm = getActivity().getSupportFragmentManager();
        return view;
    }

}