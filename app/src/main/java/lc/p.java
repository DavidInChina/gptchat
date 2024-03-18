package Lc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class p extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Kc.e f11004Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f11005Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ s f11006h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f11007i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11006h0 = sVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11005Z = obj;
        this.f11007i0 |= Integer.MIN_VALUE;
        return this.f11006h0.a(false, null, this);
    }
}
