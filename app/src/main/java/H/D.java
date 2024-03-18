package H;

import A.B0;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class D extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public F f6533Y;

    /* renamed from: Z  reason: collision with root package name */
    public B0 f6534Z;

    /* renamed from: h0  reason: collision with root package name */
    public wf.n f6535h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f6536i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ F f6537j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f6538k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(F f6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f6537j0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f6536i0 = obj;
        this.f6538k0 |= Integer.MIN_VALUE;
        return F.n(this.f6537j0, null, null, this);
    }
}
