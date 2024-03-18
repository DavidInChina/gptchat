package C3;

import B3.h;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import id.AbstractC3557B;
import wf.p;
import x3.w;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2641a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2642b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f2641a = i10;
        this.f2642b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        int i10 = this.f2641a;
        Object obj = this.f2642b;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                AbstractC3557B.c0("$query", hVar);
                AbstractC3557B.Z(sQLiteQuery);
                hVar.h(new w(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                p pVar = (p) obj;
                AbstractC3557B.c0("$tmp0", pVar);
                return (Cursor) pVar.h(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
