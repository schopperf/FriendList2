package at.fh.swengb.friendlist;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



import at.fh.swengb.friendlist.model.BadFriends;
import at.fh.swengb.friendlist.model.Friend;
import at.fh.swengb.friendlist.model.GoodFriends;
import at.fh.swengb.friendlist.CustomAdapter;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener  {

    private ListView myListView;

    private List<Friend> listFriends;

    private CustomAdapter myAdapter;

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Friend selectedFriend = listFriends.get(i);
        Intent intent = new Intent(view.getContext(),ShowUserActivity.class);
        intent.putExtra("friend", (Parcelable) selectedFriend);
        startActivity(intent);

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = (ListView) findViewById(R.id.myFriendList);

        listFriends = new ArrayList<>();
        listFriends.add(new GoodFriends("rene",50,"graz","FH","swengb"));
        listFriends.add(new GoodFriends("stefan",10,"graz","FH","blabla"));
        listFriends.add(new BadFriends("max",20,"graz","brot"));

        myAdapter = new CustomAdapter(this,listFriends);
        myListView.setAdapter(myAdapter);







    }
}
