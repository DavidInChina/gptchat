package o6;

import Z1.z0;
import com.datadog.android.rum.DdRumContentProvider;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import l6.C4339c;
import l8.AbstractC4344b;
import m6.C4562a;
import m6.C4564c;
import p5.EnumC5090b;
import t5.AbstractC5675a;

/* loaded from: classes2.dex */
public final class S implements M {

    /* renamed from: n  reason: collision with root package name */
    public static final Class[] f40709n = {C4932k.class, C4920A.class, C4921B.class};

    /* renamed from: o  reason: collision with root package name */
    public static final Class[] f40710o = {C4935n.class, C4938q.class, AbstractC4940t.class, G.class, C4930i.class, C4931j.class, C4936o.class, C4937p.class, r.class, C4939s.class, C4941u.class, C4942v.class};

    /* renamed from: a  reason: collision with root package name */
    public final M f40711a;

    /* renamed from: b  reason: collision with root package name */
    public final u5.g f40712b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f40713c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f40714d;

    /* renamed from: e  reason: collision with root package name */
    public final P f40715e;

    /* renamed from: f  reason: collision with root package name */
    public final D5.a f40716f;

    /* renamed from: g  reason: collision with root package name */
    public final w6.m f40717g;

    /* renamed from: h  reason: collision with root package name */
    public final w6.m f40718h;

    /* renamed from: i  reason: collision with root package name */
    public final w6.m f40719i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f40720j;

    /* renamed from: k  reason: collision with root package name */
    public final float f40721k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f40722l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public C4564c f40723m;

    public S(M m10, u5.g gVar, boolean z10, boolean z11, P p10, D5.a aVar, w6.m mVar, w6.m mVar2, w6.m mVar3, boolean z12, float f6) {
        AbstractC3557B.c0("parentScope", m10);
        AbstractC3557B.c0("sdkCore", gVar);
        AbstractC3557B.c0("firstPartyHostHeaderTypeResolver", aVar);
        AbstractC3557B.c0("cpuVitalMonitor", mVar);
        AbstractC3557B.c0("memoryVitalMonitor", mVar2);
        AbstractC3557B.c0("frameRateVitalMonitor", mVar3);
        this.f40711a = m10;
        this.f40712b = gVar;
        this.f40713c = z10;
        this.f40714d = z11;
        this.f40715e = p10;
        this.f40716f = aVar;
        this.f40717g = mVar;
        this.f40718h = mVar2;
        this.f40719i = mVar3;
        this.f40720j = z12;
        this.f40721k = f6;
    }

