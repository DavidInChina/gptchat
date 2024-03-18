package Vd;

import Df.H;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import dh.C0;
import dh.C2678D;
import dh.C2679E;
import dh.C2685K;
import dh.C2686L;
import dh.C2699f;
import dh.C2701g;
import dh.C2705i;
import dh.C2707j;
import dh.C2713o;
import dh.C2714p;
import dh.C2720w;
import dh.C2721x;
import dh.F0;
import dh.I0;
import dh.J0;
import dh.Q;
import dh.S;
import dh.s0;
import dh.t0;
import dh.u0;
import dh.z0;
import eh.AbstractC2904d;
import eh.AbstractC2911k;
import eh.C2917q;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.C3959i;
import jf.C3964n;
import jf.C3966p;
import jf.C3968r;
import jf.C3970t;
import jf.w;
import jf.y;
import kf.AbstractC4268D;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final C2917q f18603a = P4.a.f(b.f18585i0);

    /* renamed from: b  reason: collision with root package name */
    public static final C2917q f18604b = P4.a.f(b.f18586j0);

    /* renamed from: c  reason: collision with root package name */
    public static final Map f18605c;

    static {
        D d10 = C.f37623a;
        f18605c = AbstractC4268D.a1(new C3959i(d10.b(String.class), u0.f28491a), new C3959i(d10.b(Character.TYPE), C2714p.f28474a), new C3959i(d10.b(char[].class), C2713o.f28471c), new C3959i(d10.b(Double.TYPE), C2721x.f28501a), new C3959i(d10.b(double[].class), C2720w.f28499c), new C3959i(d10.b(Float.TYPE), C2679E.f28388a), new C3959i(d10.b(float[].class), C2678D.f28385c), new C3959i(d10.b(Long.TYPE), S.f28417a), new C3959i(d10.b(long[].class), Q.f28416c), new C3959i(d10.b(Integer.TYPE), C2686L.f28406a), new C3959i(d10.b(int[].class), C2685K.f28405c), new C3959i(d10.b(Short.TYPE), t0.f28489a), new C3959i(d10.b(short[].class), s0.f28487c), new C3959i(d10.b(Byte.TYPE), C2707j.f28460a), new C3959i(d10.b(byte[].class), C2705i.f28457c), new C3959i(d10.b(Boolean.TYPE), C2701g.f28450a), new C3959i(d10.b(boolean[].class), C2699f.f28446c), new C3959i(d10.b(y.class), J0.f28403b), new C3959i(d10.b(C3968r.class), C0.f28383a), new C3959i(d10.b(C3970t.class), F0.f28391a), new C3959i(d10.b(C3966p.class), z0.f28513a), new C3959i(d10.b(w.class), I0.f28399a));
    }

    public static final Boolean a(String str, kotlinx.serialization.json.c cVar) {
        kotlinx.serialization.json.d dVar;
        AbstractC3557B.c0("<this>", cVar);
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get(str);
        if (bVar == null) {
            return null;
        }
        if (bVar instanceof kotlinx.serialization.json.d) {
            dVar = (kotlinx.serialization.json.d) bVar;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return null;
        }
        return AbstractC2911k.d(dVar);
    }

    public static final void b(androidx.lifecycle.D d10, kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0("obj", cVar);
        for (Map.Entry entry : cVar.f37662Y.entrySet()) {
            d10.m((String) entry.getKey(), (kotlinx.serialization.json.b) entry.getValue());
        }
    }

    public static final void c(androidx.lifecycle.D d10, String str, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            H.k0(d10, str, charSequence.toString());
        } else {
            H.k0(d10, str, "undefined");
        }
    }

    public static final kotlinx.serialization.json.b d(Object obj) {
        Object[] objArr;
        AbstractC3557B.c0("<this>", obj);
        if (obj instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof kotlinx.serialization.json.b) {
                    kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) value;
                    AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                    AbstractC3557B.c0("element", bVar);
                    kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) linkedHashMap.put(str, bVar);
                } else {
                    kotlinx.serialization.json.b d10 = d(value);
                    AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                    AbstractC3557B.c0("element", d10);
                    kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) linkedHashMap.put(str, d10);
                }
            }
            return new kotlinx.serialization.json.c(linkedHashMap);
        } else if (obj instanceof Object[]) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Object[]) obj) {
                if (obj2 instanceof kotlinx.serialization.json.b) {
                    kotlinx.serialization.json.b bVar4 = (kotlinx.serialization.json.b) obj2;
                    AbstractC3557B.c0("element", bVar4);
                    arrayList.add(bVar4);
                } else {
                    kotlinx.serialization.json.b d11 = d(obj2);
                    AbstractC3557B.c0("element", d11);
                    arrayList.add(d11);
                }
            }
            return new kotlinx.serialization.json.a(arrayList);
        } else if (obj instanceof Collection) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : (Collection) obj) {
                if (obj3 instanceof kotlinx.serialization.json.b) {
                    kotlinx.serialization.json.b bVar5 = (kotlinx.serialization.json.b) obj3;
                    AbstractC3557B.c0("element", bVar5);
                    arrayList2.add(bVar5);
                } else {
                    kotlinx.serialization.json.b d12 = d(obj3);
                    AbstractC3557B.c0("element", d12);
                    arrayList2.add(d12);
                }
            }
            return new kotlinx.serialization.json.a(arrayList2);
        } else if (obj instanceof C3959i) {
            C3959i c3959i = (C3959i) obj;
            kotlinx.serialization.json.b d13 = d(c3959i.f36155Y);
            kotlinx.serialization.json.b d14 = d(c3959i.f36156Z);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            AbstractC3557B.c0("element", d13);
            kotlinx.serialization.json.b bVar6 = (kotlinx.serialization.json.b) linkedHashMap2.put("first", d13);
            AbstractC3557B.c0("element", d14);
            kotlinx.serialization.json.b bVar7 = (kotlinx.serialization.json.b) linkedHashMap2.put("second", d14);
            return new kotlinx.serialization.json.c(linkedHashMap2);
        } else if (obj instanceof C3964n) {
            C3964n c3964n = (C3964n) obj;
            kotlinx.serialization.json.b d15 = d(c3964n.f36165Y);
            kotlinx.serialization.json.b d16 = d(c3964n.f36166Z);
            kotlinx.serialization.json.b d17 = d(c3964n.f36167h0);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            AbstractC3557B.c0("element", d15);
            kotlinx.serialization.json.b bVar8 = (kotlinx.serialization.json.b) linkedHashMap3.put("first", d15);
            AbstractC3557B.c0("element", d16);
            kotlinx.serialization.json.b bVar9 = (kotlinx.serialization.json.b) linkedHashMap3.put("second", d16);
            AbstractC3557B.c0("element", d17);
            kotlinx.serialization.json.b bVar10 = (kotlinx.serialization.json.b) linkedHashMap3.put("third", d17);
            return new kotlinx.serialization.json.c(linkedHashMap3);
        } else if (obj instanceof Map.Entry) {
            Map.Entry entry2 = (Map.Entry) obj;
            kotlinx.serialization.json.b d18 = d(entry2.getKey());
            kotlinx.serialization.json.b d19 = d(entry2.getValue());
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            AbstractC3557B.c0("element", d18);
            kotlinx.serialization.json.b bVar11 = (kotlinx.serialization.json.b) linkedHashMap4.put(SubscriberAttributeKt.JSON_NAME_KEY, d18);
            AbstractC3557B.c0("element", d19);
            kotlinx.serialization.json.b bVar12 = (kotlinx.serialization.json.b) linkedHashMap4.put("value", d19);
            return new kotlinx.serialization.json.c(linkedHashMap4);
        } else {
            KSerializer kSerializer = (KSerializer) f18605c.get(C.f37623a.b(obj.getClass()));
            if (kSerializer == null) {
                kSerializer = null;
            }
            if (kSerializer != null) {
                return AbstractC2904d.f29415d.c(kSerializer, obj);
            }
            return JsonNull.INSTANCE;
        }
    }
}
