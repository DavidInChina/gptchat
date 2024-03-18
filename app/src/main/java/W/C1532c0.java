package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* renamed from: W.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1532c0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f19952Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f19953Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f19954h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.o f19955i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f19956j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f19957k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532c0(AbstractC4326r abstractC4326r, long j6, long j10, wf.o oVar, int i10, int i11) {
        super(2);
        this.f19952Y = abstractC4326r;
        this.f19953Z = j6;
        this.f19954h0 = j10;
        this.f19955i0 = oVar;
        this.f19956j0 = i10;
        this.f19957k0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f19956j0 | 1);
        long j6 = this.f19954h0;
        wf.o oVar = this.f19955i0;
        AbstractC1547f0.a(this.f19952Y, this.f19953Z, j6, oVar, (AbstractC1725n) obj, p10, this.f19957k0);
        return jf.y.f36177a;
    }
}
