package w2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import u2.AbstractC5826a;
import u2.C5827b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f47684c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5826a f47685a;

    /* renamed from: b  reason: collision with root package name */
    public String f47686b;

    public h(C5827b c5827b) {
        this.f47685a = c5827b;
    }

    public final HashMap a() {
        try {
            this.f47686b.getClass();
            Cursor query = this.f47685a.getReadableDatabase().query(this.f47686b, f47684c, null, null, null, null, null);
            HashMap hashMap = new HashMap(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(0);
                string.getClass();
                hashMap.put(string, new g(query.getLong(1), query.getLong(2)));
            }
            query.close();
            return hashMap;
        } catch (SQLException e10) {
            throw new IOException(e10);
        }
    }

    public final void b(long j6) {
        AbstractC5826a abstractC5826a = this.f47685a;
        try {
            String hexString = Long.toHexString(j6);
            this.f47686b = "ExoPlayerCacheFileMetadata" + hexString;
            if (u2.c.a(abstractC5826a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = abstractC5826a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                u2.c.b(writableDatabase, 2, hexString);
                String str = this.f47686b;
                writableDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                writableDatabase.execSQL("CREATE TABLE " + this.f47686b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new IOException(e10);
        }
    }

    public final void c(Set set) {
        this.f47686b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f47685a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                writableDatabase.delete(this.f47686b, "name = ?", new String[]{(String) it.next()});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e10) {
            throw new IOException(e10);
        }
    }

    public final void d(long j6, long j10, String str) {
        this.f47686b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f47685a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j6));
            contentValues.put("last_touch_timestamp", Long.valueOf(j10));
            writableDatabase.replaceOrThrow(this.f47686b, null, contentValues);
        } catch (SQLException e10) {
            throw new IOException(e10);
        }
    }
}
