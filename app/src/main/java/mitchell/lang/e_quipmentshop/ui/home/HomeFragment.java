package mitchell.lang.e_quipmentshop.ui.home;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import mitchell.lang.e_quipmentshop.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    FragmentManager fm;
    SharedPreferences sharedPreferences;

    public HomeFragment() {

    }

@Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       fm = getActivity().getSupportFragmentManager();
       sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
       View view = inflater.inflate(R.layout.fragment_home, container, false);

        return view;
    }
}