package manypocket.tahelper;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class homeSetting extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_setting);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_setting, menu);
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

    public void gotoEditRoom(View view) {
        AlertDialog.Builder stillNotDevelopAlert = new AlertDialog.Builder(this);
        stillNotDevelopAlert.setIcon(R.drawable.ic_action_about);
        stillNotDevelopAlert.setTitle("Sorry...");
        stillNotDevelopAlert.setMessage("We still not develop this part." + "\n" + "We apologize for this inconveniences.");
        stillNotDevelopAlert.show();
    }

    public void gotoEditSubject(View view) {
        AlertDialog.Builder stillNotDevelopAlert = new AlertDialog.Builder(this);
        stillNotDevelopAlert.setIcon(R.drawable.ic_action_about);
        stillNotDevelopAlert.setTitle("Sorry...");
        stillNotDevelopAlert.setMessage("We still not develop this part." + "\n" + "We apologize for this inconveniences.");
        stillNotDevelopAlert.show();
    }

    public void gotoEditStudent(View view) {
        Intent intent = new Intent(getApplicationContext(),Edit_seat.class);
        startActivity(intent);
    }
}
