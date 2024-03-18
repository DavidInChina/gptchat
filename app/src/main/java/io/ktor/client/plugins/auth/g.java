package io.ktor.client.plugins.auth;

import Fe.l;
import G.X;
import com.google.android.gms.internal.play_billing.N;
import he.C3418c;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentMap$EL;
import java.util.Map;
import jf.y;
import me.L;
import me.U;
import me.x;
import nf.AbstractC4825e;
import of.EnumC5000a;
import te.C5760d;
import te.C5763g;
import wf.k;

/* loaded from: classes.dex */
public final class g implements x {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g gVar, U u10, C3418c c3418c, Yc.d dVar, C5760d c5760d, AbstractC4825e abstractC4825e) {
        b bVar;
        Object obj;
        Object obj2;
        int i10;
        g gVar2;
        C5760d c5760d2;
        gVar.getClass();
        if (abstractC4825e instanceof b) {
            bVar = (b) abstractC4825e;
            int i11 = bVar.f33332l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f33332l0 = i11 - Integer.MIN_VALUE;
                obj = bVar.f33330j0;
                obj2 = EnumC5000a.f41328Y;
                i10 = bVar.f33332l0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5760d2 = bVar.f33329i0;
                    c3418c = bVar.f33328h0;
                    u10 = bVar.f33327Z;
                    gVar2 = bVar.f33326Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    C5760d c5760d3 = new C5760d();
                    c5760d3.d(c5760d);
                    bVar.f33326Y = gVar;
                    bVar.f33327Z = u10;
                    bVar.f33328h0 = c3418c;
                    bVar.f33329i0 = c5760d3;
                    bVar.f33332l0 = 1;
                    if (dVar.a(c5760d3, bVar) != obj2) {
                        gVar2 = gVar;
                        c5760d2 = c5760d3;
                    } else {
                        return obj2;
                    }
                }
                l lVar = c5760d2.f46130f;
                gVar2.getClass();
                lVar.e(h.f33357c, y.f36177a);
                Ei.a aVar = i.f33362a;
                aVar.c("Sending new request to " + c3418c.c().O());
                bVar.f33326Y = null;
                bVar.f33327Z = null;
                bVar.f33328h0 = null;
                bVar.f33329i0 = null;
                bVar.f33332l0 = 2;
                obj = u10.a(c5760d2, bVar);
                if (obj == obj2) {
                    return obj2;
                }
                return obj;
            }
        }
        bVar = new b(gVar, abstractC4825e);
        obj = bVar.f33330j0;
        obj2 = EnumC5000a.f41328Y;
        i10 = bVar.f33332l0;
        if (i10 == 0) {
        }
        l lVar2 = c5760d2.f46130f;
        gVar2.getClass();
        lVar2.e(h.f33357c, y.f36177a);
        Ei.a aVar2 = i.f33362a;
        aVar2.c("Sending new request to " + c3418c.c().O());
        bVar.f33326Y = null;
        bVar.f33327Z = null;
        bVar.f33328h0 = null;
        bVar.f33329i0 = null;
        bVar.f33332l0 = 2;
        obj = u10.a(c5760d2, bVar);
        if (obj == obj2) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(g gVar, C3418c c3418c, Yc.d dVar, C5760d c5760d, AbstractC4825e abstractC4825e) {
        f fVar;
        Object obj;
        int i10;
        C3418c c3418c2;
        a aVar;
        Map map;
        gVar.getClass();
        if (abstractC4825e instanceof f) {
            fVar = (f) abstractC4825e;
            int i11 = fVar.f33355l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f33355l0 = i11 - Integer.MIN_VALUE;
                obj = fVar.f33353j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = fVar.f33355l0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        map = fVar.f33352i0;
                        a aVar2 = fVar.f33351h0;
                        Yc.d dVar2 = fVar.f33350Z;
                        c3418c2 = fVar.f33349Y;
                        N.B0(obj);
                        aVar = aVar2;
                        dVar = dVar2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    a aVar3 = (a) ConcurrentMap$EL.computeIfAbsent(h.f33359e.f6328Y, dVar, new Ge.a(new X(c.f33336j0, 12)));
                    Map map2 = (Map) c5760d.f46130f.f(h.f33360f, c.f33335i0);
                    Integer num = (Integer) map2.get(dVar);
                    if (num != null && num.intValue() >= aVar3.atomic) {
                        Ei.a aVar4 = i.f33362a;
                        aVar4.c("Refreshing token for " + c3418c.c().O());
                        c3418c.d();
                        fVar.f33349Y = c3418c;
                        fVar.f33350Z = dVar;
                        fVar.f33351h0 = aVar3;
                        fVar.f33352i0 = map2;
                        fVar.f33355l0 = 1;
                        dVar.getClass();
                        Boolean bool = Boolean.TRUE;
                        if (bool != enumC5000a) {
                            c3418c2 = c3418c;
                            map = map2;
                            aVar = aVar3;
                            obj = bool;
                        } else {
                            return enumC5000a;
                        }
                    }
                    return Boolean.TRUE;
                }
                if (((Boolean) obj).booleanValue()) {
                    Ei.a aVar5 = i.f33362a;
                    aVar5.c("Refreshing token failed for " + c3418c2.c().O());
                    return Boolean.FALSE;
                }
                map.put(dVar, new Integer(a.f33325a.incrementAndGet(aVar)));
                return Boolean.TRUE;
            }
        }
        fVar = new f(gVar, abstractC4825e);
        obj = fVar.f33353j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = fVar.f33355l0;
        if (i10 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // me.x
    public final void a(ge.d dVar, Object obj) {
        h hVar = (h) obj;
        AbstractC3557B.c0("plugin", hVar);
        AbstractC3557B.c0("scope", dVar);
        dVar.f31598k0.f(C5763g.f46139f.k(), new d(hVar, null));
        ((L) me.y.a(dVar, L.f39171c)).f39174b.add(new e(hVar, null));
    }

    @Override // me.x
    public final Object c(k kVar) {
        h hVar = new h();
        kVar.invoke(hVar);
        return hVar;
    }

    @Override // me.x
    public final Fe.a getKey() {
        return h.f33358d;
    }
}
