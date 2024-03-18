package e2;

/* renamed from: e2.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2781m implements X1.h {

    /* renamed from: a  reason: collision with root package name */
    public X1.m f28780a = X1.k.f21752b;

    @Override // X1.h
    public final X1.h a() {
        C2781m c2781m = new C2781m();
        c2781m.f28780a = this.f28780a;
        return c2781m;
    }

    @Override // X1.h
    public final void b(X1.m mVar) {
        this.f28780a = mVar;
    }

    @Override // X1.h
    public final X1.m c() {
        return this.f28780a;
    }

    public final String toString() {
        return "EmittableSpacer(modifier=" + this.f28780a + ')';
    }
}
