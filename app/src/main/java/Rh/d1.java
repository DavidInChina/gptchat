package Rh;

import K4.C0813a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import th.AbstractC5806n;
import wh.AbstractC6242g;
import wh.AbstractC6256u;
import wh.C6253r;
import yh.AbstractC6597c;
import yh.AbstractC6624m;
import yh.AbstractC6635s;
import yh.C6620k;
import yh.G1;
import yh.H1;
import yh.l1;

/* loaded from: classes.dex */
public final class d1 extends yh.r {

    /* renamed from: A0  reason: collision with root package name */
    public final List f15809A0;

    /* renamed from: B0  reason: collision with root package name */
    public final List f15810B0;

    /* renamed from: C0  reason: collision with root package name */
    public final List f15811C0;

    /* renamed from: D0  reason: collision with root package name */
    public final List f15812D0;

    /* renamed from: E0  reason: collision with root package name */
    public final ArrayList f15813E0;

    /* renamed from: i0  reason: collision with root package name */
    public final p1 f15814i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f15815j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f15816k0;

    /* renamed from: l0  reason: collision with root package name */
    public final String f15817l0;

    /* renamed from: m0  reason: collision with root package name */
    public final String f15818m0;

    /* renamed from: n0  reason: collision with root package name */
    public final String f15819n0;

    /* renamed from: o0  reason: collision with root package name */
    public final AbstractC1325s0 f15820o0;

    /* renamed from: p0  reason: collision with root package name */
    public final List f15821p0;

    /* renamed from: q0  reason: collision with root package name */
    public final c1 f15822q0;

    /* renamed from: r0  reason: collision with root package name */
    public final String f15823r0;

    /* renamed from: s0  reason: collision with root package name */
    public final List f15824s0;

    /* renamed from: t0  reason: collision with root package name */
    public final boolean f15825t0;

    /* renamed from: u0  reason: collision with root package name */
    public final String f15826u0;

    /* renamed from: v0  reason: collision with root package name */
    public final ArrayList f15827v0;

    /* renamed from: w0  reason: collision with root package name */
    public final Map f15828w0;

    /* renamed from: x0  reason: collision with root package name */
    public final Map f15829x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Map f15830y0;

    /* renamed from: z0  reason: collision with root package name */
    public final Map f15831z0;

