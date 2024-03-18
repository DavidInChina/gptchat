package Gf;

import Sf.AbstractC1385d;
import fg.C3032C;
import hg.C3430i;
import id.AbstractC3557B;
import java.util.Collection;
import jf.AbstractC3957g;
import jf.C3964n;
import jf.EnumC3958h;
import kg.C4294f;
import lg.C4470o;

/* loaded from: classes2.dex */
public final class W extends H {

    /* renamed from: Z  reason: collision with root package name */
    public final Class f6371Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC3957g f6372h0 = R4.b.C1(EnumC3958h.f36152Y, new Q(this, 1));

    public W(Class cls) {
        AbstractC3557B.c0("jClass", cls);
        this.f6371Z = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof W) {
            if (AbstractC3557B.K(this.f6371Z, ((W) obj).f6371Z)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.jvm.internal.AbstractC4306e
    public final Class f() {
        return this.f6371Z;
    }

    public final int hashCode() {
        return this.f6371Z.hashCode();
    }

    @Override // Gf.H
    public final Collection j() {
        return kf.v.f37483Y;
    }

    @Override // Gf.H
    public final Collection k(C4294f c4294f) {
        U u10 = (U) this.f6372h0.getValue();
        u10.getClass();
        Df.v vVar = U.f6365g[1];
        Object mo122invoke = u10.f6367d.mo122invoke();
        AbstractC3557B.b0("getValue(...)", mo122invoke);
        return ((ug.n) mo122invoke).a(c4294f, Tf.d.f17212Z);
    }

    @Override // Gf.H
    public final Mf.P l(int i10) {
        C3964n c3964n = (C3964n) ((U) this.f6372h0.getValue()).f6369f.getValue();
        if (c3964n == null) {
            return null;
        }
        jg.h hVar = (jg.h) c3964n.f36165Y;
        C3032C c3032c = (C3032C) c3964n.f36166Z;
        jg.g gVar = (jg.g) c3964n.f36167h0;
        C4470o c4470o = ig.k.f33245n;
        AbstractC3557B.b0("packageLocalVariable", c4470o);
        fg.G g10 = (fg.G) A7.b.Q0(c3032c, c4470o, i10);
        if (g10 == null) {
            return null;
        }
        fg.X x10 = c3032c.f30274l0;
        AbstractC3557B.b0("getTypeTable(...)", x10);
        return (Mf.P) A0.f(this.f6371Z, g10, hVar, new C3430i(x10), gVar, V.f6370Y);
    }

    @Override // Gf.H
    public final Class n() {
        Class cls = (Class) ((U) this.f6372h0.getValue()).f6368e.getValue();
        if (cls == null) {
            return this.f6371Z;
        }
        return cls;
    }

    @Override // Gf.H
    public final Collection s(C4294f c4294f) {
        U u10 = (U) this.f6372h0.getValue();
        u10.getClass();
        Df.v vVar = U.f6365g[1];
        Object mo122invoke = u10.f6367d.mo122invoke();
        AbstractC3557B.b0("getValue(...)", mo122invoke);
        return ((ug.n) mo122invoke).f(c4294f, Tf.d.f17212Z);
    }

    public final String toString() {
        return "file class " + AbstractC1385d.a(this.f6371Z).b();
    }
}
