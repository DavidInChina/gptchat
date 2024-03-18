package f9;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import ce.AbstractC2400f;
import ce.C2395a;
import ce.C2396b;
import ce.C2398d;
import ce.C2401g;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kb.AbstractC4212F;
import lb.C4369f;
import ma.C4575b;
import mb.C4604q;
import oa.C4973D;
import oa.G;
import rb.C5400A;
import rb.C5403D;
import sa.C5600f;
import ta.C5716o;
import ua.C5871b;
import x8.S;
import za.C6809z;

/* loaded from: classes2.dex */
public final class s implements Z3.b {

    /* renamed from: a  reason: collision with root package name */
    public final ld.i f29940a;

    /* renamed from: b  reason: collision with root package name */
    public final p f29941b;

    /* renamed from: c  reason: collision with root package name */
    public final w f29942c;

    /* renamed from: d  reason: collision with root package name */
    public final C2962n f29943d;

    /* renamed from: f  reason: collision with root package name */
    public final C2398d f29945f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC2400f f29946g;

    /* renamed from: h  reason: collision with root package name */
    public final C2398d f29947h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC2400f f29948i;

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC2400f f29949j;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC2400f f29950k;

    /* renamed from: m  reason: collision with root package name */
    public final AbstractC2400f f29952m;

    /* renamed from: n  reason: collision with root package name */
    public final AbstractC2400f f29953n;

    /* renamed from: o  reason: collision with root package name */
    public final AbstractC2400f f29954o;

    /* renamed from: p  reason: collision with root package name */
    public final AbstractC2400f f29955p;

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC2400f f29956q;

    /* renamed from: r  reason: collision with root package name */
    public final AbstractC2400f f29957r;

    /* renamed from: s  reason: collision with root package name */
    public final AbstractC2400f f29958s;

    /* renamed from: t  reason: collision with root package name */
    public final AbstractC2400f f29959t;

    /* renamed from: u  reason: collision with root package name */
    public final AbstractC2400f f29960u;

    /* renamed from: v  reason: collision with root package name */
    public final AbstractC2400f f29961v;

    /* renamed from: e  reason: collision with root package name */
    public final s f29944e = this;

