package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class G extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14748Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f14749Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ H f14750h0;

    /* renamed from: i0  reason: collision with root package name */
    public H f14751i0;

    /* renamed from: j0  reason: collision with root package name */
    public AbstractC1207j f14752j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14750h0 = h10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14748Y = obj;
        this.f14749Z |= Integer.MIN_VALUE;
        return this.f14750h0.b(null, this);
    }
}
