package bb;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* renamed from: bb.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2166g0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f25822Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f25823Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f25824h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f25825i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f25826j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2166g0(AbstractC4326r abstractC4326r, float f6, boolean z10, int i10, int i11) {
        super(2);
        this.f25822Y = abstractC4326r;
        this.f25823Z = f6;
        this.f25824h0 = z10;
        this.f25825i0 = i10;
        this.f25826j0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f25825i0 | 1);
        boolean z10 = this.f25824h0;
        L4.a.u(this.f25822Y, this.f25823Z, z10, (AbstractC1725n) obj, p10, this.f25826j0);
        return jf.y.f36177a;
    }
}
