package Dg;

import Gf.C0631e;
import Mf.AbstractC1003l;
import Mf.B;
import Mf.M;
import Q1.u;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import jf.C3963m;
import kf.v;
import kg.C4291c;
import kg.C4294f;

/* loaded from: classes.dex */
public final class f implements B {

    /* renamed from: Y  reason: collision with root package name */
    public static final f f3654Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final C4294f f3655Z = C4294f.g("<Error module>");

    /* renamed from: h0  reason: collision with root package name */
    public static final v f3656h0 = v.f37483Y;

    /* renamed from: i0  reason: collision with root package name */
    public static final C3963m f3657i0 = R4.b.D1(e.f3653Y);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Dg.f] */
    static {
        b[] bVarArr = b.f3651Y;
    }

    @Override // Mf.B
    public final List f0() {
        return f3656h0;
    }

    @Override // Nf.a
    public final Nf.i getAnnotations() {
        return Nf.h.f12822a;
    }

    @Override // Mf.AbstractC1003l
    public final C4294f getName() {
        return f3655Z;
    }

    @Override // Mf.B
    public final Jf.l j() {
        return (Jf.l) f3657i0.getValue();
    }

    @Override // Mf.AbstractC1003l
    /* renamed from: k */
    public final AbstractC1003l mo20k() {
        return null;
    }

    @Override // Mf.B
    public final Collection l(C4291c c4291c, wf.k kVar) {
        AbstractC3557B.c0("fqName", c4291c);
        AbstractC3557B.c0("nameFilter", kVar);
        return v.f37483Y;
    }

    @Override // Mf.B
    public final M r(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        throw new IllegalStateException("Should not be called!");
    }

    @Override // Mf.B
    public final Object s0(u uVar) {
        AbstractC3557B.c0("capability", uVar);
        return null;
    }

    @Override // Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        return null;
    }

    @Override // Mf.B
    public final boolean w(B b10) {
        AbstractC3557B.c0("targetModule", b10);
        return false;
    }

    @Override // Mf.AbstractC1003l
    /* renamed from: a */
    public final AbstractC1003l mo24a() {
        return this;
    }
}
