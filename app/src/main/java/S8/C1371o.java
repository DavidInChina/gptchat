package S8;

import Z.AbstractC1725n;
import Z.C1723m;
import id.AbstractC3557B;
import id.AbstractC3566f;
import id.C3556A;
import java.util.Map;
import wf.AbstractC6216a;

/* renamed from: S8.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1371o extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16346Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f16347Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f16348h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f16349i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f16350j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371o(int i10, id.x xVar, C3556A c3556a, wf.k kVar) {
        super(3);
        this.f16347Z = i10;
        this.f16348h0 = xVar;
        this.f16349i0 = c3556a;
        this.f16350j0 = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i10, AbstractC1725n abstractC1725n, int i11) {
        int i12;
        int i13;
        AbstractC3566f abstractC3566f;
        boolean z10;
        boolean z11;
        boolean z12;
        CharSequence charSequence;
        boolean z13;
        boolean z14;
        id.y yVar;
        int i14 = this.f16346Y;
        Object obj = this.f16350j0;
        Object obj2 = this.f16349i0;
        Object obj3 = this.f16348h0;
        int i15 = this.f16347Z;
        int i16 = 2;
        switch (i14) {
            case 0:
                if ((i11 & 14) == 0) {
                    if (((Z.r) abstractC1725n).e(i10)) {
                        i16 = 4;
                    }
                    i12 = i11 | i16;
                } else {
                    i12 = i11;
                }
                if ((i12 & 91) == 18) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                int ordinal = ((C) obj3).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        Z.r rVar2 = (Z.r) abstractC1725n;
                        rVar2.W(-1221274836);
                        rVar2.t(false);
                        return;
                    }
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    rVar3.W(-1221274868);
                    wf.k kVar = ((B) obj2).f16210e;
                    AbstractC3557B.Z(kVar);
                    d0 d0Var = (d0) ((e0) kVar.invoke((M) obj));
                    d0Var.getClass();
                    rVar3.W(1564770975);
                    d0Var.f16318a.invoke(Integer.valueOf(i15), rVar3, 0);
                    rVar3.t(false);
                    rVar3.t(false);
                    return;
                }
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(-1221274952);
                wf.k kVar2 = ((B) obj2).f16209d;
                AbstractC3557B.Z(kVar2);
                D d10 = (D) ((E) kVar2.invoke((M) obj));
                d10.getClass();
                rVar4.W(1968827457);
                d10.f16214a.h(Integer.valueOf(i15), Integer.valueOf(i10), rVar4, Integer.valueOf((i12 << 3) & 112));
                rVar4.t(false);
                rVar4.t(false);
                return;
            default:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i11 & 14) == 0) {
                    if (((Z.r) abstractC1725n).e(i10)) {
                        i16 = 4;
                    }
                    i13 = i11 | i16;
                } else {
                    i13 = i11;
                }
                if ((i13 & 91) == 18) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                int i17 = (i10 % i15) - 1;
                int i18 = i10 / i15;
                id.x xVar = (id.x) obj3;
                String a5 = xVar.a(i17);
                Map map = (Map) kf.t.i2(i18, xVar.f33132a);
                if (map != null) {
                    abstractC3566f = (AbstractC3566f) map.get(a5);
                } else {
                    abstractC3566f = null;
                }
                C3556A c3556a = (C3556A) obj2;
                if (c3556a != null) {
                    if (c3556a.f33075a.contains(Integer.valueOf(i17))) {
                        z10 = true;
                        if (c3556a != null) {
                            if (c3556a.f33076b.contains(Integer.valueOf(i18))) {
                                z11 = true;
                                if (c3556a != null) {
                                    if (c3556a.f33077c.contains(new id.m(Ng.H.c(i18, i17)))) {
                                        z12 = true;
                                        charSequence = (CharSequence) xVar.f33133b.f33128a.get(a5);
                                        if (charSequence == null && !Lg.n.n2(charSequence)) {
                                            z13 = false;
                                        } else {
                                            z13 = true;
                                        }
                                        z14 = !z13;
                                        if (!z14 && (z10 || z11)) {
                                            yVar = id.y.f33142n0;
                                        } else if (!z14 && z12) {
                                            yVar = id.y.f33143o0;
                                        } else if (!z10) {
                                            yVar = id.y.f33140l0;
                                        } else if (z11) {
                                            yVar = id.y.f33140l0;
                                        } else if (z12) {
                                            yVar = id.y.f33141m0;
                                        } else if (z14) {
                                            yVar = id.y.f33139k0;
                                        } else {
                                            yVar = id.y.f33138j0;
                                        }
                                        id.y yVar2 = yVar;
                                        Object obj4 = C1723m.f22654Y;
                                        if (i17 != -1) {
                                            Z.r rVar6 = (Z.r) abstractC1725n;
                                            rVar6.W(91914901);
                                            String valueOf = String.valueOf(i18 + 1);
                                            rVar6.W(91915032);
                                            wf.k kVar3 = (wf.k) obj;
                                            boolean g10 = rVar6.g(c3556a) | rVar6.g(kVar3) | rVar6.e(i18);
                                            Object K10 = rVar6.K();
                                            if (g10 || K10 == obj4) {
                                                K10 = new id.q(c3556a, kVar3, i18, 1);
                                                rVar6.h0(K10);
                                            }
                                            rVar6.t(false);
                                            Bi.c.H(valueOf, null, yVar2, (AbstractC6216a) K10, id.p.f33116Z, rVar6, 24624);
                                            rVar6.t(false);
                                            return;
                                        }
                                        Z.r rVar7 = (Z.r) abstractC1725n;
                                        rVar7.W(91915350);
                                        rVar7.W(91915442);
                                        wf.k kVar4 = (wf.k) obj;
                                        boolean g11 = rVar7.g(c3556a) | rVar7.g(kVar4) | rVar7.e(i18) | rVar7.e(i17);
                                        Object K11 = rVar7.K();
                                        if (g11 || K11 == obj4) {
                                            K11 = new id.r(c3556a, kVar4, i18, i17);
                                            rVar7.h0(K11);
                                        }
                                        rVar7.t(false);
                                        Bi.c.F(abstractC3566f, yVar2, (AbstractC6216a) K11, rVar7, 0);
                                        rVar7.t(false);
                                        return;
                                    }
                                }
                                z12 = false;
                                charSequence = (CharSequence) xVar.f33133b.f33128a.get(a5);
                                if (charSequence == null) {
                                }
                                z13 = true;
                                z14 = !z13;
                                if (!z14) {
                                }
                                if (!z14) {
                                }
                                if (!z10) {
                                }
                                id.y yVar22 = yVar;
                                Object obj42 = C1723m.f22654Y;
                                if (i17 != -1) {
                                }
                            }
                        }
                        z11 = false;
                        if (c3556a != null) {
                        }
                        z12 = false;
                        charSequence = (CharSequence) xVar.f33133b.f33128a.get(a5);
                        if (charSequence == null) {
                        }
                        z13 = true;
                        z14 = !z13;
                        if (!z14) {
                        }
                        if (!z14) {
                        }
                        if (!z10) {
                        }
                        id.y yVar222 = yVar;
                        Object obj422 = C1723m.f22654Y;
                        if (i17 != -1) {
                        }
                    }
                }
                z10 = false;
                if (c3556a != null) {
                }
                z11 = false;
                if (c3556a != null) {
                }
                z12 = false;
                charSequence = (CharSequence) xVar.f33133b.f33128a.get(a5);
                if (charSequence == null) {
                }
                z13 = true;
                z14 = !z13;
                if (!z14) {
                }
                if (!z14) {
                }
                if (!z10) {
                }
                id.y yVar2222 = yVar;
                Object obj4222 = C1723m.f22654Y;
                if (i17 != -1) {
                }
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f16346Y) {
            case 0:
                a(((Number) obj).intValue(), (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a(((Number) obj).intValue(), (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371o(C c10, B b10, M m10, int i10) {
        super(3);
        this.f16348h0 = c10;
        this.f16349i0 = b10;
        this.f16350j0 = m10;
        this.f16347Z = i10;
    }
}
