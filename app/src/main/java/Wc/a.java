package Wc;

import k5.F;
import me.T;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public T f20891Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f20892Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ F f20893h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f20894i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(F f6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f20893h0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f20892Z = obj;
        this.f20894i0 |= Integer.MIN_VALUE;
        return this.f20893h0.e(null, this);
    }
}
