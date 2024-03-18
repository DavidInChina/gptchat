package z2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import h7.EnumC3329c;
import j7.C3919i;
import l7.AbstractC4341b;
import m7.C4567c;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements s2.m, AbstractC4341b, k7.i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f51525Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f51526Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f51527h0;

    public /* synthetic */ s(long j6, Object obj, Object obj2) {
        this.f51526Z = obj;
        this.f51527h0 = obj2;
        this.f51525Y = j6;
    }

    @Override // k7.i
    public final Object apply(Object obj) {
        String str = (String) this.f51526Z;
        EnumC3329c enumC3329c = (EnumC3329c) this.f51527h0;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        b7.b bVar = k7.k.f37187k0;
        boolean booleanValue = ((Boolean) k7.k.p(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC3329c.f31934Y)}), new A9.a(14))).booleanValue();
        long j6 = this.f51525Y;
        int i10 = enumC3329c.f31934Y;
        if (!booleanValue) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j6));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j6 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        }
        return null;
    }

    @Override // l7.AbstractC4341b
    public final Object c() {
        C3919i c3919i = (C3919i) this.f51526Z;
        long a5 = ((C4567c) c3919i.f36061g).a() + this.f51525Y;
        k7.k kVar = (k7.k) c3919i.f36057c;
        kVar.getClass();
        kVar.i(new g(a5, (e7.i) this.f51527h0));
        return null;
    }

    @Override // s2.m
    public final void invoke(Object obj) {
        ((AbstractC6758c) obj).getClass();
    }
}
