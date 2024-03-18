package F9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class k extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public m f5093Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f5094Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f5095h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ m f5096i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f5097j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f5096i0 = mVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f5095h0 = obj;
        this.f5097j0 |= Integer.MIN_VALUE;
        return m.m(this.f5096i0, null, this);
    }
}
