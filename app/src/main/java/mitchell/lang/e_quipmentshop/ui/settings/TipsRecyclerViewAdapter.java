package mitchell.lang.e_quipmentshop.ui.settings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import mitchell.lang.e_quipmentshop.R;
import mitchell.lang.e_quipmentshop.ui.JavaBean.Term;

public class TipsRecyclerViewAdapter extends RecyclerView.Adapter {

    private ArrayList<Term> terms;

    public TipsRecyclerViewAdapter(ArrayList<Term> terms){
        this.terms = terms;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_layout, null);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder,
                                 int position) {
        Term term = terms.get(position);
        ((CustomViewHolder)holder).definition.setText(term.getDefinition());
        ((CustomViewHolder)holder).name.setText(term.getName());
    }
    @Override
    public int getItemCount() {
        if(terms != null){
            return terms.size();
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