    public d1(p1 p1Var, int i10, int i11, String str, String str2, String[] strArr, String str3, c1 c1Var, String str4, ArrayList arrayList, boolean z10, String str5, ArrayList arrayList2, Map map, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ph.f fVar) {
        this.f15814i0 = p1Var;
        this.f15815j0 = i10 & (-33);
        this.f15816k0 = (-131105) & i11;
        this.f15817l0 = Nh.r.o(str).f();
        String str6 = null;
        this.f15818m0 = str2 == null ? null : Nh.r.o(str2).h();
        this.f15819n0 = str3;
        AbstractC1325s0 abstractC1325s0 = EnumC1333w0.f15959Y;
        if (!AbstractC6635s.f51074Z && str3 != null) {
            try {
                C1338z c1338z = new C1338z();
                new C0813a(str3, 10, 0).b(c1338z);
                abstractC1325s0 = (AbstractC1325s0) c1338z.s();
            } catch (RuntimeException unused) {
                abstractC1325s0 = EnumC1327t0.f15945Y;
            }
        }
        this.f15820o0 = abstractC1325s0;
        if (strArr == null) {
            this.f15821p0 = Collections.emptyList();
        } else {
            this.f15821p0 = new ArrayList(strArr.length);
            for (String str7 : strArr) {
                this.f15821p0.add(Nh.r.o(str7).h());
            }
        }
        this.f15822q0 = c1Var;
        this.f15823r0 = str4 == null ? null : str4.replace('/', '.');
        this.f15824s0 = arrayList;
        this.f15825t0 = z10;
        this.f15826u0 = str5 != null ? Nh.r.o(str5).f() : str6;
        this.f15827v0 = new ArrayList(arrayList2.size());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f15827v0.add(Nh.r.o((String) it.next()).f());
        }
        this.f15828w0 = map;
        this.f15829x0 = hashMap;
        this.f15830y0 = hashMap2;
        this.f15831z0 = hashMap3;
        this.f15809A0 = arrayList3;
        this.f15810B0 = arrayList4;
        this.f15811C0 = arrayList5;
        this.f15812D0 = arrayList6;
        this.f15813E0 = new ArrayList(arrayList7.size());
        Iterator it2 = arrayList7.iterator();
        while (it2.hasNext()) {
            this.f15813E0.add(Nh.r.o((String) it2.next()).h());
        }
    }

    @Override // yh.l1
    public final AbstractC6624m A() {
        return new C6620k(this);
    }

    @Override // yh.l1
    public final H1 F() {
        return new Q0(this.f15814i0, this.f15824s0);
    }

    @Override // yh.l1
    public final boolean K() {
        return this.f15825t0;
    }

    @Override // yh.AbstractC6632q
    public final l1.a L() {
        String str = this.f15818m0;
        if (str != null && !h1(512)) {
            return this.f15820o0.a(str, this.f15828w0, this, this.f15814i0);
        }
        l1.a aVar = l1.a.f51045N;
        return null;
    }

    @Override // yh.AbstractC6635s, sh.AbstractC5637i.a
    public final String N0() {
        return this.f15819n0;
    }

    @Override // yh.l1
    public final vh.l U0() {
        return new vh.j(this);
    }

    @Override // yh.l1
    public final yh.l1 W() {
        return this.f15822q0.o(this.f15814i0);
    }

    @Override // yh.AbstractC6632q
    public final boolean Y() {
        if ((this.f15815j0 & 65536) != 0 && Sh.G.RECORD.f16697Y.getDescriptor().equals(this.f15818m0)) {
            return true;
        }
        return false;
    }

    @Override // yh.AbstractC6635s, yh.l1, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final yh.l1 mo118a() {
        String str = this.f15823r0;
        if (str == null) {
            return null;
        }
        return this.f15814i0.a(str).a();
    }

    @Override // yh.l1
    public final H1 b1() {
        return new Q0(this.f15814i0, this.f15813E0);
    }

    @Override // yh.l1
    public final H1 d0() {
        p1 p1Var = this.f15814i0;
        String str = this.f15826u0;
        if (str == null) {
            return new N0(this.f15827v0, this, p1Var);
        }
        return p1Var.a(str).a().d0();
    }

    @Override // yh.AbstractC6635s, yh.l1
    public final int d1(boolean z10) {
        int i10 = this.f15815j0;
        if (z10) {
            return i10 | 32;
        }
        return i10;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.h(this.f15814i0, this.f15809A0);
    }

    @Override // sh.AbstractC5637i.b
    public final String getName() {
        return this.f15817l0;
    }

    @Override // yh.l1, yh.AbstractC6632q
    public final AbstractC6256u i() {
        return new C6253r(this);
    }

    @Override // yh.l1
    public final boolean m() {
        if (!this.f15825t0 && this.f15822q0.m()) {
            return true;
        }
        return false;
    }

    @Override // yh.AbstractC6632q
    public final G1 o0() {
        return this.f15820o0.e(this.f15821p0, this.f15814i0, this.f15829x0, this);
    }

    @Override // sh.AbstractC5641m
    public final G1 r0() {
        return this.f15820o0.f(this.f15814i0, this, this.f15830y0, this.f15831z0);
    }

    @Override // yh.l1
    public final AbstractC6242g s0() {
        return this.f15822q0.p(this.f15814i0);
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return this.f15816k0;
    }

    @Override // yh.l1
    public final yh.l1 v() {
        String str = this.f15826u0;
        if (str == null) {
            return this;
        }
        return this.f15814i0.a(str).a();
    }

    @Override // yh.AbstractC6635s, yh.l1
    public final boolean x0() {
        return !this.f15813E0.isEmpty();
    }

    @Override // yh.l1
    public final AbstractC6597c z() {
        String str;
        String str2 = this.f15817l0;
        int lastIndexOf = str2.lastIndexOf(46);
        if (lastIndexOf == -1) {
            str = "";
        } else {
            str = str2.substring(0, lastIndexOf);
        }
        return new O0(this.f15814i0, str);
    }
}
