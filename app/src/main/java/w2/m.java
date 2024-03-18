package w2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.util.SparseArray;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import q.C5241w;
import s2.AbstractC5530A;
import u2.AbstractC5826a;
import u2.C5827b;

/* loaded from: classes.dex */
public final class m implements o {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f47701e = {ParameterNames.ID, SubscriberAttributeKt.JSON_NAME_KEY, "metadata"};

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5826a f47702a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray f47703b = new SparseArray();

    /* renamed from: c  reason: collision with root package name */
    public String f47704c;

    /* renamed from: d  reason: collision with root package name */
    public String f47705d;

    public m(C5827b c5827b) {
        this.f47702a = c5827b;
    }

    @Override // w2.o
    public final void a(l lVar, boolean z10) {
        SparseArray sparseArray = this.f47703b;
        int i10 = lVar.f47696a;
        if (z10) {
            sparseArray.delete(i10);
        } else {
            sparseArray.put(i10, null);
        }
    }

    @Override // w2.o
    public final void b(HashMap hashMap) {
        try {
            SQLiteDatabase writableDatabase = this.f47702a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            i(writableDatabase);
            for (l lVar : hashMap.values()) {
                h(writableDatabase, lVar);
            }
            writableDatabase.setTransactionSuccessful();
            this.f47703b.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e10) {
            throw new IOException(e10);
        }
    }

    @Override // w2.o
    public final boolean c() {
        try {
            SQLiteDatabase readableDatabase = this.f47702a.getReadableDatabase();
            String str = this.f47704c;
            str.getClass();
            if (u2.c.a(readableDatabase, 1, str) != -1) {
                return true;
            }
            return false;
        } catch (SQLException e10) {
            throw new IOException(e10);
        }
    }

    @Override // w2.o
    public final void d(HashMap hashMap) {
        SparseArray sparseArray = this.f47703b;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f47702a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                l lVar = (l) sparseArray.valueAt(i10);
                if (lVar == null) {
                    int keyAt = sparseArray.keyAt(i10);
                    String str = this.f47705d;
                    str.getClass();
                    writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                } else {
                    h(writableDatabase, lVar);
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e10) {
            throw new IOException(e10);
        }
    }

    @Override // w2.o
    public final void delete() {
        AbstractC5826a abstractC5826a = this.f47702a;
        String str = this.f47704c;
        str.getClass();
        try {
            String concat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = abstractC5826a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            int i10 = u2.c.f46343a;
            try {
                int i11 = AbstractC5530A.f45131a;
                if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                    writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                }
                writableDatabase.execSQL("DROP TABLE IF EXISTS " + concat);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new IOException(e10);
            }
        } catch (SQLException e11) {
            throw new IOException(e11);
        }
    }

    @Override // w2.o
    public final void e(long j6) {
        String hexString = Long.toHexString(j6);
        this.f47704c = hexString;
        this.f47705d = R.a.r("ExoPlayerCacheIndex", hexString);
    }

    @Override // w2.o
    public final void f(l lVar) {
        this.f47703b.put(lVar.f47696a, lVar);
    }

    @Override // w2.o
    public final void g(HashMap hashMap, SparseArray sparseArray) {
        boolean z10;
        AbstractC5826a abstractC5826a = this.f47702a;
        if (this.f47703b.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        try {
            SQLiteDatabase readableDatabase = abstractC5826a.getReadableDatabase();
            String str = this.f47704c;
            str.getClass();
            if (u2.c.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = abstractC5826a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                i(writableDatabase);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
            SQLiteDatabase readableDatabase2 = abstractC5826a.getReadableDatabase();
            String str2 = this.f47705d;
            str2.getClass();
            Cursor query = readableDatabase2.query(str2, f47701e, null, null, null, null, null);
            while (query.moveToNext()) {
                int i10 = query.getInt(0);
                String string = query.getString(1);
                string.getClass();
                hashMap.put(string, new l(i10, string, C5241w.a(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                sparseArray.put(i10, string);
            }
            query.close();
        } catch (SQLiteException e10) {
            hashMap.clear();
            sparseArray.clear();
            throw new IOException(e10);
        }
    }

    public final void h(SQLiteDatabase sQLiteDatabase, l lVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C5241w.b(lVar.f47700e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ParameterNames.ID, Integer.valueOf(lVar.f47696a));
        contentValues.put(SubscriberAttributeKt.JSON_NAME_KEY, lVar.f47697b);
        contentValues.put("metadata", byteArray);
        String str = this.f47705d;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public final void i(SQLiteDatabase sQLiteDatabase) {
        String str = this.f47704c;
        str.getClass();
        u2.c.b(sQLiteDatabase, 1, str);
        String str2 = this.f47705d;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + this.f47705d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }
}
