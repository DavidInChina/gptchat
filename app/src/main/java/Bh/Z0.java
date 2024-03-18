package Bh;

import Eh.AbstractC0511j;
import wh.AbstractC6250o;

/* loaded from: classes.dex */
public final class Z0 extends a1 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC6250o f2311Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Hh.b f2312Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Fh.B f2313h0;

    /* renamed from: i0  reason: collision with root package name */
    public final xh.e f2314i0;

    public Z0(AbstractC6250o abstractC6250o, Hh.b bVar, Fh.B b10, xh.e eVar) {
        this.f2311Y = abstractC6250o;
        this.f2312Z = bVar;
        this.f2313h0 = b10;
        this.f2314i0 = eVar;
    }

    @Override // Bh.c1
    public final Hh.a b(Nh.l lVar, AbstractC0511j abstractC0511j) {
        return this.f2312Z.a(lVar, abstractC0511j, this.f2311Y);
    }

    @Override // Bh.c1
    public final int c() {
        return 3;
    }

    @Override // Bh.c1
    public final void e(Nh.l lVar, Fh.n nVar) {
        Fh.m mVar = (Fh.m) nVar;
        mVar.getClass();
        this.f2313h0.b(lVar, this.f2311Y, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z0.class != obj.getClass()) {
            return false;
        }
        Z0 z02 = (Z0) obj;
        if (this.f2314i0.equals(z02.f2314i0) && this.f2311Y.equals(z02.f2311Y) && this.f2312Z.equals(z02.f2312Z) && this.f2313h0.equals(z02.f2313h0)) {
            return true;
        }
        return false;
    }

    @Override // Bh.c1
    public final void g(Nh.l lVar, AbstractC0511j abstractC0511j, Fh.n nVar) {
        e(lVar, nVar);
        lVar.i();
        Hh.a b10 = b(lVar, abstractC0511j);
        lVar.y(b10.f7801a, b10.f7802b);
    }

    @Override // Bh.c1
    public final AbstractC6250o getMethod() {
        return this.f2311Y;
    }

    @Override // Bh.c1
    public final xh.e getVisibility() {
        return this.f2314i0;
    }

    public final int hashCode() {
        int hashCode = this.f2311Y.hashCode();
        int hashCode2 = this.f2312Z.hashCode();
        int hashCode3 = this.f2313h0.hashCode();
        return this.f2314i0.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (Z0.class.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // Bh.c1
    public final void d(Nh.l lVar) {
    }
}
