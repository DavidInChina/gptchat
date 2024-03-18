package S2;

import L2.A;
import L2.B;
import L2.C;
import L2.w;

/* loaded from: classes2.dex */
public final class e extends w {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B f16104b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f16105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, B b10, B b11) {
        super(b10);
        this.f16105c = fVar;
        this.f16104b = b11;
    }

    @Override // L2.w, L2.B
    public final A i(long j6) {
        A i10 = this.f16104b.i(j6);
        C c10 = i10.f10517a;
        long j10 = c10.f10520a;
        long j11 = c10.f10521b;
        long j12 = this.f16105c.f16106Y;
        C c11 = new C(j10, j11 + j12);
        C c12 = i10.f10518b;
        return new A(c11, new C(c12.f10520a, c12.f10521b + j12));
    }
}
