package Bg;

import id.AbstractC3557B;
import java.util.List;

/* renamed from: Bg.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0227u extends o0 implements Eg.e {

    /* renamed from: Z  reason: collision with root package name */
    public final D f2158Z;

    /* renamed from: h0  reason: collision with root package name */
    public final D f2159h0;

    public AbstractC0227u(D d10, D d11) {
        AbstractC3557B.c0("lowerBound", d10);
        AbstractC3557B.c0("upperBound", d11);
        this.f2158Z = d10;
        this.f2159h0 = d11;
    }

    public abstract D F0();

    public abstract String G0(mg.m mVar, mg.o oVar);

    @Override // Bg.A
    public ug.n R() {
        return F0().R();
    }

    public String toString() {
        return mg.m.f39298e.Y(this);
    }

    @Override // Bg.A
    public final List w0() {
        return F0().w0();
    }

    @Override // Bg.A
    public final Q x0() {
        return F0().x0();
    }

    @Override // Bg.A
    public final Y y0() {
        return F0().y0();
    }

    @Override // Bg.A
    public final boolean z0() {
        return F0().z0();
    }
}
