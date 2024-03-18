package C9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f2764Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f2765Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l f2766h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f2767i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2766h0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2765Z = obj;
        this.f2767i0 |= Integer.MIN_VALUE;
        return this.f2766h0.e(null, this);
    }
}
