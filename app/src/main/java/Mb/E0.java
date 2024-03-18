package Mb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class E0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public F0 f11768Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f11769Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ F0 f11770h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f11771i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(F0 f02, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11770h0 = f02;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11769Z = obj;
        this.f11771i0 |= Integer.MIN_VALUE;
        return F0.n(this.f11770h0, this);
    }
}
