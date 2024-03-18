package Gf;

import Df.AbstractC0408g;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1013w;
import Pf.AbstractC1158p;
import Pf.AbstractC1165x;
import Pf.C1154l;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import java.util.List;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kotlin.jvm.internal.AbstractC4305d;
import ng.AbstractC4838e;
import ng.AbstractC4842i;
import ud.C5902a;

/* loaded from: classes2.dex */
public final class J extends AbstractC0644s implements kotlin.jvm.internal.i, AbstractC0408g, AbstractC0633g {

    /* renamed from: r0  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f6345r0;

    /* renamed from: l0  reason: collision with root package name */
    public final H f6346l0;

    /* renamed from: m0  reason: collision with root package name */
    public final String f6347m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Object f6348n0;

    /* renamed from: o0  reason: collision with root package name */
    public final v0 f6349o0;

    /* renamed from: p0  reason: collision with root package name */
    public final AbstractC3957g f6350p0;

    /* renamed from: q0  reason: collision with root package name */
    public final AbstractC3957g f6351q0;

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f6345r0 = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(J.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public J(H h10, AbstractC1013w abstractC1013w) {
        this(h10, r3, y0.c(abstractC1013w).F(), abstractC1013w, AbstractC4305d.NO_RECEIVER);
        AbstractC3557B.c0("container", h10);
        AbstractC3557B.c0("descriptor", abstractC1013w);
        String b10 = ((AbstractC1158p) abstractC1013w).getName().b();
        AbstractC3557B.b0("asString(...)", b10);
    }

    public static final Hf.x w(J j6, Constructor constructor, AbstractC1013w abstractC1013w, boolean z10) {
        AbstractC0996e abstractC0996e;
        if (!z10) {
            j6.getClass();
            if (abstractC1013w instanceof AbstractC0996e) {
                abstractC0996e = (AbstractC0996e) abstractC1013w;
            } else {
                abstractC0996e = null;
            }
            if (abstractC0996e != null) {
                AbstractC1165x abstractC1165x = (AbstractC1165x) abstractC0996e;
                if (!Mf.r.e(abstractC1165x.getVisibility())) {
                    C1154l c1154l = (C1154l) abstractC0996e;
                    AbstractC0997f x10 = c1154l.x();
                    AbstractC3557B.b0("getConstructedClass(...)", x10);
                    if (!AbstractC4842i.e(x10) && !AbstractC4838e.q(c1154l.x())) {
                        List<Mf.h0> S = abstractC1165x.S();
                        AbstractC3557B.b0("getValueParameters(...)", S);
                        if (!S.isEmpty()) {
                            for (Mf.h0 h0Var : S) {
                                Bg.A type = ((Pf.c0) h0Var).getType();
                                AbstractC3557B.b0("getType(...)", type);
                                if (L4.a.N0(type)) {
                                    if (j6.v()) {
                                        return new Hf.h(constructor, r.f.l(j6.f6348n0, j6.s()), 0);
                                    }
                                    return new Hf.i(constructor, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (j6.v()) {
            return new Hf.h(constructor, r.f.l(j6.f6348n0, j6.s()), 1);
        }
        return new Hf.i(constructor, 1);
    }

    public final boolean equals(Object obj) {
        J b10 = A0.b(obj);
        if (b10 == null || !AbstractC3557B.K(this.f6346l0, b10.f6346l0) || !AbstractC3557B.K(getName(), b10.getName()) || !AbstractC3557B.K(this.f6347m0, b10.f6347m0) || !AbstractC3557B.K(this.f6348n0, b10.f6348n0)) {
            return false;
        }
        return true;
    }

    @Override // Gf.AbstractC0644s
    public final Hf.g g() {
        return (Hf.g) this.f6350p0.getValue();
    }

    @Override // kotlin.jvm.internal.i
    public final int getArity() {
        return AbstractC3557B.h1(g());
    }

    @Override // Df.AbstractC0404c
    public final String getName() {
        String b10 = ((AbstractC1158p) s()).getName().b();
        AbstractC3557B.b0("asString(...)", b10);
        return b10;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return this.f6347m0.hashCode() + ((hashCode + (this.f6346l0.hashCode() * 31)) * 31);
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return call(new Object[0]);
    }

    @Override // Df.AbstractC0408g
    public final boolean isExternal() {
        return s().isExternal();
    }

    @Override // Df.AbstractC0408g
    public final boolean isInfix() {
        return s().isInfix();
    }

    @Override // Df.AbstractC0408g
    public final boolean isInline() {
        return s().isInline();
    }

    @Override // Df.AbstractC0408g
    public final boolean isOperator() {
        return s().isOperator();
    }

    @Override // Df.AbstractC0404c
    public final boolean isSuspend() {
        return s().isSuspend();
    }

    @Override // Gf.AbstractC0644s
    public final H j() {
        return this.f6346l0;
    }

    @Override // wf.r
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // wf.s
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Integer num) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, num);
    }

    @Override // Gf.AbstractC0644s
    public final Hf.g m() {
        return (Hf.g) this.f6351q0.getValue();
    }

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        return call(obj, obj2, obj3, obj4, num);
    }

    public final String toString() {
        mg.m mVar = x0.f6498a;
        return x0.b(s());
    }

    @Override // Gf.AbstractC0644s
    public final boolean v() {
        return !AbstractC3557B.K(this.f6348n0, AbstractC4305d.NO_RECEIVER);
    }

    /* renamed from: x */
    public final AbstractC1013w s() {
        Df.v vVar = f6345r0[0];
        Object mo122invoke = this.f6349o0.mo122invoke();
        AbstractC3557B.b0("getValue(...)", mo122invoke);
        return (AbstractC1013w) mo122invoke;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    public J(H h10, String str, String str2, AbstractC1013w abstractC1013w, Object obj) {
        this.f6346l0 = h10;
        this.f6347m0 = str2;
        this.f6348n0 = obj;
        this.f6349o0 = new v0(abstractC1013w, new C5902a(this, 9, str));
        EnumC3958h enumC3958h = EnumC3958h.f36152Y;
        this.f6350p0 = R4.b.C1(enumC3958h, new I(this, 0));
        this.f6351q0 = R4.b.C1(enumC3958h, new I(this, 1));
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }
}
