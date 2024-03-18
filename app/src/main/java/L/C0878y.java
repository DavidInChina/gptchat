package L;

import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import xe.C6417f;
import ze.C6842a;

/* renamed from: L.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0878y implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10351Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f10352Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f10353h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f10354i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f10355j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f10356k0;

    public /* synthetic */ C0878y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f10351Y = i10;
        this.f10352Z = obj;
        this.f10353h0 = obj2;
        this.f10354i0 = obj3;
        this.f10355j0 = obj4;
        this.f10356k0 = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        De.e eVar;
        Object obj2;
        EnumC5000a enumC5000a;
        int i10;
        AbstractC1207j abstractC1207j;
        C6842a c6842a;
        jf.y yVar = jf.y.f36177a;
        int i11 = this.f10351Y;
        Object obj3 = this.f10355j0;
        Object obj4 = this.f10354i0;
        Object obj5 = this.f10353h0;
        Object obj6 = this.f10352Z;
        switch (i11) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    P0 p02 = (P0) obj6;
                    if (p02.b()) {
                        kotlin.jvm.internal.m.n((T0.A) obj5, p02, ((N.t0) obj4).j(), (T0.o) obj3, (T0.s) this.f10356k0);
                        return yVar;
                    }
                }
                kotlin.jvm.internal.m.j((P0) obj6);
                return yVar;
            default:
                if (abstractC4825e instanceof De.e) {
                    eVar = (De.e) abstractC4825e;
                    int i12 = eVar.f3599Z;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        eVar.f3599Z = i12 - Integer.MIN_VALUE;
                        obj2 = eVar.f3598Y;
                        enumC5000a = EnumC5000a.f41328Y;
                        i10 = eVar.f3599Z;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                                    return yVar;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            abstractC1207j = eVar.f3600h0;
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                        } else {
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            AbstractC1207j abstractC1207j2 = (AbstractC1207j) obj6;
                            C6417f c6417f = (C6417f) obj5;
                            Charset charset = (Charset) obj4;
                            Je.a aVar = (Je.a) obj3;
                            eVar.f3600h0 = abstractC1207j2;
                            eVar.f3599Z = 1;
                            Ee.i iVar = (Ee.i) ((De.j) obj);
                            iVar.getClass();
                            if (AbstractC3557B.K(charset, Lg.a.f11131a) && AbstractC3557B.K(aVar.f9097a, kotlin.jvm.internal.C.f37623a.b(AbstractC1206i.class))) {
                                c6842a = new C6842a(new Ee.g(iVar, this.f10356k0, com.google.android.gms.internal.play_billing.N.y0(iVar.f4729a.f29417b, r.f.g(aVar)), charset, null), AbstractC4344b.v1(c6417f, charset));
                            } else {
                                c6842a = null;
                            }
                            if (c6842a != enumC5000a) {
                                C6842a c6842a2 = c6842a;
                                abstractC1207j = abstractC1207j2;
                                obj2 = c6842a2;
                            }
                            return enumC5000a;
                        }
                        eVar.f3600h0 = null;
                        eVar.f3599Z = 2;
                        if (abstractC1207j.c(obj2, eVar) != enumC5000a) {
                            return yVar;
                        }
                        return enumC5000a;
                    }
                }
                eVar = new De.e(this, abstractC4825e);
                obj2 = eVar.f3598Y;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = eVar.f3599Z;
                if (i10 == 0) {
                }
                eVar.f3600h0 = null;
                eVar.f3599Z = 2;
                if (abstractC1207j.c(obj2, eVar) != enumC5000a) {
                }
                return enumC5000a;
        }
    }
}
