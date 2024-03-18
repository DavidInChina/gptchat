package me;

import K4.C0813a;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import e1.C2762b;
import e9.C2813f;
import ge.C3258b;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import k6.AbstractC4194d;
import l8.AbstractC4344b;
import na.L0;
import nf.AbstractC4825e;
import oe.C4995d;
import oe.C4999h;
import pe.C5153e;
import q1.AbstractC5260f;
import qe.AbstractC5314f;
import qe.C5315g;
import qe.C5316h;
import qe.C5318j;
import qe.C5319k;
import qe.C5320l;
import re.C5487e;
import re.C5488f;
import te.C5763g;
import te.C5765i;
import ve.C6033b;
import ve.C6038g;

/* renamed from: me.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4628a implements x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f39190a;

    public /* synthetic */ C4628a(int i10) {
        this.f39190a = i10;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, q1.f] */
    @Override // me.x
    public final void a(ge.d dVar, Object obj) {
        Ie.c cVar;
        AbstractC5260f abstractC5260f;
        Ie.g gVar;
        C0813a c0813a;
        C0813a c0813a2;
        C0813a c0813a3;
        switch (this.f39190a) {
            case 0:
                AbstractC3557B.c0("plugin", (C4629b) obj);
                AbstractC3557B.c0("scope", dVar);
                C0813a c0813a4 = new C0813a("ObservableContent", 7);
                C0813a c0813a5 = C5763g.f46143j;
                C5763g c5763g = dVar.f31598k0;
                c5763g.getClass();
                AbstractC3557B.c0("reference", c0813a5);
                if (!c5763g.e(c0813a4)) {
                    int c10 = c5763g.c(c0813a5);
                    if (c10 != -1) {
                        int i10 = c10 + 1;
                        ArrayList arrayList = c5763g.f8574a;
                        int u02 = AbstractC4344b.u0(arrayList);
                        if (i10 <= u02) {
                            while (true) {
                                Object obj2 = arrayList.get(i10);
                                if (obj2 instanceof Ie.c) {
                                    cVar = (Ie.c) obj2;
                                } else {
                                    cVar = null;
                                }
                                if (cVar != null && (abstractC5260f = cVar.f8571b) != null) {
                                    if (abstractC5260f instanceof Ie.g) {
                                        gVar = (Ie.g) abstractC5260f;
                                    } else {
                                        gVar = null;
                                    }
                                    if (gVar != null && (c0813a = gVar.f8580h) != null && AbstractC3557B.K(c0813a, c0813a5)) {
                                        c10 = i10;
                                    }
                                    if (i10 != u02) {
                                        i10++;
                                    }
                                }
                            }
                        }
                        arrayList.add(c10 + 1, new Ie.c(c0813a4, new Ie.g(c0813a5)));
                    } else {
                        throw new C2762b("Phase " + c0813a5 + " was not registered for this pipeline");
                    }
                }
                c5763g.f(c0813a4, new Q3.h(9, null));
                dVar.f31601n0.f(C6033b.f47489i, new Q3.h(10, null));
                return;
            case 1:
                C4633f c4633f = (C4633f) obj;
                AbstractC3557B.c0("plugin", c4633f);
                AbstractC3557B.c0("scope", dVar);
                dVar.f31598k0.f(C5763g.f46140g, new B.D(c4633f, null, 2));
                return;
            case 2:
                C4647u c4647u = (C4647u) obj;
                AbstractC3557B.c0("plugin", c4647u);
                AbstractC3557B.c0("scope", dVar);
                dVar.f31598k0.f(C5763g.f46140g, new C4644q(c4647u, null, 0));
                C0813a c0813a6 = new C0813a("BeforeReceive", 7);
                switch (C6038g.f47498f.f20901a) {
                    case 28:
                        c0813a2 = C5765i.f46158k;
                        break;
                    default:
                        c0813a2 = C6038g.f47499g;
                        break;
                }
                C6038g c6038g = dVar.f31599l0;
                c6038g.getClass();
                AbstractC3557B.c0("reference", c0813a2);
                if (!c6038g.e(c0813a6)) {
                    int c11 = c6038g.c(c0813a2);
                    if (c11 != -1) {
                        c6038g.f8574a.add(c11, new Ie.c(c0813a6, new Object()));
                    } else {
                        throw new C2762b("Phase " + c0813a2 + " was not registered for this pipeline");
                    }
                }
                c6038g.f(c0813a6, new C4644q(c4647u, null, 1));
                ((L) y.a(dVar, L.f39171c)).f39174b.add(new C4644q(c4647u, null, 2));
                return;
            case 3:
                C4618A c4618a = (C4618A) obj;
                AbstractC3557B.c0("plugin", c4618a);
                AbstractC3557B.c0("scope", dVar);
                dVar.f31598k0.f(C5763g.f46143j, new z(c4618a, null, 0));
                dVar.f31599l0.f(C6038g.f47501i, new z(c4618a, null, 1));
                return;
            case 4:
                AbstractC3557B.c0("plugin", (C4624G) obj);
                AbstractC3557B.c0("scope", dVar);
                dVar.f31598k0.f(C5763g.f46140g, new C3258b(dVar, null, 1));
                return;
            case 5:
                L l10 = (L) obj;
                AbstractC3557B.c0("plugin", l10);
                AbstractC3557B.c0("scope", dVar);
                dVar.f31598k0.f(C5763g.f46144k, new C2813f(l10, dVar, null, 4));
                return;
            case 6:
                C4999h c4999h = (C4999h) obj;
                AbstractC3557B.c0("plugin", c4999h);
                AbstractC3557B.c0("scope", dVar);
                dVar.f31598k0.f(C5763g.f46142i, new B.D(c4999h, null, 4));
                dVar.f31599l0.f(C6038g.f47501i, new L0(c4999h, (AbstractC4825e) null, 7));
                return;
            case 7:
                pe.l lVar = (pe.l) obj;
                AbstractC3557B.c0("plugin", lVar);
                AbstractC3557B.c0("scope", dVar);
                dVar.f31598k0.f(C5763g.f46139f.k(), new C5153e(lVar, null, 0));
                dVar.f31600m0.f(C5765i.f46155h, new C5153e(lVar, null, 1));
                dVar.f31601n0.f(C6033b.f47486f.k(), new C5153e(lVar, null, 2));
                return;
            case 8:
                C5320l c5320l = (C5320l) obj;
                AbstractC3557B.c0("plugin", c5320l);
                AbstractC3557B.c0("scope", dVar);
                C4628a c4628a = C5320l.f44112e;
                dVar.f31600m0.f(C5765i.f46156i, new B.D(c5320l, null, 5));
                C0813a k10 = C6033b.f47486f.k();
                C5318j c5318j = new C5318j(c5320l, null);
                C6033b c6033b = dVar.f31601n0;
                c6033b.f(k10, c5318j);
                switch (C6038g.f47498f.f20901a) {
                    case 28:
                        c0813a3 = C5765i.f46158k;
                        break;
                    default:
                        c0813a3 = C6038g.f47499g;
                        break;
                }
                dVar.f31599l0.f(c0813a3, new L0(c5320l, (AbstractC4825e) null, 8));
                if (AbstractC4194d.j(c5320l.f44115b)) {
                    c6033b.f(C6033b.f47489i, new C5487e(new C5488f(new C5319k(c5320l, null), null), dVar, null, 0));
                    return;
                }
                return;
            case 9:
                C5488f c5488f = (C5488f) obj;
                AbstractC3557B.c0("plugin", c5488f);
                AbstractC3557B.c0("scope", dVar);
                dVar.f31601n0.f(C6033b.f47489i, new C5487e(c5488f, dVar, null, 0));
                return;
            default:
                se.j jVar = (se.j) obj;
                AbstractC3557B.c0("plugin", jVar);
                AbstractC3557B.c0("scope", dVar);
                boolean contains = dVar.f31593Y.K().contains(se.g.f45558a);
                dVar.f31598k0.f(C5763g.f46143j, new se.h(jVar, null, contains));
                dVar.f31599l0.f(C6038g.f47501i, new se.i(jVar, null, contains));
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [E2.S, java.lang.Object] */
    @Override // me.x
    public final Object c(wf.k kVar) {
        switch (this.f39190a) {
            case 0:
                return new Object();
            case 1:
                return new C4633f(kVar);
            case 2:
                r rVar = new r();
                kVar.invoke(rVar);
                return new C4647u(kf.t.y2(rVar.f39232a), kf.t.y2(rVar.f39233b), rVar.f39234c);
            case 3:
                U3.i iVar = new U3.i(11);
                kVar.invoke(iVar);
                return new C4618A((Set) iVar.f17414Y, (Map) iVar.f17415Z, (Charset) iVar.f17416h0, (Charset) iVar.f17417i0);
            case 4:
                return new Object();
            case 5:
                G4.m mVar = new G4.m(2);
                kVar.invoke(mVar);
                return new L(mVar.f6018Y);
            case 6:
                C4995d c4995d = new C4995d();
                kVar.invoke(c4995d);
                return new C4999h(c4995d.f41305b, c4995d.f41304a);
            case 7:
                pe.f fVar = new pe.f();
                kVar.invoke(fVar);
                return new pe.l(fVar.f43101b, fVar.f43100a);
            case 8:
                C5316h c5316h = new C5316h();
                kVar.invoke(c5316h);
                AbstractC5314f abstractC5314f = c5316h.f44096c;
                if (abstractC5314f == null) {
                    abstractC5314f = new C5315g();
                }
                return new C5320l(abstractC5314f, c5316h.f44097d, c5316h.f44094a, c5316h.f44095b);
            case 9:
                U3.e eVar = new U3.e(18);
                kVar.invoke(eVar);
                return new C5488f((wf.n) eVar.f17400Y, (wf.k) eVar.f17401Z);
            default:
                ?? obj = new Object();
                obj.f4233c = new U3.e(19);
                obj.f4231a = -1L;
                obj.f4232b = 2147483647L;
                kVar.invoke(obj);
                AbstractC2469q0.p(obj.f4234d);
                return new se.j(obj.f4231a, obj.f4232b, (U3.e) obj.f4233c);
        }
    }

    @Override // me.x
    public final Fe.a getKey() {
        switch (this.f39190a) {
            case 0:
                return C4629b.f39192b;
            case 1:
                return C4633f.f39200c;
            case 2:
                return C4647u.f39260e;
            case 3:
                return C4618A.f39134e;
            case 4:
                return C4624G.f39159b;
            case 5:
                return L.f39172d;
            case 6:
                return C4999h.f41321d;
            case 7:
                return pe.l.f43128j0;
            case 8:
                return C5320l.f44113f;
            case 9:
                return C5488f.f44978c;
            default:
                return se.j.f45569e;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4628a(int i10, int i11) {
        this(0);
        this.f39190a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            default:
                return;
        }
    }
}
