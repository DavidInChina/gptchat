package I9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class L extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0758g0 f8206Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f8207Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0758g0 f8208h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f8209i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C0758g0 c0758g0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8208h0 = c0758g0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8207Z = obj;
        this.f8209i0 |= Integer.MIN_VALUE;
        return this.f8208h0.s(null, this);
    }
}
