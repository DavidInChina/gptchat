package Pg;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14203Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f14204Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f14205h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14204Z = kVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14203Y = obj;
        this.f14205h0 |= Integer.MIN_VALUE;
        Object G10 = k.G(this.f14204Z, this);
        if (G10 == EnumC5000a.f41328Y) {
            return G10;
        }
        return new s(G10);
    }
}
