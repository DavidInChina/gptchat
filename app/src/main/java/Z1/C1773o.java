package Z1;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;

/* renamed from: Z1.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1773o extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f23042Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1774p f23043Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f23044h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1773o(C1774p c1774p, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f23043Z = c1774p;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f23042Y = obj;
        this.f23044h0 |= Integer.MIN_VALUE;
        this.f23043Z.b(null, this);
        return EnumC5000a.f41328Y;
    }
}
