package Rh;

import java.util.HashMap;
import java.util.Map;

/* renamed from: Rh.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1309k extends AbstractC1301g {

    /* renamed from: j0  reason: collision with root package name */
    public final int f15919j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Map f15920k0;

    public C1309k(String str, I5.h hVar, int i10, int i11, HashMap hashMap) {
        super(str, hVar, i10);
        this.f15919j0 = i11;
        this.f15920k0 = hashMap;
    }

    @Override // Rh.AbstractC1301g
    public final Map l() {
        int i10 = this.f15919j0;
        Integer valueOf = Integer.valueOf(i10);
        Map map = this.f15920k0;
        Map map2 = (Map) map.get(valueOf);
        if (map2 == null) {
            HashMap hashMap = new HashMap();
            map.put(Integer.valueOf(i10), hashMap);
            return hashMap;
        }
        return map2;
    }
}
