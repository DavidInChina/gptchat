package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rc.L  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5448L extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f44797Y;

    /* renamed from: Z  reason: collision with root package name */
    public zd.q f44798Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f44799h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5451O f44800i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f44801j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5448L(C5451O c5451o, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44800i0 = c5451o;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44799h0 = obj;
        this.f44801j0 |= Integer.MIN_VALUE;
        return this.f44800i0.e(null, this);
    }
}
