package Fe;

import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import ke.C4264c;

/* loaded from: classes2.dex */
public final class r extends LinkedHashMap {

    /* renamed from: Y  reason: collision with root package name */
    public final wf.k f5347Y;

    /* renamed from: Z  reason: collision with root package name */
    public final wf.k f5348Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f5349h0 = 10;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ke.g gVar) {
        super(10, 0.75f, true);
        C4264c c4264c = C4264c.f37377h0;
        this.f5347Y = gVar;
        this.f5348Z = c4264c;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (this.f5349h0 == 0) {
            return this.f5347Y.invoke(obj);
        }
        synchronized (this) {
            Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object invoke = this.f5347Y.invoke(obj);
            put(obj, invoke);
            return invoke;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        boolean z10;
        AbstractC3557B.c0("eldest", entry);
        if (super.size() > this.f5349h0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f5348Z.invoke(entry.getValue());
        }
        return z10;
    }
}
