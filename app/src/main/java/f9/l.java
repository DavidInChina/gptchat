package F9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class l extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public m f5098Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f5099Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ m f5100h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f5101i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f5100h0 = mVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f5099Z = obj;
        this.f5101i0 |= Integer.MIN_VALUE;
        return m.n(this.f5100h0, null, this);
    }
}
