package W;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: W.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1630w extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C f20550Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f20551Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C f20552h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f20553i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1630w(C c10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f20552h0 = c10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f20551Z = obj;
        this.f20553i0 |= Integer.MIN_VALUE;
        return this.f20552h0.b(null, null, null, this);
    }
}
