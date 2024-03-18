package S2;

import L2.B;
import L2.G;
import L2.s;

/* loaded from: classes2.dex */
public final class f implements s {

    /* renamed from: Y  reason: collision with root package name */
    public final long f16106Y;

    /* renamed from: Z  reason: collision with root package name */
    public final s f16107Z;

    public f(long j6, s sVar) {
        this.f16106Y = j6;
        this.f16107Z = sVar;
    }

    @Override // L2.s
    public final void b(B b10) {
        this.f16107Z.b(new e(this, b10, b10));
    }

    @Override // L2.s
    public final void d() {
        this.f16107Z.d();
    }

    @Override // L2.s
    public final G f(int i10, int i11) {
        return this.f16107Z.f(i10, i11);
    }
}
