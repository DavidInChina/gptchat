package Rh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import th.AbstractC5806n;
import wh.AbstractC6235K;
import wh.AbstractC6241f;
import wh.C6230F;
import yh.AbstractC6632q;
import yh.G1;
import yh.l1;

/* loaded from: classes2.dex */
public final class M0 extends AbstractC6241f {

    /* renamed from: Z  reason: collision with root package name */
    public final String f15655Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f15656h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f15657i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String f15658j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC1318o0 f15659k0;

    /* renamed from: l0  reason: collision with root package name */
    public final ArrayList f15660l0;

    /* renamed from: m0  reason: collision with root package name */
    public final List f15661m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Map f15662n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Map f15663o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Map f15664p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Map f15665q0;

    /* renamed from: r0  reason: collision with root package name */
    public final Map f15666r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Map f15667s0;

    /* renamed from: t0  reason: collision with root package name */
    public final List f15668t0;

    /* renamed from: u0  reason: collision with root package name */
    public final Map f15669u0;

    /* renamed from: v0  reason: collision with root package name */
    public final String[] f15670v0;

    /* renamed from: w0  reason: collision with root package name */
    public final Integer[] f15671w0;

    /* renamed from: x0  reason: collision with root package name */
    public final th.h0 f15672x0;

    /* renamed from: y0  reason: collision with root package name */
    public final /* synthetic */ d1 f15673y0;

    public M0(d1 d1Var, String str, int i10, String str2, String str3, AbstractC1318o0 abstractC1318o0, String[] strArr, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, List list, Map map7, List list2, th.h0 h0Var) {
        this.f15673y0 = d1Var;
        this.f15656h0 = i10;
        this.f15655Z = str;
        Nh.r n10 = Nh.r.n(str2);
        String h10 = n10.h();
        Nh.r v10 = Nh.r.v(Nh.r.q(h10), h10.length(), h10);
        Nh.r[] d10 = Nh.r.d(n10.h());
        this.f15657i0 = v10.h();
        this.f15660l0 = new ArrayList(d10.length);
        int i11 = 0;
        for (Nh.r rVar : d10) {
            this.f15660l0.add(rVar.h());
        }
        this.f15658j0 = str3;
        this.f15659k0 = abstractC1318o0;
        if (strArr == null) {
            this.f15661m0 = Collections.emptyList();
        } else {
            this.f15661m0 = new ArrayList(strArr.length);
            for (String str4 : strArr) {
                this.f15661m0.add(Nh.r.o(str4).h());
            }
        }
        this.f15662n0 = map;
        this.f15663o0 = map2;
        this.f15664p0 = map3;
        this.f15665q0 = map4;
        this.f15666r0 = map5;
        this.f15667s0 = map6;
        this.f15668t0 = list;
        this.f15669u0 = map7;
        this.f15670v0 = new String[d10.length];
        this.f15671w0 = new Integer[d10.length];
        if (list2.size() == d10.length) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                R0 r02 = (R0) it.next();
                this.f15670v0[i11] = r02.f15701a;
                this.f15671w0[i11] = r02.f15702b;
                i11++;
            }
        }
        this.f15672x0 = h0Var;
    }

    @Override // sh.AbstractC5637i.b
    public final String D0() {
        return this.f15655Z;
    }

    @Override // wh.AbstractC6236a, sh.AbstractC5637i.a
    public final String N0() {
        return this.f15658j0;
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o
    public final l1.a T() {
        if (h1(8)) {
            l1.a aVar = l1.a.f51045N;
            return null;
        }
        boolean W02 = W0();
        d1 d1Var = this.f15673y0;
        if (W02) {
            yh.l1 W6 = d1Var.W();
            if (W6 == null) {
                if (d1Var.V0()) {
                    return new L0(this, d1Var);
                }
                return new H0(this, d1Var);
            } else if (!d1Var.h1(8) && d1Var.V0()) {
                return new L0(this, W6);
            } else {
                return new H0(this, W6);
            }
        } else if (d1Var.V0()) {
            return new L0(this, d1Var);
        } else {
            return new H0(this, d1Var);
        }
    }

    @Override // wh.AbstractC6250o
    public final G1 V() {
        return this.f15659k0.h(this.f15661m0, this.f15673y0.f15814i0, this.f15666r0, this);
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC6632q mo118a() {
        return this.f15673y0;
    }

    @Override // wh.AbstractC6250o
    public final th.h0 f() {
        return this.f15672x0;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.h(this.f15673y0.f15814i0, this.f15668t0);
    }

    @Override // wh.AbstractC6250o
    public final AbstractC6235K getParameters() {
        return new C6230F(this, 0);
    }

    @Override // wh.AbstractC6250o
    public final l1.a getReturnType() {
        return this.f15659k0.b(this.f15657i0, this.f15673y0.f15814i0, this.f15664p0, this);
    }

    @Override // sh.AbstractC5641m
    public final G1 r0() {
        return this.f15659k0.f(this.f15673y0.f15814i0, this, this.f15662n0, this.f15663o0);
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return this.f15656h0;
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final yh.l1 mo118a() {
        return this.f15673y0;
    }
}
