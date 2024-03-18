package o6;

import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kf.AbstractC4268D;
import m6.C4562a;
import m6.C4564c;
import q5.C5274d;
import t5.AbstractC5675a;
import z6.C6777c;

/* renamed from: o6.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4926e implements M {

    /* renamed from: a  reason: collision with root package name */
    public final M f40825a;

    /* renamed from: b  reason: collision with root package name */
    public final u5.g f40826b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f40827c;

    /* renamed from: d  reason: collision with root package name */
    public final k5.F f40828d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f40829e;

    /* renamed from: f  reason: collision with root package name */
    public final float f40830f;

    /* renamed from: g  reason: collision with root package name */
    public final long f40831g;

    /* renamed from: h  reason: collision with root package name */
    public final long f40832h;

    /* renamed from: i  reason: collision with root package name */
    public final long f40833i;

    /* renamed from: j  reason: collision with root package name */
    public final String f40834j;

    /* renamed from: k  reason: collision with root package name */
    public i6.d f40835k;

    /* renamed from: l  reason: collision with root package name */
    public String f40836l;

    /* renamed from: m  reason: collision with root package name */
    public final long f40837m;

    /* renamed from: n  reason: collision with root package name */
    public long f40838n;

    /* renamed from: o  reason: collision with root package name */
    public final C5274d f40839o;

    /* renamed from: p  reason: collision with root package name */
    public final LinkedHashMap f40840p;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f40841q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public long f40842r;

    /* renamed from: s  reason: collision with root package name */
    public long f40843s;

    /* renamed from: t  reason: collision with root package name */
    public long f40844t;

    /* renamed from: u  reason: collision with root package name */
    public long f40845u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f40846v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f40847w;

    public C4926e(M m10, u5.g gVar, boolean z10, C4564c c4564c, i6.d dVar, String str, Map map, long j6, k5.F f6, boolean z11, float f10) {
        AbstractC3557B.c0("parentScope", m10);
        AbstractC3557B.c0("eventTime", c4564c);
        AbstractC3557B.c0("initialType", dVar);
        AbstractC3557B.c0("initialName", str);
        AbstractC3557B.c0("initialAttributes", map);
        this.f40825a = m10;
        this.f40826b = gVar;
        this.f40827c = z10;
        this.f40828d = f6;
        this.f40829e = z11;
        this.f40830f = f10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f40831g = timeUnit.toNanos(100L);
        this.f40832h = timeUnit.toNanos(5000L);
        this.f40833i = c4564c.f38961a + j6;
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("randomUUID().toString()", uuid);
        this.f40834j = uuid;
        this.f40835k = dVar;
        this.f40836l = str;
        long j10 = c4564c.f38962b;
        this.f40837m = j10;
        this.f40838n = j10;
        this.f40839o = gVar.d();
        LinkedHashMap m12 = AbstractC4268D.m1(map);
        m12.putAll(i6.b.a(gVar).h());
        this.f40840p = m12;
    }

    @Override // o6.M
    public final boolean a() {
        return !this.f40847w;
    }

    @Override // o6.M
    public final M b(L4.a aVar, AbstractC5675a abstractC5675a) {
        boolean z10;
        boolean z11;
        Object obj;
        Object obj2;
        AbstractC3557B.c0("writer", abstractC5675a);
        long j6 = aVar.v0().f38962b;
        boolean z12 = false;
        if (j6 - this.f40838n > this.f40831g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j6 - this.f40837m > this.f40832h) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = this.f40841q;
        kf.s.R1(C4923b.f40806Y, arrayList);
        if (this.f40827c && !this.f40847w) {
            z12 = true;
        }
        if (z10 && arrayList.isEmpty() && !z12) {
            d(this.f40838n, abstractC5675a);
        } else if (z11) {
            d(j6, abstractC5675a);
        } else if (aVar instanceof C4944x) {
            d(this.f40838n, abstractC5675a);
        } else if (aVar instanceof C) {
            arrayList.clear();
            d(j6, abstractC5675a);
        } else if (aVar instanceof G) {
            arrayList.clear();
            d(j6, abstractC5675a);
        } else if (aVar instanceof D) {
            D d10 = (D) aVar;
            i6.d dVar = d10.f40623j;
            if (dVar != null) {
                this.f40835k = dVar;
            }
            String str = d10.f40624k;
            if (str != null) {
                this.f40836l = str;
            }
            this.f40840p.putAll(d10.f40625l);
            this.f40847w = true;
            this.f40838n = j6;
        } else if (aVar instanceof C4921B) {
            this.f40838n = j6;
            this.f40842r++;
            arrayList.add(new WeakReference(((C4921B) aVar).f40615j));
        } else if (aVar instanceof E) {
            E e10 = (E) aVar;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (AbstractC3557B.K(((WeakReference) obj2).get(), e10.f40627j)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            WeakReference weakReference = (WeakReference) obj2;
            if (weakReference != null) {
                arrayList.remove(weakReference);
                this.f40838n = j6;
            }
        } else if (aVar instanceof C4932k) {
            this.f40838n = j6;
            this.f40843s++;
            if (((C4932k) aVar).f40877n) {
                this.f40844t++;
                d(j6, abstractC5675a);
            }
        } else if (aVar instanceof F) {
            F f6 = (F) aVar;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (AbstractC3557B.K(((WeakReference) obj).get(), f6.f40633j)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            WeakReference weakReference2 = (WeakReference) obj;
            if (weakReference2 != null) {
                arrayList.remove(weakReference2);
                this.f40838n = j6;
                this.f40842r--;
                this.f40843s++;
            }
        } else if (aVar instanceof C4934m) {
            this.f40838n = j6;
            this.f40845u++;
        }
        if (this.f40846v) {
            return null;
        }
        return this;
    }

    @Override // o6.M
    public final C4562a c() {
        return this.f40825a.c();
    }

    public final void d(long j6, AbstractC5675a abstractC5675a) {
        x6.C c10;
        u5.g gVar;
        int i10;
        String str;
        if (this.f40846v) {
            return;
        }
        i6.d dVar = this.f40835k;
        LinkedHashMap linkedHashMap = this.f40840p;
        u5.g gVar2 = this.f40826b;
        linkedHashMap.putAll(i6.b.a(gVar2).h());
        LinkedHashMap m12 = AbstractC4268D.m1(linkedHashMap);
        C4562a c11 = this.f40825a.c();
        String str2 = this.f40836l;
        long j10 = this.f40843s;
        long j11 = this.f40844t;
        long j12 = this.f40845u;
        long j13 = this.f40842r;
        String str3 = c11.f38955k;
        if (str3 == null || Lg.n.n2(str3) || (str = c11.f38956l) == null || Lg.n.n2(str)) {
            gVar = gVar2;
            c10 = null;
        } else {
            gVar = gVar2;
            c10 = new x6.C(c11.f38955k, str, null);
        }
        if (c10 == null) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f40829e && j10 > 0 && dVar == i6.d.f32722Y) {
            arrayList.add(x6.D.ERROR_TAP);
        }
        C6777c q02 = P4.a.q0(gVar, abstractC5675a, new C4924c(this, c11, dVar, str2, j10, j11, j12, j13, j6, arrayList, i10, m12, c10));
        r6.c cVar = new r6.c(arrayList.size());
        q02.f51750e = new C4925d(c11, cVar, 0);
        q02.f51751f = new C4925d(c11, cVar, 1);
        q02.b();
        this.f40846v = true;
    }
}
