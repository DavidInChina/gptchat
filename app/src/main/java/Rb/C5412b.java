package rb;

import ca.C2325q;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rb.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5412b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5436z f44667Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2325q f44668Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f44669h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5436z f44670i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f44671j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5412b(C5436z c5436z, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44670i0 = c5436z;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44669h0 = obj;
        this.f44671j0 |= Integer.MIN_VALUE;
        return this.f44670i0.b(null, null, this);
    }
}
