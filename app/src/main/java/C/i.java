package C;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f2455Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ j f2456Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f2457h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2456Z = jVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2455Y = obj;
        this.f2457h0 |= Integer.MIN_VALUE;
        return j.b(this.f2456Z, null, 0.0f, 0.0f, null, this);
    }
}
