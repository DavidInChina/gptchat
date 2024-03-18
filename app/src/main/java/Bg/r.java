package Bg;

import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class r extends D {
    public abstract D H0();

    /* renamed from: I0 */
    public D D0(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        D H02 = H0();
        AbstractC3557B.c0("type", H02);
        return J0(H02);
    }

    public abstract r J0(D d10);

    @Override // Bg.A
    public final ug.n R() {
        return H0().R();
    }

    @Override // Bg.A
    public final List w0() {
        return H0().w0();
    }

    @Override // Bg.A
    public Q x0() {
        return H0().x0();
    }

    @Override // Bg.A
    public final Y y0() {
        return H0().y0();
    }

    @Override // Bg.A
    public boolean z0() {
        return H0().z0();
    }
}
