package B0;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class M extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f1607Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N f1608Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f1609h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1608Z = n10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1607Y = obj;
        this.f1609h0 |= Integer.MIN_VALUE;
        return this.f1608Z.h(0L, null, this);
    }
}
