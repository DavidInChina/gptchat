package Ng;

import java.util.concurrent.CancellationException;
import nf.AbstractC4821a;
import nf.AbstractC4825e;

/* loaded from: classes.dex */
public final class z0 extends AbstractC4821a implements AbstractC1073l0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final z0 f13000Y = new AbstractC4821a(C1071k0.f12951Y);

    @Override // Ng.AbstractC1073l0
    public final AbstractC1078o A0(v0 v0Var) {
        return A0.f12861Y;
    }

    @Override // Ng.AbstractC1073l0
    public final Object F(AbstractC4825e abstractC4825e) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // Ng.AbstractC1073l0
    public final CancellationException P() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // Ng.AbstractC1073l0
    public final T V(wf.k kVar) {
        return A0.f12861Y;
    }

    @Override // Ng.AbstractC1073l0
    public final boolean a() {
        return true;
    }

    @Override // Ng.AbstractC1073l0
    public final AbstractC1073l0 getParent() {
        return null;
    }

    @Override // Ng.AbstractC1073l0
    public final boolean j() {
        return false;
    }

    @Override // Ng.AbstractC1073l0
    public final boolean m() {
        return false;
    }

    @Override // Ng.AbstractC1073l0
    public final T m0(boolean z10, boolean z11, wf.k kVar) {
        return A0.f12861Y;
    }

    @Override // Ng.AbstractC1073l0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // Ng.AbstractC1073l0
    public final void k(CancellationException cancellationException) {
    }
}
