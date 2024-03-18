package Ca;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Ca.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0286c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Vc.r f2823Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f2824Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0290g f2825h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f2826i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0286c(C0290g c0290g, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2825h0 = c0290g;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2824Z = obj;
        this.f2826i0 |= Integer.MIN_VALUE;
        return this.f2825h0.b(null, this);
    }
}
