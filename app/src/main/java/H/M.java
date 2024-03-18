package H;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class M extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f6585Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N f6586Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f6587h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f6586Z = n10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f6585Y = obj;
        this.f6587h0 |= Integer.MIN_VALUE;
        return this.f6586Z.a(null, 0.0f, this);
    }
}
