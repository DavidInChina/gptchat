package Gf;

import Df.AbstractC0406e;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Sf.AbstractC1385d;
import id.AbstractC3557B;
import java.lang.reflect.Array;
import java.util.List;
import l8.AbstractC4344b;
import ud.C5902a;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class r0 implements kotlin.jvm.internal.n {

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f6459j0;

    /* renamed from: Y  reason: collision with root package name */
    public final Bg.A f6460Y;

    /* renamed from: Z  reason: collision with root package name */
    public final v0 f6461Z;

    /* renamed from: h0  reason: collision with root package name */
    public final v0 f6462h0;

    /* renamed from: i0  reason: collision with root package name */
    public final v0 f6463i0;

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f6459j0 = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(r0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), d10.g(new kotlin.jvm.internal.u(d10.b(r0.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public r0(Bg.A a5, AbstractC6216a abstractC6216a) {
        v0 v0Var;
        AbstractC3557B.c0("type", a5);
        this.f6460Y = a5;
        v0 v0Var2 = null;
        if (abstractC6216a instanceof v0) {
            v0Var = (v0) abstractC6216a;
        } else {
            v0Var = null;
        }
        if (v0Var == null) {
            if (abstractC6216a != null) {
                v0Var2 = AbstractC4344b.C0(abstractC6216a);
            }
        } else {
            v0Var2 = v0Var;
        }
        this.f6461Z = v0Var2;
        this.f6462h0 = AbstractC4344b.C0(new q0(this, 1));
        this.f6463i0 = AbstractC4344b.C0(new C5902a(this, 10, abstractC6216a));
    }

    @Override // Df.w
    public final boolean a() {
        return this.f6460Y.z0();
    }

    @Override // Df.w
    public final List c() {
        Df.v vVar = f6459j0[1];
        Object mo122invoke = this.f6463i0.mo122invoke();
        AbstractC3557B.b0("getValue(...)", mo122invoke);
        return (List) mo122invoke;
    }

    @Override // Df.w
    public final AbstractC0406e e() {
        Df.v vVar = f6459j0[0];
        return (AbstractC0406e) this.f6462h0.mo122invoke();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            if (AbstractC3557B.K(this.f6460Y, r0Var.f6460Y) && AbstractC3557B.K(e(), r0Var.e()) && AbstractC3557B.K(c(), r0Var.c())) {
                return true;
            }
        }
        return false;
    }

    public final AbstractC0406e f(Bg.A a5) {
        Bg.A type;
        AbstractC1000i k10 = a5.y0().k();
        if (k10 instanceof AbstractC0997f) {
            Class k11 = A0.k((AbstractC0997f) k10);
            if (k11 == null) {
                return null;
            }
            if (k11.isArray()) {
                Bg.d0 d0Var = (Bg.d0) kf.t.D2(a5.w0());
                if (d0Var != null && (type = d0Var.getType()) != null) {
                    AbstractC0406e f6 = f(type);
                    if (f6 != null) {
                        return new B(Array.newInstance(R4.b.k1(com.google.android.gms.internal.play_billing.N.Y(f6)), 0).getClass());
                    }
                    throw new Lc.l("Cannot determine classifier for array element type: " + this, 3);
                }
                return new B(k11);
            } else if (!Bg.m0.f(a5)) {
                Class cls = (Class) AbstractC1385d.f16604b.get(k11);
                if (cls != null) {
                    k11 = cls;
                }
                return new B(k11);
            } else {
                return new B(k11);
            }
        } else if (k10 instanceof Mf.b0) {
            return new s0(null, (Mf.b0) k10);
        } else {
            if (!(k10 instanceof Mf.a0)) {
                return null;
            }
            throw new Lc.l("An operation is not implemented: Type alias classifiers are not yet supported", 1);
        }
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f6460Y.hashCode() * 31;
        AbstractC0406e e10 = e();
        if (e10 != null) {
            i10 = e10.hashCode();
        } else {
            i10 = 0;
        }
        return c().hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        mg.m mVar = x0.f6498a;
        return x0.d(this.f6460Y);
    }
}
