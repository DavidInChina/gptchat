package Ya;

import cb.C2334C;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class l extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public r f22180Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2334C f22181Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f22182h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ r f22183i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f22184j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22183i0 = rVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22182h0 = obj;
        this.f22184j0 |= Integer.MIN_VALUE;
        return this.f22183i0.k(null, this);
    }
}
