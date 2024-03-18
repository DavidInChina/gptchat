package Gf;

import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kotlin.jvm.internal.AbstractC4305d;

/* loaded from: classes2.dex */
public class i0 extends p0 implements Df.u {

    /* renamed from: s0  reason: collision with root package name */
    public final AbstractC3957g f6418s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(H h10, Mf.P p10) {
        super(h10, p10);
        AbstractC3557B.c0("container", h10);
        AbstractC3557B.c0("descriptor", p10);
        EnumC3958h enumC3958h = EnumC3958h.f36152Y;
        this.f6418s0 = R4.b.C1(enumC3958h, new h0(this, 0));
        R4.b.C1(enumC3958h, new h0(this, 1));
    }

    @Override // Df.u
    public final Df.t d() {
        return (g0) this.f6418s0.getValue();
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) this.f6418s0.getValue()).call(obj, obj2);
    }

    @Override // Gf.p0
    public final l0 y() {
        return (g0) this.f6418s0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(H h10, String str, String str2) {
        super(h10, str, str2, AbstractC4305d.NO_RECEIVER);
        AbstractC3557B.c0("container", h10);
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("signature", str2);
        EnumC3958h enumC3958h = EnumC3958h.f36152Y;
        this.f6418s0 = R4.b.C1(enumC3958h, new h0(this, 0));
        R4.b.C1(enumC3958h, new h0(this, 1));
    }
}
