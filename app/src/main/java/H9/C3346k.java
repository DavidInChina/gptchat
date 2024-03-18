package h9;

import Z8.p1;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: h9.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3346k extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public p1 f31989Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f31990Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3347l f31991h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f31992i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3346k(C3347l c3347l, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31991h0 = c3347l;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31990Z = obj;
        this.f31992i0 |= Integer.MIN_VALUE;
        return this.f31991h0.b(this);
    }
}
