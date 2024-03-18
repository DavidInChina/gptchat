package We;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class u extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f21053Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f21054Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ v f21055h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f21055h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f21053Y = obj;
        this.f21054Z |= Integer.MIN_VALUE;
        return this.f21055h0.c(null, this);
    }
}
