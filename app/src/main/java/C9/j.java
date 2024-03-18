package C9;

import M1.v;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class j extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f2784Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f2785Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ v f2786h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2786h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2784Y = obj;
        this.f2785Z |= Integer.MIN_VALUE;
        return this.f2786h0.c(null, this);
    }
}
