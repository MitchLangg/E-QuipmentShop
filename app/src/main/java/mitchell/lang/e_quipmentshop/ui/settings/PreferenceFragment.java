
package mitchell.lang.e_quipmentshop.ui.settings;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;

import androidx.fragment.app.FragmentManager;
import androidx.preference.PreferenceFragmentCompat;
import mitchell.lang.e_quipmentshop.R;



public class PreferenceFragment extends PreferenceFragmentCompat
{
    //create the fragment manager
    FragmentManager fm;
    //create the fragmentTransaction
    FragmentTransaction transaction;

    String[] address = {"beercheer@gmail.com"};

    @Override
    public void onCreatePreferences(Bundle bundle, String s)
    {
        //grab the manager
        fm = getFragmentManager();

        //grab the preference
        addPreferencesFromResource(R.xml.preferences);

        //create new preferences
        Preference feedbackPreference = findPreference("feedback");

        /**
         * Create the on preference click listeners below
         */


        feedbackPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,address);

                if(intent.resolveActivity(getActivity().getPackageManager()) != null)
                {
                    startActivity(intent);
                    return  true;
                }
                else
                {
                    return false;
                }

            }
        });

    }

}
