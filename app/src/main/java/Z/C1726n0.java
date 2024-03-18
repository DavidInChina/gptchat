package Z;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Z.n0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1726n0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1728o0 f22656Y;

    /* renamed from: Z  reason: collision with root package name */
    public wf.k f22657Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f22658h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C1728o0 f22659i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f22660j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1726n0(C1728o0 c1728o0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22659i0 = c1728o0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22658h0 = obj;
        this.f22660j0 |= Integer.MIN_VALUE;
        return this.f22659i0.S(null, this);
    }
}
