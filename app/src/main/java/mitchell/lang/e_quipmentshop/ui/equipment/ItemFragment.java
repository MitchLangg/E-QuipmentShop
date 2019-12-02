package mitchell.lang.e_quipmentshop.ui.equipment;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import mitchell.lang.e_quipmentshop.R;
/**
 * A simple {@link Fragment} subclass.
 */
public class ItemFragment extends Fragment {

    ImageView itemDefinition;
    ListView listView;
    TextView itemDescription;

    public ItemFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item, container, false);

        itemDefinition = view.findViewById(R.id.itemDefinition);
        listView = view.findViewById(R.id.itemList);
        itemDescription = view.findViewById(R.id.itemDescription);

        final ArrayList<ItemType> itemTypes = new ArrayList<>();
        itemTypes.add(new ItemType("Helmet", R.drawable.helmet, "The Helmet is to protect your head and face while on the ice."));
        itemTypes.add(new ItemType("Mouth Guard", R.drawable.mouthguard, "The mouth guard stops your teeth from smashing on each other."));
        itemTypes.add(new ItemType("Neck Guard", R.drawable.neckguard,"The neck guard protects your neck from skate blades and puck hits."));
        itemTypes.add(new ItemType("Chest Protector", R.drawable.chest,"The Chest protector helps prevents injury when hit by a puck or a person."));
        itemTypes.add(new ItemType("Elbow Pads", R.drawable.elbow,"Elbow pads protect your elbows if you fall over."));
        itemTypes.add(new ItemType("Gloves", R.drawable.gloves,"Gloves protect your hands from pucks."));
        itemTypes.add(new ItemType("Pants", R.drawable.pants,"Pants protect your lower region from all kinds of damage."));
        itemTypes.add(new ItemType("Jock Strap", R.drawable.jock,"A jock strap is used to protect your sensitive areas."));
        itemTypes.add(new ItemType("Shin Guards", R.drawable.shin,"Shin guards protect your legs from getting hit by a puck."));
        itemTypes.add(new ItemType("Skates", R.drawable.skates,"Skates are used to move around on the ice."));
        itemTypes.add(new ItemType("Stick", R.drawable.stick,"A stick is used to handle the puck, you need one to play the sport."));
        itemTypes.add(new ItemType("", R.drawable.white,"ITEM DESCRIPTION"));
        itemTypes.add(new ItemType("", R.drawable.white,"ITEM DESCRIPTION"));

        ArrayAdapter adapter = new ArrayAdapter(getContext(),
                android.R.layout.simple_list_item_1, itemTypes);

        CustomListViewAdapter adapter1 =
                new CustomListViewAdapter(getContext(),
                        itemTypes);

        listView.setAdapter(adapter1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                itemDefinition.setImageResource(itemTypes.get(position)
                        .getDefinition());
                itemDescription.setText(itemTypes.get(position)
                        .getDescription());
            }
        });
        return view;
    }

    public class CustomListViewAdapter extends ArrayAdapter<ItemType> {
        public CustomListViewAdapter(@NonNull Context context,
                                     ArrayList<ItemType> items) {
            super(context, 0, items);
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            ItemType item = getItem(position);
            if (convertView == null){
                convertView = LayoutInflater.
                        from(getContext()).
                        inflate(R.layout.listview_item, parent, false);
            }
            TextView name = convertView.findViewById(R.id.name);
            name.setText(item.getName());
            return  convertView;
        }
    }
}
