package g2;

import androidx.glance.session.SessionWorker;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class t extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f31135Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ SessionWorker f31136Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f31137h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SessionWorker sessionWorker, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31136Z = sessionWorker;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31135Y = obj;
        this.f31137h0 |= Integer.MIN_VALUE;
        return this.f31136Z.f(this);
    }
}
