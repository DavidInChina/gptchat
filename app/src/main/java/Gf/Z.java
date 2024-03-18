package Gf;

import Mf.AbstractC0994c;
import Mf.AbstractC1013w;
import Pf.AbstractC1158p;
import id.AbstractC3557B;
import java.lang.reflect.Type;
import kg.C4294f;
import l8.AbstractC4344b;
import rg.AbstractC5493d;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class Z implements Df.o {

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f6377j0;

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC0644s f6378Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f6379Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Df.n f6380h0;

    /* renamed from: i0  reason: collision with root package name */
    public final v0 f6381i0;

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f6377j0 = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(Z.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), d10.g(new kotlin.jvm.internal.u(d10.b(Z.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public Z(AbstractC0644s abstractC0644s, int i10, Df.n nVar, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("callable", abstractC0644s);
        this.f6378Y = abstractC0644s;
        this.f6379Z = i10;
        this.f6380h0 = nVar;
        this.f6381i0 = AbstractC4344b.C0(abstractC6216a);
        AbstractC4344b.C0(new Y(this, 0));
    }

    public static final Type f(Z z10, Type... typeArr) {
        z10.getClass();
        int length = typeArr.length;
        if (length != 0) {
            if (length != 1) {
                return new X(typeArr);
            }
            return (Type) kf.q.v3(typeArr);
        }
        throw new Lc.l("Expected at least 1 type for compound type", 2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Z) {
            Z z10 = (Z) obj;
            if (AbstractC3557B.K(this.f6378Y, z10.f6378Y)) {
                if (this.f6379Z == z10.f6379Z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Mf.N g() {
        Df.v vVar = f6377j0[0];
        Object mo122invoke = this.f6381i0.mo122invoke();
        AbstractC3557B.b0("getValue(...)", mo122invoke);
        return (Mf.N) mo122invoke;
    }

    public final String getName() {
        Mf.i0 i0Var;
        Mf.N g10 = g();
        if (g10 instanceof Mf.h0) {
            i0Var = (Mf.h0) g10;
        } else {
            i0Var = null;
        }
        if (i0Var == null || ((Pf.b0) i0Var).mo20k().B()) {
            return null;
        }
        C4294f name = ((AbstractC1158p) i0Var).getName();
        AbstractC3557B.b0("getName(...)", name);
        if (name.f37508Z) {
            return null;
        }
        return name.b();
    }

    public final r0 h() {
        Bg.A type = g().getType();
        AbstractC3557B.b0("getType(...)", type);
        return new r0(type, new Y(this, 1));
    }

    public final int hashCode() {
        return (this.f6378Y.hashCode() * 31) + this.f6379Z;
    }

    public final boolean j() {
        Mf.h0 h0Var;
        Mf.N g10 = g();
        if (g10 instanceof Mf.h0) {
            h0Var = (Mf.h0) g10;
        } else {
            h0Var = null;
        }
        if (h0Var != null) {
            return AbstractC5493d.a(h0Var);
        }
        return false;
    }

    public final boolean k() {
        Mf.N g10 = g();
        if ((g10 instanceof Mf.h0) && ((Pf.b0) ((Mf.h0) g10)).f14085o0 != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        mg.m mVar = x0.f6498a;
        StringBuilder sb2 = new StringBuilder();
        int ordinal = this.f6380h0.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    sb2.append("parameter #" + this.f6379Z + ' ' + getName());
                }
            } else {
                sb2.append("extension receiver parameter");
            }
        } else {
            sb2.append("instance parameter");
        }
        sb2.append(" of ");
        AbstractC0994c s10 = this.f6378Y.s();
        if (s10 instanceof Mf.P) {
            str = x0.c((Mf.P) s10);
        } else if (s10 instanceof AbstractC1013w) {
            str = x0.b((AbstractC1013w) s10);
        } else {
            throw new IllegalStateException(("Illegal callable: " + s10).toString());
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }
}
