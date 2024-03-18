package Yh;

import Wh.C;
import Wh.D;
import Wh.F;
import Wh.n;
import Wh.q;
import Wh.t;
import Wh.x;
import Wh.z;
import ai.j;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import bi.f;
import id.AbstractC3557B;
import java.util.ArrayList;
import jh.L1;

/* loaded from: classes2.dex */
public final class a implements t {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f22426a = 0;

    @Override // Wh.t
    public final D a(f fVar) {
        j jVar;
        String str;
        q qVar;
        String str2;
        System.currentTimeMillis();
        z zVar = fVar.f26028e;
        AbstractC3557B.c0("request", zVar);
        b bVar = new b(zVar, null);
        if (zVar.a().f21181j) {
            bVar = new b(null, null);
        }
        j jVar2 = fVar.f26024a;
        if (jVar2 instanceof j) {
            jVar = jVar2;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            n nVar = jVar.f24259j0;
        }
        z zVar2 = bVar.f22427a;
        D d10 = bVar.f22428b;
        if (zVar2 == null && d10 == null) {
            C c10 = new C();
            c10.d(zVar);
            c10.f21118b = x.HTTP_1_1;
            c10.f21119c = 504;
            c10.f21120d = "Unsatisfiable Request (only-if-cached)";
            c10.f21123g = Xh.b.f21998c;
            c10.f21127k = -1L;
            c10.f21128l = System.currentTimeMillis();
            D a5 = c10.a();
            AbstractC3557B.c0("call", jVar2);
            return a5;
        } else if (zVar2 == null) {
            AbstractC3557B.Z(d10);
            C i10 = d10.i();
            D e10 = L1.e(d10);
            C.b("cacheResponse", e10);
            i10.f21125i = e10;
            D a10 = i10.a();
            AbstractC3557B.c0("call", jVar2);
            return a10;
        } else {
            if (d10 != null) {
                AbstractC3557B.c0("call", jVar2);
            }
            D b10 = fVar.b(zVar2);
            String str3 = "networkResponse";
            if (d10 != null) {
                if (b10.f21133i0 == 304) {
                    C i11 = d10.i();
                    ArrayList arrayList = new ArrayList(20);
                    q qVar2 = d10.f21135k0;
                    int size = qVar2.size();
                    int i12 = 0;
                    while (true) {
                        qVar = b10.f21135k0;
                        if (i12 >= size) {
                            break;
                        }
                        String y10 = qVar2.y(i12);
                        int i13 = size;
                        String T = qVar2.T(i12);
                        q qVar3 = qVar2;
                        if (Lg.n.f2(SIPHeaderNames.WARNING, y10)) {
                            str2 = str3;
                            if (Lg.n.I2(T, "1", false)) {
                                i12++;
                                size = i13;
                                qVar2 = qVar3;
                                str3 = str2;
                            }
                        } else {
                            str2 = str3;
                        }
                        if (Lg.n.f2(SIPHeaderNames.CONTENT_LENGTH, y10) || Lg.n.f2(SIPHeaderNames.CONTENT_ENCODING, y10) || Lg.n.f2(SIPHeaderNames.CONTENT_TYPE, y10) || !L1.l(y10) || qVar.r(y10) == null) {
                            AbstractC3557B.c0("name", y10);
                            AbstractC3557B.c0("value", T);
                            arrayList.add(y10);
                            arrayList.add(Lg.n.U2(T).toString());
                        }
                        i12++;
                        size = i13;
                        qVar2 = qVar3;
                        str3 = str2;
                    }
                    String str4 = str3;
                    int size2 = qVar.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        String y11 = qVar.y(i14);
                        if (!Lg.n.f2(SIPHeaderNames.CONTENT_LENGTH, y11) && !Lg.n.f2(SIPHeaderNames.CONTENT_ENCODING, y11) && !Lg.n.f2(SIPHeaderNames.CONTENT_TYPE, y11) && L1.l(y11)) {
                            String T10 = qVar.T(i14);
                            AbstractC3557B.c0("name", y11);
                            AbstractC3557B.c0("value", T10);
                            arrayList.add(y11);
                            arrayList.add(Lg.n.U2(T10).toString());
                        }
                    }
                    i11.c(new q((String[]) arrayList.toArray(new String[0])));
                    i11.f21127k = b10.f21140p0;
                    i11.f21128l = b10.f21141q0;
                    D e11 = L1.e(d10);
                    C.b("cacheResponse", e11);
                    i11.f21125i = e11;
                    D e12 = L1.e(b10);
                    C.b(str4, e12);
                    i11.f21124h = e12;
                    i11.a();
                    F f6 = b10.f21136l0;
                    AbstractC3557B.Z(f6);
                    f6.close();
                    AbstractC3557B.Z(null);
                    throw null;
                }
                str = str3;
                F f10 = d10.f21136l0;
                if (f10 != null) {
                    Xh.b.c(f10);
                }
            } else {
                str = str3;
            }
            C i15 = b10.i();
            D e13 = L1.e(d10);
            C.b("cacheResponse", e13);
            i15.f21125i = e13;
            D e14 = L1.e(b10);
            C.b(str, e14);
            i15.f21124h = e14;
            return i15.a();
        }
    }
}
