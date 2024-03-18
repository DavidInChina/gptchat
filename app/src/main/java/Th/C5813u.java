package th;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: th.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5813u extends EnumC5772D {
    public C5813u() {
        super("BOOLEAN", 0);
    }

    @Override // th.AbstractC5783O
    public final boolean a(Object obj, Object obj2) {
        if ((obj2 instanceof boolean[]) && Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
            return true;
        }
        return false;
    }

    @Override // th.AbstractC5783O
    public final int b(Object obj) {
        return Arrays.hashCode((boolean[]) obj);
    }

    @Override // th.EnumC5772D
    public final Object e(Object obj) {
        return ((boolean[]) obj).clone();
    }

    @Override // th.EnumC5772D
    public final String f(int i10, Object obj) {
        return EnumC5782N.f46173Y.c(Boolean.valueOf(Array.getBoolean(obj, i10)));
    }
}
