package Ta;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class n extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f17017Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p f17018Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f17019h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f17018Z = pVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f17017Y = obj;
        this.f17019h0 |= Integer.MIN_VALUE;
        return this.f17018Z.a(null, null, null, this);
    }
}
