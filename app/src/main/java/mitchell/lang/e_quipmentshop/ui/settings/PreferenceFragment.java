
package mitchell.lang.e_quipmentshop.ui.settings;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import mitchell.lang.e_quipmentshop.R;


/**
 * @author Mitch Lang
 * @date 01/12/2019
 * @description Preference manager for the settings page
 */

import mitchell.lang.e_quipmentshop.ui.CreditsActivity;


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
       Preference webPref = findPreference("web");
       Preference credits = findPreference("credits");
       Preference tips = findPreference("tips");


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

        webPref.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.Facebook.com"));


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

        credits.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                Intent i = new Intent(getContext(), CreditsActivity.class);
                startActivity(i);

                return true;
            }
        });
        }
    }





