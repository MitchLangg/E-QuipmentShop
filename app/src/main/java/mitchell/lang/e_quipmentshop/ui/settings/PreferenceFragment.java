
package mitchell.lang.e_quipmentshop.ui.settings;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;


import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import mitchell.lang.e_quipmentshop.R;

/**
 * @author
 * @date
 * @description
 */

public class PreferenceFragment extends PreferenceFragmentCompat
{
    //create the fragment manager
    FragmentManager fm;
    //create the fragmentTransaction
    FragmentTransaction transaction;

    String[] address = {"equipmentShop@gmail.com"};
    //create new preferences


    @Override
    public void onCreatePreferences(Bundle bundle, String s)
    {
        //grab the manager
        fm = getFragmentManager();

        //grab the preference
        addPreferencesFromResource(R.xml.preferences);

       Preference feedbackPreference = findPreference("feedback");
       Preference callPref = findPreference("call");
       Preference locationPref = findPreference("location");
       Preference tips = findPreference("tips");
       Preference webPref = findPreference("web");

        /**
         * Create the on preference click listeners below
         */


        tips.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                transaction = fm.beginTransaction();
                transaction.replace(R.id.settingsFragment, new tipsListFragment());
                transaction.addToBackStack(null);
                transaction.commit();
                return false;
            }
        });

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

        locationPref.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                Uri location = Uri.parse("geo:0,0?q=42,-83(St clair college");
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(location);

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
        callPref.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:+15199920043"));


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





