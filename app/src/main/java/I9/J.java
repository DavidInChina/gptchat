package I9;

import ca.C2311c;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class J extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0758g0 f8182Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2311c f8183Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f8184h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0758g0 f8185i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f8186j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C0758g0 c0758g0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8185i0 = c0758g0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8184h0 = obj;
        this.f8186j0 |= Integer.MIN_VALUE;
        return C0758g0.n(this.f8185i0, null, this);
    }
}
