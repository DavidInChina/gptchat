package F;

import A.B0;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class F extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public J f4857Y;

    /* renamed from: Z  reason: collision with root package name */
    public B0 f4858Z;

    /* renamed from: h0  reason: collision with root package name */
    public wf.n f4859h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f4860i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ J f4861j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f4862k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(J j6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f4861j0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f4860i0 = obj;
        this.f4862k0 |= Integer.MIN_VALUE;
        return this.f4861j0.c(null, null, this);
    }
}
