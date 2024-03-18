package l4;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class k extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public l f37818Y;

    /* renamed from: Z  reason: collision with root package name */
    public j f37819Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f37820h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l f37821i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f37822j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37821i0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37820h0 = obj;
        this.f37822j0 |= Integer.MIN_VALUE;
        return this.f37821i0.b(null, this);
    }
}
