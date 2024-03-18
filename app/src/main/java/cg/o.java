package Cg;

import Bg.A;
import Bg.C0213f;
import id.AbstractC3557B;
import ng.C4846m;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: c  reason: collision with root package name */
    public final i f3143c;

    /* renamed from: d  reason: collision with root package name */
    public final g f3144d;

    /* renamed from: e  reason: collision with root package name */
    public final C4846m f3145e = new C4846m(C4846m.f40357e);

    public o() {
        h hVar = h.f3127a;
        e eVar = e.f3126a;
        this.f3143c = hVar;
        this.f3144d = eVar;
    }

    public final boolean a(A a5, A a10) {
        AbstractC3557B.c0("a", a5);
        AbstractC3557B.c0("b", a10);
        return C0213f.e(AbstractC3557B.q0(false, false, null, this.f3144d, this.f3143c, 6), a5.B0(), a10.B0());
    }

    public final boolean b(A a5, A a10) {
        AbstractC3557B.c0("subtype", a5);
        AbstractC3557B.c0("supertype", a10);
        return C0213f.j(C0213f.f2118a, AbstractC3557B.q0(true, false, null, this.f3144d, this.f3143c, 6), a5.B0(), a10.B0());
    }
}
