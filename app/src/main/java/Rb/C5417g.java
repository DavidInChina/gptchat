package rb;

import ca.C2325q;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rb.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5417g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5436z f44684Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2325q f44685Z;

    /* renamed from: h0  reason: collision with root package name */
    public wf.n f44686h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f44687i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C5436z f44688j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f44689k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5417g(C5436z c5436z, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44688j0 = c5436z;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44687i0 = obj;
        this.f44689k0 |= Integer.MIN_VALUE;
        return this.f44688j0.e(null, null, this);
    }
}
