package h9;

import Ng.Q;
import id.AbstractC3557B;
import jf.y;
import ld.C4428a;
import nd.AbstractC4815d;
import nd.AbstractC4816e;
import nd.EnumC4814c;
import nf.AbstractC4825e;
import pf.AbstractC5163j;

/* renamed from: h9.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3337b implements AbstractC4815d {

    /* renamed from: a  reason: collision with root package name */
    public final C4428a f31956a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4816e f31957b;

    /* renamed from: c  reason: collision with root package name */
    public final EnumC4814c f31958c = EnumC4814c.f40282Y;

    public C3337b(C4428a c4428a, AbstractC4816e abstractC4816e) {
        AbstractC3557B.c0("scope", c4428a);
        AbstractC3557B.c0("accountUserProvider", abstractC4816e);
        this.f31956a = c4428a;
        this.f31957b = abstractC4816e;
    }

    @Override // nd.AbstractC4815d
    public final EnumC4814c a() {
        return this.f31958c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.j, wf.n] */
    @Override // nd.AbstractC4815d
    public final Object b(AbstractC4825e abstractC4825e) {
        L4.a.E0(L4.a.I0(new AbstractC5163j(2, null), ((xc.e) this.f31957b).f49801b), this.f31956a);
        return y.f36177a;
    }

    @Override // nd.AbstractC4815d
    public final Tg.e c() {
        return Q.f12904a;
    }
}
