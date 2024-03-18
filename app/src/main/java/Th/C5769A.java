package th;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: th.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5769A extends EnumC5772D {
    public C5769A() {
        super("FLOAT", 6);
    }

    @Override // th.AbstractC5783O
    public final boolean a(Object obj, Object obj2) {
        if ((obj2 instanceof float[]) && Arrays.equals((float[]) obj, (float[]) obj2)) {
            return true;
        }
        return false;
    }

    @Override // th.AbstractC5783O
    public final int b(Object obj) {
        return Arrays.hashCode((float[]) obj);
    }

    @Override // th.EnumC5772D
    public final Object e(Object obj) {
        return ((float[]) obj).clone();
    }

    @Override // th.EnumC5772D
    public final String f(int i10, Object obj) {
        return EnumC5782N.f46179l0.c(Float.valueOf(Array.getFloat(obj, i10)));
    }
}
