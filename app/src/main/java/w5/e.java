package w5;

import G0.C0571a;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.C3959i;
import k6.AbstractC4194d;
import kf.AbstractC4268D;
import kf.t;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import u5.C5843c;

/* loaded from: classes.dex */
public final class e implements AbstractC6120a {

    /* renamed from: c  reason: collision with root package name */
    public static final Set f48025c = R4.b.X1("host", "device", "source", ReferencesHeader.SERVICE);

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5091c f48026a;

    /* renamed from: b  reason: collision with root package name */
    public final List f48027b = AbstractC4344b.G0(C6121b.f48014Z, C6121b.f48015h0, C6121b.f48016i0, C6121b.f48017j0, C6121b.f48018k0, new C0571a(19, this));

    public e(AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f48026a = abstractC5091c;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap a(Map map, String str, String str2, Set set) {
        int i10;
        EnumC5090b enumC5090b;
        String str3;
        C3959i c3959i;
        AbstractC3557B.c0("attributes", map);
        AbstractC3557B.c0("reservedKeys", set);
        char c10 = '.';
        int i11 = 1;
        if (str != null) {
            int i12 = 0;
            for (int i13 = 0; i13 < str.length(); i13++) {
                if (str.charAt(i13) == '.') {
                    i12++;
                }
            }
            i10 = i12 + 1;
        } else {
            i10 = 0;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC5090b = EnumC5090b.f42738Y;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null) {
                P4.a.m0(this.f48026a, 5, enumC5090b, new C6122c(entry, 0), null, false, 56);
            } else if (set.contains(entry.getKey())) {
                P4.a.m0(this.f48026a, 5, enumC5090b, new C6122c(entry, i11), null, false, 56);
            } else {
                String str4 = (String) entry.getKey();
                ArrayList arrayList2 = new ArrayList(str4.length());
                int i14 = 0;
                int i15 = i10;
                while (i14 < str4.length()) {
                    char charAt = str4.charAt(i14);
                    if (charAt == c10 && (i15 = i15 + 1) > 9) {
                        charAt = '_';
                    }
                    arrayList2.add(Character.valueOf(charAt));
                    i14++;
                    c10 = '.';
                }
                char[] cArr = new char[arrayList2.size()];
                Iterator it2 = arrayList2.iterator();
                int i16 = 0;
                while (it2.hasNext()) {
                    cArr[i16] = ((Character) it2.next()).charValue();
                    i16++;
                }
                String str5 = new String(cArr);
                if (!AbstractC3557B.K(str5, entry.getKey())) {
                    P4.a.m0(this.f48026a, 4, enumC5090b, new d(entry, str5, 0), null, false, 56);
                }
                c3959i = new C3959i(str5, entry.getValue());
                if (c3959i == null) {
                    arrayList.add(c3959i);
                }
                c10 = '.';
                i11 = 1;
            }
            c3959i = null;
            if (c3959i == null) {
            }
            c10 = '.';
            i11 = 1;
        }
        int size = arrayList.size() - 128;
        if (size > 0) {
            if (str2 != null) {
                str3 = "Too many attributes were added for [" + str2 + "], " + size + " had to be discarded.";
            } else {
                str3 = AbstractC4194d.v("Too many attributes were added, ", size, " had to be discarded.");
            }
            P4.a.m0(this.f48026a, 4, enumC5090b, new C5843c(str3, 2), null, false, 56);
        }
        List G22 = t.G2(arrayList, 128);
        Object obj = Q5.b.f14432a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC4268D.i1(G22, linkedHashMap);
        return linkedHashMap;
    }
}
