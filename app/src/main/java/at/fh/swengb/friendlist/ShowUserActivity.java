package at.fh.swengb.friendlist;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.friendlist.model.Friend;

public class ShowUserActivity extends Activity {
    private Friend friend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user);

        Intent intent = getIntent();
        friend = (Friend) intent.getExtras().get("friend");

        TextView viewName = (TextView) findViewById(R.id.textViewName);
        TextView viewAge = (TextView) findViewById(R.id.textViewAge);
        TextView viewLocation = (TextView) findViewById(R.id.textViewLocation);


        viewName.setText(friend.getName());
        viewAge.setText(friend.getAge());
        viewLocation.setText(friend.getLocation());


    }

    public void showOnMap(View view) {
        // Map point based on address
        Uri location = Uri.parse("geo:0,0?q="+friend.getLocation());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }


}
