package mitchell.lang.e_quipmentshop;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import mitchell.lang.e_quipmentshop.ui.equipment.ItemFragment;
import mitchell.lang.e_quipmentshop.ui.home.HomeFragment;
import mitchell.lang.e_quipmentshop.ui.rules.rulesFragment;
import mitchell.lang.e_quipmentshop.ui.settings.settingsFragment;
import mitchell.lang.e_quipmentshop.ui.stickpick.stickPickFragment;

public class MainActivity extends AppCompatActivity {
    FragmentManager fm;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fm.beginTransaction();
            switch (menuItem.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.content, new HomeFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                    return true;
                case R.id.navigation_equipment:
                    transaction.replace(R.id.content, new ItemFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                    return true;
                case R.id.navigation_rules:
                    transaction.replace(R.id.content, new rulesFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                    return true;
                case R.id.navigation_stickpick:
                    transaction.replace(R.id.content, new stickPickFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                    return true;
                case R.id.navigation_settings:
                    transaction.replace(R.id.content, new settingsFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                    return true;
            }
            return false;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_rules, R.id.navigation_equipment, R.id.navigation_stickpick, R.id.navigation_settings)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
/*
        //for button in settings
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //Grabbing the fragment manager
            FragmentManager fm = getSupportFragmentManager();
            //Create a FragmentTransaction
            //Place the MainFragment where R.id.content is
            FragmentTransaction transaction = fm.beginTransaction();
            //Replace whatever is inside R.id.content (FrameLayout)
            //with a new MainFragment
            transaction.replace(R.id.content, new settingsFragment());
            //process the transaction
            transaction.commit();
            */
 
        }
    }

