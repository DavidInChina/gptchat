package Ia;

import M1.v;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f8508Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f8509Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ v f8510h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8510h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8508Y = obj;
        this.f8509Z |= Integer.MIN_VALUE;
        return this.f8510h0.c(null, this);
    }
}
