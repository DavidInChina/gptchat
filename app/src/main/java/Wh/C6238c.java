package wh;

import Qh.AbstractC1239q;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import th.AbstractC5806n;
import th.C5795c;
import th.C5805m;
import th.h0;
import yh.AbstractC6635s;
import yh.C6592a0;
import yh.C6633q0;
import yh.C6641v;
import yh.F1;
import yh.G1;
import yh.l1;
import yh.y1;
import yh.z1;

/* renamed from: wh.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6238c extends AbstractC6240e {

    /* renamed from: i0  reason: collision with root package name */
    public transient /* synthetic */ C5805m f48532i0;

    @Override // sh.AbstractC5637i.b
    public final String D0() {
        return ((Method) this.f48534Z).getName();
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5635g
    public final boolean H0() {
        return ((Method) this.f48534Z).isBridge();
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5636h
    public final boolean M() {
        return ((Method) this.f48534Z).isSynthetic();
    }

    @Override // wh.AbstractC6236a, wh.AbstractC6250o
    public final boolean U() {
        return false;
    }

    @Override // wh.AbstractC6250o
    public final G1 V() {
        boolean z10 = AbstractC6635s.f51074Z;
        AnnotatedElement annotatedElement = this.f48534Z;
        if (z10) {
            return new z1(((Method) annotatedElement).getExceptionTypes());
        }
        return new F1((Method) annotatedElement);
    }

    @Override // wh.AbstractC6236a, wh.AbstractC6250o
    public final boolean W0() {
        return false;
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final l1 mo118a() {
        return C6641v.l1(((Method) this.f48534Z).getDeclaringClass());
    }

    @Override // wh.AbstractC6250o
    public final h0 f() {
        Method method = (Method) this.f48534Z;
        Object defaultValue = method.getDefaultValue();
        if (defaultValue == null) {
            return null;
        }
        return C5795c.i(method.getReturnType(), defaultValue);
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        C5805m c5805m;
        if (this.f48532i0 != null) {
            c5805m = null;
        } else {
            c5805m = new C5805m(((Method) this.f48534Z).getDeclaredAnnotations());
        }
        if (c5805m == null) {
            return this.f48532i0;
        }
        this.f48532i0 = c5805m;
        return c5805m;
    }

    @Override // wh.AbstractC6236a, sh.AbstractC5637i.a
    public final String getDescriptor() {
        return Nh.r.m((Method) this.f48534Z);
    }

    @Override // wh.AbstractC6236a, sh.AbstractC5637i.b
    public final String getName() {
        return ((Method) this.f48534Z).getName();
    }

    @Override // wh.AbstractC6250o
    public final AbstractC6235K getParameters() {
        Method method = (Method) this.f48534Z;
        boolean z10 = AbstractC6232H.f48524Z;
        throw null;
    }

    @Override // wh.AbstractC6250o
    public final l1.a getReturnType() {
        boolean z10 = AbstractC6635s.f51074Z;
        AnnotatedElement annotatedElement = this.f48534Z;
        if (z10) {
            return C6633q0.i1(((Method) annotatedElement).getReturnType());
        }
        return new C6592a0((Method) annotatedElement);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [yh.G1, Qh.q] */
    @Override // sh.AbstractC5641m
    public final G1 r0() {
        if (AbstractC6635s.f51074Z) {
            return new AbstractC1239q(1);
        }
        return new y1(((GenericDeclaration) this.f48534Z).getTypeParameters());
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return ((Method) this.f48534Z).getModifiers();
    }
}
