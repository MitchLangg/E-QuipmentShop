package mitchell.lang.e_quipmentshop.ui.rules;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import mitchell.lang.e_quipmentshop.R;
import mitchell.lang.e_quipmentshop.ui.JavaBean.Rule;

/**
 * @author Mitch Todd/Mitch Lang
 * @date Week 12-14
 * @description Recycler View Adapter for rules page.
 */

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter {

    private ArrayList<Rule> rules;

    public CustomRecyclerViewAdapter(ArrayList<Rule> rules){
        this.rules = rules;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                      int viewType) {
        //Make the view that we want each list item to look like
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_row, null);
        //place that view inside the ViewHolder
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        //Return the custom ViewHolder
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder,
                                 int position) {

        Rule rule = rules.get(position);
        ((CustomViewHolder)holder).definition.setText(rule.getDefinition());
        ((CustomViewHolder)holder).name.setText(rule.getName());
    }

    @Override
    public int getItemCount() {
        if(rules != null){
            return rules.size();
        }
        return 0;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        protected TextView name;
        protected TextView definition;

        public CustomViewHolder(View view){
            super(view);
            this.name = view.findViewById(R.id.name);
            this.definition = view.findViewById(R.id.definition);
        }

    }


}
