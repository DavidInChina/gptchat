package l9;

import C6.f;
import C6.g;
import Lc.e;
import Ng.Q;
import android.app.Application;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.C3959i;
import jf.y;
import k6.C4196f;
import k6.C4199i;
import kf.AbstractC4268D;
import kf.q;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import o5.AbstractC4918b;
import o5.C4917a;
import od.AbstractC4991b;
import od.EnumC4990a;
import of.EnumC5000a;
import p5.AbstractC5092d;
import p5.EnumC5090b;
import p6.C5093a;
import u5.C5843c;
import v5.C5974a;
import v5.C5975b;
import v6.C5977a;
import wd.EnumC6206t;
import y6.C6545a;
import yf.AbstractC6583a;

/* renamed from: l9.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4355c implements AbstractC4991b {

    /* renamed from: e  reason: collision with root package name */
    public static final Map f37891e = AbstractC4268D.a1(new C3959i("app_version_code", 160), new C3959i("app_version_name", "1.2024.066"));

    /* renamed from: a  reason: collision with root package name */
    public final EnumC6206t f37892a;

    /* renamed from: b  reason: collision with root package name */
    public final e f37893b;

    /* renamed from: c  reason: collision with root package name */
    public final f f37894c;

    /* renamed from: d  reason: collision with root package name */
    public final i6.e f37895d;

    /* JADX WARN: Type inference failed for: r23v1, types: [y6.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [R4.a, java.lang.Object] */
    public C4355c(EnumC6206t enumC6206t, Application application, e eVar) {
        Float f6;
        AbstractC3557B.c0("appType", enumC6206t);
        AbstractC3557B.c0("appContext", application);
        AbstractC3557B.c0("devicePreferences", eVar);
        this.f37892a = enumC6206t;
        this.f37893b = eVar;
        C5974a c5974a = C5975b.f47251h;
        ArrayList S = Gi.e.S("Network requests", AbstractC4344b.F0("openai.com"));
        int n02 = P4.a.n0(AbstractC6583a.H1(S, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02 < 16 ? 16 : n02);
        Iterator it = S.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = (String) next;
            linkedHashMap.put(next, R4.b.X1(g.f2720Y, g.f2723i0));
        }
        C5975b c5975b = new C5975b(C5974a.a(C5974a.a(c5974a, false, linkedHashMap, 0, 0, 2043), true, null, 0, 0, 2045), "pub092a6a18eee02856520dee132f7eb321", "release", "googlePlay", null, false, P4.a.o0(new C3959i("_dd.version", "160")));
        C3636c1 c3636c1 = new C3636c1(11);
        String str2 = (String) c3636c1.f34285Z;
        U5.a aVar = (U5.a) c3636c1.f34286h0;
        AbstractC3557B.c0("eventMapper", aVar);
        this.f37894c = new f(null, new Object(), true);
        C4196f a5 = C4196f.a(C4196f.a(C4196f.a(C4196f.a(C4196f.a(C4199i.f37137B, 0.0f, 0.0f, null, null, null, new C5093a(100L), false, 1048319), 0.0f, 0.0f, q.z3(new C5977a[0]), new Object(), null, null, false, 1048479), 0.0f, 0.0f, null, null, null, null, true, 983039), A7.b.W0(this.f37892a), 0.0f, null, null, null, null, false, 1048573), 0.0f, 0.0f, null, null, new y6.d(new C6545a(1)), null, false, 1048447);
        Object obj = a5.f37127t.get("_dd.telemetry.configuration_sample_rate");
        if (obj != null && (obj instanceof Number)) {
            f6 = Float.valueOf(((Number) obj).floatValue());
        } else {
            f6 = null;
        }
        this.f37895d = new i6.e("c9880c8d-14b8-4540-aefd-e4a07e9216b4", f6 != null ? C4196f.a(a5, 0.0f, f6.floatValue(), null, null, null, null, false, 1048567) : a5);
        y5.g gVar = AbstractC4918b.f40603a;
        synchronized (gVar) {
            if (((AbstractC5092d) gVar.f50811b.get("_dd.sdk_core.default")) != null) {
                P4.a.m0(Q5.c.f14433a, 4, EnumC5090b.f42738Y, C4917a.f40600Z, null, false, 56);
            } else {
                String b02 = AbstractC4918b.f40604b.b0("null/" + c5975b.f47252a.f47249h.f40608Y);
                if (b02 == null) {
                    P4.a.m0(Q5.c.f14433a, 5, EnumC5090b.f42738Y, C4917a.f40601h0, null, false, 56);
                } else {
                    u5.f fVar = new u5.f(application, b02, "_dd.sdk_core.default");
                    fVar.s(c5975b);
                    fVar.r().f50791i.C();
                    LinkedHashMap linkedHashMap2 = gVar.f50811b;
                    if (linkedHashMap2.containsKey("_dd.sdk_core.default")) {
                        P4.a.m0(gVar.f50810a, 4, EnumC5090b.f42738Y, new C5843c("_dd.sdk_core.default", 4), null, false, 56);
                    } else {
                        linkedHashMap2.put("_dd.sdk_core.default", fVar);
                    }
                }
            }
        }
        r5.d dVar = (r5.d) AbstractC4918b.a(null);
        dVar.i(new W5.c(dVar, str2, aVar));
    }

    @Override // od.AbstractC4991b
    public final EnumC4990a a() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // od.AbstractC4991b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C4354b c4354b;
        int i10;
        String str;
        if (abstractC4825e instanceof C4354b) {
            c4354b = (C4354b) abstractC4825e;
            int i11 = c4354b.f37890i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4354b.f37890i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4354b.f37888Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4354b.f37890i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        str = c4354b.f37887Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    c4354b.f37887Y = "device_id";
                    c4354b.f37890i0 = 1;
                    Object a5 = this.f37893b.a(c4354b);
                    if (a5 != enumC5000a) {
                        str = "device_id";
                        obj = a5;
                    } else {
                        return enumC5000a;
                    }
                }
                AbstractC4918b.c(null, null, P4.a.o0(new C3959i(str, obj)), 23);
                return y.f36177a;
            }
        }
        c4354b = new C4354b(this, abstractC4825e);
        Object obj2 = c4354b.f37888Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4354b.f37890i0;
        if (i10 == 0) {
        }
        AbstractC4918b.c(null, null, P4.a.o0(new C3959i(str, obj2)), 23);
        return y.f36177a;
    }

    @Override // od.AbstractC4991b
    public final Tg.e c() {
        return Q.f12904a;
    }

    @Override // od.AbstractC4991b
    public final Object d(AbstractC4825e abstractC4825e) {
        return y.f36177a;
    }

    @Override // od.AbstractC4991b
    public final void e() {
    }
}
