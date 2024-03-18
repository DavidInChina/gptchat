package th;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: th.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5770B extends EnumC5772D {
    public C5770B() {
        super("DOUBLE", 7);
    }

    @Override // th.AbstractC5783O
    public final boolean a(Object obj, Object obj2) {
        if ((obj2 instanceof double[]) && Arrays.equals((double[]) obj, (double[]) obj2)) {
            return true;
        }
        return false;
    }

    @Override // th.AbstractC5783O
    public final int b(Object obj) {
        return Arrays.hashCode((double[]) obj);
    }

    @Override // th.EnumC5772D
    public final Object e(Object obj) {
        return ((double[]) obj).clone();
    }

    @Override // th.EnumC5772D
    public final String f(int i10, Object obj) {
        return EnumC5782N.f46180m0.c(Double.valueOf(Array.getDouble(obj, i10)));
    }
}
