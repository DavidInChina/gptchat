package tc;

import ah.AbstractC1998i;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import dh.C2682H;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import wd.B0;
import wd.C6189g;
import wd.C6191h;
import wd.C6200m;
import wd.E0;
import wd.EnumC6181c;
import wd.EnumC6187f;
import wd.EnumC6198k0;
import wd.H0;
import x8.W;

@AbstractC1998i
/* renamed from: tc.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5743l {
    public static final C5742k Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f46087c;

    /* renamed from: a  reason: collision with root package name */
    public final Map f46088a;

    /* renamed from: b  reason: collision with root package name */
    public final List f46089b;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, tc.k] */
    static {
        C6191h c6191h = C6191h.f48420a;
        f46087c = new KSerializer[]{new C2682H(c6191h, C5747p.f46099a, 1), new C2695d(c6191h, 0)};
    }

    public C5743l(int i10, Map map, List list) {
        if (3 == (i10 & 3)) {
            this.f46088a = map;
            this.f46089b = list;
            return;
        }
        R4.b.e2(i10, 3, C5741j.f46086b);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
        if (r7.equals("chatgptplusfreeplan") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (r7.equals("chatgptplusplan") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        r7 = wd.E0.f48328i0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
        if (r7.equals("chatgptplusfreeplan_with_expiration") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6200m a() {
        E0 e02;
        H0 h02;
        EnumC6187f enumC6187f;
        Set set;
        EnumC6198k0 enumC6198k0;
        Object obj;
        Map map = this.f46088a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C5749r c5749r = (C5749r) entry.getValue();
            C5746o c5746o = c5749r.f46102a;
            String str = c5746o.f46092a;
            C5752u c5752u = c5749r.f46104c;
            String str2 = c5752u.f46109b;
            switch (str2.hashCode()) {
                case -418064618:
                    break;
                case -237473191:
                    if (str2.equals("chatgptteamplan")) {
                        e02 = E0.f48329j0;
                        break;
                    }
                    e02 = E0.f48326Z;
                    break;
                case -107239704:
                    if (str2.equals("chatgptfreeplan")) {
                        e02 = E0.f48327h0;
                        break;
                    }
                    e02 = E0.f48326Z;
                    break;
                case 218511133:
                    if (str2.equals("chatgptenterpriseplan")) {
                        e02 = E0.f48330k0;
                        break;
                    }
                    e02 = E0.f48326Z;
                    break;
                case 1227495682:
                    break;
                case 1304494731:
                    break;
                default:
                    e02 = E0.f48326Z;
                    break;
            }
            E0 e03 = e02;
            C5755x c5755x = c5749r.f46103b;
            if (AbstractC3557B.K(c5755x.f46113a, "chatgpt_mobile_android")) {
                h02 = H0.f48338Z;
            } else {
                h02 = H0.f48339h0;
            }
            B0 b02 = new B0(e03, h02, c5752u.f46110c, c5755x.f46114b, c5752u.f46108a);
            String str3 = c5746o.f46095d;
            Object obj2 = null;
            if (AbstractC3557B.K(str3, "personal")) {
                enumC6187f = EnumC6187f.f48399Z;
            } else if (AbstractC3557B.K(str3, "workspace")) {
                enumC6187f = EnumC6187f.f48400h0;
            } else {
                W.G(Pc.e.a(), "Unknown account structure: " + str3, null, 6);
                enumC6187f = EnumC6187f.f48401i0;
            }
            EnumC6187f enumC6187f2 = enumC6187f;
            Set<String> set2 = c5749r.f46105d;
            if (set2 != null) {
                ArrayList arrayList = new ArrayList();
                for (String str4 : set2) {
                    EnumC6181c.f48384Z.getClass();
                    AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str4);
                    Iterator it = EnumC6181c.f48391n0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3557B.K(((EnumC6181c) obj).f48392Y, str4)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    EnumC6181c enumC6181c = (EnumC6181c) obj;
                    if (enumC6181c != null) {
                        arrayList.add(enumC6181c);
                    }
                }
                set = kf.t.P2(arrayList);
            } else {
                set = null;
            }
            if (set == null) {
                set = kf.x.f37485Y;
            }
            Set set3 = set;
            EnumC6198k0.Companion.getClass();
            Iterator it2 = EnumC6198k0.f48436n0.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (AbstractC3557B.K(((EnumC6198k0) next).f48437Y, c5746o.f46096e)) {
                        obj2 = next;
                    }
                }
            }
            EnumC6198k0 enumC6198k02 = (EnumC6198k0) obj2;
            if (enumC6198k02 == null) {
                enumC6198k0 = EnumC6198k0.f48434l0;
            } else {
                enumC6198k0 = enumC6198k02;
            }
            linkedHashMap.put(key, new C6189g(c5746o.f46093b, str, b02, c5746o.f46094c, enumC6187f2, set3, enumC6198k0, c5746o.f46097f, c5746o.f46098g));
        }
        return new C6200m(this.f46089b, linkedHashMap);
    }
}
