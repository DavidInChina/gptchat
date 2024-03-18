package Ya;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f22159Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r f22160Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f22161h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22160Z = rVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22159Y = obj;
        this.f22161h0 |= Integer.MIN_VALUE;
        return this.f22160Z.d(null, this);
    }
}
