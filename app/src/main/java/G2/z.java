package g2;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class z extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C3136A f31158Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f31159Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3136A f31160h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f31161i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C3136A c3136a, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31160h0 = c3136a;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31159Z = obj;
        this.f31161i0 |= Integer.MIN_VALUE;
        return this.f31160h0.c(null, this);
    }
}
