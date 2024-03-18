package Gf;

import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* loaded from: classes2.dex */
public class f0 extends p0 implements Df.s {

    /* renamed from: s0  reason: collision with root package name */
    public final AbstractC3957g f6412s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(H h10, Mf.P p10) {
        super(h10, p10);
        AbstractC3557B.c0("container", h10);
        AbstractC3557B.c0("descriptor", p10);
        EnumC3958h enumC3958h = EnumC3958h.f36152Y;
        this.f6412s0 = R4.b.C1(enumC3958h, new e0(this, 0));
        R4.b.C1(enumC3958h, new e0(this, 1));
    }

    @Override // Df.s
    public final Df.r d() {
        return (d0) this.f6412s0.getValue();
    }

    @Override // Df.s
    public final Object get(Object obj) {
        return ((d0) this.f6412s0.getValue()).call(obj);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // Gf.p0
    public final l0 y() {
        return (d0) this.f6412s0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(H h10, String str, String str2, Object obj) {
        super(h10, str, str2, obj);
        AbstractC3557B.c0("container", h10);
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("signature", str2);
        EnumC3958h enumC3958h = EnumC3958h.f36152Y;
        this.f6412s0 = R4.b.C1(enumC3958h, new e0(this, 0));
        R4.b.C1(enumC3958h, new e0(this, 1));
    }
}
