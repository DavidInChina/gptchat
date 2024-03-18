package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import wf.AbstractC6216a;

/* renamed from: W.j2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1569j2 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f20175Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f20176Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f20177h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f20178i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569j2(long j6, AbstractC6216a abstractC6216a, boolean z10, int i10) {
        super(2);
        this.f20175Y = j6;
        this.f20176Z = abstractC6216a;
        this.f20177h0 = z10;
        this.f20178i0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f20178i0 | 1);
        AbstractC6216a abstractC6216a = this.f20176Z;
        boolean z10 = this.f20177h0;
        A7.b.T(this.f20175Y, abstractC6216a, z10, (AbstractC1725n) obj, p10);
        return jf.y.f36177a;
    }
}
