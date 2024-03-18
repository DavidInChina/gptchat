package Pf;

import Bg.j0;
import Mf.AbstractC0994c;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1001j;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.C1008q;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import kg.AbstractC4296h;
import kg.C4294f;

/* loaded from: classes2.dex */
public final class Y extends AbstractC1165x implements V {

    /* renamed from: M0  reason: collision with root package name */
    public static final W f14067M0 = new Object();

    /* renamed from: J0  reason: collision with root package name */
    public final Ag.u f14068J0;

    /* renamed from: K0  reason: collision with root package name */
    public final Mf.a0 f14069K0;

    /* renamed from: L0  reason: collision with root package name */
    public AbstractC0996e f14070L0;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Pf.W] */
    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        d10.g(new kotlin.jvm.internal.u(d10.b(Y.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
    }

    public Y(Ag.u uVar, Mf.a0 a0Var, AbstractC0996e abstractC0996e, V v10, Nf.i iVar, int i10, Mf.V v11) {
        super(i10, a0Var, v10, v11, iVar, AbstractC4296h.f37515e);
        this.f14068J0 = uVar;
        this.f14069K0 = a0Var;
        this.f14183x0 = false;
        ((Ag.q) uVar).d(new X(this, abstractC0996e));
        this.f14070L0 = abstractC0996e;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC0994c
    public final AbstractC0994c D(AbstractC1003l abstractC1003l, Mf.A a5, C1008q c1008q) {
        AbstractC3557B.c0("newOwner", abstractC1003l);
        AbstractC3557B.c0("visibility", c1008q);
        AbstractC2469q0.q("kind", 2);
        C1164w C02 = C0(j0.f2127b);
        C02.b(abstractC1003l);
        C02.o(a5);
        C02.d(c1008q);
        C02.e(2);
        C02.f14148m = false;
        AbstractC1165x z02 = C02.f14159x.z0(C02);
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor", z02);
        return (V) z02;
    }

    /* renamed from: H0 */
    public final V p0() {
        AbstractC1013w mo24a = super.mo24a();
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor", mo24a);
        return (V) mo24a;
    }

    /* renamed from: I0 */
    public final Y c(j0 j0Var) {
        AbstractC3557B.c0("substitutor", j0Var);
        AbstractC1013w c10 = super.c(j0Var);
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl", c10);
        Y y10 = (Y) c10;
        Bg.A a5 = y10.f14171l0;
        AbstractC3557B.Z(a5);
        AbstractC0996e c11 = ((C1154l) ((C1154l) this.f14070L0).p0()).c(j0.d(a5));
        if (c11 == null) {
            return null;
        }
        y10.f14070L0 = c11;
        return y10;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC0993b
    public final Bg.A getReturnType() {
        Bg.A a5 = this.f14171l0;
        AbstractC3557B.Z(a5);
        return a5;
    }

    @Override // Pf.AbstractC1159q, Mf.AbstractC1003l
    /* renamed from: k */
    public final AbstractC1001j mo20k() {
        return this.f14069K0;
    }

    @Override // Mf.AbstractC1002k
    public final boolean v() {
        return ((C1154l) this.f14070L0).f14108J0;
    }

    @Override // Mf.AbstractC1002k
    public final AbstractC0997f x() {
        AbstractC0997f x10 = ((C1154l) this.f14070L0).x();
        AbstractC3557B.b0("getConstructedClass(...)", x10);
        return x10;
    }

    @Override // Pf.AbstractC1165x
    public final AbstractC1165x y0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, Mf.V v10, Nf.i iVar, C4294f c4294f) {
        AbstractC3557B.c0("newOwner", abstractC1003l);
        AbstractC2469q0.q("kind", i10);
        AbstractC3557B.c0("annotations", iVar);
        if (i10 != 1) {
        }
        return new Y(this.f14068J0, this.f14069K0, this.f14070L0, this, iVar, 1, v10);
    }

    @Override // Pf.AbstractC1159q, Mf.AbstractC1003l
    /* renamed from: k  reason: collision with other method in class */
    public final AbstractC1003l mo20k() {
        return this.f14069K0;
    }
}
