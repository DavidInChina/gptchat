package M1;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class C extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public J f11381Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f11382Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ J f11383h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f11384i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(J j6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11383h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11382Z = obj;
        this.f11384i0 |= Integer.MIN_VALUE;
        return this.f11383h0.f(this);
    }
}
