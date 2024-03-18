package j7;

import M3.H;
import U3.u;
import V1.C1464e;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Log;
import c7.C2303a;
import d7.q;
import d7.v;
import d7.w;
import d7.x;
import e7.o;
import f7.C2938a;
import f7.C2943f;
import h.C3276b;
import h7.C3327a;
import i7.C3482a;
import io.sentry.C3636c1;
import io.sentry.android.core.AbstractC3612c;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import k7.AbstractC4202c;
import k7.C4201b;
import l7.AbstractC4341b;
import l7.AbstractC4342c;
import m7.AbstractC4565a;
import m7.C4567c;
import q.C5241w;
import q.D1;

/* renamed from: j7.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3919i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f36055a;

    /* renamed from: b  reason: collision with root package name */
    public final C2943f f36056b;

    /* renamed from: c  reason: collision with root package name */
    public final k7.d f36057c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC3923m f36058d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f36059e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC4342c f36060f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC4565a f36061g;

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC4565a f36062h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC4202c f36063i;

    public C3919i(Context context, C2943f c2943f, k7.d dVar, AbstractC3923m abstractC3923m, Executor executor, AbstractC4342c abstractC4342c, AbstractC4565a abstractC4565a, AbstractC4565a abstractC4565a2, AbstractC4202c abstractC4202c) {
        this.f36055a = context;
        this.f36056b = c2943f;
        this.f36057c = dVar;
        this.f36058d = abstractC3923m;
        this.f36059e = executor;
        this.f36060f = abstractC4342c;
        this.f36061g = abstractC4565a;
        this.f36062h = abstractC4565a2;
        this.f36063i = abstractC4202c;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object, q.D1] */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object, q.D1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final e7.i iVar, int i10) {
        SQLiteDatabase sQLiteDatabase;
        k7.k kVar;
        f7.h hVar;
        C2938a c2938a;
        int i11;
        int i12;
        boolean z10;
        String str;
        IOException e10;
        Object apply;
        C2938a c2938a2;
        String str2;
        Integer num;
        k7.k kVar2;
        String str3;
        D1 d12;
        long j6;
        String str4;
        final e7.i iVar2 = iVar;
        f7.h a5 = this.f36056b.a(iVar2.f29006a);
        final long j10 = 0;
        while (true) {
            AbstractC4341b abstractC4341b = new AbstractC4341b(this) { // from class: j7.g

                /* renamed from: Z  reason: collision with root package name */
                public final /* synthetic */ C3919i f36049Z;

                {
                    this.f36049Z = this;
                }

                @Override // l7.AbstractC4341b
                public final Object c() {
                    int i13 = r3;
                    final e7.i iVar3 = iVar2;
                    C3919i c3919i = this.f36049Z;
                    switch (i13) {
                        case 0:
                            final k7.k kVar3 = (k7.k) c3919i.f36057c;
                            kVar3.getClass();
                            Boolean bool = (Boolean) kVar3.i(new k7.i() { // from class: k7.f
                                /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
                                /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
                                @Override // k7.i
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object apply(Object obj) {
                                    b7.c[] values;
                                    ListIterator listIterator;
                                    int i14 = r3;
                                    e7.i iVar4 = iVar3;
                                    k kVar4 = kVar3;
                                    switch (i14) {
                                        case 0:
                                            SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                                            C4200a c4200a = kVar4.f37191i0;
                                            ArrayList j11 = kVar4.j(sQLiteDatabase2, iVar4, c4200a.f37168b);
                                            for (b7.c cVar : b7.c.values()) {
                                                if (cVar != iVar4.f29008c) {
                                                    int size = c4200a.f37168b - j11.size();
                                                    if (size > 0) {
                                                        u a10 = e7.i.a();
                                                        a10.O(iVar4.f29006a);
                                                        a10.P(cVar);
                                                        a10.f17493h0 = iVar4.f29007b;
                                                        j11.addAll(kVar4.j(sQLiteDatabase2, a10.h(), size));
                                                    } else {
                                                        HashMap hashMap = new HashMap();
                                                        StringBuilder sb2 = new StringBuilder("event_id IN (");
                                                        for (int i15 = 0; i15 < j11.size(); i15++) {
                                                            sb2.append(((C4201b) j11.get(i15)).f37172a);
                                                            if (i15 < j11.size() - 1) {
                                                                sb2.append(',');
                                                            }
                                                        }
                                                        sb2.append(')');
                                                        k.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new C3276b(29, hashMap));
                                                        listIterator = j11.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            C4201b c4201b = (C4201b) listIterator.next();
                                                            if (hashMap.containsKey(Long.valueOf(c4201b.f37172a))) {
                                                                C5241w c10 = c4201b.f37174c.c();
                                                                long j12 = c4201b.f37172a;
                                                                for (j jVar : (Set) hashMap.get(Long.valueOf(j12))) {
                                                                    c10.c(jVar.f37185a, jVar.f37186b);
                                                                }
                                                                listIterator.set(new C4201b(j12, c4201b.f37173b, c10.e()));
                                                            }
                                                        }
                                                        return j11;
                                                    }
                                                }
                                            }
                                            HashMap hashMap2 = new HashMap();
                                            StringBuilder sb22 = new StringBuilder("event_id IN (");
                                            while (i15 < j11.size()) {
                                            }
                                            sb22.append(')');
                                            k.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb22.toString(), null, null, null, null), new C3276b(29, hashMap2));
                                            listIterator = j11.listIterator();
                                            while (listIterator.hasNext()) {
                                            }
                                            return j11;
                                        default:
                                            kVar4.getClass();
                                            Long h10 = k.h((SQLiteDatabase) obj, iVar4);
                                            if (h10 == null) {
                                                return Boolean.FALSE;
                                            }
                                            return (Boolean) k.p(kVar4.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{h10.toString()}), new A9.a(13));
                                    }
                                }
                            });
                            bool.getClass();
                            return bool;
                        default:
                            final k7.k kVar4 = (k7.k) c3919i.f36057c;
                            kVar4.getClass();
                            return (Iterable) kVar4.i(new k7.i() { // from class: k7.f
                                /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
                                /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
                                @Override // k7.i
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object apply(Object obj) {
                                    b7.c[] values;
                                    ListIterator listIterator;
                                    int i14 = r3;
                                    e7.i iVar4 = iVar3;
                                    k kVar42 = kVar4;
                                    switch (i14) {
                                        case 0:
                                            SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                                            C4200a c4200a = kVar42.f37191i0;
                                            ArrayList j11 = kVar42.j(sQLiteDatabase2, iVar4, c4200a.f37168b);
                                            for (b7.c cVar : b7.c.values()) {
                                                if (cVar != iVar4.f29008c) {
                                                    int size = c4200a.f37168b - j11.size();
                                                    if (size > 0) {
                                                        u a10 = e7.i.a();
                                                        a10.O(iVar4.f29006a);
                                                        a10.P(cVar);
                                                        a10.f17493h0 = iVar4.f29007b;
                                                        j11.addAll(kVar42.j(sQLiteDatabase2, a10.h(), size));
                                                    } else {
                                                        HashMap hashMap2 = new HashMap();
                                                        StringBuilder sb22 = new StringBuilder("event_id IN (");
                                                        for (int i15 = 0; i15 < j11.size(); i15++) {
                                                            sb22.append(((C4201b) j11.get(i15)).f37172a);
                                                            if (i15 < j11.size() - 1) {
                                                                sb22.append(',');
                                                            }
                                                        }
                                                        sb22.append(')');
                                                        k.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb22.toString(), null, null, null, null), new C3276b(29, hashMap2));
                                                        listIterator = j11.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            C4201b c4201b = (C4201b) listIterator.next();
                                                            if (hashMap2.containsKey(Long.valueOf(c4201b.f37172a))) {
                                                                C5241w c10 = c4201b.f37174c.c();
                                                                long j12 = c4201b.f37172a;
                                                                for (j jVar : (Set) hashMap2.get(Long.valueOf(j12))) {
                                                                    c10.c(jVar.f37185a, jVar.f37186b);
                                                                }
                                                                listIterator.set(new C4201b(j12, c4201b.f37173b, c10.e()));
                                                            }
                                                        }
                                                        return j11;
                                                    }
                                                }
                                            }
                                            HashMap hashMap22 = new HashMap();
                                            StringBuilder sb222 = new StringBuilder("event_id IN (");
                                            while (i15 < j11.size()) {
                                            }
                                            sb222.append(')');
                                            k.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb222.toString(), null, null, null, null), new C3276b(29, hashMap22));
                                            listIterator = j11.listIterator();
                                            while (listIterator.hasNext()) {
                                            }
                                            return j11;
                                        default:
                                            kVar42.getClass();
                                            Long h10 = k.h((SQLiteDatabase) obj, iVar4);
                                            if (h10 == null) {
                                                return Boolean.FALSE;
                                            }
                                            return (Boolean) k.p(kVar42.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{h10.toString()}), new A9.a(13));
                                    }
                                }
                            });
                    }
                }
            };
            k7.k kVar3 = (k7.k) this.f36060f;
            boolean booleanValue = ((Boolean) kVar3.k(abstractC4341b)).booleanValue();
            AbstractC4565a abstractC4565a = this.f36061g;
            if (booleanValue) {
                final Iterable<C4201b> iterable = (Iterable) kVar3.k(new AbstractC4341b(this) { // from class: j7.g

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ C3919i f36049Z;

                    {
                        this.f36049Z = this;
                    }

                    @Override // l7.AbstractC4341b
                    public final Object c() {
                        int i13 = r3;
                        final e7.i iVar3 = iVar2;
                        C3919i c3919i = this.f36049Z;
                        switch (i13) {
                            case 0:
                                final k7.k kVar32 = (k7.k) c3919i.f36057c;
                                kVar32.getClass();
                                Boolean bool = (Boolean) kVar32.i(new k7.i() { // from class: k7.f
                                    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
                                    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
                                    @Override // k7.i
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object apply(Object obj) {
                                        b7.c[] values;
                                        ListIterator listIterator;
                                        int i14 = r3;
                                        e7.i iVar4 = iVar3;
                                        k kVar42 = kVar32;
                                        switch (i14) {
                                            case 0:
                                                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                                                C4200a c4200a = kVar42.f37191i0;
                                                ArrayList j11 = kVar42.j(sQLiteDatabase2, iVar4, c4200a.f37168b);
                                                for (b7.c cVar : b7.c.values()) {
                                                    if (cVar != iVar4.f29008c) {
                                                        int size = c4200a.f37168b - j11.size();
                                                        if (size > 0) {
                                                            u a10 = e7.i.a();
                                                            a10.O(iVar4.f29006a);
                                                            a10.P(cVar);
                                                            a10.f17493h0 = iVar4.f29007b;
                                                            j11.addAll(kVar42.j(sQLiteDatabase2, a10.h(), size));
                                                        } else {
                                                            HashMap hashMap22 = new HashMap();
                                                            StringBuilder sb222 = new StringBuilder("event_id IN (");
                                                            for (int i15 = 0; i15 < j11.size(); i15++) {
                                                                sb222.append(((C4201b) j11.get(i15)).f37172a);
                                                                if (i15 < j11.size() - 1) {
                                                                    sb222.append(',');
                                                                }
                                                            }
                                                            sb222.append(')');
                                                            k.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb222.toString(), null, null, null, null), new C3276b(29, hashMap22));
                                                            listIterator = j11.listIterator();
                                                            while (listIterator.hasNext()) {
                                                                C4201b c4201b = (C4201b) listIterator.next();
                                                                if (hashMap22.containsKey(Long.valueOf(c4201b.f37172a))) {
                                                                    C5241w c10 = c4201b.f37174c.c();
                                                                    long j12 = c4201b.f37172a;
                                                                    for (j jVar : (Set) hashMap22.get(Long.valueOf(j12))) {
                                                                        c10.c(jVar.f37185a, jVar.f37186b);
                                                                    }
                                                                    listIterator.set(new C4201b(j12, c4201b.f37173b, c10.e()));
                                                                }
                                                            }
                                                            return j11;
                                                        }
                                                    }
                                                }
                                                HashMap hashMap222 = new HashMap();
                                                StringBuilder sb2222 = new StringBuilder("event_id IN (");
                                                while (i15 < j11.size()) {
                                                }
                                                sb2222.append(')');
                                                k.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2222.toString(), null, null, null, null), new C3276b(29, hashMap222));
                                                listIterator = j11.listIterator();
                                                while (listIterator.hasNext()) {
                                                }
                                                return j11;
                                            default:
                                                kVar42.getClass();
                                                Long h10 = k.h((SQLiteDatabase) obj, iVar4);
                                                if (h10 == null) {
                                                    return Boolean.FALSE;
                                                }
                                                return (Boolean) k.p(kVar42.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{h10.toString()}), new A9.a(13));
                                        }
                                    }
                                });
                                bool.getClass();
                                return bool;
                            default:
                                final k7.k kVar4 = (k7.k) c3919i.f36057c;
                                kVar4.getClass();
                                return (Iterable) kVar4.i(new k7.i() { // from class: k7.f
                                    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
                                    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
                                    @Override // k7.i
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object apply(Object obj) {
                                        b7.c[] values;
                                        ListIterator listIterator;
                                        int i14 = r3;
                                        e7.i iVar4 = iVar3;
                                        k kVar42 = kVar4;
                                        switch (i14) {
                                            case 0:
                                                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                                                C4200a c4200a = kVar42.f37191i0;
                                                ArrayList j11 = kVar42.j(sQLiteDatabase2, iVar4, c4200a.f37168b);
                                                for (b7.c cVar : b7.c.values()) {
                                                    if (cVar != iVar4.f29008c) {
                                                        int size = c4200a.f37168b - j11.size();
                                                        if (size > 0) {
                                                            u a10 = e7.i.a();
                                                            a10.O(iVar4.f29006a);
                                                            a10.P(cVar);
                                                            a10.f17493h0 = iVar4.f29007b;
                                                            j11.addAll(kVar42.j(sQLiteDatabase2, a10.h(), size));
                                                        } else {
                                                            HashMap hashMap222 = new HashMap();
                                                            StringBuilder sb2222 = new StringBuilder("event_id IN (");
                                                            for (int i15 = 0; i15 < j11.size(); i15++) {
                                                                sb2222.append(((C4201b) j11.get(i15)).f37172a);
                                                                if (i15 < j11.size() - 1) {
                                                                    sb2222.append(',');
                                                                }
                                                            }
                                                            sb2222.append(')');
                                                            k.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2222.toString(), null, null, null, null), new C3276b(29, hashMap222));
                                                            listIterator = j11.listIterator();
                                                            while (listIterator.hasNext()) {
                                                                C4201b c4201b = (C4201b) listIterator.next();
                                                                if (hashMap222.containsKey(Long.valueOf(c4201b.f37172a))) {
                                                                    C5241w c10 = c4201b.f37174c.c();
                                                                    long j12 = c4201b.f37172a;
                                                                    for (j jVar : (Set) hashMap222.get(Long.valueOf(j12))) {
                                                                        c10.c(jVar.f37185a, jVar.f37186b);
                                                                    }
                                                                    listIterator.set(new C4201b(j12, c4201b.f37173b, c10.e()));
                                                                }
                                                            }
                                                            return j11;
                                                        }
                                                    }
                                                }
                                                HashMap hashMap2222 = new HashMap();
                                                StringBuilder sb22222 = new StringBuilder("event_id IN (");
                                                while (i15 < j11.size()) {
                                                }
                                                sb22222.append(')');
                                                k.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb22222.toString(), null, null, null, null), new C3276b(29, hashMap2222));
                                                listIterator = j11.listIterator();
                                                while (listIterator.hasNext()) {
                                                }
                                                return j11;
                                            default:
                                                kVar42.getClass();
                                                Long h10 = k.h((SQLiteDatabase) obj, iVar4);
                                                if (h10 == null) {
                                                    return Boolean.FALSE;
                                                }
                                                return (Boolean) k.p(kVar42.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{h10.toString()}), new A9.a(13));
                                        }
                                    }
                                });
                        }
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                byte[] bArr = iVar2.f29007b;
                if (a5 == null) {
                    H.M("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar2);
                    c2938a = new C2938a(3, -1L);
                    hVar = a5;
                    kVar = kVar3;
                } else {
                    ArrayList<e7.h> arrayList = new ArrayList();
                    for (C4201b c4201b : iterable) {
                        arrayList.add(c4201b.f37174c);
                    }
                    if (bArr != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String str5 = "proto";
                    if (z10) {
                        AbstractC4202c abstractC4202c = this.f36063i;
                        Objects.requireNonNull(abstractC4202c);
                        C3327a c3327a = (C3327a) kVar3.k(new C3276b(25, abstractC4202c));
                        C5241w c5241w = new C5241w(4);
                        c5241w.f43578f = new HashMap();
                        c5241w.f43576d = Long.valueOf(((C4567c) abstractC4565a).a());
                        c5241w.f43577e = Long.valueOf(((C4567c) this.f36062h).a());
                        c5241w.f43573a = "GDT_CLIENT_METRICS";
                        b7.b bVar = new b7.b(str5);
                        c3327a.getClass();
                        u uVar = o.f29019a;
                        uVar.getClass();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            uVar.j(c3327a, byteArrayOutputStream);
                        } catch (IOException unused) {
                        }
                        c5241w.n(new e7.l(bVar, byteArrayOutputStream.toByteArray()));
                        arrayList.add(((c7.d) a5).a(c5241w.e()));
                    }
                    U3.e eVar = new U3.e(11);
                    eVar.f17400Y = arrayList;
                    eVar.f17401Z = bArr;
                    c7.d dVar = (c7.d) a5;
                    HashMap hashMap = new HashMap();
                    for (e7.h hVar2 : arrayList) {
                        String str6 = hVar2.f29000a;
                        if (!hashMap.containsKey(str6)) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(hVar2);
                            hashMap.put(str6, arrayList2);
                        } else {
                            ((List) hashMap.get(str6)).add(hVar2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        e7.h hVar3 = (e7.h) ((List) entry.getValue()).get(0);
                        x xVar = x.f28122Y;
                        long a10 = ((C4567c) dVar.f26343f).a();
                        long a11 = ((C4567c) dVar.f26342e).a();
                        f7.h hVar4 = a5;
                        C3636c1 c3636c1 = new C3636c1(12);
                        c3636c1.f34285Z = q.f28116Y;
                        d7.i iVar3 = new d7.i(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a("country"), hVar3.a("mcc_mnc"), hVar3.a("application_build"));
                        c3636c1.f34286h0 = iVar3;
                        d7.k kVar4 = new d7.k((q) c3636c1.f34285Z, iVar3);
                        try {
                            num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                            str2 = null;
                        } catch (NumberFormatException unused2) {
                            str2 = (String) entry.getKey();
                            num = null;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = ((List) entry.getValue()).iterator();
                        while (it2.hasNext()) {
                            e7.h hVar5 = (e7.h) it2.next();
                            Iterator it3 = it;
                            e7.l lVar = hVar5.f29002c;
                            Iterator it4 = it2;
                            b7.b bVar2 = lVar.f29015a;
                            boolean equals = bVar2.equals(new b7.b(str5));
                            byte[] bArr2 = lVar.f29016b;
                            if (equals) {
                                ?? obj = new Object();
                                obj.f43264d = bArr2;
                                str3 = str5;
                                d12 = obj;
                            } else {
                                str3 = str5;
                                if (bVar2.equals(new b7.b("json"))) {
                                    String str7 = new String(bArr2, Charset.forName("UTF-8"));
                                    ?? obj2 = new Object();
                                    obj2.f43265e = str7;
                                    d12 = obj2;
                                } else {
                                    kVar2 = kVar3;
                                    String W6 = H.W("CctTransportBackend");
                                    if (Log.isLoggable(W6, 5)) {
                                        AbstractC3612c.r(W6, "Received event of unsupported encoding " + bVar2 + ". Skipping...");
                                    }
                                    it2 = it4;
                                    it = it3;
                                    str5 = str3;
                                    kVar3 = kVar2;
                                }
                            }
                            kVar2 = kVar3;
                            d12.f43261a = Long.valueOf(hVar5.f29003d);
                            d12.f43263c = Long.valueOf(hVar5.f29004e);
                            String str8 = (String) hVar5.f29005f.get("tz-offset");
                            if (str8 == null) {
                                j6 = 0;
                            } else {
                                j6 = Long.valueOf(str8).longValue();
                            }
                            d12.f43266f = Long.valueOf(j6);
                            U3.c cVar = new U3.c(13);
                            cVar.f17396Z = (v) v.f28120Y.get(hVar5.b("net-type"));
                            d7.u uVar2 = (d7.u) d7.u.f28118Y.get(hVar5.b("mobile-subtype"));
                            cVar.f17397h0 = uVar2;
                            d12.f43267g = new d7.o((v) cVar.f17396Z, uVar2);
                            Integer num2 = hVar5.f29001b;
                            if (num2 != null) {
                                d12.f43262b = num2;
                            }
                            if (((Long) d12.f43261a) == null) {
                                str4 = " eventTimeMs";
                            } else {
                                str4 = "";
                            }
                            if (((Long) d12.f43263c) == null) {
                                str4 = str4.concat(" eventUptimeMs");
                            }
                            if (((Long) d12.f43266f) == null) {
                                str4 = android.gov.nist.core.a.g(str4, " timezoneOffsetSeconds");
                            }
                            if (str4.isEmpty()) {
                                arrayList4.add(new d7.l(((Long) d12.f43261a).longValue(), (Integer) d12.f43262b, ((Long) d12.f43263c).longValue(), (byte[]) d12.f43264d, (String) d12.f43265e, ((Long) d12.f43266f).longValue(), (w) d12.f43267g));
                                it2 = it4;
                                it = it3;
                                str5 = str3;
                                kVar3 = kVar2;
                            } else {
                                throw new IllegalStateException("Missing required properties:".concat(str4));
                            }
                        }
                        arrayList3.add(new d7.m(a10, a11, kVar4, num, str2, arrayList4, xVar));
                        a5 = hVar4;
                        it = it;
                        str5 = str5;
                        kVar3 = kVar3;
                    }
                    hVar = a5;
                    kVar = kVar3;
                    d7.j jVar = new d7.j(arrayList3);
                    URL url = dVar.f26341d;
                    if (bArr != null) {
                        try {
                            C2303a a12 = C2303a.a(bArr);
                            str = a12.f26331b;
                            if (str == null) {
                                str = null;
                            }
                            String str9 = a12.f26330a;
                            if (str9 != null) {
                                url = c7.d.b(str9);
                            }
                        } catch (IllegalArgumentException unused3) {
                            c2938a2 = new C2938a(3, -1L);
                        }
                    } else {
                        str = null;
                    }
                    try {
                        c7.b bVar3 = new c7.b(url, jVar, str);
                        C3276b c3276b = new C3276b(22, dVar);
                        int i13 = 5;
                        do {
                            apply = c3276b.apply(bVar3);
                            c7.c cVar2 = (c7.c) apply;
                            URL url2 = cVar2.f26336b;
                            if (url2 != null) {
                                H.M("CctTransportBackend", "Following redirect to: %s", url2);
                                bVar3 = new c7.b(cVar2.f26336b, bVar3.f26333b, bVar3.f26334c);
                            } else {
                                bVar3 = null;
                            }
                            if (bVar3 == null) {
                                break;
                            }
                            i13--;
                        } while (i13 >= 1);
                        c7.c cVar3 = (c7.c) apply;
                        int i14 = cVar3.f26335a;
                        if (i14 == 200) {
                            c2938a = new C2938a(1, cVar3.f26337c);
                        } else {
                            if (i14 < 500 && i14 != 404) {
                                if (i14 == 400) {
                                    try {
                                        c2938a2 = new C2938a(4, -1L);
                                    } catch (IOException e11) {
                                        e10 = e11;
                                        H.N("CctTransportBackend", "Could not make request to the backend", e10);
                                        i11 = 2;
                                        c2938a = new C2938a(2, -1L);
                                        i12 = c2938a.f29643a;
                                        if (i12 != i11) {
                                        }
                                    }
                                } else {
                                    c2938a2 = new C2938a(3, -1L);
                                }
                            } else {
                                c2938a2 = new C2938a(2, -1L);
                            }
                            c2938a = c2938a2;
                        }
                    } catch (IOException e12) {
                        e10 = e12;
                    }
                }
                i11 = 2;
                i12 = c2938a.f29643a;
                if (i12 != i11) {
                    kVar.k(new AbstractC4341b() { // from class: j7.h
                        @Override // l7.AbstractC4341b
                        public final Object c() {
                            C3919i c3919i = C3919i.this;
                            k7.k kVar5 = (k7.k) c3919i.f36057c;
                            kVar5.getClass();
                            Iterable iterable2 = iterable;
                            if (iterable2.iterator().hasNext()) {
                                kVar5.i(new C3482a(kVar5, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + k7.k.m(iterable2), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", 2));
                            }
                            kVar5.i(new z2.g(((C4567c) c3919i.f36061g).a() + j10, iVar));
                            return null;
                        }
                    });
                    ((C3914d) this.f36058d).a(iVar, i10 + 1, true);
                    return;
                }
                k7.k kVar5 = kVar;
                kVar5.k(new C1464e(this, 14, iterable));
                if (i12 == 1) {
                    j10 = Math.max(j10, c2938a.f29644b);
                    if (bArr != null) {
                        kVar5.k(new C3276b(24, this));
                    }
                } else if (i12 == 4) {
                    HashMap hashMap2 = new HashMap();
                    for (C4201b c4201b2 : iterable) {
                        String str10 = c4201b2.f37174c.f29000a;
                        if (!hashMap2.containsKey(str10)) {
                            hashMap2.put(str10, 1);
                        } else {
                            hashMap2.put(str10, Integer.valueOf(((Integer) hashMap2.get(str10)).intValue() + 1));
                        }
                    }
                    kVar5.k(new C1464e(this, 15, hashMap2));
                }
                iVar2 = iVar;
                a5 = hVar;
            } else {
                e7.i iVar4 = iVar2;
                SQLiteDatabase a13 = kVar3.a();
                A9.a aVar = new A9.a(7);
                C4567c c4567c = (C4567c) kVar3.f37190h0;
                long a14 = c4567c.a();
                while (true) {
                    try {
                        a13.beginTransaction();
                        sQLiteDatabase = a13;
                        break;
                    } catch (SQLiteDatabaseLockedException e13) {
                        sQLiteDatabase = a13;
                        if (c4567c.a() >= kVar3.f37191i0.f37169c + a14) {
                            aVar.apply(e13);
                            break;
                        } else {
                            SystemClock.sleep(50L);
                            a13 = sQLiteDatabase;
                        }
                    }
                }
                try {
                    k7.k kVar6 = (k7.k) this.f36057c;
                    kVar6.getClass();
                    kVar6.i(new z2.g(((C4567c) abstractC4565a).a() + j10, iVar4));
                    sQLiteDatabase.setTransactionSuccessful();
                    return;
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            }
        }
    }
}
