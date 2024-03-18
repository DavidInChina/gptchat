package N;

import E0.AbstractC0461u;
import F.C0534h;
import H0.AbstractC0696o0;
import H0.C0667a0;
import H0.C0689l;
import H0.U0;
import N0.C1044c;
import N0.C1046e;
import Z.C1724m0;
import Z.o1;
import android.view.ActionMode;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import jf.C3959i;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5251c;
import q0.C5252d;
import x0.AbstractC6263a;
import x0.C6264b;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final m0 f12315a;

    /* renamed from: b  reason: collision with root package name */
    public final C1724m0 f12316b;

    /* renamed from: c  reason: collision with root package name */
    public final C1724m0 f12317c;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC6263a f12319e;

    /* renamed from: f  reason: collision with root package name */
    public AbstractC0696o0 f12320f;

    /* renamed from: g  reason: collision with root package name */
    public U0 f12321g;

    /* renamed from: i  reason: collision with root package name */
    public final C1724m0 f12323i;

    /* renamed from: j  reason: collision with root package name */
    public C5251c f12324j;

    /* renamed from: k  reason: collision with root package name */
    public AbstractC0461u f12325k;

    /* renamed from: l  reason: collision with root package name */
    public final C1724m0 f12326l;

    /* renamed from: m  reason: collision with root package name */
    public final C1724m0 f12327m;

    /* renamed from: n  reason: collision with root package name */
    public final C1724m0 f12328n;

    /* renamed from: o  reason: collision with root package name */
    public final C1724m0 f12329o;

    /* renamed from: p  reason: collision with root package name */
    public final C1724m0 f12330p;

    /* renamed from: q  reason: collision with root package name */
    public final C1724m0 f12331q;

    /* renamed from: r  reason: collision with root package name */
    public Q f12332r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12333s;

    /* renamed from: d  reason: collision with root package name */
    public wf.k f12318d = U.f12255i0;

    /* renamed from: h  reason: collision with root package name */
    public final p0.l f12322h = new p0.l();

    public f0(m0 m0Var) {
        this.f12315a = m0Var;
        o1 o1Var = o1.f22665a;
        this.f12316b = AbstractC4828h.Z(null, o1Var);
        this.f12317c = AbstractC4828h.Z(Boolean.TRUE, o1Var);
        this.f12323i = AbstractC4828h.Z(Boolean.FALSE, o1Var);
        long j6 = C5251c.f43619b;
        this.f12326l = AbstractC4828h.Z(new C5251c(j6), o1Var);
        this.f12327m = AbstractC4828h.Z(new C5251c(j6), o1Var);
        this.f12328n = AbstractC4828h.Z(null, o1Var);
        this.f12329o = AbstractC4828h.Z(null, o1Var);
        this.f12330p = AbstractC4828h.Z(null, o1Var);
        this.f12331q = AbstractC4828h.Z(null, o1Var);
        m0Var.f12377e = new E(this, 1);
        m0Var.f12378f = new C0534h(1, this);
        m0Var.f12379g = new Z(this);
        m0Var.f12380h = new C(this, 2);
        m0Var.f12381i = new E(this, 3);
    }

    public static final long a(f0 f0Var, AbstractC0461u abstractC0461u, long j6) {
        AbstractC0461u abstractC0461u2 = f0Var.f12325k;
        if (abstractC0461u2 != null && abstractC0461u2.i()) {
            return f0Var.i().B(abstractC0461u, j6);
        }
        return C5251c.f43621d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        C1046e c1046e;
        AbstractC0696o0 abstractC0696o0;
        C1046e c1046e2;
        C1046e c1046e3;
        C1046e c1046e4 = null;
        if (f() != null) {
            m0 m0Var = this.f12315a;
            if (!m0Var.a().isEmpty()) {
                C1044c c1044c = new C1044c();
                ArrayList c10 = m0Var.c(i());
                int size = c10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C1030n c1030n = (C1030n) ((AbstractC1032p) c10.get(i10));
                    C1034s c1034s = (C1034s) m0Var.a().get(Long.valueOf(c1030n.f12383a));
                    if (c1034s != null) {
                        N0.C c11 = (N0.C) c1030n.f12385c.mo122invoke();
                        if (c11 == null) {
                            c1046e2 = new C1046e("", null, 6);
                        } else {
                            c1046e2 = c11.f12477a.f12467a;
                        }
                        boolean z10 = c1034s.f12410c;
                        r rVar = c1034s.f12408a;
                        r rVar2 = c1034s.f12409b;
                        if (z10) {
                            c1046e3 = c1046e2.subSequence(rVar2.f12404b, rVar.f12404b);
                        } else {
                            c1046e3 = c1046e2.subSequence(rVar.f12404b, rVar2.f12404b);
                        }
                        c1044c.b(c1046e3);
                    }
                }
                c1046e = c1044c.i();
                if (c1046e == null) {
                    if (c1046e.f12512Y.length() > 0) {
                        c1046e4 = c1046e;
                    }
                    if (c1046e4 != null && (abstractC0696o0 = this.f12320f) != null) {
                        ((C0689l) abstractC0696o0).a(c1046e4);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        c1046e = null;
        if (c1046e == null) {
        }
    }

    public final AbstractC1032p c(r rVar) {
        return (AbstractC1032p) this.f12315a.f12375c.get(Long.valueOf(rVar.f12405c));
    }

    public final L.Y d() {
        return (L.Y) this.f12330p.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.f12323i.getValue()).booleanValue();
    }

    public final C1034s f() {
        return (C1034s) this.f12316b.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f12317c.getValue()).booleanValue();
    }

    public final void h() {
        AbstractC6263a abstractC6263a;
        this.f12315a.f12382j.setValue(kf.w.f37484Y);
        k(false);
        if (f() != null) {
            this.f12318d.invoke(null);
            if (g() && (abstractC6263a = this.f12319e) != null) {
                ((C6264b) abstractC6263a).a(M3.H.f11535i);
            }
        }
    }

    public final AbstractC0461u i() {
        AbstractC0461u abstractC0461u = this.f12325k;
        if (abstractC0461u != null) {
            if (abstractC0461u.i()) {
                return abstractC0461u;
            }
            throw new IllegalArgumentException("unattached coordinates".toString());
        }
        throw new IllegalArgumentException("null coordinates".toString());
    }

    public final void j(boolean z10) {
        C1724m0 c1724m0 = this.f12317c;
        if (((Boolean) c1724m0.getValue()).booleanValue() != z10) {
            c1724m0.setValue(Boolean.valueOf(z10));
            n();
        }
    }

    public final void k(boolean z10) {
        this.f12333s = z10;
        n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
        if (N.h0.a(r10, r9) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        AbstractC1032p abstractC1032p;
        AbstractC1032p abstractC1032p2;
        AbstractC0461u abstractC0461u;
        AbstractC0461u abstractC0461u2;
        C5251c c5251c;
        r rVar;
        r rVar2;
        C1034s f6 = f();
        AbstractC0461u abstractC0461u3 = this.f12325k;
        C5251c c5251c2 = null;
        if (f6 != null && (rVar2 = f6.f12408a) != null) {
            abstractC1032p = c(rVar2);
        } else {
            abstractC1032p = null;
        }
        if (f6 != null && (rVar = f6.f12409b) != null) {
            abstractC1032p2 = c(rVar);
        } else {
            abstractC1032p2 = null;
        }
        if (abstractC1032p != null) {
            abstractC0461u = ((C1030n) abstractC1032p).c();
        } else {
            abstractC0461u = null;
        }
        if (abstractC1032p2 != null) {
            abstractC0461u2 = ((C1030n) abstractC1032p2).c();
        } else {
            abstractC0461u2 = null;
        }
        C1724m0 c1724m0 = this.f12329o;
        C1724m0 c1724m02 = this.f12328n;
        if (f6 != null && abstractC0461u3 != null && abstractC0461u3.i() && (abstractC0461u != null || abstractC0461u2 != null)) {
            C5252d c10 = h0.c(abstractC0461u3);
            if (abstractC0461u != null) {
                long a5 = ((C1030n) abstractC1032p).a(f6, true);
                if (!R4.b.B1(a5)) {
                    long B10 = abstractC0461u3.B(abstractC0461u, a5);
                    c5251c = new C5251c(B10);
                    if (d() != L.Y.f10082Z) {
                    }
                    c1724m02.setValue(c5251c);
                    if (abstractC0461u2 != null) {
                        long a10 = ((C1030n) abstractC1032p2).a(f6, false);
                        if (!R4.b.B1(a10)) {
                            long B11 = abstractC0461u3.B(abstractC0461u2, a10);
                            C5251c c5251c3 = new C5251c(B11);
                            if (d() == L.Y.f10083h0 || h0.a(B11, c10)) {
                                c5251c2 = c5251c3;
                            }
                        }
                    }
                    c1724m0.setValue(c5251c2);
                    return;
                }
            }
            c5251c = null;
            c1724m02.setValue(c5251c);
            if (abstractC0461u2 != null) {
            }
            c1724m0.setValue(c5251c2);
            return;
        }
        c1724m02.setValue(null);
        c1724m0.setValue(null);
    }

    public final boolean m(long j6, long j10, boolean z10, AbstractC1038w abstractC1038w) {
        L.Y y10;
        C1034s c1034s;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        int i10;
        int i11;
        Q p0Var;
        m0 m0Var;
        C1046e c1046e;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList2;
        m0 m0Var2;
        S s10;
        N0.C c10;
        long j11;
        int i15;
        S s11;
        int i16;
        int i17;
        int i18;
        int i19;
        S s12;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        r rVar;
        int i26;
        r rVar2;
        r rVar3;
        r rVar4;
        S s13;
        if (z10) {
            y10 = L.Y.f10082Z;
        } else {
            y10 = L.Y.f10083h0;
        }
        this.f12330p.setValue(y10);
        this.f12331q.setValue(new C5251c(j6));
        AbstractC0461u i27 = i();
        m0 m0Var3 = this.f12315a;
        ArrayList c11 = m0Var3.c(i27);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int size = c11.size();
        for (int i28 = 0; i28 < size; i28++) {
            linkedHashMap2.put(Long.valueOf(((C1030n) ((AbstractC1032p) c11.get(i28))).f12383a), Integer.valueOf(i28));
        }
        b0 b0Var = new b0(0, linkedHashMap2);
        if (R4.b.B1(j10)) {
            c1034s = null;
        } else {
            c1034s = f();
        }
        S s14 = new S(j6, j10, i27, z10, c1034s, b0Var);
        int size2 = c11.size();
        int i29 = 0;
        while (true) {
            arrayList = s14.f12247h;
            linkedHashMap = s14.f12246g;
            if (i29 >= size2) {
                break;
            }
            C1030n c1030n = (C1030n) ((AbstractC1032p) c11.get(i29));
            AbstractC0461u c12 = c1030n.c();
            if (c12 == null || (c10 = (N0.C) c1030n.f12385c.mo122invoke()) == null) {
                i14 = size2;
                m0Var2 = m0Var3;
                arrayList2 = c11;
                s10 = s14;
            } else {
                long B10 = s14.f12242c.B(c12, C5251c.f43619b);
                long g10 = C5251c.g(s14.f12240a, B10);
                m0Var2 = m0Var3;
                long j12 = s14.f12241b;
                if (R4.b.B1(j12)) {
                    j11 = C5251c.f43621d;
                } else {
                    j11 = C5251c.g(j12, B10);
                }
                long j13 = c10.f12479c;
                S s15 = s14;
                float f6 = (int) (j13 >> 32);
                float f10 = (int) (j13 & 4294967295L);
                if (C5251c.d(g10) < 0.0f) {
                    i15 = 1;
                } else if (C5251c.d(g10) > f6) {
                    i15 = 3;
                } else {
                    i15 = 2;
                }
                if (C5251c.e(g10) < 0.0f) {
                    i14 = size2;
                    s11 = s15;
                    i16 = 1;
                } else if (C5251c.e(g10) > f10) {
                    i14 = size2;
                    i16 = 3;
                    s11 = s15;
                } else {
                    i14 = size2;
                    s11 = s15;
                    i16 = 2;
                }
                boolean z11 = s11.f12243d;
                long j14 = c1030n.f12383a;
                arrayList2 = c11;
                C1034s c1034s2 = s11.f12244e;
                if (z11) {
                    if (c1034s2 != null) {
                        rVar4 = c1034s2.f12409b;
                        s13 = s11;
                    } else {
                        s13 = s11;
                        rVar4 = null;
                    }
                    s12 = s13;
                    i22 = 2;
                    i21 = U3.f.h(i15, i16, s12, j14, rVar4);
                    i19 = i16;
                    i20 = i15;
                    i18 = i21;
                    i17 = i18;
                } else {
                    s12 = s11;
                    i22 = 2;
                    if (c1034s2 != null) {
                        rVar3 = c1034s2.f12408a;
                    } else {
                        rVar3 = null;
                    }
                    i21 = U3.f.h(i15, i16, s12, j14, rVar3);
                    i17 = i16;
                    i18 = i15;
                    i20 = i21;
                    i19 = i20;
                }
                int h02 = AbstractC4828h.h0(i15, i16);
                if (h02 != i22 && h02 == i21) {
                    s10 = s12;
                } else {
                    int length = c10.f12477a.f12467a.f12512Y.length();
                    s10 = s12;
                    Comparator comparator = s10.f12245f;
                    if (z11) {
                        int S = U3.f.S(g10, c10);
                        if (c1034s2 != null && (rVar2 = c1034s2.f12409b) != null) {
                            i26 = S;
                            int compare = comparator.compare(Long.valueOf(rVar2.f12405c), Long.valueOf(j14));
                            if (compare < 0) {
                                length = 0;
                            } else if (compare <= 0) {
                                length = rVar2.f12404b;
                            }
                        } else {
                            i26 = S;
                            length = i26;
                        }
                        i24 = i26;
                        i23 = length;
                    } else {
                        int S10 = U3.f.S(g10, c10);
                        if (c1034s2 != null && (rVar = c1034s2.f12408a) != null) {
                            int compare2 = comparator.compare(Long.valueOf(rVar.f12405c), Long.valueOf(j14));
                            if (compare2 < 0) {
                                length = 0;
                            } else if (compare2 <= 0) {
                                length = rVar.f12404b;
                            }
                        } else {
                            length = S10;
                        }
                        i23 = S10;
                        i24 = length;
                    }
                    if (R4.b.B1(j11)) {
                        i25 = -1;
                    } else {
                        i25 = U3.f.S(j11, c10);
                    }
                    int i30 = s10.f12250k + 2;
                    s10.f12250k = i30;
                    C1033q c1033q = new C1033q(j14, i30, i24, i23, i25, c10);
                    s10.f12248i = s10.a(s10.f12248i, i20, i19);
                    s10.f12249j = s10.a(s10.f12249j, i18, i17);
                    linkedHashMap.put(Long.valueOf(j14), Integer.valueOf(arrayList.size()));
                    arrayList.add(c1033q);
                }
            }
            i29++;
            size2 = i14;
            s14 = s10;
            m0Var3 = m0Var2;
            c11 = arrayList2;
        }
        m0 m0Var4 = m0Var3;
        S s16 = s14;
        int i31 = s16.f12250k + 1;
        int size3 = arrayList.size();
        if (size3 != 0) {
            if (size3 != 1) {
                int i32 = s16.f12248i;
                if (i32 == -1) {
                    i12 = i31;
                } else {
                    i12 = i32;
                }
                int i33 = s16.f12249j;
                if (i33 == -1) {
                    i13 = i31;
                } else {
                    i13 = i33;
                }
                p0Var = new C1029m(linkedHashMap, arrayList, i12, i13, s16.f12243d, s16.f12244e);
            } else {
                C1033q c1033q2 = (C1033q) kf.t.B2(arrayList);
                int i34 = s16.f12248i;
                if (i34 == -1) {
                    i10 = i31;
                } else {
                    i10 = i34;
                }
                int i35 = s16.f12249j;
                if (i35 == -1) {
                    i11 = i31;
                } else {
                    i11 = i35;
                }
                p0Var = new p0(s16.f12243d, i10, i11, s16.f12244e, c1033q2);
            }
            if (!p0Var.e(this.f12332r)) {
                return false;
            }
            C1034s a5 = ((C1035t) abstractC1038w).a(p0Var);
            if (!AbstractC3557B.K(a5, f())) {
                if (g()) {
                    m0Var = m0Var4;
                    ArrayList arrayList3 = m0Var.f12374b;
                    int size4 = arrayList3.size();
                    int i36 = 0;
                    while (true) {
                        if (i36 >= size4) {
                            break;
                        }
                        N0.C c13 = (N0.C) ((C1030n) ((AbstractC1032p) arrayList3.get(i36))).f12385c.mo122invoke();
                        if (c13 == null) {
                            c1046e = new C1046e("", null, 6);
                        } else {
                            c1046e = c13.f12477a.f12467a;
                        }
                        if (c1046e.f12512Y.length() > 0) {
                            AbstractC6263a abstractC6263a = this.f12319e;
                            if (abstractC6263a != null) {
                                ((C6264b) abstractC6263a).a(M3.H.f11535i);
                            }
                        } else {
                            i36++;
                        }
                    }
                } else {
                    m0Var = m0Var4;
                }
                m0Var.f12382j.setValue(p0Var.i(a5));
                this.f12318d.invoke(a5);
            }
            this.f12332r = p0Var;
            return true;
        }
        throw new IllegalStateException("SelectionLayout must not be empty.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0235 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0236  */
    /* JADX WARN: Type inference failed for: r5v5, types: [H0.a0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [wf.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        U0 u02;
        C1034s f6;
        U0 u03;
        C5252d c5252d;
        AbstractC0461u abstractC0461u;
        C5252d c5252d2;
        int i10;
        U0 u04;
        ArrayList arrayList;
        C1030n c1030n;
        AbstractC0461u c10;
        int[] iArr;
        int i11;
        C5252d c5252d3;
        C3959i c3959i;
        f0 f0Var = this;
        int i12 = 0;
        int i13 = 1;
        if (!e() || (u02 = f0Var.f12321g) == null) {
            return;
        }
        if (f0Var.f12333s && g() && (f6 = f()) != null) {
            r rVar = f6.f12408a;
            r rVar2 = f6.f12409b;
            if (!AbstractC3557B.K(rVar, rVar2)) {
                int i14 = (rVar.f12405c > rVar2.f12405c ? 1 : (rVar.f12405c == rVar2.f12405c ? 0 : -1));
                m0 m0Var = f0Var.f12315a;
                if (i14 != 0) {
                    ArrayList c11 = m0Var.c(i());
                    int size = c11.size();
                    int i15 = 0;
                    while (i15 < size) {
                        C1034s c1034s = (C1034s) m0Var.a().get(Long.valueOf(((C1030n) ((AbstractC1032p) c11.get(i15))).f12383a));
                        if (c1034s == null || c1034s.f12408a.f12404b == c1034s.f12409b.f12404b) {
                            int i16 = i13;
                            i15 += i16;
                            f0Var = this;
                            i13 = i16;
                            u02 = u02;
                            i12 = 0;
                        }
                    }
                }
                if (f() != null && (abstractC0461u = f0Var.f12325k) != null && abstractC0461u.i()) {
                    ArrayList c12 = m0Var.c(i());
                    ArrayList arrayList2 = new ArrayList(c12.size());
                    int size2 = c12.size();
                    for (int i17 = i12; i17 < size2; i17 += i13) {
                        AbstractC1032p abstractC1032p = (AbstractC1032p) c12.get(i17);
                        C1034s c1034s2 = (C1034s) m0Var.a().get(Long.valueOf(((C1030n) abstractC1032p).f12383a));
                        if (c1034s2 != null) {
                            c3959i = new C3959i(abstractC1032p, c1034s2);
                        } else {
                            c3959i = null;
                        }
                        if (c3959i != null) {
                            arrayList2.add(c3959i);
                        }
                    }
                    int size3 = arrayList2.size();
                    ArrayList arrayList3 = arrayList2;
                    arrayList3 = arrayList2;
                    if (size3 != 0 && size3 != i13) {
                        Object f22 = kf.t.f2(arrayList2);
                        Object o22 = kf.t.o2(arrayList2);
                        Object[] objArr = new Object[2];
                        objArr[i12] = f22;
                        objArr[i13] = o22;
                        arrayList3 = AbstractC4344b.G0(objArr);
                    }
                    if (!arrayList3.isEmpty()) {
                        boolean isEmpty = arrayList3.isEmpty();
                        C5252d c5252d4 = h0.f12345a;
                        if (isEmpty) {
                            c5252d2 = c5252d4;
                            u03 = u02;
                        } else {
                            int size4 = arrayList3.size();
                            int i18 = i12;
                            float f10 = Float.POSITIVE_INFINITY;
                            float f11 = Float.POSITIVE_INFINITY;
                            float f12 = Float.NEGATIVE_INFINITY;
                            float f13 = Float.NEGATIVE_INFINITY;
                            ArrayList arrayList4 = arrayList3;
                            while (i18 < size4) {
                                C3959i c3959i2 = (C3959i) arrayList4.get(i18);
                                AbstractC1032p abstractC1032p2 = (AbstractC1032p) c3959i2.f36155Y;
                                C1034s c1034s3 = (C1034s) c3959i2.f36156Z;
                                int i19 = c1034s3.f12408a.f12404b;
                                int i20 = c1034s3.f12409b.f12404b;
                                if (i19 == i20 || (c10 = (c1030n = (C1030n) abstractC1032p2).c()) == null) {
                                    i10 = size4;
                                    u04 = u02;
                                    arrayList = arrayList4;
                                } else {
                                    i10 = size4;
                                    int min = Math.min(i19, i20);
                                    int max = Math.max(i19, i20) - i13;
                                    if (min == max) {
                                        iArr = new int[]{min};
                                    } else {
                                        iArr = new int[]{min, max};
                                    }
                                    int length = iArr.length;
                                    int i21 = 0;
                                    float f14 = Float.POSITIVE_INFINITY;
                                    float f15 = Float.POSITIVE_INFINITY;
                                    float f16 = Float.NEGATIVE_INFINITY;
                                    float f17 = Float.NEGATIVE_INFINITY;
                                    while (i21 < length) {
                                        int i22 = iArr[i21];
                                        int[] iArr2 = iArr;
                                        N0.C c13 = (N0.C) c1030n.f12385c.mo122invoke();
                                        C5252d c5252d5 = C5252d.f43624e;
                                        if (c13 == null) {
                                            i11 = length;
                                        } else {
                                            i11 = length;
                                            int length2 = c13.f12477a.f12467a.f12512Y.length();
                                            if (length2 >= 1) {
                                                c5252d3 = c13.b(com.google.android.gms.internal.play_billing.N.p(i22, 0, length2 - 1));
                                                f14 = Math.min(f14, c5252d3.f43625a);
                                                f15 = Math.min(f15, c5252d3.f43626b);
                                                f16 = Math.max(f16, c5252d3.f43627c);
                                                f17 = Math.max(f17, c5252d3.f43628d);
                                                i21++;
                                                iArr = iArr2;
                                                length = i11;
                                            }
                                        }
                                        c5252d3 = c5252d5;
                                        f14 = Math.min(f14, c5252d3.f43625a);
                                        f15 = Math.min(f15, c5252d3.f43626b);
                                        f16 = Math.max(f16, c5252d3.f43627c);
                                        f17 = Math.max(f17, c5252d3.f43628d);
                                        i21++;
                                        iArr = iArr2;
                                        length = i11;
                                    }
                                    u04 = u02;
                                    long r10 = R4.b.r(f14, f15);
                                    arrayList = arrayList4;
                                    long r11 = R4.b.r(f16, f17);
                                    long B10 = abstractC0461u.B(c10, r10);
                                    long B11 = abstractC0461u.B(c10, r11);
                                    f10 = Math.min(f10, C5251c.d(B10));
                                    f11 = Math.min(f11, C5251c.e(B10));
                                    f12 = Math.max(f12, C5251c.d(B11));
                                    f13 = Math.max(f13, C5251c.e(B11));
                                }
                                i18++;
                                arrayList4 = arrayList;
                                i13 = 1;
                                u02 = u04;
                                size4 = i10;
                            }
                            u03 = u02;
                            c5252d2 = new C5252d(f10, f11, f12, f13);
                        }
                        if (!AbstractC3557B.K(c5252d2, c5252d4)) {
                            C5252d g10 = h0.c(abstractC0461u).g(c5252d2);
                            if (g10.f() >= 0.0f && g10.c() >= 0.0f) {
                                c5252d = C5252d.a(g10.i(androidx.compose.ui.layout.a.l(abstractC0461u)), 0.0f, 0.0f, (P.f12238b * 4) + g10.f43628d, 7);
                                if (c5252d == null) {
                                    return;
                                }
                                ((C0667a0) u03).a(c5252d, new kotlin.jvm.internal.j(0, this, f0.class, "toolbarCopy", "toolbarCopy()V", 0), null, null, null);
                                return;
                            }
                        }
                        c5252d = null;
                        if (c5252d == null) {
                        }
                    }
                }
                u03 = u02;
                c5252d = null;
                if (c5252d == null) {
                }
            }
        }
        C0667a0 c0667a0 = (C0667a0) u02;
        if (c0667a0.f6905d == i13) {
            c0667a0.f6905d = 2;
            ActionMode actionMode = c0667a0.f6903b;
            if (actionMode != null) {
                actionMode.finish();
            }
            c0667a0.f6903b = null;
        }
    }
}
