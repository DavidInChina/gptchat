package Bg;

import id.AbstractC3557B;

/* renamed from: Bg.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0226t extends h0 {

    /* renamed from: b  reason: collision with root package name */
    public final h0 f2156b;

    /* renamed from: c  reason: collision with root package name */
    public final h0 f2157c;

    public C0226t(h0 h0Var, h0 h0Var2) {
        this.f2156b = h0Var;
        this.f2157c = h0Var2;
    }

    @Override // Bg.h0
    public final boolean a() {
        if (!this.f2156b.a() && !this.f2157c.a()) {
            return false;
        }
        return true;
    }

    @Override // Bg.h0
    public final boolean b() {
        if (!this.f2156b.b() && !this.f2157c.b()) {
            return false;
        }
        return true;
    }

    @Override // Bg.h0
    public final Nf.i c(Nf.i iVar) {
        AbstractC3557B.c0("annotations", iVar);
        return this.f2157c.c(this.f2156b.c(iVar));
    }

    @Override // Bg.h0
    public final d0 d(A a5) {
        d0 d10 = this.f2156b.d(a5);
        if (d10 == null) {
            return this.f2157c.d(a5);
        }
        return d10;
    }

    @Override // Bg.h0
    public final A f(A a5, p0 p0Var) {
        AbstractC3557B.c0("topLevelType", a5);
        AbstractC3557B.c0("position", p0Var);
        return this.f2157c.f(this.f2156b.f(a5, p0Var), p0Var);
    }
}
