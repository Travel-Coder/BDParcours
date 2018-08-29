package be.evoliris.formation.bdparcours.database.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import be.evoliris.formation.bdparcours.database.DatabaseHelper;
import be.evoliris.formation.bdparcours.models.Etape;

public class EtapeDao implements IDao<Etape> {

    public static final String TABLE_NAME = "Etape";

    public static final String COL_ID = "id";
    public static final String COL_PERSONNAGE = "personnage";
    public static final String COL_AUTEUR = "auteur";
    public static final String COL_PHOTO = "photo";
    public static final String COL_LATITUDE = "latitude";
    public static final String COL_LONGITUDE = "longitude";

    public static final String REQUEST_CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + " ( "
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COL_PERSONNAGE + " VARCHAR(50) NOT NULL, "
            + COL_AUTEUR + " VARCHAR(50) NOT NULL, "
            + COL_PHOTO + " TEXT NOT NULL, "
            + COL_LATITUDE + " NUMERIC NOT NULL, "
            + COL_LONGITUDE + " NUMERIC NOT NULL, "
            + ");" ;

    public static final String REQUEST_DELETE_TABLE =
            "DROP TABLE " + TABLE_NAME + ";" ;

    private Context context;
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    public EtapeDao(Context context) {this.context = context;}

    public EtapeDao openWritable() {
        databaseHelper = new DatabaseHelper(context);
        db = databaseHelper.getWritableDatabase();
        return this;
    }

    public EtapeDao openReadable() {
        databaseHelper = new DatabaseHelper(context);
        db = databaseHelper.getReadableDatabase();
        return this;
    }

    public void close() {
        db.close();
        DatabaseHelper.close();
    }



    @Override
    public long insert(Etape entity) {
        ContentValues cv = new ContentValues();
        cv.put(COL_PERSONNAGE = entity.getPersonnage());
        cv.put(COL_AUTEUR = entity.getAuteur());
        cv.put(COL_PHOTO = entity.getPhoto());
        cv.put(COL_LATITUDE = entity.getLatitude());
        cv.put(COL_LONGITUDE = entity.setLongitude());
        return db.insert(TABLE_NAME, null, cv);
    }

    @Override
    public ArrayList<Etape> getAll() {
        return null;
    }

    @Override
    public Etape getById(long id) {
        return null;
    }

    @Override
    public boolean update(Etape entity) {
        return false;
    }

    @Override
    public void delete(long id) {

    }
}
