package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rc.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5461j extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f44895Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44896Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5463l f44897h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f44898i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5461j(C5463l c5463l, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44897h0 = c5463l;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44896Z = obj;
        this.f44898i0 |= Integer.MIN_VALUE;
        return this.f44897h0.e(null, this);
    }
}
