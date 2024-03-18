package Za;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class O0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f23493Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ T0 f23494Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f23495h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(T0 t02, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f23494Z = t02;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f23493Y = obj;
        this.f23495h0 |= Integer.MIN_VALUE;
        return this.f23494Z.h(null, null, this);
    }
}
