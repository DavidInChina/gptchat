package Dd;

import id.AbstractC3557B;
import ld.C4428a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import rc.C5451O;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a  reason: collision with root package name */
    public final C0389j f3547a;

    /* renamed from: b  reason: collision with root package name */
    public final Lc.e f3548b;

    /* renamed from: c  reason: collision with root package name */
    public final xd.g f3549c;

    public W(C0389j c0389j, Lc.e eVar, xd.g gVar, C4428a c4428a) {
        AbstractC3557B.c0("legacyStore", c0389j);
        AbstractC3557B.c0("devicePrefs", eVar);
        AbstractC3557B.c0("remoteSettingsRepository", gVar);
        AbstractC3557B.c0("coroutineScope", c4428a);
        this.f3547a = c0389j;
        this.f3548b = eVar;
        this.f3549c = gVar;
        Ad.l.O0(c4428a, null, null, new T(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(AbstractC4825e abstractC4825e) {
        U u10;
        EnumC5000a enumC5000a;
        int i10;
        Ed.h hVar;
        W w10;
        zd.q qVar;
        Object a5;
        if (abstractC4825e instanceof U) {
            u10 = (U) abstractC4825e;
            int i11 = u10.f3541i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                u10.f3541i0 = i11 - Integer.MIN_VALUE;
                Object obj = u10.f3539Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = u10.f3541i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            hVar = (Ed.h) u10.f3538Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            hVar.getClass();
                            return Ed.h.a((String) obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w10 = (W) u10.f3538Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Ia.j jVar = ((C5451O) this.f3549c).f44814c;
                    u10.f3538Y = this;
                    u10.f3541i0 = 1;
                    obj = L4.a.m0(jVar, u10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    w10 = this;
                }
                qVar = ((zd.g) obj).f51969e;
                if (qVar != null) {
                    Ed.i.Companion.getClass();
                    Ed.i c10 = Ed.h.c(qVar);
                    if (c10 != null) {
                        return c10;
                    }
                }
                Ed.h hVar2 = Ed.i.Companion;
                Lc.e eVar = w10.f3548b;
                u10.f3538Y = hVar2;
                u10.f3541i0 = 2;
                a5 = eVar.a(u10);
                if (a5 != enumC5000a) {
                    return enumC5000a;
                }
                hVar = hVar2;
                obj = a5;
                hVar.getClass();
                return Ed.h.a((String) obj);
            }
        }
        u10 = new U(this, abstractC4825e);
        Object obj2 = u10.f3539Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = u10.f3541i0;
        if (i10 == 0) {
        }
        qVar = ((zd.g) obj2).f51969e;
        if (qVar != null) {
        }
        Ed.h hVar22 = Ed.i.Companion;
        Lc.e eVar2 = w10.f3548b;
        u10.f3538Y = hVar22;
        u10.f3541i0 = 2;
        a5 = eVar2.a(u10);
        if (a5 != enumC5000a) {
        }
    }
}
