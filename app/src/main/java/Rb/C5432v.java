package rb;

import ca.C2325q;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rb.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5432v extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5436z f44748Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2325q f44749Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f44750h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5436z f44751i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f44752j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5432v(C5436z c5436z, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44751i0 = c5436z;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44750h0 = obj;
        this.f44752j0 |= Integer.MIN_VALUE;
        return C5436z.a(this.f44751i0, null, null, null, this);
    }
}
