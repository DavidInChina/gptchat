package W;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: W.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1615t extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C f20414Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f20415Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C f20416h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f20417i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1615t(C c10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f20416h0 = c10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f20415Z = obj;
        this.f20417i0 |= Integer.MIN_VALUE;
        return this.f20416h0.a(null, null, this);
    }
}
