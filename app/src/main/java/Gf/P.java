package Gf;

import Df.AbstractC0409h;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* loaded from: classes2.dex */
public final class P extends i0 implements Df.m {

    /* renamed from: t0  reason: collision with root package name */
    public final AbstractC3957g f6357t0 = R4.b.C1(EnumC3958h.f36152Y, new zc.u(23, this));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(H h10, Mf.P p10) {
        super(h10, p10);
        AbstractC3557B.c0("container", h10);
        AbstractC3557B.c0("descriptor", p10);
    }

    @Override // Df.m
    /* renamed from: b */
    public final AbstractC0409h mo11b() {
        return (O) this.f6357t0.getValue();
    }
}
