package mitchell.lang.e_quipmentshop.ui.rules;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import mitchell.lang.e_quipmentshop.R;
import mitchell.lang.e_quipmentshop.ui.Rule;


public class rulesFragment extends Fragment {


    public rulesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rules, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.ruleRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ArrayList<Rule> ruleArrayList = new ArrayList<>();

       return view;
    }

}
