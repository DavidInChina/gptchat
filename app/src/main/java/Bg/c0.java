package Bg;

import B0.C0186c;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jf.C3963m;
import lf.C4442g;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final P5.c f2106a;

    /* renamed from: b  reason: collision with root package name */
    public final C0186c f2107b;

    /* renamed from: c  reason: collision with root package name */
    public final C3963m f2108c = R4.b.D1(new Uf.A(16, this));

    /* renamed from: d  reason: collision with root package name */
    public final Ag.n f2109d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, B0.c] */
    public c0(P5.c cVar) {
        ?? obj = new Object();
        obj.f1626a = false;
        obj.f1627b = false;
        AbstractC3557B.c0("projectionComputer", cVar);
        this.f2106a = cVar;
        this.f2107b = obj;
        Ag.q qVar = new Ag.q("Type parameter upper bound erasure results");
        this.f2109d = qVar.b(new Xf.f(13, this));
    }

    public final o0 a(AbstractC0210c abstractC0210c) {
        o0 z12;
        D d10 = ((Zf.a) abstractC0210c).f23718f;
        if (d10 == null || (z12 = Bi.c.z1(d10)) == null) {
            return (Dg.j) this.f2108c.getValue();
        }
        return z12;
    }

    public final A b(Mf.b0 b0Var, AbstractC0210c abstractC0210c) {
        AbstractC3557B.c0("typeParameter", b0Var);
        AbstractC3557B.c0("typeAttr", abstractC0210c);
        return (A) this.f2109d.invoke(new b0(b0Var, abstractC0210c));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x026c A[LOOP:0: B:3:0x000f->B:106:0x026c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0276 A[EDGE_INSN: B:111:0x0276->B:108:0x0276 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4442g c(j0 j0Var, List list, AbstractC0210c abstractC0210c) {
        Iterator it;
        C0186c c0186c;
        AbstractC0210c abstractC0210c2;
        c0 c0Var;
        D d10;
        boolean z10;
        A type;
        boolean z11;
        A type2;
        boolean z12;
        A type3;
        c0 c0Var2 = this;
        AbstractC0210c abstractC0210c3 = abstractC0210c;
        C4442g c4442g = new C4442g();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            A a5 = (A) it2.next();
            AbstractC1000i k10 = a5.y0().k();
            boolean z13 = k10 instanceof AbstractC0997f;
            C0186c c0186c2 = c0Var2.f2107b;
            if (z13) {
                Set set = ((Zf.a) abstractC0210c3).f23717e;
                boolean z14 = c0186c2.f1626a;
                o0 B02 = a5.B0();
                boolean z15 = B02 instanceof AbstractC0227u;
                Fg.b bVar = Fg.b.f5371Y;
                if (z15) {
                    AbstractC0227u abstractC0227u = (AbstractC0227u) B02;
                    D d11 = abstractC0227u.f2158Z;
                    if (d11.y0().getParameters().isEmpty() || d11.y0().k() == null) {
                        it = it2;
                        c0186c = c0186c2;
                    } else {
                        List parameters = d11.y0().getParameters();
                        AbstractC3557B.b0("getParameters(...)", parameters);
                        it = it2;
                        c0186c = c0186c2;
                        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(parameters, 10));
                        Iterator it3 = parameters.iterator();
                        while (it3.hasNext()) {
                            Mf.b0 b0Var = (Mf.b0) it3.next();
                            Iterator it4 = it3;
                            d0 d0Var = (d0) kf.t.i2(b0Var.getIndex(), a5.w0());
                            if (!z14 || d0Var == null || (type3 = d0Var.getType()) == null || m0.d(type3, bVar, null)) {
                                if (set != null && set.contains(b0Var)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (d0Var != null && !z12) {
                                    h0 g10 = j0Var.g();
                                    A type4 = d0Var.getType();
                                    AbstractC3557B.b0("getType(...)", type4);
                                    if (g10.d(type4) != null) {
                                    }
                                }
                                d0Var = new I(b0Var);
                            }
                            arrayList.add(d0Var);
                            it3 = it4;
                        }
                        d11 = K4.J.U(d11, arrayList, null, 2);
                    }
                    D d12 = abstractC0227u.f2159h0;
                    if (!d12.y0().getParameters().isEmpty() && d12.y0().k() != null) {
                        List<Mf.b0> parameters2 = d12.y0().getParameters();
                        AbstractC3557B.b0("getParameters(...)", parameters2);
                        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(parameters2, 10));
                        for (Mf.b0 b0Var2 : parameters2) {
                            d0 d0Var2 = (d0) kf.t.i2(b0Var2.getIndex(), a5.w0());
                            if (!z14 || d0Var2 == null || (type2 = d0Var2.getType()) == null || m0.d(type2, bVar, null)) {
                                if (set != null && set.contains(b0Var2)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (d0Var2 != null && !z11) {
                                    h0 g11 = j0Var.g();
                                    A type5 = d0Var2.getType();
                                    AbstractC3557B.b0("getType(...)", type5);
                                    if (g11.d(type5) != null) {
                                    }
                                }
                                d0Var2 = new I(b0Var2);
                            }
                            arrayList2.add(d0Var2);
                        }
                        d12 = K4.J.U(d12, arrayList2, null, 2);
                    }
                    d10 = C0213f.f(d11, d12);
                } else {
                    it = it2;
                    c0186c = c0186c2;
                    if (B02 instanceof D) {
                        D d13 = (D) B02;
                        boolean isEmpty = d13.y0().getParameters().isEmpty();
                        d10 = d13;
                        if (!isEmpty) {
                            AbstractC1000i k11 = d13.y0().k();
                            d10 = d13;
                            if (k11 != null) {
                                List<Mf.b0> parameters3 = d13.y0().getParameters();
                                AbstractC3557B.b0("getParameters(...)", parameters3);
                                ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(parameters3, 10));
                                for (Mf.b0 b0Var3 : parameters3) {
                                    d0 d0Var3 = (d0) kf.t.i2(b0Var3.getIndex(), a5.w0());
                                    if (!z14 || d0Var3 == null || (type = d0Var3.getType()) == null || m0.d(type, bVar, null)) {
                                        if (set != null && set.contains(b0Var3)) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (d0Var3 != null && !z10) {
                                            h0 g12 = j0Var.g();
                                            A type6 = d0Var3.getType();
                                            AbstractC3557B.b0("getType(...)", type6);
                                            if (g12.d(type6) != null) {
                                            }
                                        }
                                        d0Var3 = new I(b0Var3);
                                    }
                                    arrayList3.add(d0Var3);
                                }
                                d10 = K4.J.U(d13, arrayList3, null, 2);
                            }
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
                c4442g.add(j0Var.h(L4.a.B0(d10, B02), p0.f2148j0));
            } else {
                it = it2;
                c0186c = c0186c2;
                if (k10 instanceof Mf.b0) {
                    abstractC0210c2 = abstractC0210c;
                    Set set2 = ((Zf.a) abstractC0210c2).f23717e;
                    if (set2 != null && set2.contains(k10)) {
                        c0Var = this;
                        c4442g.add(c0Var.a(abstractC0210c2));
                    } else {
                        c0Var = this;
                        List upperBounds = ((Mf.b0) k10).getUpperBounds();
                        AbstractC3557B.b0("getUpperBounds(...)", upperBounds);
                        c4442g.addAll(c0Var.c(j0Var, upperBounds, abstractC0210c2));
                    }
                    if (c0186c.f1627b) {
                        break;
                    }
                    it2 = it;
                    c0 c0Var3 = c0Var;
                    abstractC0210c3 = abstractC0210c2;
                    c0Var2 = c0Var3;
                }
            }
            c0Var = this;
            abstractC0210c2 = abstractC0210c;
            if (c0186c.f1627b) {
            }
        }
        return R4.b.K(c4442g);
    }
}
