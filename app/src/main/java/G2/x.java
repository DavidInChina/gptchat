package g2;

import Ng.D0;
import Z.C1744x;
import Z.E0;
import androidx.glance.session.SessionWorker;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class x extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f31146Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f31147Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f31148h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f31149i0;

    /* renamed from: j0  reason: collision with root package name */
    public D0 f31150j0;

    /* renamed from: k0  reason: collision with root package name */
    public E0 f31151k0;

    /* renamed from: l0  reason: collision with root package name */
    public C1744x f31152l0;

    /* renamed from: m0  reason: collision with root package name */
    public /* synthetic */ Object f31153m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ SessionWorker f31154n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f31155o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(SessionWorker sessionWorker, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31154n0 = sessionWorker;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31153m0 = obj;
        this.f31155o0 |= Integer.MIN_VALUE;
        return SessionWorker.h(this.f31154n0, null, this);
    }
}
