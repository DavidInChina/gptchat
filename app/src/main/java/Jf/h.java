package Jf;

import Bg.D;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class h implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9107Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f9108Z;

    public /* synthetic */ h(l lVar, int i10) {
        this.f9107Y = i10;
        this.f9108Z = lVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        n[] values;
        int i10 = this.f9107Y;
        l lVar = this.f9108Z;
        switch (i10) {
            case 0:
                return Arrays.asList(lVar.k().r(q.f9204k), lVar.k().r(q.f9206m), lVar.k().r(q.f9207n), lVar.k().r(q.f9205l));
            default:
                EnumMap enumMap = new EnumMap(n.class);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                for (n nVar : n.values()) {
                    String b10 = nVar.f9134Y.b();
                    if (b10 != null) {
                        D n10 = lVar.j(b10).n();
                        if (n10 != null) {
                            String b11 = nVar.f9135Z.b();
                            if (b11 != null) {
                                D n11 = lVar.j(b11).n();
                                if (n11 != null) {
                                    enumMap.put((EnumMap) nVar, (n) n11);
                                    hashMap.put(n10, n11);
                                    hashMap2.put(n11, n10);
                                } else {
                                    l.a(48);
                                    throw null;
                                }
                            } else {
                                l.a(47);
                                throw null;
                            }
                        } else {
                            l.a(48);
                            throw null;
                        }
                    } else {
                        lVar.getClass();
                        l.a(47);
                        throw null;
                    }
                }
                return new k(enumMap, hashMap, hashMap2);
        }
    }
}
