package mitchell.lang.e_quipmentshop.ui.stickpick;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import mitchell.lang.e_quipmentshop.R;


public class stickPickFragment extends Fragment {
    SeekBar seekBar;
    TextView textView;

    public stickPickFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_stick_pick, container, false);
        SeekBar seekBar = view.findViewById(R.id.seekBar);

        // Initialize the textview with '0'.
        //textView.setText("Covered: " + seekBar.getProgress() + "/" + seekBar.getMax());
        return view;
    }

}

