package Ve;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Ve.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1515u extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f18906Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1519y f18907Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f18908h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1515u(C1519y c1519y, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18907Z = c1519y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18906Y = obj;
        this.f18908h0 |= Integer.MIN_VALUE;
        return this.f18907Z.g(this);
    }
}
