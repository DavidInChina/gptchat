package Ra;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class n extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public o f15223Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f15224Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ o f15225h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f15226i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f15225h0 = oVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f15224Z = obj;
        this.f15226i0 |= Integer.MIN_VALUE;
        return o.m(this.f15225h0, null, this);
    }
}
