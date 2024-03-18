package Za;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class F0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f23454Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ T0 f23455Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f23456h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(T0 t02, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f23455Z = t02;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f23454Y = obj;
        this.f23456h0 |= Integer.MIN_VALUE;
        return this.f23455Z.e(this);
    }
}
