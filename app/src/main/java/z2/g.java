package z2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import n7.AbstractC4720a;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements s2.m, k7.i, io.sentry.instrumentation.file.a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51505Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f51506Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f51507h0;

    public /* synthetic */ g(long j6, e7.i iVar) {
        this.f51505Y = 2;
        this.f51506Z = j6;
        this.f51507h0 = iVar;
    }

    @Override // k7.i
    public final Object apply(Object obj) {
        int i10 = this.f51505Y;
        long j6 = this.f51506Z;
        Object obj2 = this.f51507h0;
        switch (i10) {
            case 1:
                k7.k kVar = (k7.k) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                b7.b bVar = k7.k.f37187k0;
                kVar.getClass();
                String[] strArr = {String.valueOf(j6)};
                k7.k.p(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new k7.g(kVar, 1));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                e7.i iVar = (e7.i) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                b7.b bVar2 = k7.k.f37187k0;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j6));
                String str = iVar.f29006a;
                b7.c cVar = iVar.f29008c;
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC4720a.a(cVar))}) < 1) {
                    contentValues.put("backend_name", iVar.f29006a);
                    contentValues.put("priority", Integer.valueOf(AbstractC4720a.a(cVar)));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }

    @Override // io.sentry.instrumentation.file.a
    public final Object call() {
        return Long.valueOf(((io.sentry.instrumentation.file.d) this.f51507h0).f34382Y.skip(this.f51506Z));
    }

    @Override // s2.m
    public final void invoke(Object obj) {
        ((AbstractC6758c) obj).getClass();
    }

    public /* synthetic */ g(Object obj, long j6, int i10) {
        this.f51505Y = i10;
        this.f51507h0 = obj;
        this.f51506Z = j6;
    }
}
