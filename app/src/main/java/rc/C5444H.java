package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rc.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5444H extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44780Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5451O f44781Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f44782h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5444H(C5451O c5451o, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44781Z = c5451o;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44780Y = obj;
        this.f44782h0 |= Integer.MIN_VALUE;
        return this.f44781Z.a(null, this);
    }
}
