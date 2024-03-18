package Hc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f7595Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c f7596Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f7597h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f7596Z = cVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f7595Y = obj;
        this.f7597h0 |= Integer.MIN_VALUE;
        this.f7596Z.b(null, this);
        return EnumC5000a.f41328Y;
    }
}
