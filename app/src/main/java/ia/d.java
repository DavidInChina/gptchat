package Ia;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f8496Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f8497Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f8498h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8497Z = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8496Y = obj;
        this.f8498h0 |= Integer.MIN_VALUE;
        return this.f8497Z.d(this);
    }
}
