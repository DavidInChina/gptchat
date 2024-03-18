package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class g0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f44875Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44876Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ h0 f44877h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f44878i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44877h0 = h0Var;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44876Z = obj;
        this.f44878i0 |= Integer.MIN_VALUE;
        return this.f44877h0.a(this);
    }
}
