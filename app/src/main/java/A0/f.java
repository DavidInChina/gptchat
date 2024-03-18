package A0;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public g f367Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f368Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f369h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ g f370i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f371j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f370i0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f369h0 = obj;
        this.f371j0 |= Integer.MIN_VALUE;
        return this.f370i0.T(0L, this);
    }
}
