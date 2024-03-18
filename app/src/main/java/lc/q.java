package Lc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class q extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public s f11008Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f11009Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f11010h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ s f11011i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f11012j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11011i0 = sVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11010h0 = obj;
        this.f11012j0 |= Integer.MIN_VALUE;
        return this.f11011i0.b(false, this);
    }
}
