package u2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.javax.sip.header.ParameterNames;
import java.io.IOException;
import p2.I;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f46343a = 0;

    static {
        I.a("media3.database");
    }

    public static int a(SQLiteDatabase sQLiteDatabase, int i10, String str) {
        boolean z10;
        try {
            int i11 = AbstractC5530A.f45131a;
            if (DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{ParameterNames.VERSION}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i10), str}, null, null, null);
            if (query.getCount() == 0) {
                query.close();
                return -1;
            }
            query.moveToNext();
            int i12 = query.getInt(0);
            query.close();
            return i12;
        } catch (SQLException e10) {
            throw new IOException(e10);
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i10, String str) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i10));
            contentValues.put("instance_uid", str);
            contentValues.put(ParameterNames.VERSION, (Integer) 1);
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e10) {
            throw new IOException(e10);
        }
    }
}
