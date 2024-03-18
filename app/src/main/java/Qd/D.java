package Qd;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class D implements Li.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14573a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14574b;

    public /* synthetic */ D(int i10, boolean z10) {
        this.f14573a = i10;
        this.f14574b = z10;
    }

    @Override // Li.a
    public final /* bridge */ /* synthetic */ Li.b a(Li.b bVar) {
        switch (this.f14573a) {
            case 0:
                return b((E) bVar);
            default:
                return b((E) bVar);
        }
    }

    public final E b(E e10) {
        switch (this.f14573a) {
            case 0:
                AbstractC3557B.c0("state", e10);
                return new E(e10.f14575a, e10.f14576b, e10.f14577c, e10.f14578d, this.f14574b);
            default:
                AbstractC3557B.c0("state", e10);
                return new E(e10.f14575a, e10.f14576b, this.f14574b, e10.f14578d, e10.f14579e);
        }
    }
}
