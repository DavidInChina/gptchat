package Ya;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f22162Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r f22163Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f22164h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22163Z = rVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22162Y = obj;
        this.f22164h0 |= Integer.MIN_VALUE;
        return this.f22163Z.e(null, this);
    }
}
