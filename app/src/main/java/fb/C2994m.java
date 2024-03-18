package fb;

import ce.AbstractC2397c;
import f9.C2945A;
import fe.AbstractC3024b;
import fe.C3023a;
import fe.C3025c;
import fe.C3027e;
import fe.C3028f;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kf.t;

/* renamed from: fb.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2994m implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f30100a;

    public C2994m(C2945A c2945a) {
        this.f30100a = c2945a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r7 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r6 == null) goto L26;
     */
    @Override // p000if.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        String str;
        String str2;
        Object obj = this.f30100a.get();
        AbstractC3557B.b0("get(...)", obj);
        AbstractC3024b abstractC3024b = (AbstractC3024b) obj;
        List<C3023a> list = C3025c.f30248b;
        ArrayList arrayList = new ArrayList();
        for (C3023a c3023a : list) {
            String str3 = c3023a.f30243d;
            C2995n c2995n = null;
            if (str3 != null) {
                List list2 = c3023a.f30244e;
                C3027e c3027e = (C3027e) t.h2(list2);
                List list3 = c3023a.f30246g;
                if (c3027e == null || (str = c3027e.f30251b) == null) {
                    C3028f c3028f = (C3028f) t.h2(list3);
                    if (c3028f != null) {
                        str = c3028f.f30253a;
                    } else {
                        str = null;
                    }
                }
                C3027e c3027e2 = (C3027e) t.h2(list2);
                if (c3027e2 == null || (str2 = c3027e2.f30252c) == null) {
                    C3028f c3028f2 = (C3028f) t.h2(list3);
                    if (c3028f2 != null) {
                        str2 = c3028f2.f30254b;
                    } else {
                        str2 = null;
                    }
                }
                c2995n = new C2995n(c3023a.f30240a + ":" + c3023a.f30241b, str3, str, str2);
            }
            if (c2995n != null) {
                arrayList.add(c2995n);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((C2995n) next).f30101a)) {
                arrayList2.add(next);
            }
        }
        return new Ad.g(new C2996o(arrayList2));
    }
}
