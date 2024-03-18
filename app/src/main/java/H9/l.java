package H9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class l extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public m f7520Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f7521Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ m f7522h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7523i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f7522h0 = mVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f7521Z = obj;
        this.f7523i0 |= Integer.MIN_VALUE;
        return this.f7522h0.a(this);
    }
}
