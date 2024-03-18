package Pg;

import Ng.AbstractC1073l0;
import Ng.C1071k0;
import java.util.concurrent.CancellationException;
import nf.AbstractC4831k;

/* renamed from: Pg.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1168a extends p implements AbstractC1169b {
    public C1168a(AbstractC4831k abstractC4831k, k kVar, boolean z10) {
        super(abstractC4831k, kVar, false, z10);
        Y((AbstractC1073l0) abstractC4831k.get(C1071k0.f12951Y));
    }

    @Override // Ng.v0
    public final boolean W(Throwable th2) {
        L4.a.A0(this.f12919h0, th2);
        return true;
    }

    @Override // Ng.v0
    public final void i0(Throwable th2) {
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = A7.b.g(getClass().getSimpleName().concat(" was cancelled"), th2);
            }
        }
        this.f14244i0.k(cancellationException);
    }
}
