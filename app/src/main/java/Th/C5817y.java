package th;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: th.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5817y extends EnumC5772D {
    public C5817y() {
        super("INTEGER", 4);
    }

    @Override // th.AbstractC5783O
    public final boolean a(Object obj, Object obj2) {
        if ((obj2 instanceof int[]) && Arrays.equals((int[]) obj, (int[]) obj2)) {
            return true;
        }
        return false;
    }

    @Override // th.AbstractC5783O
    public final int b(Object obj) {
        return Arrays.hashCode((int[]) obj);
    }

    @Override // th.EnumC5772D
    public final Object e(Object obj) {
        return ((int[]) obj).clone();
    }

    @Override // th.EnumC5772D
    public final String f(int i10, Object obj) {
        return EnumC5782N.f46177j0.c(Integer.valueOf(Array.getInt(obj, i10)));
    }
}
