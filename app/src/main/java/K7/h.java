package k7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37183Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f37184Z;

    public /* synthetic */ h(long j6, int i10) {
        this.f37183Y = i10;
        this.f37184Z = j6;
    }

    @Override // k7.i
    public final Object apply(Object obj) {
        int i10 = this.f37183Y;
        long j6 = this.f37184Z;
        switch (i10) {
            case 0:
                return (h7.g) k.p(((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new h(j6, 1));
            default:
                Cursor cursor = (Cursor) obj;
                cursor.moveToNext();
                return new h7.g(cursor.getLong(0), j6);
        }
    }
}
