package x9;

import jf.C3961k;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f49661Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f49662Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f49663h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49662Z = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49661Y = obj;
        this.f49663h0 |= Integer.MIN_VALUE;
        Object b10 = this.f49662Z.b(null, null, this);
        if (b10 == EnumC5000a.f41328Y) {
            return b10;
        }
        return new C3961k(b10);
    }
}
