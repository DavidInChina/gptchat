package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class F2 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f19127Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f19128Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f19129h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f19130i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f19131j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f19132k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f19133l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, long j6, long j10, int i10, int i11, int i12) {
        super(2);
        this.f19127Y = abstractC6216a;
        this.f19128Z = abstractC4326r;
        this.f19129h0 = j6;
        this.f19130i0 = j10;
        this.f19131j0 = i10;
        this.f19132k0 = i11;
        this.f19133l0 = i12;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f19132k0 | 1);
        long j6 = this.f19130i0;
        int i10 = this.f19131j0;
        I2.d(this.f19127Y, this.f19128Z, this.f19129h0, j6, i10, (AbstractC1725n) obj, p10, this.f19133l0);
        return jf.y.f36177a;
    }
}
