package j0;

import Z.h1;

/* renamed from: j0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3891g extends AbstractC3893i {

    /* renamed from: f  reason: collision with root package name */
    public final wf.k f35887f;

    /* renamed from: g  reason: collision with root package name */
    public int f35888g = 1;

    public C3891g(int i10, n nVar, wf.k kVar) {
        super(i10, nVar);
        this.f35887f = kVar;
    }

    @Override // j0.AbstractC3893i
    public final void c() {
        if (!this.f35894c) {
            l();
            this.f35894c = true;
            synchronized (p.f35918b) {
                int i10 = this.f35895d;
                if (i10 >= 0) {
                    p.t(i10);
                    this.f35895d = -1;
                }
            }
        }
    }

    @Override // j0.AbstractC3893i
    public final wf.k f() {
        return this.f35887f;
    }

    @Override // j0.AbstractC3893i
    public final boolean g() {
        return true;
    }

    @Override // j0.AbstractC3893i
    public final wf.k i() {
        return null;
    }

    @Override // j0.AbstractC3893i
    public final void k() {
        this.f35888g++;
    }

    @Override // j0.AbstractC3893i
    public final void l() {
        int i10 = this.f35888g - 1;
        this.f35888g = i10;
        if (i10 == 0) {
            a();
        }
    }

    @Override // j0.AbstractC3893i
    public final void n(AbstractC3882G abstractC3882G) {
        h1 h1Var = p.f35917a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // j0.AbstractC3893i
    public final AbstractC3893i t(wf.k kVar) {
        p.c(this);
        return new C3889e(this.f35893b, this.f35892a, kVar, this);
    }

    @Override // j0.AbstractC3893i
    public final void m() {
    }
}
