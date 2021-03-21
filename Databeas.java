package com.example.myteacher;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class Databeas extends SQLiteOpenHelper {
    public static final String DB_NAME = "student.dp";
    public static final int DB_VIRSION = 1;
    public static final String STUDENT_TB_NAME = "student";
    public static final String STUDENT_CLN_ID = "id";
    public static final String STUDENT_CLN_USER = "UserName";
    public static final String STUDENT_CLN_FNAME = "FirstName";
    public static final String STUDENT_CLN_LNAME = "LastName";
    public static final String STUDENT_CLN_EMAIL = "Email";
    public static final String STUDENT_CLN_EDUCATIONAL_LEVEL = "Educational_level";
    public static final String STUDENT_CLN_PASSWORD = "password";

    public static final String BOOK_TB_NAME = "book";
    public static final String BOOK_CLN_TITLE = "title";
    public static final String BOOK_CLN_ID = "id";
    public static final String BOOK_CLN_CONTENT = "content";
    public static final String BOOK_CLN_LEVEL_NUMBER = "level_number";


    public Databeas(Context context){
        super(context,"login.db",null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE "+STUDENT_TB_NAME+"("+STUDENT_CLN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                STUDENT_CLN_USER+" TEXT ,"+ STUDENT_CLN_FNAME+" TEXT ,"+ STUDENT_CLN_LNAME+" TEXT ,"+
                STUDENT_CLN_EMAIL+" TEXT ,"+ STUDENT_CLN_EDUCATIONAL_LEVEL+" TEXT ,"+ STUDENT_CLN_PASSWORD+" TEXT "+ " ) " );


        db.execSQL(" CREATE TABLE "+BOOK_TB_NAME+"("+BOOK_CLN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT ,"+BOOK_CLN_TITLE+" TEXT ,"+ BOOK_CLN_CONTENT+" TEXT, "+BOOK_CLN_LEVEL_NUMBER+" TEXT "+ " ) " )  ;

    }
    public void fillData() {
        insertBook(new book(0, "لغتي " ,"نهض فواز من فراشه وصرخ متألماً : ضرسي يؤلمني. حظر الأب واخذه الى طبيب الأسنان. نظف الطبيب الضرس وعالجه، ثم قال: يا فواز، الإكثار من الحلوى يضر الأسنان ","المرحلة الابتدائية"));
        insertBook(new book(0, "التوحيد " ,"الله ربي الإسلام ديني محمد صلى الله عليه وسلم نبيي","المرحلة الابتدائية"));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + STUDENT_TB_NAME);
        onCreate(db);

    }

    public Boolean chkemail(String email) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + STUDENT_TB_NAME +
                " WHERE " + STUDENT_CLN_EMAIL + "=?", new String[]{email});
        if (cursor.getCount() > 0) return false;
        else return true;
    }

    public Boolean emailpassword(String email,String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + STUDENT_TB_NAME +
                " WHERE " + STUDENT_CLN_EMAIL + "=? AND "+STUDENT_CLN_PASSWORD+"=?", new String[]{email,password});
        if (cursor.getCount() > 0) return true;
        else return false;
    }


    public Boolean insert(String username, String fname, String lname, String educational, String email, String password) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(STUDENT_CLN_USER,username);
        values.put(STUDENT_CLN_FNAME,fname);
        values.put(STUDENT_CLN_LNAME,lname);
        values.put(STUDENT_CLN_EDUCATIONAL_LEVEL,educational);
        values.put(STUDENT_CLN_EMAIL,email);
        values.put(STUDENT_CLN_PASSWORD,password);

        long ins = db.insert(STUDENT_TB_NAME, null, values);
        if (ins==-1) return false;
        return true;

    }
    public boolean insertBook(book bo) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(BOOK_CLN_TITLE, bo.getTitle());
        values.put(BOOK_CLN_CONTENT, bo.getContent());
        values.put(BOOK_CLN_LEVEL_NUMBER, bo.getLevel_number());
        long id = db.insert(BOOK_TB_NAME, null, values);
        if (id > 0)
            return true;
        return false;
    }
    public ArrayList<book> searchBook(String title) {
        ArrayList<book> books = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM "+BOOK_TB_NAME+" WHERE "+BOOK_CLN_TITLE+" LIKE ?",new String[]{"%"+title+"%"});
        if (cursor != null && cursor.moveToFirst()) {
            do {

                int id = cursor.getInt(cursor.getColumnIndex(BOOK_CLN_ID));
                String t = cursor.getString(cursor.getColumnIndex(BOOK_CLN_TITLE));
                String content = cursor.getString(cursor.getColumnIndex(BOOK_CLN_CONTENT));
                String level = cursor.getString(cursor.getColumnIndex(BOOK_CLN_LEVEL_NUMBER));

                books.add(new book(id,t,content,level));

            } while (cursor.moveToNext());
            cursor.close();
        }
        return books;
    }
    public ArrayList<book> getAllBook() {
        ArrayList<book> books = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM "+BOOK_TB_NAME,null);
        if (cursor != null && cursor.moveToFirst()) {
            do {

                int id = cursor.getInt(cursor.getColumnIndex(BOOK_CLN_ID));
                String t = cursor.getString(cursor.getColumnIndex(BOOK_CLN_TITLE));
                String content = cursor.getString(cursor.getColumnIndex(BOOK_CLN_CONTENT));
                String level = cursor.getString(cursor.getColumnIndex(BOOK_CLN_LEVEL_NUMBER));

                books.add(new book(id,t,content,level));

            } while (cursor.moveToNext());
            cursor.close();
        }
        return books;
    }
}
