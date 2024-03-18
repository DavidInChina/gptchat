package Bh;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import wh.AbstractC6236a;
import wh.AbstractC6242g;
import wh.C6249n;

/* renamed from: Bh.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0272u extends D {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2381c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0272u(int i10, int i11, Object obj, String str) {
        super(str, i10);
        this.f2381c = i11;
        this.f2382d = obj;
    }

    @Override // Bh.D
    public final Set a() {
        int i10 = this.f2381c;
        Object obj = this.f2382d;
        switch (i10) {
            case 0:
                return (Set) obj;
            default:
                return ((Map) obj).keySet();
        }
    }

    public final C0272u b(C0272u c0272u) {
        HashMap hashMap = new HashMap((Map) this.f2382d);
        for (Map.Entry entry : ((Map) c0272u.f2382d).entrySet()) {
            Set set = (Set) hashMap.get(entry.getKey());
            if (set == null) {
                hashMap.put(entry.getKey(), entry.getValue());
            } else {
                HashSet hashSet = new HashSet(set);
                hashSet.addAll((Collection) entry.getValue());
                hashMap.put(entry.getKey(), hashSet);
            }
        }
        return new C0272u(this.f2193b, 1, hashMap, this.f2192a);
    }

    public final C0272u c(C6249n c6249n) {
        HashSet hashSet = new HashSet();
        for (Set set : ((Map) this.f2382d).values()) {
            hashSet.addAll(set);
        }
        hashSet.add(c6249n);
        return new C0272u(this.f2193b, 0, hashSet, this.f2192a);
    }

    public final C0272u d(AbstractC6242g abstractC6242g, AbstractC0270t abstractC0270t) {
        HashMap hashMap = new HashMap((Map) this.f2382d);
        C6249n k12 = ((AbstractC6236a) abstractC6242g).k1();
        ((EnumC0268s) abstractC0270t).getClass();
        r rVar = new r(k12);
        Set set = (Set) hashMap.get(rVar);
        if (set == null) {
            hashMap.put(rVar, Collections.singleton(k12));
        } else {
            HashSet hashSet = new HashSet(set);
            hashSet.add(k12);
            hashMap.put(rVar, hashSet);
        }
        return new C0272u(this.f2193b, 1, hashMap, this.f2192a);
    }
}
