package bb;

import cb.C2350T;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class t0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public F0 f25899Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2350T f25900Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f25901h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ F0 f25902i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f25903j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(F0 f02, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f25902i0 = f02;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f25901h0 = obj;
        this.f25903j0 |= Integer.MIN_VALUE;
        return F0.n(this.f25902i0, null, this);
    }
}
