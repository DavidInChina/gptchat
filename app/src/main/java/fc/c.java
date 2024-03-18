package Fc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public g f5187Y;

    /* renamed from: Z  reason: collision with root package name */
    public Yg.p f5188Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f5189h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ g f5190i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f5191j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f5190i0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f5189h0 = obj;
        this.f5191j0 |= Integer.MIN_VALUE;
        return this.f5190i0.a(this);
    }
}
