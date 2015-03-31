package manypocket.tahelper;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class editProfile extends ActionBarActivity {

    private EditText edtStudentID;
    private EditText edtName;
    private EditText edtSurname;
    private EditText edtMajor;
    private EditText edtFaculty;

    private String strStudentID;
    private String strName;
    private String strSurname;
    private String strMajor;
    private String strFaculty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        initWidget();
    }

    private void initWidget() {
        edtStudentID = (EditText)findViewById(R.id.editText_studentID);
        edtName = (EditText)findViewById(R.id.editText_name);
        edtSurname = (EditText)findViewById(R.id.editText_surname);
        edtMajor = (EditText)findViewById(R.id.editText_major);
        edtFaculty = (EditText)findViewById(R.id.editText_faculty);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edit_profile, menu);
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

    public void clickSaveNewStudent(View view) {
        strStudentID = edtStudentID.getText().toString();
        strName = edtName.getText().toString();
        strSurname = edtSurname.getText().toString();
        strMajor = edtMajor.getText().toString();
        strFaculty = edtFaculty.getText().toString();

        showAddStudentDialog();
    }

    private void showAddStudentDialog() {
        AlertDialog.Builder addStudentAlert = new AlertDialog.Builder(this);
        addStudentAlert.setIcon(R.drawable.ic_action_warning);
        addStudentAlert.setTitle("Add New Student to Database");
        addStudentAlert.setMessage("StudentID : " + strStudentID + "\n" + "Name : "
            + strName + "\n" + "Surname : " + strSurname + "\n" + "Major : "
                + strMajor + "\n" + "Faculty : " + strFaculty);

        addStudentAlert.setPositiveButton("OK",
                new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        addStudentAlert.setNegativeButton("Cancel",
                new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        addStudentAlert.show();
    }
}
