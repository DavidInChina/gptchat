package h9;

import Ng.Q;
import com.openai.experiment.t;
import id.AbstractC3557B;
import j9.C3927c;
import jf.y;
import l9.C4355c;
import ld.C4428a;
import nd.AbstractC4815d;
import nd.AbstractC4816e;
import nd.EnumC4814c;
import nf.AbstractC4825e;

/* renamed from: h9.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3343h implements AbstractC4815d {

    /* renamed from: a  reason: collision with root package name */
    public final C4428a f31976a;

    /* renamed from: b  reason: collision with root package name */
    public final t f31977b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC4816e f31978c;

    /* renamed from: d  reason: collision with root package name */
    public final C4355c f31979d;

    /* renamed from: e  reason: collision with root package name */
    public final C3927c f31980e;

    /* renamed from: f  reason: collision with root package name */
    public final Lc.e f31981f;

    /* renamed from: g  reason: collision with root package name */
    public final EnumC4814c f31982g = EnumC4814c.f40283Z;

    public C3343h(C4428a c4428a, t tVar, AbstractC4816e abstractC4816e, C4355c c4355c, C3927c c3927c, Lc.e eVar) {
        AbstractC3557B.c0("scope", c4428a);
        AbstractC3557B.c0("experimentManager", tVar);
        AbstractC3557B.c0("accountUserProvider", abstractC4816e);
        AbstractC3557B.c0("datadogConfig", c4355c);
        AbstractC3557B.c0("datadogLogger", c3927c);
        AbstractC3557B.c0("devicePreferences", eVar);
        this.f31976a = c4428a;
        this.f31977b = tVar;
        this.f31978c = abstractC4816e;
        this.f31979d = c4355c;
        this.f31980e = c3927c;
        this.f31981f = eVar;
    }

    @Override // nd.AbstractC4815d
    public final EnumC4814c a() {
        return this.f31982g;
    }

    @Override // nd.AbstractC4815d
    public final Object b(AbstractC4825e abstractC4825e) {
        L4.a.E0(L4.a.F0(new C3342g(this, null), ((xc.e) this.f31978c).f49801b), this.f31976a);
        return y.f36177a;
    }

    @Override // nd.AbstractC4815d
    public final Tg.e c() {
        return Q.f12904a;
    }
}
