package Mf;

import Gf.C0631e;
import id.AbstractC3557B;
import java.util.List;
import kg.C4294f;

/* renamed from: Mf.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0995d implements b0 {

    /* renamed from: Y  reason: collision with root package name */
    public final b0 f12079Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC1003l f12080Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f12081h0;

    public C0995d(b0 b0Var, AbstractC1003l abstractC1003l, int i10) {
        AbstractC3557B.c0("declarationDescriptor", abstractC1003l);
        this.f12079Y = b0Var;
        this.f12080Z = abstractC1003l;
        this.f12081h0 = i10;
    }

    @Override // Mf.b0
    public final boolean A() {
        return this.f12079Y.A();
    }

    @Override // Mf.b0
    public final Bg.p0 J() {
        return this.f12079Y.J();
    }

    @Override // Mf.b0
    public final Ag.u X() {
        return this.f12079Y.X();
    }

    @Override // Mf.b0
    public final boolean b0() {
        return true;
    }

    @Override // Mf.b0, Mf.AbstractC1000i
    public final Bg.Y f() {
        return this.f12079Y.f();
    }

    @Override // Mf.AbstractC1004m
    public final V g() {
        return this.f12079Y.g();
    }

    @Override // Nf.a
    public final Nf.i getAnnotations() {
        return this.f12079Y.getAnnotations();
    }

    @Override // Mf.b0
    public final int getIndex() {
        return this.f12079Y.getIndex() + this.f12081h0;
    }

    @Override // Mf.AbstractC1003l
    public final C4294f getName() {
        return this.f12079Y.getName();
    }

    @Override // Mf.b0
    public final List getUpperBounds() {
        return this.f12079Y.getUpperBounds();
    }

    @Override // Mf.AbstractC1003l
    /* renamed from: k */
    public final AbstractC1003l mo20k() {
        return this.f12080Z;
    }

    @Override // Mf.AbstractC1000i
    public final Bg.D n() {
        return this.f12079Y.n();
    }

    public final String toString() {
        return this.f12079Y + "[inner-copy]";
    }

    @Override // Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        return this.f12079Y.u0(c0631e, obj);
    }

    @Override // Mf.b0, Mf.AbstractC1000i, Mf.AbstractC1003l
    /* renamed from: a */
    public final b0 mo24a() {
        return this.f12079Y.mo24a();
    }
}
