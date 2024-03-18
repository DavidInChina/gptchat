package j0;

import Z.h1;

/* renamed from: j0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3889e extends AbstractC3893i {

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC3893i f35885f;

    /* renamed from: g  reason: collision with root package name */
    public final wf.k f35886g;

    public C3889e(int i10, n nVar, wf.k kVar, AbstractC3893i abstractC3893i) {
        super(i10, nVar);
        this.f35885f = abstractC3893i;
        abstractC3893i.k();
        if (kVar != null) {
            wf.k f6 = abstractC3893i.f();
            if (f6 != null) {
                kVar = new C3885a(kVar, f6, 1);
            }
        } else {
            kVar = abstractC3893i.f();
        }
        this.f35886g = kVar;
    }

    @Override // j0.AbstractC3893i
    public final void c() {
        if (!this.f35894c) {
            int i10 = this.f35893b;
            AbstractC3893i abstractC3893i = this.f35885f;
            if (i10 != abstractC3893i.d()) {
                a();
            }
            abstractC3893i.l();
            this.f35894c = true;
            synchronized (p.f35918b) {
                int i11 = this.f35895d;
                if (i11 >= 0) {
                    p.t(i11);
                    this.f35895d = -1;
                }
            }
        }
    }

    @Override // j0.AbstractC3893i
    public final wf.k f() {
        return this.f35886g;
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
        y.a();
        throw null;
    }

    @Override // j0.AbstractC3893i
    public final void l() {
        y.a();
        throw null;
    }

    @Override // j0.AbstractC3893i
    public final void n(AbstractC3882G abstractC3882G) {
        h1 h1Var = p.f35917a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // j0.AbstractC3893i
    public final AbstractC3893i t(wf.k kVar) {
        return new C3889e(this.f35893b, this.f35892a, kVar, this.f35885f);
    }

    @Override // j0.AbstractC3893i
    public final void m() {
    }
}
