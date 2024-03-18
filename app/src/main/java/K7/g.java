package k7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import h7.EnumC3329c;
import m7.C4567c;
import z2.s;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37181Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f37182Z;

    public /* synthetic */ g(k kVar, int i10) {
        this.f37181Y = i10;
        this.f37182Z = kVar;
    }

    @Override // k7.i
    public final Object apply(Object obj) {
        int i10 = this.f37181Y;
        k kVar = this.f37182Z;
        switch (i10) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                kVar.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ((C4567c) kVar.f37189Z).a()).execute();
                return null;
            case 1:
                Cursor cursor = (Cursor) obj;
                kVar.getClass();
                while (cursor.moveToNext()) {
                    kVar.i(new s(cursor.getInt(0), cursor.getString(1), EnumC3329c.MESSAGE_TOO_OLD));
                }
                return null;
            default:
                Cursor cursor2 = (Cursor) obj;
                kVar.getClass();
                while (cursor2.moveToNext()) {
                    kVar.i(new s(cursor2.getInt(0), cursor2.getString(1), EnumC3329c.MAX_RETRIES_REACHED));
                }
                return null;
        }
    }
}
