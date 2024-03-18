package Dd;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class U extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f3538Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f3539Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ W f3540h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3541i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f3540h0 = w10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f3539Z = obj;
        this.f3541i0 |= Integer.MIN_VALUE;
        return this.f3540h0.a(this);
    }
}
