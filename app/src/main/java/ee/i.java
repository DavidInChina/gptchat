package Ee;

import Ad.l;
import De.j;
import Kg.k;
import Ng.Q;
import Qg.AbstractC1206i;
import com.google.android.gms.internal.play_billing.N;
import eh.AbstractC2904d;
import id.AbstractC3557B;
import io.ktor.utils.io.x;
import io.ktor.utils.io.z;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import jf.y;
import kotlin.jvm.internal.C;
import kotlinx.serialization.KSerializer;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2904d f4729a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f4730b = new LinkedHashMap();

    public i(AbstractC2904d abstractC2904d) {
        AbstractC3557B.c0("format", abstractC2904d);
        this.f4729a = abstractC2904d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, AbstractC1206i abstractC1206i, KSerializer kSerializer, Charset charset, z zVar, AbstractC4825e abstractC4825e) {
        h hVar;
        EnumC5000a enumC5000a;
        int i10;
        z zVar2;
        a aVar;
        byte[] bArr;
        i iVar2;
        KSerializer kSerializer2;
        AbstractC1206i abstractC1206i2;
        Charset charset2;
        f fVar;
        iVar.getClass();
        if (abstractC4825e instanceof h) {
            hVar = (h) abstractC4825e;
            int i11 = hVar.f4728n0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f4728n0 = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f4726l0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = hVar.f4728n0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                N.B0(obj);
                                return y.f36177a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (a) hVar.f4721Z;
                        zVar2 = (z) hVar.f4720Y;
                        N.B0(obj);
                        bArr = aVar.f4695b;
                        hVar.f4720Y = null;
                        hVar.f4721Z = null;
                        hVar.f4728n0 = 3;
                        if (P4.a.T0(zVar2, bArr, hVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        return y.f36177a;
                    }
                    aVar = hVar.f4725k0;
                    zVar2 = hVar.f4724j0;
                    charset2 = hVar.f4723i0;
                    kSerializer2 = hVar.f4722h0;
                    iVar2 = (i) hVar.f4720Y;
                    N.B0(obj);
                    abstractC1206i2 = (AbstractC1206i) hVar.f4721Z;
                } else {
                    N.B0(obj);
                    LinkedHashMap linkedHashMap = iVar.f4730b;
                    Object obj2 = linkedHashMap.get(charset);
                    if (obj2 == null) {
                        obj2 = new a(charset);
                        linkedHashMap.put(charset, obj2);
                    }
                    a aVar2 = (a) obj2;
                    hVar.f4720Y = iVar;
                    abstractC1206i2 = abstractC1206i;
                    hVar.f4721Z = abstractC1206i2;
                    hVar.f4722h0 = kSerializer;
                    hVar.f4723i0 = charset;
                    hVar.f4724j0 = zVar;
                    hVar.f4725k0 = aVar2;
                    hVar.f4728n0 = 1;
                    if (P4.a.T0(zVar, aVar2.f4694a, hVar) != enumC5000a) {
                        iVar2 = iVar;
                        aVar = aVar2;
                        kSerializer2 = kSerializer;
                        charset2 = charset;
                        zVar2 = zVar;
                    } else {
                        return enumC5000a;
                    }
                }
                fVar = new f(zVar2, aVar, iVar2, kSerializer2, charset2);
                hVar.f4720Y = zVar2;
                hVar.f4721Z = aVar;
                hVar.f4722h0 = null;
                hVar.f4723i0 = null;
                hVar.f4724j0 = null;
                hVar.f4725k0 = null;
                hVar.f4728n0 = 2;
                if (abstractC1206i2.b(fVar, hVar) == enumC5000a) {
                    return enumC5000a;
                }
                bArr = aVar.f4695b;
                hVar.f4720Y = null;
                hVar.f4721Z = null;
                hVar.f4728n0 = 3;
                if (P4.a.T0(zVar2, bArr, hVar) == enumC5000a) {
                }
                return y.f36177a;
            }
        }
        hVar = new h(iVar, abstractC4825e);
        Object obj3 = hVar.f4726l0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = hVar.f4728n0;
        if (i10 == 0) {
        }
        fVar = new f(zVar2, aVar, iVar2, kSerializer2, charset2);
        hVar.f4720Y = zVar2;
        hVar.f4721Z = aVar;
        hVar.f4722h0 = null;
        hVar.f4723i0 = null;
        hVar.f4724j0 = null;
        hVar.f4725k0 = null;
        hVar.f4728n0 = 2;
        if (abstractC1206i2.b(fVar, hVar) == enumC5000a) {
        }
        bArr = aVar.f4695b;
        hVar.f4720Y = null;
        hVar.f4721Z = null;
        hVar.f4728n0 = 3;
        if (P4.a.T0(zVar2, bArr, hVar) == enumC5000a) {
        }
        return y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Charset charset, Je.a aVar, x xVar, AbstractC4825e abstractC4825e) {
        d dVar;
        int i10;
        try {
            if (abstractC4825e instanceof d) {
                dVar = (d) abstractC4825e;
                int i11 = dVar.f4702h0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    dVar.f4702h0 = i11 - Integer.MIN_VALUE;
                    Object obj = dVar.f4700Y;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = dVar.f4702h0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        if (!AbstractC3557B.K(charset, Lg.a.f11131a) || !AbstractC3557B.K(aVar.f9097a, C.f37623a.b(k.class))) {
                            return null;
                        }
                        AbstractC2904d abstractC2904d = this.f4729a;
                        dVar.f4702h0 = 1;
                        obj = l.n1(dVar, Q.f12906c, new b(aVar, xVar, null, abstractC2904d));
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return obj;
                }
            }
            if (i10 == 0) {
            }
            return obj;
        } catch (Throwable th2) {
            throw new Ce.g("Illegal input: " + th2.getMessage(), th2);
        }
        dVar = new d(this, abstractC4825e);
        Object obj2 = dVar.f4700Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = dVar.f4702h0;
    }
}
