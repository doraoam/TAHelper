package manypocket.tahelper;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Edit_seat extends ActionBarActivity {

    public final static String STRSEATNUMBER = ".TAHelper.SEATNUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_seat);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edit_seat, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void gotoEditProfile(View view) {
        Intent intent = new Intent(getApplicationContext(),editProfile.class);
        Resources res = view.getResources();
        int id = view.getId();
        String idString = res.getResourceEntryName(id);
        String seatNumber = idString.substring(11);
        intent.putExtra(STRSEATNUMBER,seatNumber);
        startActivity(intent);
    }
}
