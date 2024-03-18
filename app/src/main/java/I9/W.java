package I9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class W extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0758g0 f8244Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f8245Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0758g0 f8246h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f8247i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(C0758g0 c0758g0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8246h0 = c0758g0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8245Z = obj;
        this.f8247i0 |= Integer.MIN_VALUE;
        return C0758g0.o(this.f8246h0, null, this);
    }
}
