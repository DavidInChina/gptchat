package k7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.gov.nist.core.Separators;
import android.os.SystemClock;
import android.util.Base64;
import i7.C3482a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import l7.AbstractC4341b;
import l7.AbstractC4342c;
import m7.AbstractC4565a;
import m7.C4567c;
import n7.AbstractC4720a;

/* loaded from: classes2.dex */
public final class k implements d, AbstractC4342c, AbstractC4202c {

    /* renamed from: k0  reason: collision with root package name */
    public static final b7.b f37187k0 = new b7.b("proto");

    /* renamed from: Y  reason: collision with root package name */
    public final n f37188Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4565a f37189Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC4565a f37190h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C4200a f37191i0;

    /* renamed from: j0  reason: collision with root package name */
    public final p000if.a f37192j0;

    public k(AbstractC4565a abstractC4565a, AbstractC4565a abstractC4565a2, C4200a c4200a, n nVar, p000if.a aVar) {
        this.f37188Y = nVar;
        this.f37189Z = abstractC4565a;
        this.f37190h0 = abstractC4565a2;
        this.f37191i0 = c4200a;
        this.f37192j0 = aVar;
    }

    public static Long h(SQLiteDatabase sQLiteDatabase, e7.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f29006a, String.valueOf(AbstractC4720a.a(iVar.f29008c))));
        byte[] bArr = iVar.f29007b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) p(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new A9.a(12));
    }

    public static String m(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((C4201b) it.next()).f37172a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object p(Cursor cursor, i iVar) {
        try {
            return iVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        Object obj;
        n nVar = this.f37188Y;
        Objects.requireNonNull(nVar);
        A9.a aVar = new A9.a(8);
        C4567c c4567c = (C4567c) this.f37190h0;
        long a5 = c4567c.a();
        while (true) {
            try {
                obj = nVar.getWritableDatabase();
                break;
            } catch (SQLiteDatabaseLockedException e10) {
                if (c4567c.a() >= this.f37191i0.f37169c + a5) {
                    obj = aVar.apply(e10);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        return (SQLiteDatabase) obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37188Y.close();
    }

    public final Object i(i iVar) {
        SQLiteDatabase a5 = a();
        a5.beginTransaction();
        try {
            Object apply = iVar.apply(a5);
            a5.setTransactionSuccessful();
            return apply;
        } finally {
            a5.endTransaction();
        }
    }

    public final ArrayList j(SQLiteDatabase sQLiteDatabase, e7.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long h10 = h(sQLiteDatabase, iVar);
        if (h10 == null) {
            return arrayList;
        }
        p(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{h10.toString()}, null, null, null, String.valueOf(i10)), new C3482a(this, (Object) arrayList, iVar, 3));
        return arrayList;
    }

    public final Object k(AbstractC4341b abstractC4341b) {
        SQLiteDatabase a5 = a();
        A9.a aVar = new A9.a(7);
        C4567c c4567c = (C4567c) this.f37190h0;
        long a10 = c4567c.a();
        while (true) {
            try {
                a5.beginTransaction();
            } catch (SQLiteDatabaseLockedException e10) {
                if (c4567c.a() >= this.f37191i0.f37169c + a10) {
                    aVar.apply(e10);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        try {
            Object c10 = abstractC4341b.c();
            a5.setTransactionSuccessful();
            return c10;
        } finally {
            a5.endTransaction();
        }
    }
}
