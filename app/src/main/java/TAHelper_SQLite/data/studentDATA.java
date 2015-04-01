package TAHelper_SQLite.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by doraoam on 31/03/58.
 */
public class studentDATA {

    private DatabaseHelper dbHelper;
    private SQLiteDatabase database;

    private static final String STUDENT_TABLE = "student_Table";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_SEATNUMBER = "seatNumber";
    private static final String COLUMN_STUDENTID = "StudentID";
    private static final String COLUMN_NAME = "Name";
    private static final String COLUMN_SURNAME = "Surname";
    private static final String COLUMN_MAJOR = "Major";
    private static final String COLUMN_FACULTY = "Faculty";

    public studentDATA(Context context){
        dbHelper = new DatabaseHelper(context);
        database = dbHelper.getWritableDatabase();
    }

    public long addNewStudent(String seatNumber,String StudentID, String Name, String Surname, String Major, String Faculty){
        ContentValues values = new ContentValues();
        values.put(COLUMN_SEATNUMBER,seatNumber);
        values.put(COLUMN_STUDENTID,StudentID);
        values.put(COLUMN_NAME,Name);
        values.put(COLUMN_SURNAME,Surname);
        values.put(COLUMN_MAJOR,Major);
        values.put(COLUMN_FACULTY,Faculty);
        return database.insert(STUDENT_TABLE,null,values);
    }

    public Cursor readAllStudent(){
        Cursor mCursor = database.query(true,STUDENT_TABLE, new String[]{
                COLUMN_ID,COLUMN_SEATNUMBER,COLUMN_STUDENTID,COLUMN_NAME,COLUMN_SURNAME,COLUMN_MAJOR,COLUMN_FACULTY},null,
                null,null,null,null,null,null);
        if(mCursor != null){
            mCursor.moveToFirst();
        }
        return mCursor;
    }

    public int updateStudent(String seatNumber, String id,String StudentID, String Name, String Surname, String Major, String Faculty){
        ContentValues values = new ContentValues();
        values.put(COLUMN_ID,id);
        values.put(COLUMN_SEATNUMBER,seatNumber);
        values.put(COLUMN_STUDENTID,StudentID);
        values.put(COLUMN_NAME,Name);
        values.put(COLUMN_SURNAME,Surname);
        values.put(COLUMN_MAJOR,Major);
        values.put(COLUMN_FACULTY,Faculty);
        return database.update(STUDENT_TABLE,values,COLUMN_ID + "=?", new String[]{id});
    }

    public boolean deleteStudent(String id){
        return database.delete(STUDENT_TABLE,COLUMN_ID + "=" + id, null) > 0;
    }
}
