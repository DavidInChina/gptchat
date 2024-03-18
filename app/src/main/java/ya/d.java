package Ya;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f22155Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f22156Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ r f22157h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f22158i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22157h0 = rVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22156Z = obj;
        this.f22158i0 |= Integer.MIN_VALUE;
        return this.f22157h0.c(this);
    }
}
