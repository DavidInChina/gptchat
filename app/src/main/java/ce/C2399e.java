package ce;

import B1.m;
import f9.C2945A;
import java.util.LinkedHashMap;

/* renamed from: ce.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2399e extends m {
    public final C2945A c() {
        return new C2945A((LinkedHashMap) this.f1725a);
    }

    public final void d(Class cls, AbstractC2400f abstractC2400f) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1725a;
        if (abstractC2400f != null) {
            linkedHashMap.put(cls, abstractC2400f);
            return;
        }
        throw new NullPointerException("provider");
    }
}
