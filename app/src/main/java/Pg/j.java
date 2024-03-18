package Pg;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class j extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14206Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f14207Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f14208h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14207Z = kVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14206Y = obj;
        this.f14208h0 |= Integer.MIN_VALUE;
        Object H6 = this.f14207Z.H(null, 0, 0L, this);
        if (H6 == EnumC5000a.f41328Y) {
            return H6;
        }
        return new s(H6);
    }
}
