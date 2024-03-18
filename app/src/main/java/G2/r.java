package g2;

import android.content.Context;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class r extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public D5.a f31129Y;

    /* renamed from: Z  reason: collision with root package name */
    public Context f31130Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f31131h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ D5.a f31132i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f31133j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(D5.a aVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31132i0 = aVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31131h0 = obj;
        this.f31133j0 |= Integer.MIN_VALUE;
        return this.f31132i0.e(null, null, this);
    }
}