    @Override // o6.M
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ca, code lost:
        if (r2 == 0) goto L56;
     */
    /* JADX WARN: Type inference failed for: r16v2, types: [w6.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v4, types: [w6.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [w6.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [w6.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [w6.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [w6.m, java.lang.Object] */
    @Override // o6.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M b(L4.a aVar, AbstractC5675a abstractC5675a) {
        a0 a0Var;
        String str;
        N n10;
        boolean z10 = false;
        AbstractC3557B.c0("writer", abstractC5675a);
        boolean z11 = aVar instanceof C4935n;
        kf.w wVar = kf.w.f37484Y;
        ArrayList arrayList = this.f40722l;
        if (z11 && !this.f40720j) {
            C4935n c4935n = (C4935n) aVar;
            a0 a0Var2 = new a0(this, this.f40712b, new N("com.datadog.application-launch.view", "com/datadog/application-launch/view", "ApplicationLaunch"), c4935n.f40889j, wVar, this.f40715e, this.f40716f, new Object(), new Object(), new Object(), 4, this.f40714d, this.f40721k, 1024);
            this.f40720j = true;
            a0Var2.b(c4935n, abstractC5675a);
            arrayList.add(a0Var2);
            return this;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            M m10 = (M) it.next();
            if ((aVar instanceof G) && m10.a()) {
                if (m10 instanceof a0) {
                    a0Var = (a0) m10;
                } else {
                    a0Var = null;
                }
                if (a0Var != null && (n10 = a0Var.f40782c) != null) {
                    str = n10.f40685a;
                } else {
                    str = null;
                }
                if (AbstractC3557B.K(str, ((G) aVar).f40640j.f40685a)) {
                    this.f40723m = aVar.v0();
                }
            }
            if (m10.b(aVar, abstractC5675a) == null) {
                it.remove();
            }
        }
        boolean z12 = aVar instanceof C;
        u5.g gVar = this.f40712b;
        if (z12) {
            C c10 = (C) aVar;
            int i10 = a0.P;
            AbstractC3557B.c0("sdkCore", gVar);
            D5.a aVar2 = this.f40716f;
            AbstractC3557B.c0("firstPartyHostHeaderTypeResolver", aVar2);
            w6.m mVar = this.f40717g;
            AbstractC3557B.c0("cpuVitalMonitor", mVar);
            w6.m mVar2 = this.f40718h;
            AbstractC3557B.c0("memoryVitalMonitor", mVar2);
            w6.m mVar3 = this.f40719i;
            AbstractC3557B.c0("frameRateVitalMonitor", mVar3);
            a0 a0Var3 = new a0(this, gVar, c10.f40620j, c10.f40622l, c10.f40621k, this.f40715e, aVar2, mVar, mVar2, mVar3, 0, this.f40714d, this.f40721k, 3072);
            this.f40720j = true;
            arrayList.add(a0Var3);
            a0Var3.b(new C4938q(), abstractC5675a);
            P p10 = this.f40715e;
            if (p10 != null) {
                Q q10 = new Q(c10.f40620j, c10.f40621k, true);
                C4928g c4928g = (C4928g) p10;
                if (q10.f40708c) {
                    c4928g.f40865l = q10;
                }
            }
            C4564c c4564c = this.f40723m;
            if (c4564c != null) {
                P4.a.l0(gVar.l(), 3, AbstractC4344b.G0(EnumC5090b.f42740h0, EnumC5090b.f42739Z), new z0(aVar.v0().f38962b - c4564c.f38962b, 1), null, 56);
            }
            this.f40723m = null;
        } else {
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                int i11 = 0;
                while (it2.hasNext()) {
                    if (((M) it2.next()).a() && (i11 = i11 + 1) < 0) {
                        AbstractC4344b.c1();
                        throw null;
                    }
                }
            }
            if (DdRumContentProvider.f26755Y == 100) {
                z10 = true;
            }
            boolean z13 = this.f40720j;
            EnumC5090b enumC5090b = EnumC5090b.f42738Y;
            Class[] clsArr = f40710o;
            if (!z13 && z10) {
                if (!kf.q.S2(aVar.getClass(), clsArr)) {
                    P4.a.m0(gVar.l(), 4, enumC5090b, C4927f.f40850i0, null, false, 56);
                }
            } else if (!(aVar instanceof C4932k) || !(((C4932k) aVar).f40875l instanceof C4339c)) {
                boolean S22 = kf.q.S2(aVar.getClass(), f40709n);
                boolean S23 = kf.q.S2(aVar.getClass(), clsArr);
                if (S22 && this.f40713c) {
                    a0 a0Var4 = new a0(this, this.f40712b, new N("com.datadog.background.view", "com/datadog/background/view", "Background"), aVar.v0(), wVar, this.f40715e, this.f40716f, new Object(), new Object(), new Object(), 3, this.f40714d, this.f40721k, 1024);
                    a0Var4.b(aVar, abstractC5675a);
                    arrayList.add(a0Var4);
                    this.f40723m = null;
                    return this;
                } else if (S23) {
                    return this;
                } else {
                    P4.a.m0(gVar.l(), 4, enumC5090b, C4927f.f40849h0, null, false, 56);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // o6.M
    public final C4562a c() {
        return this.f40711a.c();
    }
}
