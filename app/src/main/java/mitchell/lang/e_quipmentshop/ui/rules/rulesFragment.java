package mitchell.lang.e_quipmentshop.ui.rules;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import mitchell.lang.e_quipmentshop.R;
import mitchell.lang.e_quipmentshop.ui.JavaBean.Rule;


public class rulesFragment extends Fragment {


    public rulesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rules, container, false);
        ArrayList<Rule> rules = new ArrayList<>();
        rules.add(new Rule("Offside", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Icing", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Boarding", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Charging", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Elbowing", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("High-Sticking", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Cross-Checking", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Holding", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Hooking", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Interference", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Roughing", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Slashing", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Misconduct", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Spearing", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Tripping", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));
        rules.add(new Rule("Washout", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vulputate purus est, vitae condimentum orci vestibulum eget. Vestibulum fringilla feugiat."));

        RecyclerView recyclerView = view.findViewById(R.id.ruleRecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        CustomRecyclerViewAdapter adapter =
                new CustomRecyclerViewAdapter(rules);

        recyclerView.setAdapter(adapter);

        return view;
    }

}
