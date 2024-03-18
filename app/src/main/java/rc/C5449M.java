package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rc.M  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5449M extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f44802Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f44803Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f44804h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5451O f44805i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f44806j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5449M(C5451O c5451o, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44805i0 = c5451o;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44804h0 = obj;
        this.f44806j0 |= Integer.MIN_VALUE;
        return this.f44805i0.f(null, this);
    }
}
