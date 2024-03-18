package De;

import Qg.C1209l;
import ah.AbstractC1997h;
import ah.AbstractC2003n;
import ah.C1999j;
import com.google.android.gms.internal.play_billing.N;
import eh.AbstractC2904d;
import eh.C2917q;
import id.AbstractC3557B;
import io.ktor.utils.io.t;
import io.ktor.utils.io.x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import xe.C6417f;
import ze.AbstractC6848g;
import ze.l;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1997h f3616a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3617b;

    public i(C2917q c2917q) {
        AbstractC3557B.c0("format", c2917q);
        this.f3616a = c2917q;
        List<Ee.c> list = a.f3584a;
        ArrayList arrayList = new ArrayList();
        for (Ee.c cVar : list) {
            j a5 = cVar.a(c2917q);
            if (a5 != null) {
                arrayList.add(a5);
            }
        }
        this.f3617b = arrayList;
        if (this.f3616a instanceof AbstractC2003n) {
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + this.f3616a + " is not supported.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:32:0x00bd, B:34:0x00c3, B:38:0x00d2, B:41:0x00e2, B:44:0x00ee, B:46:0x00f4, B:48:0x010e, B:49:0x0111, B:50:0x0114, B:51:0x0130), top: B:54:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:32:0x00bd, B:34:0x00c3, B:38:0x00d2, B:41:0x00e2, B:44:0x00ee, B:46:0x00f4, B:48:0x010e, B:49:0x0111, B:50:0x0114, B:51:0x0130), top: B:54:0x00bd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Charset charset, Je.a aVar, x xVar, AbstractC4825e abstractC4825e) {
        c cVar;
        c cVar2;
        EnumC5000a enumC5000a;
        int i10;
        i iVar;
        Charset charset2;
        KSerializer kSerializer;
        AbstractC1997h abstractC1997h;
        i iVar2;
        Je.a aVar2;
        Object o22;
        x xVar2 = xVar;
        if (abstractC4825e instanceof c) {
            cVar = (c) abstractC4825e;
            int i11 = cVar.f3595l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f3595l0 = i11 - Integer.MIN_VALUE;
                cVar2 = cVar;
                Object obj = cVar2.f3593j0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = cVar2.f3595l0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            kSerializer = (KSerializer) cVar2.f3591h0;
                            charset2 = cVar2.f3590Z;
                            iVar = cVar2.f3589Y;
                            N.B0(obj);
                            Me.d dVar = (Me.d) obj;
                            try {
                                abstractC1997h = iVar.f3616a;
                                if (!(abstractC1997h instanceof AbstractC2003n)) {
                                    return ((AbstractC2904d) ((AbstractC2003n) abstractC1997h)).b(kSerializer, N.q0(dVar, charset2));
                                }
                                AbstractC3557B.c0("<this>", dVar);
                                long j6 = Long.MAX_VALUE;
                                while (j6 != 0) {
                                    Ne.c k10 = dVar.k();
                                    if (dVar.f12037j0 - dVar.f12036i0 < 1) {
                                        k10 = dVar.p(1, k10);
                                    }
                                    if (k10 == null) {
                                        break;
                                    }
                                    int min = (int) Math.min(k10.f12023c - k10.f12022b, j6);
                                    k10.c(min);
                                    dVar.f12036i0 += min;
                                    if (k10.f12023c - k10.f12022b == 0) {
                                        dVar.O(k10);
                                    }
                                    j6 -= min;
                                }
                                throw new IllegalStateException(("Unsupported format " + iVar.f3616a).toString());
                            } catch (Throwable th2) {
                                throw new Ce.g("Illegal input: " + th2.getMessage(), th2);
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar2 = cVar2.f3592i0;
                    Charset charset3 = cVar2.f3590Z;
                    iVar2 = cVar2.f3589Y;
                    N.B0(obj);
                    aVar2 = (Je.a) cVar2.f3591h0;
                    charset2 = charset3;
                } else {
                    N.B0(obj);
                    Ce.d dVar2 = new Ce.d(new C1209l(0, this.f3617b), charset, aVar, xVar, 1);
                    d dVar3 = new d(xVar2, null);
                    cVar2.f3589Y = this;
                    charset2 = charset;
                    cVar2.f3590Z = charset2;
                    aVar2 = aVar;
                    cVar2.f3591h0 = aVar2;
                    cVar2.f3592i0 = xVar2;
                    cVar2.f3595l0 = 1;
                    obj = L4.a.p0(dVar2, dVar3, cVar2);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    iVar2 = this;
                }
                if (!(!iVar2.f3617b.isEmpty()) && (obj != null || ((t) xVar2).r())) {
                    return obj;
                }
                KSerializer y02 = N.y0(((AbstractC2904d) iVar2.f3616a).f29417b, aVar2);
                cVar2.f3589Y = iVar2;
                cVar2.f3590Z = charset2;
                cVar2.f3591h0 = y02;
                cVar2.f3592i0 = null;
                cVar2.f3595l0 = 2;
                o22 = AbstractC3557B.o2(xVar2, cVar2);
                if (o22 != enumC5000a) {
                    return enumC5000a;
                }
                iVar = iVar2;
                obj = o22;
                kSerializer = y02;
                Me.d dVar4 = (Me.d) obj;
                abstractC1997h = iVar.f3616a;
                if (!(abstractC1997h instanceof AbstractC2003n)) {
                }
            }
        }
        cVar = new c(this, abstractC4825e);
        cVar2 = cVar;
        Object obj2 = cVar2.f3593j0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = cVar2.f3595l0;
        if (i10 == 0) {
        }
        if (!(!iVar2.f3617b.isEmpty())) {
        }
        KSerializer y022 = N.y0(((AbstractC2904d) iVar2.f3616a).f29417b, aVar2);
        cVar2.f3589Y = iVar2;
        cVar2.f3590Z = charset2;
        cVar2.f3591h0 = y022;
        cVar2.f3592i0 = null;
        cVar2.f3595l0 = 2;
        o22 = AbstractC3557B.o2(xVar2, cVar2);
        if (o22 != enumC5000a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(C6417f c6417f, Charset charset, Je.a aVar, Object obj, AbstractC4825e abstractC4825e) {
        g gVar;
        int i10;
        i iVar;
        AbstractC6848g abstractC6848g;
        KSerializer kSerializer;
        if (abstractC4825e instanceof g) {
            gVar = (g) abstractC4825e;
            int i11 = gVar.f3614m0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f3614m0 = i11 - Integer.MIN_VALUE;
                Object obj2 = gVar.f3612k0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = gVar.f3614m0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        obj = gVar.f3611j0;
                        aVar = gVar.f3610i0;
                        charset = gVar.f3609h0;
                        c6417f = gVar.f3608Z;
                        iVar = gVar.f3607Y;
                        N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    f fVar = new f(new C1209l(0, this.f3617b), c6417f, charset, aVar, obj);
                    ?? abstractC5163j = new AbstractC5163j(2, null);
                    gVar.f3607Y = this;
                    gVar.f3608Z = c6417f;
                    gVar.f3609h0 = charset;
                    gVar.f3610i0 = aVar;
                    gVar.f3611j0 = obj;
                    gVar.f3614m0 = 1;
                    obj2 = L4.a.p0(fVar, abstractC5163j, gVar);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    iVar = this;
                }
                abstractC6848g = (AbstractC6848g) obj2;
                if (abstractC6848g == null) {
                    return abstractC6848g;
                }
                try {
                    kSerializer = N.y0(((AbstractC2904d) iVar.f3616a).f29417b, aVar);
                } catch (C1999j unused) {
                    kSerializer = N.e0(obj, ((AbstractC2904d) iVar.f3616a).f29417b);
                }
                AbstractC1997h abstractC1997h = iVar.f3616a;
                if (abstractC1997h instanceof AbstractC2003n) {
                    return new l(((AbstractC2904d) ((AbstractC2003n) abstractC1997h)).d(kSerializer, obj), AbstractC4344b.v1(c6417f, charset));
                }
                throw new IllegalStateException(("Unsupported format " + abstractC1997h).toString());
            }
        }
        gVar = new g(this, abstractC4825e);
        Object obj22 = gVar.f3612k0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = gVar.f3614m0;
        if (i10 == 0) {
        }
        abstractC6848g = (AbstractC6848g) obj22;
        if (abstractC6848g == null) {
        }
    }
}
