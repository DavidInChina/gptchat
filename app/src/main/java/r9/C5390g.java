package r9;

import W.C1550f3;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* renamed from: r9.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5390g extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f44550Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f44551Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ r0.L f44552h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f44553i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C1550f3 f44554j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.n f44555k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.o f44556l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f44557m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f44558n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5390g(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, r0.L l10, long j6, C1550f3 c1550f3, wf.n nVar, wf.o oVar, int i10, int i11) {
        super(2);
        this.f44550Y = abstractC6216a;
        this.f44551Z = abstractC4326r;
        this.f44552h0 = l10;
        this.f44553i0 = j6;
        this.f44554j0 = c1550f3;
        this.f44555k0 = nVar;
        this.f44556l0 = oVar;
        this.f44557m0 = i10;
        this.f44558n0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f44557m0 | 1);
        wf.n nVar = this.f44555k0;
        wf.o oVar = this.f44556l0;
        A7.b.f(this.f44550Y, this.f44551Z, this.f44552h0, this.f44553i0, this.f44554j0, nVar, oVar, (AbstractC1725n) obj, p10, this.f44558n0);
        return jf.y.f36177a;
    }
}
