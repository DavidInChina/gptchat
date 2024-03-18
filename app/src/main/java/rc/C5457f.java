package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rc.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5457f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5463l f44866Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44867Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5463l f44868h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f44869i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5457f(C5463l c5463l, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44868h0 = c5463l;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44867Z = obj;
        this.f44869i0 |= Integer.MIN_VALUE;
        return this.f44868h0.a(this);
    }
}
