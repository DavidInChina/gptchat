package z;

import A.C0046u0;
import B.AbstractC0130h1;
import Df.AbstractC0408g;
import E0.AbstractC0461u;
import F.C0535i;
import L.P0;
import Mf.AbstractC0997f;
import W.AbstractC1547f0;
import Z.AbstractC1706d0;
import Z.AbstractC1708e0;
import Z.AbstractC1710f0;
import Z.C1724m0;
import Z.S0;
import Z.l1;
import ab.C1965s;
import android.os.Bundle;
import androidx.lifecycle.C2074i;
import b0.C2104h;
import bb.AbstractC2171k;
import bb.C2170j;
import ca.AbstractC2314f;
import ca.AbstractC2318j;
import ca.C2315g;
import ca.C2316h;
import ca.C2317i;
import cb.C2350T;
import de.AbstractC2627b;
import de.C2633h;
import de.C2635j;
import e9.AbstractC2811d;
import ee.C2886d;
import f9.AbstractC2949a;
import fa.C2969F;
import g9.AbstractC3215f;
import h.C3281g;
import h0.C3288a;
import id.AbstractC3557B;
import io.sentry.android.navigation.SentryNavigationListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jf.C3959i;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import m.AbstractActivityC4532l;
import m6.C4562a;
import na.C4745d0;
import na.C4751f0;
import na.C4754g0;
import na.D1;
import o6.C4935n;
import q0.C5251c;
import q0.C5252d;
import q5.C5271a;
import q5.C5272b;
import rg.AbstractC5493d;
import s3.AbstractC5540C;
import s3.AbstractC5568s;
import s3.C5545H;
import s3.C5562l;
import wa.AbstractC6150b;
import wa.C6153e;
import wa.C6154f;
import wd.EnumC6206t;
import wf.AbstractC6216a;
import x6.C6278a;
import x6.C6284c;
import x6.C6290e;
import x6.C6293f;
import x6.C6302i;
import x6.C6314m;
import x6.C6317n;
import x6.C6320o;
import x6.C6331s;
import x6.C6337u;
import x6.C6346x;
import x6.C6349y;
import x6.EnumC6352z;
import y.C6471i;
import yf.AbstractC6583a;
import zc.C6821H;