    /* renamed from: l  reason: collision with root package name */
    public final C2395a f29951l = new Object();

    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, ce.a] */
    public s(p pVar, w wVar, C2962n c2962n, Z9.d dVar, ld.i iVar) {
        this.f29941b = pVar;
        this.f29942c = wVar;
        this.f29943d = c2962n;
        this.f29940a = iVar;
        C2398d a5 = C2398d.a(iVar);
        this.f29945f = a5;
        this.f29946g = C2396b.a(new C2957i(a5, new r(0, this), 1));
        C2398d a10 = C2398d.a(dVar);
        this.f29947h = a10;
        this.f29948i = C2396b.a(new ka.c(a10));
        C2959k c2959k = pVar.f29911h0;
        AbstractC2400f abstractC2400f = pVar.f29884K;
        AbstractC2400f abstractC2400f2 = pVar.f29910h;
        C2398d c2398d = c2962n.f29833f;
        AbstractC2400f abstractC2400f3 = pVar.f29923o;
        AbstractC3557B.c0("clock", c2959k);
        AbstractC3557B.c0("integrityTokenGenerator", abstractC2400f);
        AbstractC3557B.c0("devicePreferences", abstractC2400f2);
        AbstractC3557B.c0("accountSession", c2398d);
        AbstractC3557B.c0("analytics", abstractC2400f3);
        AbstractC2400f a11 = C2396b.a(new C5716o(c2959k, abstractC2400f, abstractC2400f2, c2398d, abstractC2400f3));
        this.f29949j = a11;
        AbstractC2400f abstractC2400f4 = c2962n.S;
        AbstractC2400f abstractC2400f5 = c2962n.f29839i;
        AbstractC3557B.c0("api", abstractC2400f4);
        AbstractC3557B.c0("experimentManager", abstractC2400f5);
        this.f29950k = C2396b.a(new G(abstractC2400f4, a11, abstractC2400f5));
        int i10 = C2401g.f26599c;
        ArrayList arrayList = new ArrayList(1);
        List emptyList = Collections.emptyList();
        arrayList.add(this.f29951l);
        AbstractC2400f a12 = C2396b.a(new C5871b(new C2401g(arrayList, emptyList)));
        this.f29952m = a12;
        C2395a c2395a = this.f29951l;
        C2398d c2398d2 = pVar.f29902d;
        AbstractC2400f abstractC2400f6 = c2962n.f29836g0;
        Ua.d dVar2 = pVar.f29913i0;
        AbstractC3557B.c0(SIPServerTransaction.CONTENT_TYPE_APPLICATION, c2398d2);
        AbstractC3557B.c0("messageFileApi", abstractC2400f6);
        AbstractC3557B.c0("fileDownloader", dVar2);
        AbstractC2400f a13 = C2396b.a(new Ra.h(c2398d2, abstractC2400f6, dVar2, a12));
        if (c2395a.f26594a == null) {
            c2395a.f26594a = a13;
            C2398d c2398d3 = pVar.f29902d;
            AbstractC2400f abstractC2400f7 = c2962n.f29839i;
            AbstractC3557B.c0("context", c2398d3);
            AbstractC3557B.c0("experimentManager", abstractC2400f7);
            this.f29953n = C2396b.a(new C4575b(c2398d3, abstractC2400f7));
            ArrayList arrayList2 = new ArrayList(2);
            List emptyList2 = Collections.emptyList();
            arrayList2.add(this.f29951l);
            arrayList2.add(this.f29953n);
            C2401g c2401g = new C2401g(arrayList2, emptyList2);
            AbstractC2400f abstractC2400f8 = this.f29948i;
            AbstractC2400f abstractC2400f9 = c2962n.f29832e0;
            AbstractC2400f abstractC2400f10 = this.f29950k;
            AbstractC2400f abstractC2400f11 = c2962n.f29863u;
            C2398d c2398d4 = this.f29945f;
            AbstractC2400f abstractC2400f12 = c2962n.f29834f0;
            AbstractC2400f abstractC2400f13 = pVar.f29881H;
            AbstractC2400f abstractC2400f14 = c2962n.P;
            AbstractC2400f abstractC2400f15 = c2962n.f29810J;
            AbstractC3557B.c0("conversationIdsProvider", abstractC2400f8);
            AbstractC3557B.c0("repository", abstractC2400f9);
            AbstractC3557B.c0(ReferencesHeader.SERVICE, abstractC2400f10);
            AbstractC3557B.c0("settingsRepository", abstractC2400f11);
            AbstractC3557B.c0("coroutineScope", c2398d4);
            AbstractC3557B.c0("latencyTracker", abstractC2400f12);
            AbstractC3557B.c0("networkErrorMapper", abstractC2400f13);
            AbstractC3557B.c0("conversationItemMapper", abstractC2400f14);
            AbstractC3557B.c0("webSocketManager", abstractC2400f15);
            AbstractC2400f a14 = C2396b.a(new C4973D(abstractC2400f8, abstractC2400f9, abstractC2400f10, abstractC2400f11, c2398d4, abstractC2400f12, abstractC2400f13, abstractC2400f14, c2401g, abstractC2400f15));
            this.f29954o = a14;
            AbstractC2400f abstractC2400f16 = c2962n.f29870y;
            C2398d c2398d5 = this.f29945f;
            C2398d c2398d6 = this.f29947h;
            AbstractC3557B.c0("gizmosRepository", abstractC2400f16);
            AbstractC3557B.c0("screenCoroutineScope", c2398d5);
            AbstractC3557B.c0("conversationInfo", c2398d6);
            this.f29955p = C2396b.a(new C5600f(abstractC2400f16, c2398d5, c2398d6, a14));
            C2398d c2398d7 = pVar.f29902d;
            AbstractC3557B.c0("context", c2398d7);
            AbstractC2400f a15 = C2396b.a(new C5403D(c2398d7));
            AbstractC2400f abstractC2400f17 = this.f29954o;
            AbstractC2400f abstractC2400f18 = c2962n.f29839i;
            AbstractC2400f abstractC2400f19 = pVar.f29905e0;
            AbstractC3557B.c0("conversationCoordinator", abstractC2400f17);
            AbstractC3557B.c0("configurationManager", abstractC2400f18);
            AbstractC3557B.c0("assistantSessionProvider", abstractC2400f19);
            this.f29956q = C2396b.a(new C5400A(abstractC2400f17, abstractC2400f18, a15, abstractC2400f19));
            this.f29957r = C2396b.a(C6809z.f51811a);
            this.f29958s = C2396b.a(AbstractC4212F.f37236a);
            AbstractC2400f abstractC2400f20 = pVar.f29915j0;
            AbstractC2400f abstractC2400f21 = pVar.T;
            AbstractC3557B.c0("imageDownloader", abstractC2400f20);
            AbstractC3557B.c0("fileServiceApi", abstractC2400f21);
            this.f29959t = C2396b.a(new C4369f(abstractC2400f20, abstractC2400f21));
            AbstractC2400f abstractC2400f22 = this.f29954o;
            AbstractC2400f abstractC2400f23 = c2962n.f29846l0;
            C2398d c2398d8 = this.f29945f;
            AbstractC3557B.c0("conversationCoordinator", abstractC2400f22);
            AbstractC3557B.c0("provider", abstractC2400f23);
            AbstractC3557B.c0("scope", c2398d8);
            this.f29960u = C2396b.a(new Ab.d(abstractC2400f22, abstractC2400f23, c2398d8));
            C2398d c2398d9 = pVar.f29902d;
            C2398d c2398d10 = c2962n.f29835g;
            AbstractC2400f abstractC2400f24 = c2962n.f29849n;
            AbstractC2400f abstractC2400f25 = c2962n.f29866v0;
            AbstractC3557B.c0("context", c2398d9);
            AbstractC3557B.c0("scope", c2398d10);
            AbstractC3557B.c0("releaseCompletable", abstractC2400f24);
            AbstractC3557B.c0("customDataSourceFactory", abstractC2400f25);
            this.f29961v = C2396b.a(new C4604q(c2398d9, c2398d10, abstractC2400f24, abstractC2400f25));
            return;
        }
        throw new IllegalStateException();
    }

    @Override // Ad.v
    public final Set f() {
        return S.U(2, (Ad.u) this.f29943d.f29841j.get(), (Ad.u) this.f29946g.get());
    }
}
