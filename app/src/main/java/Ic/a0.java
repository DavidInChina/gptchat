package ic;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f33000Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ O f33001Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(O o10, int i10) {
        super(1);
        this.f33000Y = i10;
        this.f33001Z = o10;
    }

    public final P a(P p10) {
        int i10 = this.f33000Y;
        O o10 = this.f33001Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", p10);
                return P.e(p10, null, false, false, null, ((J) o10).f32957a, false, null, null, 239);
            default:
                AbstractC3557B.c0("$this$setState", p10);
                ((N) o10).getClass();
                return P.e(p10, Boolean.TRUE, false, false, null, null, false, null, null, 254);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f33000Y) {
            case 0:
                return a((P) obj);
            default:
                return a((P) obj);
        }
    }
}
