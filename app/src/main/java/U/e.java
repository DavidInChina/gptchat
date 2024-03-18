package U;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f17334Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ n f17335Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f17336h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f17337i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f17338j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ boolean f17339k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f17340l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f17341m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z10, n nVar, AbstractC4326r abstractC4326r, long j6, long j10, boolean z11, int i10, int i11) {
        super(2);
        this.f17334Y = z10;
        this.f17335Z = nVar;
        this.f17336h0 = abstractC4326r;
        this.f17337i0 = j6;
        this.f17338j0 = j10;
        this.f17339k0 = z11;
        this.f17340l0 = i10;
        this.f17341m0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f17340l0 | 1);
        long j6 = this.f17338j0;
        boolean z10 = this.f17339k0;
        f.a(this.f17334Y, this.f17335Z, this.f17336h0, this.f17337i0, j6, z10, (AbstractC1725n) obj, p10, this.f17341m0);
        return y.f36177a;
    }
}
