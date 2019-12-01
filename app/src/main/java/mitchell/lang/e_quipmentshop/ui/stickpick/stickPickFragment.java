package mitchell.lang.e_quipmentshop.ui.stickpick;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import mitchell.lang.e_quipmentshop.R;
import mitchell.lang.e_quipmentshop.ui.settings.tipsListFragment;


public class stickPickFragment extends Fragment {

    int age;
    int heightCM;
    int weight;

    public stickPickFragment() {
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
        View view = inflater.inflate(R.layout.fragment_stick_pick, container, false);
        final FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        final TextView ageTV = view.findViewById(R.id.ageTitle);
        NumberPicker ageNP =  view.findViewById(R.id.numberPickerAge);

        ageNP.setMinValue(0);
        //Specify the maximum value/number of NumberPicker
        ageNP.setMaxValue(20);

        //Gets whether the selector wheel wraps when reaching the min/max value.
        ageNP.setWrapSelectorWheel(true);

        //Set a value change listener for NumberPicker
        ageNP.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Display the newly selected number from picker
                ageTV.setText("Age Selected : " + newVal);
                age = newVal;
            }
        });

        final TextView heightCMTV = view.findViewById(R.id.heightTitle);
        NumberPicker heightNP = view.findViewById(R.id.numberPickerHeight);
        heightNP.setMinValue(0);
        heightNP.setMaxValue(500);
        heightNP.setWrapSelectorWheel(true);

        heightNP.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                heightCMTV.setText("Height Selected : " + newVal);
                heightCM = newVal;
            }
        });

        final TextView weightTV = view.findViewById(R.id.weightTitle);
        NumberPicker weightNP = view.findViewById(R.id.numberPickerWeight);
        weightNP.setMinValue(0);
        weightNP.setMaxValue(500);
        weightNP.setWrapSelectorWheel(true);

        weightNP.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                weightTV.setText("Weight Selected : " + newVal);
                weight = newVal;
            }
        });


        Button submitButton = view.findViewById(R.id.submitButton);
        final TextView stickText = view.findViewById(R.id.stickText);
        final ImageView image = view.findViewById(R.id.image);
        final TextView cheapText = view.findViewById(R.id.cheaperStickText);
        final ImageView cheaperImage = view.findViewById(R.id.cheaperImage);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              if(age <= 5 && heightCM <= 108 && weight <= 39) {
                stickText.setText("Bauer Vapor Flylite Grip \n Curve: PM9 \n Flex: 30");
                image.setImageResource(R.drawable.shin);
              }
                if(age <= 8 && age > 5 && heightCM <= 128 && heightCM > 108 && weight <= 56 && weight > 39) {
                    stickText.setText("Bauer Vapor X60");
                    image.setImageResource(R.drawable.chest);
                }
              if(age <= 10 && age > 8 && heightCM <= 138 && heightCM > 128 && weight <= 70 && weight > 56) {
                  stickText.setText("Bauer Vapor X60");
                  image.setImageResource(R.drawable.chest);
              }
                if(age <= 12 && age > 10 && heightCM <= 149 && heightCM > 138 && weight <= 88 && weight > 70) {
                    stickText.setText("Bauer Vapor X60");
                    image.setImageResource(R.drawable.chest);
                }
                if(age <= 15 && age > 10 && heightCM <= 170 && heightCM > 149 && weight <= 123 && weight > 88) {
                    stickText.setText("Bauer Vapor X70");
                    image.setImageResource(R.drawable.elbow);
                }
                if(age <= 16 && age > 15 && heightCM <= 173 && heightCM > 170 && weight <= 134 && weight > 123) {
                    stickText.setText("Bauer Vapor X70");
                    image.setImageResource(R.drawable.elbow);
                }
                if(age <= 18 && age > 16 && heightCM <= 175 && heightCM > 170 && weight <= 147 && weight > 123) {
                    stickText.setText("Bauer Vapor X70");
                    image.setImageResource(R.drawable.elbow);
                }
                if(age <= 19 && age > 18 && heightCM <= 176 && heightCM > 175 && weight <= 152 && weight > 147) {
                    stickText.setText("Bauer Vapor X70");
                    image.setImageResource(R.drawable.elbow);
                }
                if(age <= 20 && age > 15 && heightCM <= 177 && heightCM > 170 && weight <= 155 && weight > 123) {
                    stickText.setText("Bauer Vapor X50 \n Curve: Kane \n Flex: 80 \n Link: linkliklinklink");
                    image.setImageResource(R.drawable.helmet);
                }

            }
        });
        return view;
    }

}

