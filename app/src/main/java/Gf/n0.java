package Gf;

import Df.AbstractC0409h;
import Mf.AbstractC0994c;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public abstract class n0 extends j0 implements AbstractC0409h {

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f6434n0;

    /* renamed from: l0  reason: collision with root package name */
    public final v0 f6435l0 = AbstractC4344b.C0(new m0(this, 1));

    /* renamed from: m0  reason: collision with root package name */
    public final AbstractC3957g f6436m0 = R4.b.C1(EnumC3958h.f36152Y, new m0(this, 0));

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f6434n0 = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(n0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof n0) && AbstractC3557B.K(x(), ((n0) obj).x())) {
            return true;
        }
        return false;
    }

    @Override // Gf.AbstractC0644s
    public final Hf.g g() {
        return (Hf.g) this.f6436m0.getValue();
    }

    @Override // Df.AbstractC0404c
    public final String getName() {
        return android.gov.nist.core.a.n(new StringBuilder("<set-"), x().f6449m0, '>');
    }

    public final int hashCode() {
        return x().hashCode();
    }

    @Override // Gf.AbstractC0644s
    public final AbstractC0994c s() {
        Df.v vVar = f6434n0[0];
        Object mo122invoke = this.f6435l0.mo122invoke();
        AbstractC3557B.b0("getValue(...)", mo122invoke);
        return (Mf.S) mo122invoke;
    }

    public final String toString() {
        return "setter of " + x();
    }

    @Override // Gf.j0
    public final Mf.O w() {
        Df.v vVar = f6434n0[0];
        Object mo122invoke = this.f6435l0.mo122invoke();
        AbstractC3557B.b0("getValue(...)", mo122invoke);
        return (Mf.S) mo122invoke;
    }
}
