package W;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: W.o3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1595o3 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1600p3 f20259Y;

    /* renamed from: Z  reason: collision with root package name */
    public B3 f20260Z;

    /* renamed from: h0  reason: collision with root package name */
    public Wg.a f20261h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f20262i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C1600p3 f20263j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f20264k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1595o3(C1600p3 c1600p3, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f20263j0 = c1600p3;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f20262i0 = obj;
        this.f20264k0 |= Integer.MIN_VALUE;
        return this.f20263j0.a(null, this);
    }
}
