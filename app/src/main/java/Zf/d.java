package Zf;

import Bg.A;
import Bg.C0213f;
import Bg.D;
import Bg.I;
import Bg.Q;
import Bg.Y;
import Bg.c0;
import Bg.d0;
import Bg.h0;
import Bg.k0;
import Bg.p0;
import Dg.m;
import Jf.l;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.b0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jf.C3959i;
import l8.AbstractC4344b;
import ug.n;
import yf.AbstractC6583a;
import z.C6686a;

/* loaded from: classes.dex */
public final class d extends h0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f23724d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f23725e;

    /* renamed from: b  reason: collision with root package name */
    public final P5.c f23726b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f23727c;

    static {
        k0 k0Var = k0.f2132Z;
        f23724d = A7.b.N1(k0Var, false, true, null, 5).g(b.f23721h0);
        f23725e = A7.b.N1(k0Var, false, true, null, 5).g(b.f23720Z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, P5.c] */
    public d() {
        ?? obj = new Object();
        this.f23726b = obj;
        this.f23727c = new c0(obj);
    }

    @Override // Bg.h0
    public final d0 d(A a5) {
        return new I(h(a5, new a(k0.f2132Z, false, false, null, 62)));
    }

    public final C3959i g(D d10, AbstractC0997f abstractC0997f, a aVar) {
        if (d10.y0().getParameters().isEmpty()) {
            return new C3959i(d10, Boolean.FALSE);
        }
        if (l.y(d10)) {
            d0 d0Var = (d0) d10.w0().get(0);
            p0 b10 = d0Var.b();
            A type = d0Var.getType();
            AbstractC3557B.b0("getType(...)", type);
            return new C3959i(C0213f.m(d10.x0(), d10.y0(), AbstractC4344b.F0(new I(h(type, aVar), b10)), d10.z0()), Boolean.FALSE);
        } else if (Bi.c.g1(d10)) {
            return new C3959i(m.c(Dg.l.f3699s0, d10.y0().toString()), Boolean.FALSE);
        } else {
            n E10 = abstractC0997f.E(this);
            AbstractC3557B.b0("getMemberScope(...)", E10);
            Q x02 = d10.x0();
            Y f6 = abstractC0997f.f();
            AbstractC3557B.b0("getTypeConstructor(...)", f6);
            List<b0> parameters = abstractC0997f.f().getParameters();
            AbstractC3557B.b0("getParameters(...)", parameters);
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(parameters, 10));
            for (b0 b0Var : parameters) {
                AbstractC3557B.Z(b0Var);
                c0 c0Var = this.f23727c;
                A b11 = c0Var.b(b0Var, aVar);
                this.f23726b.getClass();
                arrayList.add(P5.c.t(b0Var, aVar, c0Var, b11));
            }
            return new C3959i(C0213f.o(x02, f6, arrayList, d10.z0(), E10, new C6686a(abstractC0997f, this, d10, aVar, 19)), Boolean.TRUE);
        }
    }

    public final A h(A a5, a aVar) {
        AbstractC1000i k10 = a5.y0().k();
        if (k10 instanceof b0) {
            aVar.getClass();
            a f6 = a.f(aVar, null, true, null, null, 59);
            return h(this.f23727c.b((b0) k10, f6), aVar);
        } else if (k10 instanceof AbstractC0997f) {
            AbstractC1000i k11 = Ad.l.m1(a5).y0().k();
            if (k11 instanceof AbstractC0997f) {
                C3959i g10 = g(Ad.l.Q0(a5), (AbstractC0997f) k10, f23724d);
                D d10 = (D) g10.f36155Y;
                boolean booleanValue = ((Boolean) g10.f36156Z).booleanValue();
                C3959i g11 = g(Ad.l.m1(a5), (AbstractC0997f) k11, f23725e);
                D d11 = (D) g11.f36155Y;
                boolean booleanValue2 = ((Boolean) g11.f36156Z).booleanValue();
                if (!booleanValue && !booleanValue2) {
                    return C0213f.f(d10, d11);
                }
                return new f(d10, d11);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + k11 + "\" while for lower it's \"" + k10 + '\"').toString());
        } else {
            throw new IllegalStateException(("Unexpected declaration kind: " + k10).toString());
        }
    }
}
