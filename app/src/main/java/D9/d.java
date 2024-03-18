package D9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public e f3429Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f3430Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ e f3431h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3432i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f3431h0 = eVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f3430Z = obj;
        this.f3432i0 |= Integer.MIN_VALUE;
        return this.f3431h0.b(this);
    }
}