/* renamed from: z.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6686a extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51199Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f51200Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f51201h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f51202i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f51203j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6686a(Ad.s sVar, wf.k kVar, Object obj, Object obj2, int i10) {
        super(1);
        this.f51199Y = i10;
        this.f51200Z = sVar;
        this.f51202i0 = kVar;
        this.f51201h0 = obj;
        this.f51203j0 = obj2;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [Z.M, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final Z.M a(Z.N n10) {
        int i10 = this.f51199Y;
        Object obj = this.f51201h0;
        Object obj2 = this.f51203j0;
        Object obj3 = this.f51202i0;
        Object obj4 = this.f51200Z;
        switch (i10) {
            case 4:
                T0.A a5 = (T0.A) obj4;
                if (a5 != null) {
                    P0 p02 = (P0) obj;
                    if (p02.b()) {
                        ?? obj5 = new Object();
                        C3281g c3281g = new C3281g(p02.f10032d, p02.f10048t, obj5, 13);
                        T0.u uVar = a5.f16730a;
                        T0.D d10 = (T0.D) uVar;
                        d10.f16741d = true;
                        d10.f16744g = (T0.z) obj3;
                        d10.f16745h = (T0.o) obj2;
                        d10.f16742e = c3281g;
                        d10.f16743f = p02.f10049u;
                        d10.a(T0.B.f16732Y);
                        T0.F f6 = new T0.F(a5, uVar);
                        a5.f16731b.set(f6);
                        obj5.f37622Y = f6;
                        p02.f10033e = f6;
                    }
                }
                return new Object();
            default:
                AbstractC3557B.c0("$this$DisposableEffect", n10);
                C2074i c2074i = new C2074i((C5545H) obj4, new SentryNavigationListener(((Boolean) ((l1) obj3).getValue()).booleanValue(), ((Boolean) ((l1) obj2).getValue()).booleanValue()));
                androidx.lifecycle.S s10 = (androidx.lifecycle.S) obj;
                s10.a(c2074i);
                return new C6678S(c2074i, 11, s10);
        }
    }

    public final void c(F.B b10) {
        boolean z10;
        int i10 = 8;
        int i11 = this.f51199Y;
        int i12 = 0;
        Object obj = this.f51203j0;
        Object obj2 = this.f51202i0;
        Object obj3 = this.f51201h0;
        Object obj4 = this.f51200Z;
        switch (i11) {
            case 10:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                D1 d12 = (D1) obj4;
                d12.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : d12.f39771j) {
                    AbstractC2318j abstractC2318j = (AbstractC2318j) obj5;
                    abstractC2318j.getClass();
                    if (abstractC2318j instanceof C2316h) {
                        z10 = ((C2316h) abstractC2318j).f26391a.f30025r;
                    } else if (abstractC2318j instanceof C2317i) {
                        List<C2969F> list = ((C2317i) abstractC2318j).f26393b;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (C2969F c2969f : list) {
                                if (!c2969f.f30025r) {
                                    z10 = false;
                                }
                            }
                        }
                        z10 = true;
                    } else if (abstractC2318j instanceof C2315g) {
                        z10 = ((C2315g) abstractC2318j).f26390a.f30025r;
                    } else if (abstractC2318j instanceof AbstractC2314f) {
                        z10 = false;
                    } else {
                        throw new RuntimeException();
                    }
                    if (!z10) {
                        arrayList.add(obj5);
                    }
                }
                C0535i c0535i = (C0535i) b10;
                c0535i.l0(arrayList.size(), new C4751f0(C4745d0.f39944Z, arrayList, 0), new C4751f0(C4745d0.f39945h0, arrayList, 1), new C3288a(new C4754g0(arrayList, d12, (wf.k) obj2, (wf.k) obj3, (AbstractC1708e0) obj), true, -632812321));
                return;
            case 11:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                Sc.n nVar = (Sc.n) obj3;
                AbstractC6216a abstractC6216a = (AbstractC6216a) obj;
                wf.k kVar = (wf.k) obj2;
                for (Object obj6 : ((Sc.c) obj4).f16507a) {
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        Sc.f fVar = (Sc.f) obj6;
                        if (i12 > 0) {
                            E9.f.t(b10, null, AbstractC6150b.f48259a, 3);
                        }
                        List list2 = fVar.f16513b;
                        ((C0535i) b10).l0(list2.size(), null, new C4751f0(C6153e.f48265Y, list2, i10), new C3288a(new C6154f(list2, nVar, abstractC6216a, kVar, 0), true, -632812321));
                        i12 = i13;
                        i10 = 8;
                    } else {
                        AbstractC4344b.d1();
                        throw null;
                    }
                }
                return;
            case 12:
            default:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                pc.m0 m0Var = (pc.m0) obj4;
                AbstractC3557B.c0("<this>", m0Var);
                if (m0Var instanceof pc.l0) {
                    if (((pc.l0) m0Var).f43011d != pc.S.f42940Y) {
                        E9.f.t(b10, null, new C3288a(new C6471i(25, (AbstractC0408g) obj3), true, 953069198), 3);
                    }
                }
                pc.P p10 = pc.P.f42935h0;
                List list3 = ((pc.l0) m0Var).f43008a;
                ((C0535i) b10).l0(list3.size(), new C4751f0(pc.P.f42934Z, list3, 22), new C4751f0(p10, list3, 23), new C3288a(new C6154f(list3, m0Var, (pc.b0) obj2, (AbstractActivityC4532l) obj, 5), true, -632812321));
                return;
            case 13:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                C2350T c2350t = (C2350T) obj4;
                E9.f.t(b10, null, new C3288a(new C0046u0(c2350t, 13, (bb.H0) obj3), true, 2146965468), 3);
                if (c2350t != null) {
                    wf.k kVar2 = (wf.k) obj2;
                    C2170j c2170j = C2170j.f25845o0;
                    List list4 = c2350t.f26487b;
                    ((C0535i) b10).l0(list4.size(), null, new C4751f0(c2170j, list4, 11), new C3288a(new C6154f(list4, (Object) c2350t, kVar2, (Object) ((bb.l0) obj), 2), true, -632812321));
                    E9.f.t(b10, null, new C3288a(new bb.V(1, c2350t, kVar2), true, 1644106196), 3);
                    return;
                }
                E9.f.u(b10, 8, null, AbstractC2171k.f25864g, 6);
                return;
            case 14:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                E9.f.t(b10, "search", new C3288a(new C0046u0((wf.k) obj2, 23, (l1) obj3), true, -2014257192), 2);
                ArrayList arrayList2 = ((gc.o) obj4).f31574d;
                ((C0535i) b10).l0(arrayList2.size(), new C4751f0(gc.i.f31560Y, arrayList2, 16), new C4751f0(gc.h.f31558h0, arrayList2, 17), new C3288a(new t3.s(arrayList2, 5, (gc.p) obj), true, -632812321));
                return;
        }
    }

    public final void e(C6712n c6712n) {
        int i10 = this.f51199Y;
        Object obj = this.f51203j0;
        Object obj2 = this.f51202i0;
        Object obj3 = this.f51201h0;
        Object obj4 = this.f51200Z;
        switch (i10) {
            case 0:
                C6694e c6694e = (C6694e) obj4;
                AbstractC6696f.w(c6712n, c6694e.f51230c);
                C1724m0 c1724m0 = c6712n.f51333e;
                Object d10 = c6694e.d(c1724m0.getValue());
                if (!AbstractC3557B.K(d10, c1724m0.getValue())) {
                    c6694e.f51230c.f51346Z.setValue(d10);
                    ((C6716p) obj3).f51346Z.setValue(d10);
                    wf.k kVar = (wf.k) obj2;
                    if (kVar != null) {
                        kVar.invoke(c6694e);
                    }
                    c6712n.a();
                    ((kotlin.jvm.internal.x) obj).f37645Y = true;
                    return;
                }
                wf.k kVar2 = (wf.k) obj2;
                if (kVar2 != null) {
                    kVar2.invoke(c6694e);
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) obj4;
                float floatValue = ((Number) c6712n.f51333e.getValue()).floatValue() - yVar.f37646Y;
                float a5 = ((AbstractC0130h1) obj3).a(floatValue);
                yVar.f37646Y = ((Number) c6712n.f51333e.getValue()).floatValue();
                ((kotlin.jvm.internal.y) obj2).f37646Y = ((Number) c6712n.f51329a.f51417b.invoke(c6712n.f51334f)).floatValue();
                if (Math.abs(floatValue - a5) > 0.5f) {
                    c6712n.a();
                }
                ((B.W) obj).getClass();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map] */
    @Override // wf.k
    public final Object invoke(Object obj) {
        long j6;
        boolean z10;
        boolean z11;
        AbstractC0461u abstractC0461u;
        AbstractC0461u x10;
        x6.C c10;
        x6.E e10;
        String str;
        Wa.j jVar;
        kf.w wVar;
        String a5;
        jf.y yVar = jf.y.f36177a;
        float f6 = 0.0f;
        int i10 = this.f51199Y;
        int i11 = 1;
        String str2 = null;
        Object obj2 = this.f51203j0;
        Object obj3 = this.f51202i0;
        Object obj4 = this.f51201h0;
        Object obj5 = this.f51200Z;
        switch (i10) {
            case 0:
                e((C6712n) obj);
                return yVar;
            case 1:
                long longValue = ((Number) obj).longValue();
                l1 l1Var = (l1) ((AbstractC1710f0) obj5).getValue();
                if (l1Var != null) {
                    j6 = ((Number) l1Var.getValue()).longValue();
                } else {
                    j6 = longValue;
                }
                C6676P c6676p = (C6676P) obj4;
                int i12 = (c6676p.f51181c > Long.MIN_VALUE ? 1 : (c6676p.f51181c == Long.MIN_VALUE ? 0 : -1));
                C2104h c2104h = c6676p.f51179a;
                if (i12 == 0 || ((kotlin.jvm.internal.y) obj3).f37646Y != AbstractC6696f.q(((Ng.F) obj2).i())) {
                    c6676p.f51181c = longValue;
                    int i13 = c2104h.f25569h0;
                    if (i13 > 0) {
                        Object[] objArr = c2104h.f25567Y;
                        int i14 = 0;
                        do {
                            ((C6671K) objArr[i14]).f51165l0 = true;
                            i14++;
                        } while (i14 < i13);
                        ((kotlin.jvm.internal.y) obj3).f37646Y = AbstractC6696f.q(((Ng.F) obj2).i());
                    } else {
                        ((kotlin.jvm.internal.y) obj3).f37646Y = AbstractC6696f.q(((Ng.F) obj2).i());
                    }
                }
                float f10 = ((kotlin.jvm.internal.y) obj3).f37646Y;
                if (f10 == 0.0f) {
                    int i15 = c2104h.f25569h0;
                    if (i15 > 0) {
                        Object[] objArr2 = c2104h.f25567Y;
                        int i16 = 0;
                        do {
                            C6671K c6671k = (C6671K) objArr2[i16];
                            c6671k.f51162i0.setValue(c6671k.f51163j0.f51323d);
                            c6671k.f51165l0 = true;
                            i16++;
                        } while (i16 < i15);
                    }
                } else {
                    long j10 = ((float) (j6 - c6676p.f51181c)) / f10;
                    int i17 = c2104h.f25569h0;
                    if (i17 > 0) {
                        Object[] objArr3 = c2104h.f25567Y;
                        z10 = true;
                        int i18 = 0;
                        do {
                            C6671K c6671k2 = (C6671K) objArr3[i18];
                            if (!c6671k2.f51164k0) {
                                c6671k2.f51167n0.f51180b.setValue(Boolean.FALSE);
                                z11 = false;
                                if (c6671k2.f51165l0) {
                                    c6671k2.f51165l0 = false;
                                    c6671k2.f51166m0 = j10;
                                }
                                long j11 = j10 - c6671k2.f51166m0;
                                c6671k2.f51162i0.setValue(c6671k2.f51163j0.f(j11));
                                C6711m0 c6711m0 = c6671k2.f51163j0;
                                c6711m0.getClass();
                                c6671k2.f51164k0 = AbstractC6708l.a(c6711m0, j11);
                            } else {
                                z11 = false;
                            }
                            if (!c6671k2.f51164k0) {
                                z10 = z11;
                            }
                            i18++;
                        } while (i18 < i17);
                    } else {
                        z10 = true;
                    }
                    c6676p.f51182d.setValue(Boolean.valueOf(!z10));
                }
                return yVar;
            case 2:
                e((C6712n) obj);
                return yVar;
            case 3:
                E0.c0 c0Var = (E0.c0) obj;
                C2104h c2104h2 = ((E.O) obj5).f3808c;
                E.n0 n0Var = (E.n0) obj4;
                int[] iArr = (int[]) obj3;
                E0.P p10 = (E0.P) obj2;
                int i19 = c2104h2.f25569h0;
                if (i19 > 0) {
                    Object[] objArr4 = c2104h2.f25567Y;
                    int i20 = 0;
                    do {
                        n0Var.d(c0Var, (E.l0) objArr4[i20], iArr[i20], p10.getLayoutDirection());
                        i20++;
                    } while (i20 < i19);
                    return yVar;
                }
                return yVar;
            case 4:
                return a((Z.N) obj);
            case 5:
                AbstractC0461u abstractC0461u2 = (AbstractC0461u) obj;
                C5252d c11 = androidx.compose.ui.layout.a.c(abstractC0461u2);
                float f11 = AbstractC1547f0.f20040a;
                ((S0) ((AbstractC1706d0) obj5)).i(c11.f43625a);
                ((S0) ((AbstractC1706d0) obj4)).i(androidx.compose.ui.layout.a.c(abstractC0461u2).f43626b);
                AbstractC0461u x11 = abstractC0461u2.x();
                if (x11 != null && (x10 = x11.x()) != null) {
                    abstractC0461u = x10.f();
                } else {
                    abstractC0461u = null;
                }
                if (abstractC0461u != null) {
                    ((S0) ((AbstractC1706d0) obj3)).i(androidx.compose.ui.layout.a.c(abstractC0461u).f43627c);
                    ((S0) ((AbstractC1706d0) obj2)).i(androidx.compose.ui.layout.a.c(abstractC0461u).f43626b);
                }
                return yVar;
            case 6:
                C5562l c5562l = (C5562l) obj;
                AbstractC3557B.c0("it", c5562l);
                ((kotlin.jvm.internal.x) obj2).f37645Y = true;
                ((AbstractC5568s) obj5).a((AbstractC5540C) obj4, (Bundle) obj3, c5562l, kf.v.f37483Y);
                return yVar;
            case 7:
                C5271a c5271a = (C5271a) obj;
                AbstractC3557B.c0("datadogContext", c5271a);
                C4562a c4562a = (C4562a) obj5;
                String str3 = c4562a.f38955k;
                if (str3 != null && !Lg.n.n2(str3) && (str = c4562a.f38956l) != null && !Lg.n.n2(str)) {
                    c10 = new x6.C(c4562a.f38955k, str, null);
                } else {
                    c10 = null;
                }
                if (c10 != null) {
                    i11 = 2;
                }
                o6.a0 a0Var = (o6.a0) obj4;
                long j12 = a0Var.f40796q;
                C6278a c6278a = new C6278a(6, UUID.randomUUID().toString(), Long.valueOf(((C4935n) obj3).f40890k), null, null, new C6337u(0L), new C6317n(0L), new C6346x(0L), new x6.B(0L));
                String str4 = c4562a.f38948d;
                String str5 = "";
                if (str4 == null) {
                    str4 = str5;
                }
                String str6 = c4562a.f38950f;
                if (str6 != null) {
                    str5 = str6;
                }
                C6290e c6290e = new C6290e(str4, str5, c4562a.f38949e);
                q5.g gVar = c5271a.f43907m;
                if (M3.H.Y(gVar)) {
                    e10 = new x6.E(gVar.f43937a, gVar.f43938b, gVar.f43939c, AbstractC4268D.m1(gVar.f43940d));
                } else {
                    e10 = null;
                }
                C6293f c6293f = new C6293f(c4562a.f38945a);
                C6284c c6284c = new C6284c(c4562a.f38946b, i11, Boolean.FALSE);
                int r12 = AbstractC4344b.r1(c5271a.f43901g, a0Var.f40781b.l());
                C5272b c5272b = c5271a.f43906l;
                return new x6.G(j12, c6293f, c5271a.f43897c, c5271a.f43899e, c6284c, r12, c6290e, e10, AbstractC4344b.e1(c5271a.f43905k), c10, new C6349y(c5272b.f43915f, c5272b.f43917h, null, c5272b.f43916g), new C6331s(AbstractC4344b.f1(c5272b.f43913d), c5272b.f43910a, c5272b.f43912c, c5272b.f43911b, c5272b.f43918i), new C6320o(new x6.r(EnumC6352z.PLAN_1, AbstractC4344b.g1(c4562a.f38953i)), new C6302i(Float.valueOf(a0Var.f40787h), null), null, null), new C6314m((Map) obj2), c6278a);
            case 8:
                AbstractC3557B.c0("$this$setState", (pd.s) obj);
                return AbstractC2811d.a((EnumC6206t) obj5, (AbstractC3215f) obj4, (AbstractC2949a) obj3, (com.openai.experiment.s) obj2);
            case 9:
                ((x9.l) obj5).a(Ad.l.D(((C5251c) obj).f43623a, (C5252d) ((AbstractC1710f0) obj2).getValue(), (mh.P) obj4));
                ((wf.k) obj3).invoke(Boolean.TRUE);
                return yVar;
            case 10:
                c((F.B) obj);
                return yVar;
            case 11:
                c((F.B) obj);
                return yVar;
            case 12:
                C1965s c1965s = (C1965s) obj;
                AbstractC3557B.c0("$this$setState", c1965s);
                Wa.j jVar2 = c1965s.f24127d;
                if (jVar2 != null) {
                    String str7 = (String) obj5;
                    kotlin.jvm.internal.B b10 = (kotlin.jvm.internal.B) obj4;
                    String str8 = (String) obj3;
                    Wa.n nVar = (Wa.n) obj2;
                    List<Wa.m> list = jVar2.f20853a;
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                    for (Wa.m mVar : list) {
                        if (AbstractC3557B.K(mVar.f20857a, str7)) {
                            kf.w wVar2 = kf.w.f37484Y;
                            ?? r62 = mVar.f20859c;
                            if (r62 == 0) {
                                wVar = wVar2;
                            } else {
                                wVar = r62;
                            }
                            b10.f37622Y = wVar.get(str8);
                            if (r62 != 0) {
                                wVar2 = r62;
                            }
                            Map g1 = AbstractC4268D.g1(wVar2, new C3959i(str8, nVar));
                            String str9 = mVar.f20857a;
                            AbstractC3557B.c0("actionId", str9);
                            mVar = new Wa.m(str9, mVar.f20858b, g1, mVar.f20860d);
                        }
                        arrayList.add(mVar);
                    }
                    jVar = new Wa.j(arrayList);
                } else {
                    jVar = null;
                }
                return C1965s.e(c1965s, null, null, jVar, 7);
            case 13:
                c((F.B) obj);
                return yVar;
            case 14:
                c((F.B) obj);
                return yVar;
            case 15:
                c((F.B) obj);
                return yVar;
            case 16:
                Cd.X x12 = (Cd.X) obj;
                AbstractC3557B.c0("$this$setState", x12);
                String str10 = ((Sc.n) obj5).f16534b;
                String str11 = ((Ec.o) obj4).f4631Y;
                String str12 = (String) obj3;
                if (str12 == null) {
                    a5 = "null";
                } else {
                    a5 = wd.O.a(str12);
                }
                String str13 = a5;
                String str14 = ((T9.c) obj2).f16967b;
                if (str14 != null) {
                    str2 = str14;
                }
                return Cd.X.e(x12, null, null, false, false, false, false, null, null, Hd.b.e(x12.f3038m, null, null, null, String.valueOf(str2), str10, str11, str13, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, 8388487), 4095);
            case 17:
                ee.p pVar = (ee.p) obj;
                AbstractC3557B.c0("$this$MinaBox", pVar);
                float floatValue = ((Number) ((AbstractC1710f0) obj5).getValue()).floatValue();
                de.l lVar = (de.l) obj4;
                List<Number> list2 = lVar.f28243b;
                AbstractC3557B.c0("<this>", list2);
                for (Number number : list2) {
                    f6 += number.floatValue();
                }
                C2635j c2635j = (C2635j) obj2;
                E9.f.k(((de.m) obj3).f28245b, new C2633h(pVar, c2635j, lVar, Math.min(floatValue, f6), 1));
                if (c2635j.f28241c) {
                    pVar.f29336a.a(1, new C2886d(new C6821H(8, lVar), null, ee.o.f29335Y, AbstractC2627b.f28217a));
                }
                return yVar;
            case 18:
                return a((Z.N) obj);
            default:
                AbstractC3557B.c0("kotlinTypeRefiner", (Cg.i) obj);
                AbstractC0997f abstractC0997f = (AbstractC0997f) obj5;
                if (!(abstractC0997f instanceof AbstractC0997f)) {
                    abstractC0997f = null;
                }
                if (abstractC0997f != null) {
                    AbstractC5493d.f(abstractC0997f);
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6686a(Sc.c cVar, Sc.n nVar, AbstractC6216a abstractC6216a, wf.k kVar) {
        super(1);
        this.f51199Y = 11;
        this.f51200Z = cVar;
        this.f51201h0 = nVar;
        this.f51203j0 = abstractC6216a;
        this.f51202i0 = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6686a(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(1);
        this.f51199Y = i10;
        this.f51200Z = obj;
        this.f51201h0 = obj2;
        this.f51202i0 = obj3;
        this.f51203j0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6686a(kotlin.jvm.internal.x xVar, AbstractC5568s abstractC5568s, AbstractC5540C abstractC5540C, Bundle bundle) {
        super(1);
        this.f51199Y = 6;
        this.f51203j0 = xVar;
        this.f51200Z = abstractC5568s;
        this.f51201h0 = abstractC5540C;
        this.f51202i0 = bundle;
    }
}
