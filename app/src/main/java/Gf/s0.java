package Gf;

import Df.AbstractC0405d;
import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import zg.AbstractC6864k;
import zg.AbstractC6865l;

/* loaded from: classes.dex */
public final class s0 implements Df.x, C {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f6470i0;

    /* renamed from: Y  reason: collision with root package name */
    public final Mf.b0 f6471Y;

    /* renamed from: Z  reason: collision with root package name */
    public final v0 f6472Z = AbstractC4344b.C0(new zc.u(24, this));

    /* renamed from: h0  reason: collision with root package name */
    public final t0 f6473h0;

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f6470i0 = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(s0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public s0(t0 t0Var, Mf.b0 b0Var) {
        Object obj;
        B b10;
        AbstractC6865l abstractC6865l;
        dg.r rVar;
        Object obj2;
        Class cls;
        AbstractC3557B.c0("descriptor", b0Var);
        this.f6471Y = b0Var;
        if (t0Var == null) {
            AbstractC1003l mo20k = b0Var.mo20k();
            AbstractC3557B.b0("getContainingDeclaration(...)", mo20k);
            if (mo20k instanceof AbstractC0997f) {
                obj = b((AbstractC0997f) mo20k);
            } else if (mo20k instanceof AbstractC0994c) {
                AbstractC1003l mo20k2 = ((AbstractC0994c) mo20k).mo20k();
                AbstractC3557B.b0("getContainingDeclaration(...)", mo20k2);
                if (mo20k2 instanceof AbstractC0997f) {
                    b10 = b((AbstractC0997f) mo20k2);
                } else {
                    Rf.c cVar = null;
                    if (mo20k instanceof AbstractC6865l) {
                        abstractC6865l = (AbstractC6865l) mo20k;
                    } else {
                        abstractC6865l = null;
                    }
                    if (abstractC6865l != null) {
                        AbstractC6864k U10 = abstractC6865l.U();
                        if (U10 instanceof dg.r) {
                            rVar = (dg.r) U10;
                        } else {
                            rVar = null;
                        }
                        if (rVar != null) {
                            obj2 = rVar.f28359d;
                        } else {
                            obj2 = null;
                        }
                        cVar = obj2 instanceof Rf.c ? (Rf.c) obj2 : cVar;
                        if (cVar != null && (cls = cVar.f15499a) != null) {
                            b10 = (B) R4.b.n1(cls);
                        } else {
                            throw new Lc.l("Container of deserialized member is not resolved: " + abstractC6865l, 3);
                        }
                    } else {
                        throw new Lc.l("Non-class callable descriptor must be deserialized: " + mo20k, 3);
                    }
                }
                obj = mo20k.u0(new C0631e(b10), jf.y.f36177a);
            } else {
                throw new Lc.l("Unknown type parameter container: " + mo20k, 3);
            }
            AbstractC3557B.Z(obj);
            t0Var = (t0) obj;
        }
        this.f6473h0 = t0Var;
    }

    public static B b(AbstractC0997f abstractC0997f) {
        AbstractC0405d abstractC0405d;
        Class k10 = A0.k(abstractC0997f);
        if (k10 != null) {
            abstractC0405d = R4.b.n1(k10);
        } else {
            abstractC0405d = null;
        }
        B b10 = (B) abstractC0405d;
        if (b10 != null) {
            return b10;
        }
        throw new Lc.l("Type parameter container is not resolved: " + abstractC0997f.mo20k(), 3);
    }

    public final String a() {
        String b10 = this.f6471Y.getName().b();
        AbstractC3557B.b0("asString(...)", b10);
        return b10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (AbstractC3557B.K(this.f6473h0, s0Var.f6473h0) && AbstractC3557B.K(a(), s0Var.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // Gf.C
    public final AbstractC1000i getDescriptor() {
        return this.f6471Y;
    }

    public final int hashCode() {
        return a().hashCode() + (this.f6473h0.hashCode() * 31);
    }

    public final String toString() {
        Df.A a5;
        StringBuilder sb2 = new StringBuilder();
        int ordinal = this.f6471Y.J().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    a5 = Df.A.f3620h0;
                } else {
                    throw new RuntimeException();
                }
            } else {
                a5 = Df.A.f3619Z;
            }
        } else {
            a5 = Df.A.f3618Y;
        }
        int ordinal2 = a5.ordinal();
        if (ordinal2 != 1) {
            if (ordinal2 == 2) {
                sb2.append("out ");
            }
        } else {
            sb2.append("in ");
        }
        sb2.append(a());
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }
}
