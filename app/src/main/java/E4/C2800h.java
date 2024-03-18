package e4;

import android.util.LruCache;
import id.AbstractC3557B;

/* renamed from: e4.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2800h extends LruCache {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        AbstractC2802j abstractC2802j = (AbstractC2802j) obj2;
        AbstractC2802j abstractC2802j2 = (AbstractC2802j) obj3;
        AbstractC3557B.c0("oldValue", abstractC2802j);
        if (z10) {
            abstractC2802j.close();
        }
    }
}
