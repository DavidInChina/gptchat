package Kb;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ char f9605Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f9606Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f9607h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f9608i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(char c10, boolean z10, int i10, int i11) {
        super(2);
        this.f9605Y = c10;
        this.f9606Z = z10;
        this.f9607h0 = i10;
        this.f9608i0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f9607h0 | 1);
        K8.d.g0(this.f9605Y, this.f9606Z, (AbstractC1725n) obj, p10, this.f9608i0);
        return y.f36177a;
    }
}
