package C;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public wf.k f2438Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f2439Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ j f2440h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f2441i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2440h0 = jVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2439Z = obj;
        this.f2441i0 |= Integer.MIN_VALUE;
        return this.f2440h0.c(null, 0.0f, null, this);
    }
}
