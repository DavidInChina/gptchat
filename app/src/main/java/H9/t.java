package H9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class t extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public x f7546Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f7547Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ x f7548h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7549i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f7548h0 = xVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f7547Z = obj;
        this.f7549i0 |= Integer.MIN_VALUE;
        return x.m(this.f7548h0, this);
    }
}
