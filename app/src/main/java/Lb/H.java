package lb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class H extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public K f37941Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f37942Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f37943h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ K f37944i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f37945j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(K k10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37944i0 = k10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37943h0 = obj;
        this.f37945j0 |= Integer.MIN_VALUE;
        return K.o(this.f37944i0, null, this);
    }
}
