package B0;

import E0.AbstractC0461u;
import G0.AbstractC0579h;
import G0.AbstractC0587p;
import G0.g0;
import G0.t0;
import b0.C2104h;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l0.AbstractC4325q;
import q0.C5251c;
import w.C6066m;

/* renamed from: B0.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0192i extends C0193j {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4325q f1643b;

    /* renamed from: c  reason: collision with root package name */
    public final C0.b f1644c;

    /* renamed from: e  reason: collision with root package name */
    public g0 f1646e;

    /* renamed from: f  reason: collision with root package name */
    public C0194k f1647f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1648g;

    /* renamed from: d  reason: collision with root package name */
    public final C6066m f1645d = new C6066m(2);

    /* renamed from: h  reason: collision with root package name */
    public boolean f1649h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1650i = true;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, C0.b] */
    public C0192i(AbstractC4325q abstractC4325q) {
        this.f1643b = abstractC4325q;
        ?? obj = new Object();
        obj.f2484b = new long[2];
        this.f1644c = obj;
    }

    @Override // B0.C0193j
    public final boolean a(C6066m c6066m, AbstractC0461u abstractC0461u, C0189f c0189f, boolean z10) {
        C6066m c6066m2;
        C0.b bVar;
        Object obj;
        boolean z11;
        int i10;
        boolean z12;
        C0194k c0194k;
        boolean z13;
        int i11;
        boolean a5 = super.a(c6066m, abstractC0461u, c0189f, z10);
        AbstractC4325q abstractC4325q = this.f1643b;
        if (!abstractC4325q.f37732r0) {
            return true;
        }
        C2104h c2104h = null;
        while (abstractC4325q != null) {
            if (abstractC4325q instanceof t0) {
                this.f1646e = AbstractC0579h.z((t0) abstractC4325q, 16);
            } else if ((abstractC4325q.f37722h0 & 16) != 0 && (abstractC4325q instanceof AbstractC0587p)) {
                int i12 = 0;
                for (AbstractC4325q abstractC4325q2 = ((AbstractC0587p) abstractC4325q).f5816t0; abstractC4325q2 != null; abstractC4325q2 = abstractC4325q2.f37725k0) {
                    if ((abstractC4325q2.f37722h0 & 16) != 0) {
                        i12++;
                        if (i12 == 1) {
                            abstractC4325q = abstractC4325q2;
                        } else {
                            if (c2104h == null) {
                                c2104h = new C2104h(new AbstractC4325q[16]);
                            }
                            if (abstractC4325q != null) {
                                c2104h.b(abstractC4325q);
                                abstractC4325q = null;
                            }
                            c2104h.b(abstractC4325q2);
                        }
                    }
                }
                if (i12 == 1) {
                }
            }
            abstractC4325q = AbstractC0579h.f(c2104h);
        }
        int i13 = c6066m.i();
        int i14 = 0;
        while (true) {
            c6066m2 = this.f1645d;
            bVar = this.f1644c;
            if (i14 >= i13) {
                break;
            }
            long g10 = c6066m.g(i14);
            u uVar = (u) c6066m.j(i14);
            int i15 = bVar.f2483a;
            int i16 = 0;
            while (true) {
                if (i16 < i15) {
                    if (bVar.f2484b[i16] == g10) {
                        List list = uVar.f1680k;
                        List list2 = kf.v.f37483Y;
                        if (list == null) {
                            list = list2;
                        }
                        ArrayList arrayList = new ArrayList(list.size());
                        List list3 = uVar.f1680k;
                        if (list3 != null) {
                            list2 = list3;
                        }
                        int size = list2.size();
                        int i17 = 0;
                        while (i17 < size) {
                            C0187d c0187d = (C0187d) list2.get(i17);
                            long j6 = c0187d.f1628a;
                            int i18 = size;
                            g0 g0Var = this.f1646e;
                            AbstractC3557B.Z(g0Var);
                            arrayList.add(new C0187d(j6, g0Var.B(abstractC0461u, c0187d.f1629b), c0187d.f1630c));
                            i17++;
                            size = i18;
                            list2 = list2;
                            i13 = i13;
                            a5 = a5;
                            c6066m2 = c6066m2;
                        }
                        z13 = a5;
                        i11 = i13;
                        g0 g0Var2 = this.f1646e;
                        AbstractC3557B.Z(g0Var2);
                        long B10 = g0Var2.B(abstractC0461u, uVar.f1676g);
                        g0 g0Var3 = this.f1646e;
                        AbstractC3557B.Z(g0Var3);
                        u uVar2 = new u(uVar.f1670a, uVar.f1671b, g0Var3.B(abstractC0461u, uVar.f1672c), uVar.f1673d, uVar.f1674e, uVar.f1675f, B10, uVar.f1677h, uVar.f1678i, arrayList, uVar.f1679j, uVar.f1681l);
                        uVar2.f1682m = uVar.f1682m;
                        c6066m2.h(g10, uVar2);
                    } else {
                        i16++;
                        a5 = a5;
                    }
                } else {
                    z13 = a5;
                    i11 = i13;
                    break;
                }
            }
            i14++;
            i13 = i11;
            a5 = z13;
        }
        boolean z14 = a5;
        if (c6066m2.i() == 0) {
            bVar.f2483a = 0;
            this.f1651a.f();
            return true;
        }
        for (int i19 = bVar.f2483a - 1; -1 < i19; i19--) {
            if (c6066m.f(bVar.f2484b[i19]) < 0) {
                bVar.b(i19);
            }
        }
        ArrayList arrayList2 = new ArrayList(c6066m2.i());
        int i20 = c6066m2.i();
        for (int i21 = 0; i21 < i20; i21++) {
            arrayList2.add(c6066m2.j(i21));
        }
        C0194k c0194k2 = new C0194k(arrayList2, c0189f);
        int size2 = arrayList2.size();
        int i22 = 0;
        while (true) {
            if (i22 < size2) {
                obj = arrayList2.get(i22);
                if (c0189f.a(((u) obj).f1670a)) {
                    break;
                }
                i22++;
            } else {
                obj = null;
                break;
            }
        }
        u uVar3 = (u) obj;
        if (uVar3 != null) {
            boolean z15 = uVar3.f1673d;
            if (!z10) {
                i10 = false;
                this.f1649h = false;
            } else {
                i10 = false;
                if (!this.f1649h && (z15 || uVar3.f1677h)) {
                    g0 g0Var4 = this.f1646e;
                    AbstractC3557B.Z(g0Var4);
                    boolean D02 = r9.y.D0(uVar3, g0Var4.f4055h0);
                    z11 = true;
                    this.f1649h = !D02;
                    int i23 = 5;
                    if (this.f1649h == this.f1648g && (s.a(c0194k2.f1655d, 3) || s.a(c0194k2.f1655d, 4) || s.a(c0194k2.f1655d, 5))) {
                        if (this.f1649h) {
                            i23 = 4;
                        }
                        c0194k2.f1655d = i23;
                    } else if (!s.a(c0194k2.f1655d, 4) && this.f1648g && !this.f1650i) {
                        c0194k2.f1655d = 3;
                    } else if (s.a(c0194k2.f1655d, 5) && this.f1649h && z15) {
                        c0194k2.f1655d = 3;
                    }
                }
            }
            z11 = true;
            int i232 = 5;
            if (this.f1649h == this.f1648g) {
            }
            if (!s.a(c0194k2.f1655d, 4)) {
            }
            if (s.a(c0194k2.f1655d, 5)) {
                c0194k2.f1655d = 3;
            }
        } else {
            i10 = false;
            z11 = true;
        }
        if (!z14 && s.a(c0194k2.f1655d, 3) && (c0194k = this.f1647f) != null) {
            List list4 = c0194k.f1652a;
            int size3 = list4.size();
            List list5 = c0194k2.f1652a;
            if (size3 == list5.size()) {
                int size4 = list5.size();
                for (int i24 = i10; i24 < size4; i24++) {
                    if (C5251c.b(((u) list4.get(i24)).f1672c, ((u) list5.get(i24)).f1672c)) {
                    }
                }
                z12 = i10;
                this.f1647f = c0194k2;
                return z12;
            }
        }
        z12 = z11;
        this.f1647f = c0194k2;
        return z12;
    }

    @Override // B0.C0193j
    public final void b(C0189f c0189f) {
        super.b(c0189f);
        C0194k c0194k = this.f1647f;
        if (c0194k == null) {
            return;
        }
        this.f1648g = this.f1649h;
        List list = c0194k.f1652a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = (u) list.get(i10);
            if (!uVar.f1673d) {
                long j6 = uVar.f1670a;
                if (!c0189f.a(j6) || !this.f1649h) {
                    C0.b bVar = this.f1644c;
                    int i11 = bVar.f2483a;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            break;
                        } else if (j6 == bVar.f2484b[i12]) {
                            bVar.b(i12);
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        this.f1649h = false;
        this.f1650i = s.a(c0194k.f1655d, 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        AbstractC4325q abstractC4325q;
        C2104h c2104h = this.f1651a;
        int i10 = c2104h.f25569h0;
        if (i10 > 0) {
            Object[] objArr = c2104h.f25567Y;
            int i11 = 0;
            do {
                ((C0192i) objArr[i11]).d();
                i11++;
            } while (i11 < i10);
            abstractC4325q = this.f1643b;
            C2104h c2104h2 = null;
            while (abstractC4325q != null) {
                if (abstractC4325q instanceof t0) {
                    ((t0) abstractC4325q).A();
                } else if ((abstractC4325q.f37722h0 & 16) != 0 && (abstractC4325q instanceof AbstractC0587p)) {
                    int i12 = 0;
                    for (AbstractC4325q abstractC4325q2 = ((AbstractC0587p) abstractC4325q).f5816t0; abstractC4325q2 != null; abstractC4325q2 = abstractC4325q2.f37725k0) {
                        if ((abstractC4325q2.f37722h0 & 16) != 0) {
                            i12++;
                            if (i12 == 1) {
                                abstractC4325q = abstractC4325q2;
                            } else {
                                if (c2104h2 == null) {
                                    c2104h2 = new C2104h(new AbstractC4325q[16]);
                                }
                                if (abstractC4325q != null) {
                                    c2104h2.b(abstractC4325q);
                                    abstractC4325q = null;
                                }
                                c2104h2.b(abstractC4325q2);
                            }
                        }
                    }
                    if (i12 == 1) {
                    }
                }
                abstractC4325q = AbstractC0579h.f(c2104h2);
            }
        }
        abstractC4325q = this.f1643b;
        C2104h c2104h22 = null;
        while (abstractC4325q != null) {
        }
    }

    public final boolean e(C0189f c0189f) {
        Object[] objArr;
        C2104h c2104h;
        int i10;
        C6066m c6066m = this.f1645d;
        boolean z10 = false;
        int i11 = 0;
        z10 = false;
        if (c6066m.i() == 0) {
            objArr = 1;
        } else {
            objArr = null;
        }
        if (objArr == null) {
            AbstractC4325q abstractC4325q = this.f1643b;
            if (abstractC4325q.f37732r0) {
                C0194k c0194k = this.f1647f;
                AbstractC3557B.Z(c0194k);
                g0 g0Var = this.f1646e;
                AbstractC3557B.Z(g0Var);
                long j6 = g0Var.f4055h0;
                AbstractC4325q abstractC4325q2 = abstractC4325q;
                C2104h c2104h2 = null;
                while (abstractC4325q2 != null) {
                    if (abstractC4325q2 instanceof t0) {
                        ((t0) abstractC4325q2).s(c0194k, EnumC0195l.f1658h0, j6);
                    } else if ((abstractC4325q2.f37722h0 & 16) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                        int i12 = 0;
                        for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                            if ((abstractC4325q3.f37722h0 & 16) != 0) {
                                i12++;
                                if (i12 == 1) {
                                    abstractC4325q2 = abstractC4325q3;
                                } else {
                                    if (c2104h2 == null) {
                                        c2104h2 = new C2104h(new AbstractC4325q[16]);
                                    }
                                    if (abstractC4325q2 != null) {
                                        c2104h2.b(abstractC4325q2);
                                        abstractC4325q2 = null;
                                    }
                                    c2104h2.b(abstractC4325q3);
                                }
                            }
                        }
                        if (i12 == 1) {
                        }
                    }
                    abstractC4325q2 = AbstractC0579h.f(c2104h2);
                }
                if (abstractC4325q.f37732r0 && (i10 = (c2104h = this.f1651a).f25569h0) > 0) {
                    Object[] objArr2 = c2104h.f25567Y;
                    do {
                        ((C0192i) objArr2[i11]).e(c0189f);
                        i11++;
                    } while (i11 < i10);
                    z10 = true;
                } else {
                    z10 = true;
                }
            }
        }
        b(c0189f);
        c6066m.b();
        this.f1646e = null;
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(C0189f c0189f, boolean z10) {
        boolean z11;
        C2104h c2104h;
        int i10;
        if (this.f1645d.i() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return false;
        }
        AbstractC4325q abstractC4325q = this.f1643b;
        if (!abstractC4325q.f37732r0) {
            return false;
        }
        C0194k c0194k = this.f1647f;
        AbstractC3557B.Z(c0194k);
        g0 g0Var = this.f1646e;
        AbstractC3557B.Z(g0Var);
        long j6 = g0Var.f4055h0;
        AbstractC4325q abstractC4325q2 = abstractC4325q;
        C2104h c2104h2 = null;
        while (abstractC4325q2 != null) {
            if (abstractC4325q2 instanceof t0) {
                ((t0) abstractC4325q2).s(c0194k, EnumC0195l.f1656Y, j6);
            } else if ((abstractC4325q2.f37722h0 & 16) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                int i11 = 0;
                for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                    if ((abstractC4325q3.f37722h0 & 16) != 0) {
                        i11++;
                        if (i11 == 1) {
                            abstractC4325q2 = abstractC4325q3;
                        } else {
                            if (c2104h2 == null) {
                                c2104h2 = new C2104h(new AbstractC4325q[16]);
                            }
                            if (abstractC4325q2 != null) {
                                c2104h2.b(abstractC4325q2);
                                abstractC4325q2 = null;
                            }
                            c2104h2.b(abstractC4325q3);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            abstractC4325q2 = AbstractC0579h.f(c2104h2);
        }
        if (abstractC4325q.f37732r0 && (i10 = (c2104h = this.f1651a).f25569h0) > 0) {
            Object[] objArr = c2104h.f25567Y;
            int i12 = 0;
            do {
                AbstractC3557B.Z(this.f1646e);
                ((C0192i) objArr[i12]).f(c0189f, z10);
                i12++;
            } while (i12 < i10);
            if (abstractC4325q.f37732r0) {
            }
            return true;
        }
        if (abstractC4325q.f37732r0) {
            C2104h c2104h3 = null;
            while (abstractC4325q != null) {
                if (abstractC4325q instanceof t0) {
                    ((t0) abstractC4325q).s(c0194k, EnumC0195l.f1657Z, j6);
                } else if ((abstractC4325q.f37722h0 & 16) != 0 && (abstractC4325q instanceof AbstractC0587p)) {
                    int i13 = 0;
                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                        if ((abstractC4325q4.f37722h0 & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                abstractC4325q = abstractC4325q4;
                            } else {
                                if (c2104h3 == null) {
                                    c2104h3 = new C2104h(new AbstractC4325q[16]);
                                }
                                if (abstractC4325q != null) {
                                    c2104h3.b(abstractC4325q);
                                    abstractC4325q = null;
                                }
                                c2104h3.b(abstractC4325q4);
                            }
                        }
                    }
                    if (i13 == 1) {
                    }
                }
                abstractC4325q = AbstractC0579h.f(c2104h3);
            }
        }
        return true;
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f1643b + ", children=" + this.f1651a + ", pointerIds=" + this.f1644c + ')';
    }
}
