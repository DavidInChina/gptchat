package Sb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public g f16497Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f16498Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ g f16499h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f16500i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f16499h0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f16498Z = obj;
        this.f16500i0 |= Integer.MIN_VALUE;
        return g.n(this.f16499h0, null, this);
    }
}
