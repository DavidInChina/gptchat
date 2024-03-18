package D9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public e f3425Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f3426Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ e f3427h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3428i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f3427h0 = eVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f3426Z = obj;
        this.f3428i0 |= Integer.MIN_VALUE;
        return this.f3427h0.a(null, this);
    }
}
