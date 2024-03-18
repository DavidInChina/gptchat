package i7;

import M3.H;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import e7.h;
import e7.l;
import h7.C3327a;
import h7.C3328b;
import h7.C3330d;
import h7.EnumC3329c;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import io.sentry.C3679q;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.P0;
import io.sentry.Z0;
import io.sentry.hints.g;
import io.sentry.protocol.n;
import io.sentry.x1;
import io.sentry.y1;
import j7.C3914d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.C4200a;
import k7.C4201b;
import k7.i;
import k7.k;
import l7.AbstractC4341b;
import m7.C4567c;
import n7.AbstractC4720a;
import q.C5241w;
import r.f;
import z2.s;

/* renamed from: i7.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3482a implements AbstractC4341b, i, io.sentry.util.a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32735Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f32736Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f32737h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f32738i0;

    public /* synthetic */ C3482a(Object obj, Object obj2, Object obj3, int i10) {
        this.f32735Y = i10;
        this.f32738i0 = obj;
        this.f32737h0 = obj2;
        this.f32736Z = obj3;
    }

    public final void a(y1 y1Var) {
        x1 x1Var;
        String str;
        Map map;
        C4.c cVar;
        P0 p02 = (P0) this.f32738i0;
        Z0 z02 = (Z0) this.f32737h0;
        C3686u c3686u = (C3686u) this.f32736Z;
        boolean z10 = false;
        if (y1Var != null) {
            p02.getClass();
            String str2 = null;
            if (z02.b() != null) {
                x1Var = x1.Crashed;
            } else {
                x1Var = null;
            }
            if (x1.Crashed == x1Var || ((cVar = z02.f33903y0) != null && !cVar.f2667Y.isEmpty())) {
                z10 = true;
            }
            n nVar = z02.f33839i0;
            if (nVar != null && (map = nVar.f34589k0) != null && map.containsKey("user-agent")) {
                str = (String) z02.f33839i0.f34589k0.get("user-agent");
            } else {
                str = null;
            }
            Object v12 = AbstractC3557B.v1(c3686u);
            if (v12 instanceof io.sentry.hints.a) {
                str2 = ((io.sentry.hints.a) v12).c();
                x1Var = x1.Abnormal;
            }
            if (y1Var.c(x1Var, str, z10, str2) && y1Var.f34841l0 != x1.Ok) {
                y1Var.b(f.A());
                return;
            }
            return;
        }
        p02.f33851a.getLogger().f(EnumC3642e1.INFO, "Session is null on scope.withSession", new Object[0]);
    }

    @Override // io.sentry.util.a
    public final void accept(Object obj) {
        C3679q c3679q = (C3679q) this.f32738i0;
        c3679q.getClass();
        ((g) obj).c(false);
        c3679q.f34683g.b(EnumC3642e1.INFO, (Throwable) this.f32737h0, "File '%s' won't retry.", ((File) this.f32736Z).getAbsolutePath());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    @Override // k7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        long j6;
        boolean z10;
        byte[] bArr;
        int i10;
        b7.b bVar;
        b7.b bVar2;
        EnumC3329c enumC3329c;
        EnumC3329c enumC3329c2 = EnumC3329c.CACHE_FULL;
        int i11 = this.f32735Y;
        int i12 = 5;
        int i13 = 4;
        int i14 = 3;
        Object obj2 = this.f32736Z;
        Object obj3 = this.f32737h0;
        int i15 = 1;
        k kVar = (k) this.f32738i0;
        switch (i11) {
            case 1:
                h hVar = (h) obj2;
                e7.i iVar = (e7.i) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                b7.b bVar3 = k.f37187k0;
                long simpleQueryForLong = kVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * kVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C4200a c4200a = kVar.f37191i0;
                if (simpleQueryForLong >= c4200a.f37167a) {
                    kVar.i(new s(1L, hVar.f29000a, enumC3329c2));
                    return -1L;
                }
                Long h10 = k.h(sQLiteDatabase, iVar);
                if (h10 != null) {
                    j6 = h10.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f29006a);
                    contentValues.put("priority", Integer.valueOf(AbstractC4720a.a(iVar.f29008c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr2 = iVar.f29007b;
                    if (bArr2 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr2, 0));
                    }
                    j6 = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                byte[] bArr3 = hVar.f29002c.f29016b;
                int length = bArr3.length;
                int i16 = c4200a.f37171e;
                if (length <= i16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(j6));
                contentValues2.put("transport_name", hVar.f29000a);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar.f29003d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar.f29004e));
                contentValues2.put("payload_encoding", hVar.f29002c.f29015a.f25647a);
                contentValues2.put("code", hVar.f29001b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                if (z10) {
                    bArr = bArr3;
                } else {
                    bArr = new byte[0];
                }
                contentValues2.put("payload", bArr);
                long insert = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int ceil = (int) Math.ceil(bArr3.length / i16);
                    for (int i17 = 1; i17 <= ceil; i17++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr3, (i17 - 1) * i16, Math.min(i17 * i16, bArr3.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert));
                        contentValues3.put("sequence_num", Integer.valueOf(i17));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar.f29005f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert);
            case 2:
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                b7.b bVar4 = k.f37187k0;
                kVar.getClass();
                sQLiteDatabase2.compileStatement((String) obj3).execute();
                k.p(sQLiteDatabase2.rawQuery((String) obj2, null), new k7.g(kVar, 2));
                sQLiteDatabase2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            case 3:
                List list = (List) obj2;
                e7.i iVar2 = (e7.i) obj3;
                Cursor cursor = (Cursor) obj;
                b7.b bVar5 = k.f37187k0;
                kVar.getClass();
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    if (cursor.getInt(7) != 0) {
                        i10 = i15;
                    } else {
                        i10 = 0;
                    }
                    C5241w c5241w = new C5241w(4);
                    c5241w.f43578f = new HashMap();
                    String string = cursor.getString(i15);
                    if (string != null) {
                        c5241w.f43573a = string;
                        c5241w.f43576d = Long.valueOf(cursor.getLong(2));
                        c5241w.f43577e = Long.valueOf(cursor.getLong(3));
                        if (i10 != 0) {
                            String string2 = cursor.getString(4);
                            if (string2 == null) {
                                bVar2 = k.f37187k0;
                            } else {
                                bVar2 = new b7.b(string2);
                            }
                            c5241w.n(new l(bVar2, cursor.getBlob(5)));
                        } else {
                            String string3 = cursor.getString(4);
                            if (string3 == null) {
                                bVar = k.f37187k0;
                            } else {
                                bVar = new b7.b(string3);
                            }
                            c5241w.n(new l(bVar, (byte[]) k.p(kVar.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new A9.a(15))));
                        }
                        if (!cursor.isNull(6)) {
                            c5241w.f43574b = Integer.valueOf(cursor.getInt(6));
                        }
                        list.add(new C4201b(j10, iVar2, c5241w.e()));
                        i15 = 1;
                    } else {
                        throw new NullPointerException("Null transportName");
                    }
                }
                return null;
            default:
                Map map = (Map) obj3;
                U3.n nVar = (U3.n) obj2;
                Cursor cursor2 = (Cursor) obj;
                b7.b bVar6 = k.f37187k0;
                kVar.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(0);
                    int i18 = cursor2.getInt(1);
                    EnumC3329c enumC3329c3 = EnumC3329c.REASON_UNKNOWN;
                    if (i18 != 0) {
                        if (i18 == 1) {
                            enumC3329c3 = EnumC3329c.MESSAGE_TOO_OLD;
                        } else if (i18 == 2) {
                            enumC3329c = enumC3329c2;
                            long j11 = cursor2.getLong(2);
                            if (map.containsKey(string4)) {
                                map.put(string4, new ArrayList());
                            }
                            ((List) map.get(string4)).add(new C3330d(j11, enumC3329c));
                            i12 = 5;
                            i13 = 4;
                            i14 = 3;
                        } else if (i18 == i14) {
                            enumC3329c3 = EnumC3329c.PAYLOAD_TOO_BIG;
                        } else if (i18 == i13) {
                            enumC3329c3 = EnumC3329c.MAX_RETRIES_REACHED;
                        } else if (i18 == i12) {
                            enumC3329c3 = EnumC3329c.INVALID_PAYLOD;
                        } else if (i18 == 6) {
                            enumC3329c3 = EnumC3329c.SERVER_ERROR;
                        } else {
                            H.M("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i18));
                        }
                    }
                    enumC3329c = enumC3329c3;
                    long j112 = cursor2.getLong(2);
                    if (map.containsKey(string4)) {
                    }
                    ((List) map.get(string4)).add(new C3330d(j112, enumC3329c));
                    i12 = 5;
                    i13 = 4;
                    i14 = 3;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i19 = h7.e.f31937c;
                    C3636c1 c3636c1 = new C3636c1(13);
                    c3636c1.f34285Z = (String) entry2.getKey();
                    c3636c1.f34286h0 = (List) entry2.getValue();
                    ((List) nVar.f17427Z).add(new h7.e((String) c3636c1.f34285Z, Collections.unmodifiableList((List) c3636c1.f34286h0)));
                }
                long a5 = ((C4567c) kVar.f37189Z).a();
                SQLiteDatabase a10 = kVar.a();
                a10.beginTransaction();
                try {
                    h7.g gVar = (h7.g) k.p(a10.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new k7.h(a5, 1));
                    a10.setTransactionSuccessful();
                    a10.endTransaction();
                    nVar.f17426Y = gVar;
                    nVar.f17428h0 = new C3328b(new h7.f(kVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * kVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), C4200a.f37166f.f37167a));
                    nVar.f17429i0 = (String) kVar.f37192j0.get();
                    return new C3327a((h7.g) nVar.f17426Y, Collections.unmodifiableList((List) nVar.f17427Z), (C3328b) nVar.f17428h0, (String) nVar.f17429i0);
                } catch (Throwable th2) {
                    a10.endTransaction();
                    throw th2;
                }
        }
    }

    @Override // l7.AbstractC4341b
    public final Object c() {
        b bVar = (b) this.f32738i0;
        e7.i iVar = (e7.i) this.f32737h0;
        h hVar = (h) this.f32736Z;
        k kVar = (k) bVar.f32743d;
        kVar.getClass();
        b7.c cVar = iVar.f29008c;
        String str = hVar.f29000a;
        String W6 = H.W("SQLiteEventStore");
        if (Log.isLoggable(W6, 3)) {
            Log.d(W6, "Storing event with priority=" + cVar + ", name=" + str + " for destination " + iVar.f29006a);
        }
        ((Long) kVar.i(new C3482a(kVar, (Object) hVar, iVar, 1))).getClass();
        ((C3914d) bVar.f32740a).a(iVar, 1, false);
        return null;
    }

    public /* synthetic */ C3482a(k kVar, Object obj, e7.i iVar, int i10) {
        this.f32735Y = i10;
        this.f32738i0 = kVar;
        this.f32736Z = obj;
        this.f32737h0 = iVar;
    }
}
