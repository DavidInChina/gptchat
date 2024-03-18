package h9;

import Ng.Q;
import Qg.D;
import id.AbstractC3557B;
import jf.y;
import ld.C4428a;
import nd.AbstractC4815d;
import nd.AbstractC4816e;
import nd.C4812a;
import nd.EnumC4814c;
import nf.AbstractC4825e;
import yc.C6578d;

/* renamed from: h9.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3341f implements AbstractC4815d {

    /* renamed from: a  reason: collision with root package name */
    public final C4428a f31965a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4816e f31966b;

    /* renamed from: c  reason: collision with root package name */
    public final C6578d f31967c;

    /* renamed from: d  reason: collision with root package name */
    public final C4812a f31968d;

    /* renamed from: e  reason: collision with root package name */
    public final EnumC4814c f31969e = EnumC4814c.f40284h0;

    public C3341f(C4428a c4428a, AbstractC4816e abstractC4816e, C6578d c6578d, C4812a c4812a) {
        AbstractC3557B.c0("scope", c4428a);
        AbstractC3557B.c0("accountUserProvider", abstractC4816e);
        AbstractC3557B.c0("accountIdHeaderPluginProvider", c6578d);
        AbstractC3557B.c0("accountSession", c4812a);
        this.f31965a = c4428a;
        this.f31966b = abstractC4816e;
        this.f31967c = c6578d;
        this.f31968d = c4812a;
    }

    @Override // nd.AbstractC4815d
    public final EnumC4814c a() {
        return this.f31969e;
    }

    @Override // nd.AbstractC4815d
    public final Object b(AbstractC4825e abstractC4825e) {
        L4.a.E0(new D(L4.a.I0(new C3339d(this, null), ((xc.e) this.f31966b).f49801b), new C3340e(this, null, 0)), this.f31965a);
        return y.f36177a;
    }

    @Override // nd.AbstractC4815d
    public final Tg.e c() {
        return Q.f12904a;
    }
}
