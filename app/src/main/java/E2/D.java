package E2;

import p2.C5065s;

/* loaded from: classes.dex */
public final class D implements H2.s {

    /* renamed from: a  reason: collision with root package name */
    public final H2.s f4128a;

    /* renamed from: b  reason: collision with root package name */
    public final p2.h0 f4129b;

    public D(H2.s sVar, p2.h0 h0Var) {
        this.f4128a = sVar;
        this.f4129b = h0Var;
    }

    @Override // H2.s
    public final p2.h0 a() {
        return this.f4129b;
    }

    @Override // H2.s
    public final void b(boolean z10) {
        this.f4128a.b(z10);
    }

    @Override // H2.s
    public final C5065s c(int i10) {
        return this.f4128a.c(i10);
    }

    @Override // H2.s
    public final void d() {
        this.f4128a.d();
    }

    @Override // H2.s
    public final int e(int i10) {
        return this.f4128a.e(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (this.f4128a.equals(d10.f4128a) && this.f4129b.equals(d10.f4129b)) {
            return true;
        }
        return false;
    }

    @Override // H2.s
    public final void f() {
        this.f4128a.f();
    }

    @Override // H2.s
    public final C5065s g() {
        return this.f4128a.g();
    }

    @Override // H2.s
    public final void h(float f6) {
        this.f4128a.h(f6);
    }

    public final int hashCode() {
        return this.f4128a.hashCode() + ((this.f4129b.hashCode() + 527) * 31);
    }

    @Override // H2.s
    public final void i() {
        this.f4128a.i();
    }

    @Override // H2.s
    public final void j() {
        this.f4128a.j();
    }

    @Override // H2.s
    public final int k(int i10) {
        return this.f4128a.k(i10);
    }

    @Override // H2.s
    public final int length() {
        return this.f4128a.length();
    }
}
