package Ya;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class j extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f22174Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r f22175Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f22176h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22175Z = rVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22174Y = obj;
        this.f22176h0 |= Integer.MIN_VALUE;
        return this.f22175Z.i(this);
    }
}
