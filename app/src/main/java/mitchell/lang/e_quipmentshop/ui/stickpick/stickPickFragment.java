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

              if(age <= 5 && heightCM <= 140 && weight <= 100) {
                stickText.setText("Bauer Vapor Flylite Grip \n Curve: PM9 \n Flex: 30 \n Price: $99.99");
                image.setImageResource(R.drawable.flylite2);
                cheapText.setText("Warrior Covert QR EDGE \n Curve: W02 \n Flex: 30 \n Price: $69.99");
                cheaperImage.setImageResource(R.drawable.covertqr);
              }
                if(age <= 8 && age > 5 && heightCM <= 160 && heightCM > 60 && weight <= 100 && weight > 30) {
                    stickText.setText("Bauer Nexus 2N \n Curve: P92 \n Flex: 35 \n Price: $99.99");
                    image.setImageResource(R.drawable.nexus2n);
                    cheapText.setText("Easton Synergy 550 \n Curve: E3 \n Flex: 50 \n Price: $29.99");
                    cheaperImage.setImageResource(R.drawable.synergy550);
                }
              if(age <= 10 && age > 8 && heightCM <= 180 && heightCM > 100 && weight <= 150 && weight > 56) {
                  cheapText.setText("CCM RIBCOR 64K \n Curve: P29 \n Flex: 50 \n Price: $59.99");
                  cheaperImage.setImageResource(R.drawable.ribcor);
                  stickText.setText("True A4.5 SBP \n Curve: P88 \n Flex: 45 \n Price: $99.99");
                  image.setImageResource(R.drawable.truestick);
              }
                if(age <= 12 && age > 10 && heightCM <= 200 && heightCM > 110 && weight <= 200 && weight > 60) {
                    stickText.setText("Sherwood Rekker M90 \n Curve: PP26 \n Flex: 55 \n Price: $194.99");
                    image.setImageResource(R.drawable.rekker);
                    cheapText.setText("WARRIOR ALPHA DX5 \n Curve: W03 \n Flex: 70/55 \n Price: $79.99");
                    cheaperImage.setImageResource(R.drawable.alphadx5);
                }
                if(age <= 15 && age > 10 && heightCM <= 220 && heightCM > 130 && weight <= 230 && weight > 70) {
                    stickText.setText("CCM Jetspeed \n Curve: P29 \n Flex: 65 \n Price: $224.99");
                    image.setImageResource(R.drawable.jetspeed);
                    cheapText.setText("Bauer Vapor X2.7 \n Curve: P88 \n Flex: 65 \n Price: $119.99");
                    cheaperImage.setImageResource(R.drawable.vaporx2);
                }
                /*
                if(age <= 16 && age > 15 && heightCM <= 173 && heightCM > 170 && weight <= 134 && weight > 123) {
                    stickText.setText("Bauer Vapor 1X \n Curve: P88 \n Flex: 87 \n Price: $179.99");
                    image.setImageResource(R.drawable.vapor1x);
                    cheapText.setText("Bauer Vapor X900 \n Curve: P88 \n Flex: 87 \n Price: $99.99");
                    cheaperImage.setImageResource(R.drawable.vaporx900);
                }

                 */
                if(age <= 18 && age > 15 && heightCM <= 250 && heightCM > 150 && weight <= 240 && weight > 110) {
                    stickText.setText("Warrior Covert QRE SuperLight \n Curve: W88 \n Flex: 100 \n Price: $259.99");
                    image.setImageResource(R.drawable.covertqre);
                    cheapText.setText("Warrior Covert QRL5 \n Curve: W71 \n Flex: 100 \n Price: $79.99");
                    cheaperImage.setImageResource(R.drawable.qrl5);
                }
                /*
                if(age <= 19 && age > 18 && heightCM <= 176 && heightCM > 175 && weight <= 152 && weight > 147) {
                    stickText.setText("Bauer Supreme 2S Pro \n Curve: P88 \n Flex: 102 \n Price: $279.99");
                    image.setImageResource(R.drawable.supreme2s);
                    cheapText.setText("CCM Jetspeed 460 \n Curve: P88 \n Flex: 95 \n Price: $109.99");
                    cheaperImage.setImageResource(R.drawable.jetspeed460);
                }
                */

                if(age <= 20 && age > 18 && heightCM <= 250 && heightCM > 140 && weight <= 250 && weight > 110) {
                    stickText.setText("Warrior Alpha QX \n Curve: W88 \n Flex: 100 \n Price: $259.99");
                    image.setImageResource(R.drawable.alphaqx);
                    cheapText.setText("CCM Super Tacks \n Curve: P88 \n Flex: 95 \n Price: $109.99");
                    cheaperImage.setImageResource(R.drawable.supertacks);
                }
                else {
                    stickText.setText("Warrior Fantom QRE \n Curve: W28 \n Flex: 85 \n Price: $319.99");
                    image.setImageResource(R.drawable.fantom);
                    cheapText.setText("True A Series \n Curve: TC2 \n Flex: 75 \n Price: $119.99");
                    cheaperImage.setImageResource(R.drawable.truea);
                }

            }
        });
        return view;
    }

}

