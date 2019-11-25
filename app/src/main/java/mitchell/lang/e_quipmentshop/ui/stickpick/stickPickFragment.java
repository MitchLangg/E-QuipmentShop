package mitchell.lang.e_quipmentshop.ui.stickpick;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        final TextView heightTV = (TextView) findViewById(R.id.heightTitle);
        NumberPicker heightNP =  (NumberPicker) findViewById(R.id.numberPickerHeight);

        heightNP.setMinValue(0);
        //Specify the maximum value/number of NumberPicker
        heightNP.setMaxValue(10);

        //Gets whether the selector wheel wraps when reaching the min/max value.
        heightNP.setWrapSelectorWheel(true);

        //Set a value change listener for NumberPicker
        heightNP.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Display the newly selected number from picker
                heightTV.setText("Selected Number : " + newVal);
            }
        });
*/
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_stick_pick, container, false);

        return view;
    }

}

