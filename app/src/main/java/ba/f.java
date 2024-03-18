package Ba;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public j f2015Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f2016Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ j f2017h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f2018i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2017h0 = jVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2016Z = obj;
        this.f2018i0 |= Integer.MIN_VALUE;
        return this.f2017h0.a(this);
    }
}
