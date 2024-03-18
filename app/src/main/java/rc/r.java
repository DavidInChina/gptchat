package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class r extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f44919Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44920Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5472v f44921h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f44922i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C5472v c5472v, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44921h0 = c5472v;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44920Z = obj;
        this.f44922i0 |= Integer.MIN_VALUE;
        return this.f44921h0.a(this);
    }
}
