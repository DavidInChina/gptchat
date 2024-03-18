package Ve;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Ve.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1507l extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f18811Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1519y f18812Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f18813h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1507l(C1519y c1519y, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18812Z = c1519y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18811Y = obj;
        this.f18813h0 |= Integer.MIN_VALUE;
        return this.f18812Z.d(this);
    }
}
