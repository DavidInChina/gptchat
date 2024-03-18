package Gf;

import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* loaded from: classes2.dex */
public class c0 extends p0 implements Df.q {

    /* renamed from: s0  reason: collision with root package name */
    public final AbstractC3957g f6403s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(H h10, Mf.P p10) {
        super(h10, p10);
        AbstractC3557B.c0("container", h10);
        AbstractC3557B.c0("descriptor", p10);
        EnumC3958h enumC3958h = EnumC3958h.f36152Y;
        this.f6403s0 = R4.b.C1(enumC3958h, new C0628b0(this, 0));
        R4.b.C1(enumC3958h, new C0628b0(this, 1));
    }

    @Override // Df.q
    public final Object get() {
        return ((C0626a0) this.f6403s0.getValue()).call(new Object[0]);
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return get();
    }

    @Override // Gf.p0
    public final l0 y() {
        return (C0626a0) this.f6403s0.getValue();
    }

    public final Df.p z() {
        return (C0626a0) this.f6403s0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(H h10, String str, String str2, Object obj) {
        super(h10, str, str2, obj);
        AbstractC3557B.c0("container", h10);
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("signature", str2);
        EnumC3958h enumC3958h = EnumC3958h.f36152Y;
        this.f6403s0 = R4.b.C1(enumC3958h, new C0628b0(this, 0));
        R4.b.C1(enumC3958h, new C0628b0(this, 1));
    }
}
