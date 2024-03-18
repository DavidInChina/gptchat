package B;

import Ng.AbstractC1070k;
import b0.C2104h;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final C2104h f1120a = new C2104h(new O[16]);

    public final void a(CancellationException cancellationException) {
        C2104h c2104h = this.f1120a;
        int i10 = c2104h.f25569h0;
        AbstractC1070k[] abstractC1070kArr = new AbstractC1070k[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            abstractC1070kArr[i11] = ((O) c2104h.f25567Y[i11]).f1143b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            abstractC1070kArr[i12].s(cancellationException);
        }
        if (c2104h.k()) {
            return;
        }
        throw new IllegalStateException("uncancelled requests present".toString());
    }

    public final void b() {
        C2104h c2104h = this.f1120a;
        int i10 = 0;
        int i11 = new Cf.e(0, c2104h.f25569h0 - 1, 1).f3107Z;
        if (i11 >= 0) {
            while (true) {
                ((O) c2104h.f25567Y[i10]).f1143b.resumeWith(jf.y.f36177a);
                if (i10 == i11) {
                    break;
                }
                i10++;
            }
        }
        c2104h.f();
    }
}
