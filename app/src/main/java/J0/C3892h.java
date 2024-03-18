package j0;

import jf.AbstractC3953c;

/* renamed from: j0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3892h implements AbstractC3890f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35889a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC3953c f35890b;

    public /* synthetic */ C3892h(kotlin.jvm.internal.o oVar, int i10) {
        this.f35889a = i10;
        this.f35890b = oVar;
    }

    private final void b() {
        wf.k kVar = (wf.k) this.f35890b;
        synchronized (p.f35918b) {
            p.f35924h = kf.t.t2(p.f35924h, kVar);
        }
        p.e(o.f35914Z);
    }

    public final void a() {
        switch (this.f35889a) {
            case 0:
                b();
                return;
            default:
                wf.n nVar = (wf.n) this.f35890b;
                synchronized (p.f35918b) {
                    p.f35923g = kf.t.t2(p.f35923g, nVar);
                }
                return;
        }
    }
}
