package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rc.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5458g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44872Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5463l f44873Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f44874h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5458g(C5463l c5463l, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44873Z = c5463l;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44872Y = obj;
        this.f44874h0 |= Integer.MIN_VALUE;
        return this.f44873Z.b(this);
    }
}
