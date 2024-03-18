package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* renamed from: W.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1562i0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1567j0 f20124Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f20125Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f20126h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f20127i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ r0.L f20128j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ long f20129k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f20130l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f20131m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1562i0(C1567j0 c1567j0, AbstractC4326r abstractC4326r, float f6, float f10, r0.L l10, long j6, int i10, int i11) {
        super(2);
        this.f20124Y = c1567j0;
        this.f20125Z = abstractC4326r;
        this.f20126h0 = f6;
        this.f20127i0 = f10;
        this.f20128j0 = l10;
        this.f20129k0 = j6;
        this.f20130l0 = i10;
        this.f20131m0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f20130l0 | 1);
        r0.L l10 = this.f20128j0;
        long j6 = this.f20129k0;
        this.f20124Y.a(this.f20125Z, this.f20126h0, this.f20127i0, l10, j6, (AbstractC1725n) obj, p10, this.f20131m0);
        return jf.y.f36177a;
    }
}
