package th;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: th.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5814v extends EnumC5772D {
    public C5814v() {
        super("BYTE", 1);
    }

    @Override // th.AbstractC5783O
    public final boolean a(Object obj, Object obj2) {
        if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) obj, (byte[]) obj2)) {
            return true;
        }
        return false;
    }

    @Override // th.AbstractC5783O
    public final int b(Object obj) {
        return Arrays.hashCode((byte[]) obj);
    }

    @Override // th.EnumC5772D
    public final Object e(Object obj) {
        return ((byte[]) obj).clone();
    }

    @Override // th.EnumC5772D
    public final String f(int i10, Object obj) {
        return EnumC5782N.f46174Z.c(Byte.valueOf(Array.getByte(obj, i10)));
    }
}
