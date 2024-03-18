package A;

import q0.C5254f;

/* renamed from: A.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0024j extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C0026k f221Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0024j(C0026k c0026k) {
        super(1);
        this.f221Y = c0026k;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        long j6 = ((Z0.k) obj).f22804a;
        long z10 = Ng.H.z(j6);
        C0026k c0026k = this.f221Y;
        boolean z11 = !C5254f.a(z10, c0026k.f241p);
        c0026k.f241p = Ng.H.z(j6);
        if (z11) {
            int i10 = (int) (j6 >> 32);
            int i11 = (int) (j6 & 4294967295L);
            c0026k.f228c.setSize(i10, i11);
            c0026k.f229d.setSize(i10, i11);
            c0026k.f230e.setSize(i11, i10);
            c0026k.f231f.setSize(i11, i10);
            c0026k.f233h.setSize(i10, i11);
            c0026k.f234i.setSize(i10, i11);
            c0026k.f235j.setSize(i11, i10);
            c0026k.f236k.setSize(i11, i10);
        }
        if (z11) {
            c0026k.i();
            c0026k.e();
        }
        return jf.y.f36177a;
    }
}
