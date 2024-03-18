package j$.util.stream;

import j$.util.C3727k;

/* loaded from: classes3.dex */
final class L extends M {

    /* renamed from: c  reason: collision with root package name */
    static final H f35462c;

    /* renamed from: d  reason: collision with root package name */
    static final H f35463d;

    static {
        EnumC3764f3 enumC3764f3 = EnumC3764f3.REFERENCE;
        f35462c = new H(true, enumC3764f3, C3727k.a(), new N0(26), new C3740b(14));
        f35463d = new H(false, enumC3764f3, C3727k.a(), new N0(26), new C3740b(14));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f35470a) {
            return C3727k.d(this.f35471b);
        }
        return null;
    }
}
