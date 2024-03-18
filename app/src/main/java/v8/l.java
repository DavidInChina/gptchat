package V8;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class l extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public m f18489Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f18490Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ m f18491h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f18492i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18491h0 = mVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18490Z = obj;
        this.f18492i0 |= Integer.MIN_VALUE;
        return this.f18491h0.k0(this);
    }
}
