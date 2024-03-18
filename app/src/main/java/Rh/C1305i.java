package Rh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m.AbstractC4508E;

/* renamed from: Rh.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1305i extends AbstractC4508E {

    /* renamed from: h0  reason: collision with root package name */
    public final int f15882h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Map f15883i0;

    public C1305i(int i10, String str, HashMap hashMap) {
        super(str);
        this.f15882h0 = i10;
        this.f15883i0 = hashMap;
    }

    @Override // m.AbstractC4508E
    public final List f() {
        int i10 = this.f15882h0;
        Integer valueOf = Integer.valueOf(i10);
        Map map = this.f15883i0;
        List list = (List) map.get(valueOf);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            map.put(Integer.valueOf(i10), arrayList);
            return arrayList;
        }
        return list;
    }
}
