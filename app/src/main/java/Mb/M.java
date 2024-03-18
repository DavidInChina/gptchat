package Mb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class M extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public S f11808Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f11809Z;

    /* renamed from: h0  reason: collision with root package name */
    public Yg.r f11810h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f11811i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f11812j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ S f11813k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f11814l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(S s10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11813k0 = s10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11812j0 = obj;
        this.f11814l0 |= Integer.MIN_VALUE;
        return S.m(this.f11813k0, this);
    }
}
