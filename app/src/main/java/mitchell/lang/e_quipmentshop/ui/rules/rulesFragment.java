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
        rules.add(new Rule("Offside", "Offside occurs if a player on the attacking team does not control the puck and is in the offensive zone when a different attacking player causes the puck to completely cross the blue line into the offensive zone, until either the puck or all attacking players leave the offensive zone."));
        rules.add(new Rule("Icing", "Icing occurs when a player shoots the puck from behind the centre red line, across the opposing team's goal line, and the puck remains untouched."));
        rules.add(new Rule("Boarding", "Boarding is the penalty called when a player checks a defenseless opponent violently into the… well… boards. A defenseless player is defined as one that has his back to the checking player, no longer has a play on the puck, or other situations at the referee’s discretion."));
        rules.add(new Rule("Charging", "A charge is a similar offense to boarding but can take place in open ice. It can also occur along the boards. A charge is defined as a violent hit as a result of “distance traveled.”"));
        rules.add(new Rule("Elbowing", "Elbowing is the use of an extended elbow as the point of contact with an opponent while delivering a check, or as a means to create separation with an opponent, and may include an attempted elbow."));
        rules.add(new Rule("High-Sticking", "High Sticking is the action where a player carries the stick above the normal height of the opponent's shoulders and makes contact with the opponent. A player must be accountable for being in control of their stick at all times."));
        rules.add(new Rule("Cross-Checking", " Cross-checking is the action of using the shaft of the stick between the two hands to forcefully check an opponent with no portion of the stick on the ice."));
        rules.add(new Rule("Holding", "Holding is the action of a player wrapping his arms around an opponent or using a free hand to clutch, grab or hold the stick, jersey or body on the opponent. This includes wrapping one or both arms around the opponent along the boards in a manner that pins them against the boards and prevents them from playing the puck or skating"));
        rules.add(new Rule("Hooking", " Hooking is the action of impeding the progress of an opponent with a pulling or tugging motion by applying the blade of the stick to any part of an opponent's body or stick. A player cannot use his/her stick against an opponent's body (puck carrier or non-puck carrier) to gain a positional advantage."));
        rules.add(new Rule("Interference", "Interference is defined as when a player uses his body (\"pick\" or \"block\") to impede the progress of an opponent (non-puck carrier) with no effort to play the puck, maintain normal foot speed or maintain an established skating lane."));
        rules.add(new Rule("Roughing", "Roughing is an offense and penalty in ice hockey when two players are in a minor altercation. The incident would have to be minor for either player to be categorized as such an offense, for instance: A player striking another opponent."));
        rules.add(new Rule("Slashing", "Slashing is the act of a player swinging his stick at an opponent, whether contact is made, or not. Any forceful chop with the stick on an opponent's body or opponent's stick, on or near the opponent's hands, shall be considered slashing."));
        rules.add(new Rule("Misconduct", "In the event of \"MISCONDUCT\" penalties to any players except the goalkeeper, the players shall be ruled off the ice for a period of ten (10) minutes each. A substitute player is permitted permitted to immediately replace a player serving a misconduct penalty."));
        rules.add(new Rule("Spearing", "Spearing is the act of poking, stabbing, or attempting to poke or stab an opponent with the tip of the blade of the stick while holding the stick with one or both hands."));
        rules.add(new Rule("Tripping", "Tripping is the act of placing a stick, knee, foot, arm, hand or elbow in such a manner that causes his opponent to lose balance or fall."));

        RecyclerView recyclerView = view.findViewById(R.id.ruleRecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        CustomRecyclerViewAdapter adapter =
                new CustomRecyclerViewAdapter(rules);

        recyclerView.setAdapter(adapter);

        return view;
    }

}
