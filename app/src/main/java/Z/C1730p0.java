package Z;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jf.C3963m;
import z.C6672L;

/* renamed from: Z.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1730p0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f22673a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22674b;

    /* renamed from: c  reason: collision with root package name */
    public int f22675c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f22676d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f22677e;

    /* renamed from: f  reason: collision with root package name */
    public final C3963m f22678f;

    public C1730p0(int i10, ArrayList arrayList) {
        this.f22673a = arrayList;
        this.f22674b = i10;
        if (i10 >= 0) {
            this.f22676d = new ArrayList();
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                W w10 = (W) this.f22673a.get(i12);
                Integer valueOf = Integer.valueOf(w10.f22580c);
                int i13 = w10.f22581d;
                hashMap.put(valueOf, new P(i12, i11, i13));
                i11 += i13;
            }
            this.f22677e = hashMap;
            this.f22678f = R4.b.D1(new C6672L(11, this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final int a(W w10) {
        P p10 = (P) this.f22677e.get(Integer.valueOf(w10.f22580c));
        if (p10 != null) {
            return p10.f22534b;
        }
        return -1;
    }

    public final boolean b(int i10, int i11) {
        int i12;
        HashMap hashMap = this.f22677e;
        P p10 = (P) hashMap.get(Integer.valueOf(i10));
        if (p10 != null) {
            int i13 = p10.f22534b;
            int i14 = i11 - p10.f22535c;
            p10.f22535c = i11;
            if (i14 != 0) {
                for (P p11 : hashMap.values()) {
                    if (p11.f22534b >= i13 && !AbstractC3557B.K(p11, p10) && (i12 = p11.f22534b + i14) >= 0) {
                        p11.f22534b = i12;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
