package ic;

import jc.C3942j;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class V extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public g0 f32976Y;

    /* renamed from: Z  reason: collision with root package name */
    public C3942j f32977Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f32978h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ g0 f32979i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f32980j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(g0 g0Var, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f32979i0 = g0Var;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f32978h0 = obj;
        this.f32980j0 |= Integer.MIN_VALUE;
        return g0.m(this.f32979i0, null, this);
    }
}
