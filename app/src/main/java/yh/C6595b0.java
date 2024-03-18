package yh;

import yh.l1;

/* renamed from: yh.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6595b0 extends AbstractC6613h0 {

    /* renamed from: Z  reason: collision with root package name */
    public final Class f50992Z;

    /* renamed from: h0  reason: collision with root package name */
    public transient /* synthetic */ AbstractC6643w f50993h0;

    public C6595b0(Class cls) {
        this.f50992Z = cls;
    }

    @Override // yh.AbstractC6621k0
    public final l1.a i1() {
        AbstractC6643w abstractC6643w;
        if (this.f50993h0 != null) {
            abstractC6643w = null;
        } else {
            abstractC6643w = EnumC6628o.a(this.f50992Z.getGenericSuperclass(), j1());
        }
        if (abstractC6643w == null) {
            return this.f50993h0;
        }
        this.f50993h0 = abstractC6643w;
        return abstractC6643w;
    }

    @Override // yh.AbstractC6613h0
    public final Y j1() {
        return new F(this.f50992Z);
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return C6641v.l1(this.f50992Z.getSuperclass());
    }
}
