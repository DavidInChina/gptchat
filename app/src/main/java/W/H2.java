package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class H2 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f19183Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f19184Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f19185h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f19186i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f19187j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f19188k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2(AbstractC4326r abstractC4326r, long j6, long j10, int i10, int i11, int i12) {
        super(2);
        this.f19183Y = abstractC4326r;
        this.f19184Z = j6;
        this.f19185h0 = j10;
        this.f19186i0 = i10;
        this.f19187j0 = i11;
        this.f19188k0 = i12;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f19187j0 | 1);
        long j6 = this.f19185h0;
        int i10 = this.f19186i0;
        I2.c(this.f19183Y, this.f19184Z, j6, i10, (AbstractC1725n) obj, p10, this.f19188k0);
        return jf.y.f36177a;
    }
}
