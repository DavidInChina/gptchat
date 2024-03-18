package M3;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public final q f11512a;

    /* renamed from: b  reason: collision with root package name */
    public final X3.b f11513b;

    public D(q qVar, X3.b bVar) {
        AbstractC3557B.c0("processor", qVar);
        AbstractC3557B.c0("workTaskExecutor", bVar);
        this.f11512a = qVar;
        this.f11513b = bVar;
    }

    public final void a(w wVar, int i10) {
        AbstractC3557B.c0("workSpecId", wVar);
        this.f11513b.a(new V3.o(this.f11512a, wVar, false, i10));
    }
}
