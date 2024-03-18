package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class a0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44840Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f44841Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ N.W f44842h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(N.W w10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44842h0 = w10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44840Y = obj;
        this.f44841Z |= Integer.MIN_VALUE;
        return this.f44842h0.c(null, this);
    }
}
