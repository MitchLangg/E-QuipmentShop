package mitchell.lang.e_quipmentshop.ui.settings;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import mitchell.lang.e_quipmentshop.R;

/**
 * @author Mitch Lang
 * @date 01/12/2019
 * @description Settings activity
 */

public class SettingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new CustomPreferenceFragment()).commit();
        setTheme(R.style.SettingsFragmentStyle);

    }

    public static class CustomPreferenceFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);




        }
    }
}

