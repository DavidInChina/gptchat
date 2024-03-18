package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;

/* renamed from: W.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1551g extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ float f20067Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f20068Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20069h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f20070i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1551g(float f6, float f10, wf.n nVar, int i10) {
        super(2);
        this.f20067Y = f6;
        this.f20068Z = f10;
        this.f20069h0 = nVar;
        this.f20070i0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f20070i0 | 1);
        float f6 = this.f20068Z;
        wf.n nVar = this.f20069h0;
        AbstractC1556h.b(this.f20067Y, f6, nVar, (AbstractC1725n) obj, p10);
        return jf.y.f36177a;
    }
}
