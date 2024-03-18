package S0;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15967a;

    public C(B... bArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bArr.length <= 0) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    kf.s.N1(list, arrayList);
                } else {
                    throw new IllegalArgumentException(android.gov.nist.core.a.n(android.gov.nist.core.a.s(Separators.QUOTE, str, "' must be unique. Actual [ ["), kf.t.m2(list, null, null, null, null, 63), ']').toString());
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.f15967a = arrayList2;
            if (arrayList2.size() <= 0) {
                return;
            }
            AbstractC2469q0.p(arrayList2.get(0));
            throw null;
        }
        B b10 = bArr[0];
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C) && AbstractC3557B.K(this.f15967a, ((C) obj).f15967a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15967a.hashCode();
    }
}
