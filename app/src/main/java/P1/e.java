package P1;

import A.C0033n0;
import Ad.l;
import M1.AbstractC0931l;
import M1.C0923d;
import M1.J;
import M1.q;
import Ng.Q;
import Sg.C1394f;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC2031p;
import androidx.datastore.preferences.protobuf.AbstractC2040z;
import androidx.datastore.preferences.protobuf.C2030o;
import androidx.datastore.preferences.protobuf.D;
import id.AbstractC3557B;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kf.AbstractC4268D;
import kf.t;
import kf.v;
import l8.AbstractC4344b;
import wf.AbstractC6216a;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class e implements AbstractC0931l {

    /* renamed from: a  reason: collision with root package name */
    public static final e f13781a = new Object();

    /* JADX WARN: Type inference failed for: r5v0, types: [R4.a, java.lang.Object] */
    public static d a(C1394f c1394f, AbstractC6216a abstractC6216a, int i10) {
        v vVar = v.f37483Y;
        if ((i10 & 4) != 0) {
            c1394f = l.g(Q.f12906c.plus(Bi.c.z()));
        }
        C1394f c1394f2 = c1394f;
        AbstractC3557B.c0("scope", c1394f2);
        e eVar = f13781a;
        return new d(new J(new C0033n0(abstractC6216a, 8), eVar, AbstractC4344b.F0(new C0923d(vVar, null)), new Object(), c1394f2));
    }

    @Override // M1.AbstractC0931l
    public Object f() {
        return new b(true);
    }

    @Override // M1.AbstractC0931l
    public Object g(io.sentry.instrumentation.file.d dVar) {
        int i10;
        try {
            O1.e l10 = O1.e.l(dVar);
            b bVar = new b(false);
            g[] gVarArr = (g[]) Arrays.copyOf(new g[0], 0);
            AbstractC3557B.c0("pairs", gVarArr);
            bVar.a();
            if (gVarArr.length <= 0) {
                Map j6 = l10.j();
                AbstractC3557B.b0("preferencesProto.preferencesMap", j6);
                for (Map.Entry entry : j6.entrySet()) {
                    String str = (String) entry.getKey();
                    O1.i iVar = (O1.i) entry.getValue();
                    AbstractC3557B.b0("name", str);
                    AbstractC3557B.b0("value", iVar);
                    int x10 = iVar.x();
                    if (x10 == 0) {
                        i10 = -1;
                    } else {
                        i10 = j.f13786a[AbstractC6708l.f(x10)];
                    }
                    switch (i10) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            throw new RuntimeException();
                        case 1:
                            bVar.b(new f(str), Boolean.valueOf(iVar.p()));
                            break;
                        case 2:
                            bVar.b(new f(str), Float.valueOf(iVar.s()));
                            break;
                        case 3:
                            bVar.b(new f(str), Double.valueOf(iVar.r()));
                            break;
                        case 4:
                            bVar.b(new f(str), Integer.valueOf(iVar.t()));
                            break;
                        case 5:
                            bVar.b(new f(str), Long.valueOf(iVar.u()));
                            break;
                        case 6:
                            f fVar = new f(str);
                            String v10 = iVar.v();
                            AbstractC3557B.b0("value.string", v10);
                            bVar.b(fVar, v10);
                            break;
                        case 7:
                            f fVar2 = new f(str);
                            A k10 = iVar.w().k();
                            AbstractC3557B.b0("value.stringSet.stringsList", k10);
                            bVar.b(fVar2, t.P2(k10));
                            break;
                        case 8:
                            throw new IOException("Value not set.", null);
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(bVar.f13775a);
                AbstractC3557B.b0("unmodifiableMap(preferencesMap)", unmodifiableMap);
                return new b(AbstractC4268D.m1(unmodifiableMap), true);
            }
            g gVar = gVarArr[0];
            throw null;
        } catch (D e10) {
            throw new IOException("Unable to parse preferences proto.", e10);
        }
    }

    @Override // M1.AbstractC0931l
    public void h(Object obj, q qVar) {
        AbstractC2040z abstractC2040z;
        Map unmodifiableMap = Collections.unmodifiableMap(((b) ((h) obj)).f13775a);
        AbstractC3557B.b0("unmodifiableMap(preferencesMap)", unmodifiableMap);
        O1.c k10 = O1.e.k();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            Object value = entry.getValue();
            String str = ((f) entry.getKey()).f13782a;
            if (value instanceof Boolean) {
                O1.h y10 = O1.i.y();
                boolean booleanValue = ((Boolean) value).booleanValue();
                y10.c();
                O1.i.m((O1.i) y10.f25127Z, booleanValue);
                abstractC2040z = y10.a();
            } else if (value instanceof Float) {
                O1.h y11 = O1.i.y();
                float floatValue = ((Number) value).floatValue();
                y11.c();
                O1.i.n((O1.i) y11.f25127Z, floatValue);
                abstractC2040z = y11.a();
            } else if (value instanceof Double) {
                O1.h y12 = O1.i.y();
                double doubleValue = ((Number) value).doubleValue();
                y12.c();
                O1.i.l((O1.i) y12.f25127Z, doubleValue);
                abstractC2040z = y12.a();
            } else if (value instanceof Integer) {
                O1.h y13 = O1.i.y();
                int intValue = ((Number) value).intValue();
                y13.c();
                O1.i.o((O1.i) y13.f25127Z, intValue);
                abstractC2040z = y13.a();
            } else if (value instanceof Long) {
                O1.h y14 = O1.i.y();
                long longValue = ((Number) value).longValue();
                y14.c();
                O1.i.i((O1.i) y14.f25127Z, longValue);
                abstractC2040z = y14.a();
            } else if (value instanceof String) {
                O1.h y15 = O1.i.y();
                y15.c();
                O1.i.j((O1.i) y15.f25127Z, (String) value);
                abstractC2040z = y15.a();
            } else if (value instanceof Set) {
                O1.h y16 = O1.i.y();
                O1.f l10 = O1.g.l();
                l10.c();
                O1.g.i((O1.g) l10.f25127Z, (Set) value);
                y16.c();
                O1.i.k((O1.i) y16.f25127Z, l10);
                abstractC2040z = y16.a();
            } else {
                throw new IllegalStateException(AbstractC3557B.v2("PreferencesSerializer does not support type: ", value.getClass().getName()));
            }
            k10.getClass();
            str.getClass();
            k10.c();
            O1.e.i((O1.e) k10.f25127Z).put(str, (O1.i) abstractC2040z);
        }
        O1.e eVar = (O1.e) k10.a();
        int a5 = eVar.a();
        Logger logger = AbstractC2031p.f25100d;
        if (a5 > 4096) {
            a5 = 4096;
        }
        C2030o c2030o = new C2030o(qVar, a5);
        eVar.c(c2030o);
        if (c2030o.f25092h > 0) {
            c2030o.h0();
        }
    }
}
