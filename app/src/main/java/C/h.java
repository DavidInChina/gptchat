package C;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f2452Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ j f2453Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f2454h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2453Z = jVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2452Y = obj;
        this.f2454h0 |= Integer.MIN_VALUE;
        return this.f2453Z.d(null, 0.0f, null, this);
    }
}
