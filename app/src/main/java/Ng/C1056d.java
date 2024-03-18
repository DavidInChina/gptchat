package Ng;

import id.AbstractC3557B;

/* renamed from: Ng.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1056d extends AbstractC1068j {

    /* renamed from: Y  reason: collision with root package name */
    public final C1054c[] f12932Y;

    public C1056d(C1054c[] c1054cArr) {
        this.f12932Y = c1054cArr;
    }

    @Override // Ng.AbstractC1068j
    public final void a(Throwable th2) {
        e();
    }

    public final void e() {
        for (C1054c c1054c : this.f12932Y) {
            T t10 = c1054c.f12930k0;
            if (t10 != null) {
                t10.dispose();
            } else {
                AbstractC3557B.C2("handle");
                throw null;
            }
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        e();
        return jf.y.f36177a;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f12932Y + ']';
    }
}
