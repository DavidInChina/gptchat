package x8;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class Z extends a0 {
    public Z() {
        super("VALUE", 1);
    }

    @Override // w8.f
    public final Object apply(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
