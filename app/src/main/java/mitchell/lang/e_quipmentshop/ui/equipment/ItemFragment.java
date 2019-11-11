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

    public ItemFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item, container, false);

        itemDefinition = view.findViewById(R.id.itemDefinition);
        listView = view.findViewById(R.id.itemList);

        final ArrayList<ItemType> itemTypes = new ArrayList<>();
        itemTypes.add(new ItemType("Helmet", R.drawable.helmet));
        itemTypes.add(new ItemType("Mouth Guard", R.drawable.mouthguard));
        itemTypes.add(new ItemType("Neck Guard", R.drawable.neckguard));
        itemTypes.add(new ItemType("Chest Protector", R.drawable.chest));
        itemTypes.add(new ItemType("Elbow Pads", R.drawable.elbow));
        itemTypes.add(new ItemType("Gloves", R.drawable.gloves));
        itemTypes.add(new ItemType("Pants", R.drawable.pants));
        itemTypes.add(new ItemType("Jock Strap", R.drawable.jock));
        itemTypes.add(new ItemType("Shin Guards", R.drawable.shin));
        itemTypes.add(new ItemType("Skates", R.drawable.skates));
        itemTypes.add(new ItemType("Stick", R.drawable.stick));
        itemTypes.add(new ItemType("Default", R.drawable.stick));


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
