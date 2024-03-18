package De;

import L.C0878y;
import Qg.AbstractC1207j;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f3598Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f3599Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC1207j f3600h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0878y f3601i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C0878y c0878y, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f3601i0 = c0878y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f3598Y = obj;
        this.f3599Z |= Integer.MIN_VALUE;
        return this.f3601i0.c(null, this);
    }
}
