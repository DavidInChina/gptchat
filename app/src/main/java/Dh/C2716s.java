package dh;

import Df.AbstractC0405d;
import Sg.C1391c;
import ah.C2000k;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import jf.C3961k;
import kotlinx.serialization.KSerializer;
import yf.AbstractC6583a;

/* renamed from: dh.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2716s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28484a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.n f28485b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f28486c;

    public C2716s(C2000k c2000k, int i10) {
        this.f28484a = i10;
        if (i10 != 1) {
            this.f28485b = c2000k;
            this.f28486c = new C1391c(1);
            return;
        }
        this.f28485b = c2000k;
        this.f28486c = new ConcurrentHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [wf.a, kotlin.jvm.internal.o] */
    public final Object a(AbstractC0405d abstractC0405d, ArrayList arrayList) {
        Object obj;
        Object obj2;
        Object obj3;
        Object putIfAbsent;
        switch (this.f28484a) {
            case 0:
                obj = ((C1391c) this.f28486c).get(R4.b.k1(abstractC0405d));
                AbstractC3557B.b0("get(...)", obj);
                Y y10 = (Y) obj;
                Object obj4 = y10.f28432a.get();
                if (obj4 == null) {
                    obj4 = y10.a(new kotlin.jvm.internal.o(0));
                }
                C2702g0 c2702g0 = (C2702g0) obj4;
                ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C2687M((Df.w) it.next()));
                }
                ConcurrentHashMap concurrentHashMap = c2702g0.f28452a;
                Object obj5 = concurrentHashMap.get(arrayList2);
                if (obj5 == null) {
                    try {
                        obj2 = (KSerializer) this.f28485b.invoke(abstractC0405d, arrayList);
                    } catch (Throwable th2) {
                        obj2 = com.google.android.gms.internal.play_billing.N.w(th2);
                    }
                    C3961k c3961k = new C3961k(obj2);
                    Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, c3961k);
                    if (putIfAbsent2 == null) {
                        obj5 = c3961k;
                    } else {
                        obj5 = putIfAbsent2;
                    }
                }
                return ((C3961k) obj5).f36158Y;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f28486c;
                Class k12 = R4.b.k1(abstractC0405d);
                Object obj6 = concurrentHashMap2.get(k12);
                if (obj6 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(k12, (obj6 = new C2702g0()))) != null) {
                    obj6 = putIfAbsent;
                }
                C2702g0 c2702g02 = (C2702g0) obj6;
                ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new C2687M((Df.w) it2.next()));
                }
                ConcurrentHashMap concurrentHashMap3 = c2702g02.f28452a;
                Object obj7 = concurrentHashMap3.get(arrayList3);
                if (obj7 == null) {
                    try {
                        obj3 = (KSerializer) this.f28485b.invoke(abstractC0405d, arrayList);
                    } catch (Throwable th3) {
                        obj3 = com.google.android.gms.internal.play_billing.N.w(th3);
                    }
                    C3961k c3961k2 = new C3961k(obj3);
                    Object putIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, c3961k2);
                    if (putIfAbsent3 == null) {
                        obj7 = c3961k2;
                    } else {
                        obj7 = putIfAbsent3;
                    }
                }
                return ((C3961k) obj7).f36158Y;
        }
    }
}
