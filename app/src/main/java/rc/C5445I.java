package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rc.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5445I extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f44783Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44784Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5451O f44785h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f44786i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5445I(C5451O c5451o, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44785h0 = c5451o;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44784Z = obj;
        this.f44786i0 |= Integer.MIN_VALUE;
        return this.f44785h0.b(this);
    }
}
