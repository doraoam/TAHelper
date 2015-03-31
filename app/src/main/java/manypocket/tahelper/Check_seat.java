package manypocket.tahelper;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Check_seat extends ActionBarActivity {

    private static int totalStudent;

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_seat);
        totalStudent = 0;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_check_seat, menu);
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

    public void countToTalStudent(View view) {

        // create to check id of button
        Resources res = view.getResources();
        int id = view.getId();
        String idString = res.getResourceEntryName(id);

        // translate a string into resource type
        int resID = getResources().getIdentifier(idString,"id", getPackageName());

        // convert int into ImageButton and make it can click only one time
        ImageButton imageButton = (ImageButton)findViewById(resID);
        imageButton.setClickable(false);

        totalStudent++;
    }

    public void showToTalStudent(View view) {
        AlertDialog.Builder alertTotalStudent = new AlertDialog.Builder(this);
        alertTotalStudent.setMessage("Total student : " + totalStudent);
        alertTotalStudent.show();
    }
}
