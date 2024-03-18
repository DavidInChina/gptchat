package M1;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class y extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f11472Y;

    /* renamed from: Z  reason: collision with root package name */
    public J f11473Z;

    /* renamed from: h0  reason: collision with root package name */
    public Ng.r f11474h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f11475i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ J f11476j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f11477k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(J j6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11476j0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11475i0 = obj;
        this.f11477k0 |= Integer.MIN_VALUE;
        return J.c(this.f11476j0, null, this);
    }
}
