package wh;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import th.AbstractC5806n;
import th.C5805m;
import th.h0;
import yh.B1;
import yh.C6633q0;
import yh.C6641v;
import yh.G1;
import yh.l1;
import yh.y1;

/* renamed from: wh.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6237b extends AbstractC6240e {

    /* renamed from: i0  reason: collision with root package name */
    public transient /* synthetic */ C5805m f48531i0;

    @Override // sh.AbstractC5637i.b
    public final String D0() {
        return "<init>";
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5636h
    public final boolean M() {
        return ((Constructor) this.f48534Z).isSynthetic();
    }

    @Override // wh.AbstractC6236a, wh.AbstractC6250o
    public final boolean U() {
        return false;
    }

    @Override // wh.AbstractC6250o
    public final G1 V() {
        return new B1((Constructor) this.f48534Z);
    }

    @Override // wh.AbstractC6236a, wh.AbstractC6250o
    public final boolean W0() {
        return true;
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final l1 mo118a() {
        return C6641v.l1(((Constructor) this.f48534Z).getDeclaringClass());
    }

    @Override // wh.AbstractC6250o
    public final h0 f() {
        return null;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        C5805m c5805m;
        if (this.f48531i0 != null) {
            c5805m = null;
        } else {
            c5805m = new C5805m(((Constructor) this.f48534Z).getDeclaredAnnotations());
        }
        if (c5805m == null) {
            return this.f48531i0;
        }
        this.f48531i0 = c5805m;
        return c5805m;
    }

    @Override // wh.AbstractC6236a, sh.AbstractC5637i.a
    public final String getDescriptor() {
        return Nh.r.g((Constructor) this.f48534Z);
    }

    @Override // wh.AbstractC6236a, sh.AbstractC5637i.b
    public final String getName() {
        return ((Constructor) this.f48534Z).getName();
    }

    @Override // wh.AbstractC6250o
    public final AbstractC6235K getParameters() {
        Constructor constructor = (Constructor) this.f48534Z;
        boolean z10 = AbstractC6232H.f48524Z;
        throw null;
    }

    @Override // wh.AbstractC6250o
    public final l1.a getReturnType() {
        return C6633q0.i1(Void.TYPE);
    }

    @Override // sh.AbstractC5641m
    public final G1 r0() {
        return new y1(((GenericDeclaration) this.f48534Z).getTypeParameters());
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return ((Constructor) this.f48534Z).getModifiers();
    }
}
