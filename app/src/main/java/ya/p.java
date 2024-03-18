package Ya;

import cb.C2334C;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class p extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public r f22194Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2334C f22195Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f22196h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ r f22197i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f22198j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22197i0 = rVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22196h0 = obj;
        this.f22198j0 |= Integer.MIN_VALUE;
        return this.f22197i0.n(null, this);
    }
}
