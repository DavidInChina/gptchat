package A0;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public g f361Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f362Z;

    /* renamed from: h0  reason: collision with root package name */
    public long f363h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f364i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ g f365j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f366k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f365j0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f364i0 = obj;
        this.f366k0 |= Integer.MIN_VALUE;
        return this.f365j0.l(0L, 0L, this);
    }
}
