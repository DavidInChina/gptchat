package xa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class p extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public s f49753Y;

    /* renamed from: Z  reason: collision with root package name */
    public Wg.d f49754Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f49755h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ s f49756i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f49757j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49756i0 = sVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49755h0 = obj;
        this.f49757j0 |= Integer.MIN_VALUE;
        return this.f49756i0.e(this);
    }
}
