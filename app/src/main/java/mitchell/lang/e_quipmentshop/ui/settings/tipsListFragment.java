package mitchell.lang.e_quipmentshop.ui.settings;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import mitchell.lang.e_quipmentshop.R;
import mitchell.lang.e_quipmentshop.ui.JavaBean.Term;


/**
 * A simple {@link Fragment} subclass.
 */
public class tipsListFragment extends Fragment {
    FragmentManager fm;
    SharedPreferences sharedPreferences;

    public tipsListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tips_list, container, false);
        ArrayList<Term> terms = new ArrayList<>();
        terms.add(new Term("Skating", "The most important step to becoming a good hockey player is having the agility and acceleration to jump into the play quickly and efficiently. Learning how to properly make strides while skating at fast speeds is critical to advancing the level of your game. Skating might be the most crucial aspect to the game of hockey, its vert important to know how the edges of the blade work into the ice to hit maximum speeds in your game."));
        terms.add(new Term("Protect The Puck", " If you see a defender coming to you, move the puck to the other side of your body and block them from getting it. You can use your feet, hips, leg, arm, back of your hand and body to separate the puck from opposing players. Protecting the puck is very important in modern day hockey because the game is more about puck possession time instead of real scoring opportunities. Protecting the puck can reward your team in the long run of a full course game"));
        terms.add(new Term("Keep The Puck Moving", "Practice “soft hands” and dribbling the puck so that the puck is almost always moving. By keeping the puck moving you are keeping the opponent thinking and guessing so they will never know when you are going to pull a move on them, shoot the puck or pass. Keeping the puck moving will also force the opponent to chase you down with the puck and this can make a team tired over the course of three  full periods of play"));
        terms.add(new Term("Head Up", "If you have your head down you will miss passes, miss plays or end up laid out on the ice. With practice you can develop a sixth sense and know where the puck is on your blade without looking at it. If you practice with your head down, you will play with your head down. Make sure you are not staring at the puck when you practice or else it will fall into habit and you will miss plenty of great scoring opportunities on the ice"));
        terms.add(new Term("Top Hands", "Beginners tend to use their bottom hand too much and it ends up with choppy stickhandling. Your top hand should be doing most of the work when it comes to moving the puck and pulling moves; your bottom hand is there for support. Holding the stick is crustal when making a shot, pass or simply just skating in open ice. The way you hold your stick can give you more grip and torque when ripping shots and can make all the difference"));
        terms.add(new Term("Know Your Surroundings", "Understanding where you are on the ice in comparison to the puck and every other player is key to having a strong offensive and defensive awareness. Knowing where your team is can help when making a pass when you need to cough up the puck. Knowing when to take your time and when to rush things is important at controlling the flow of things inside the game, strong team chemistry and understanding of positions on the ice will help your team and yourself get more goals"));
        terms.add(new Term("PRACTICE", "Your muscles have memory, and if you practice enough they can perform things automatically just like tying your shoes or walking. Before you start practicing, you need to know WHAT to practice and HOW to practice."));

        RecyclerView recyclerView = view.findViewById(R.id.recycle);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, LinearLayoutManager.HORIZONTAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        TipsRecyclerViewAdapter adapter = new TipsRecyclerViewAdapter(terms);
        recyclerView.setAdapter(adapter);
        return view;
    }

}
