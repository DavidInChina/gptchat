package ta;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class T extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f45849Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f45850Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ M1.v f45851h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(M1.v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f45851h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f45849Y = obj;
        this.f45850Z |= Integer.MIN_VALUE;
        return this.f45851h0.c(null, this);
    }
}
