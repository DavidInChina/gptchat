package lb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class I extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public K f37946Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f37947Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ K f37948h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f37949i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(K k10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37948h0 = k10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37947Z = obj;
        this.f37949i0 |= Integer.MIN_VALUE;
        return K.p(this.f37948h0, null, this);
    }
}
