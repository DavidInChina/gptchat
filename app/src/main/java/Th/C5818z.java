package th;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: th.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5818z extends EnumC5772D {
    public C5818z() {
        super("LONG", 5);
    }

    @Override // th.AbstractC5783O
    public final boolean a(Object obj, Object obj2) {
        if ((obj2 instanceof long[]) && Arrays.equals((long[]) obj, (long[]) obj2)) {
            return true;
        }
        return false;
    }

    @Override // th.AbstractC5783O
    public final int b(Object obj) {
        return Arrays.hashCode((long[]) obj);
    }

    @Override // th.EnumC5772D
    public final Object e(Object obj) {
        return ((long[]) obj).clone();
    }

    @Override // th.EnumC5772D
    public final String f(int i10, Object obj) {
        return EnumC5782N.f46178k0.c(Long.valueOf(Array.getLong(obj, i10)));
    }
}
