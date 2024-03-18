package Gf;

import Df.AbstractC0409h;
import Df.AbstractC0410i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* loaded from: classes2.dex */
public final class L extends c0 implements Df.j {

    /* renamed from: t0  reason: collision with root package name */
    public final AbstractC3957g f6353t0 = R4.b.C1(EnumC3958h.f36152Y, new zc.u(21, this));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(H h10, Mf.P p10) {
        super(h10, p10);
        AbstractC3557B.c0("container", h10);
        AbstractC3557B.c0("descriptor", p10);
    }

    @Override // Df.j, Df.m
    /* renamed from: b */
    public final AbstractC0409h mo11b() {
        return (K) this.f6353t0.getValue();
    }

    @Override // Df.j, Df.m
    /* renamed from: b  reason: collision with other method in class */
    public final AbstractC0410i mo11b() {
        return (K) this.f6353t0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(H h10, String str, String str2, Object obj) {
        super(h10, str, str2, obj);
        AbstractC3557B.c0("container", h10);
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("signature", str2);
    }
}
