package Rh;

import java.util.HashMap;
import java.util.Map;

/* renamed from: Rh.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1301g extends AbstractC1303h {

    /* renamed from: i0  reason: collision with root package name */
    public final int f15849i0;

    public AbstractC1301g(String str, I5.h hVar, int i10) {
        super(str, hVar);
        this.f15849i0 = i10;
    }

    @Override // Rh.AbstractC1303h
    public final Map k() {
        Map l10 = l();
        int i10 = this.f15849i0;
        Map map = (Map) l10.get(Integer.valueOf(i10));
        if (map == null) {
            HashMap hashMap = new HashMap();
            l10.put(Integer.valueOf(i10), hashMap);
            return hashMap;
        }
        return map;
    }

    public abstract Map l();
}
