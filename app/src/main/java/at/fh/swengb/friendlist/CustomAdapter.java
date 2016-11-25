package at.fh.swengb.friendlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.friendlist.model.Friend;

/**
 * Created by fabian on 25.11.16.
 */

public class CustomAdapter extends android.widget.BaseAdapter {



    List<Friend> listFriends;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Friend> listFriends) {
        this.context = applicationContext;
        this.listFriends= listFriends;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listFriends.size();
    }

    @Override
    public Object getItem(int i) {
        return listFriends.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewLocation=(TextView)view.findViewById(R.id.textViewListLocation);

        Friend friend = listFriends.get(i);
        viewName.setText(friend.getName());
        viewLocation.setText(friend.getLocation());


        return view;
    }
}
