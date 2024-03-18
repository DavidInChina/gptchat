package I9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: I9.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0756f0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0758g0 f8339Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f8340Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0758g0 f8341h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f8342i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0756f0(C0758g0 c0758g0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8341h0 = c0758g0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8340Z = obj;
        this.f8342i0 |= Integer.MIN_VALUE;
        return C0758g0.r(this.f8341h0, null, this);
    }
}
