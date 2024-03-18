package th;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: th.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5771C extends EnumC5772D {
    public C5771C() {
        super("STRING", 8);
    }

    @Override // th.AbstractC5783O
    public final boolean a(Object obj, Object obj2) {
        if ((obj2 instanceof String[]) && Arrays.equals((String[]) obj, (String[]) obj2)) {
            return true;
        }
        return false;
    }

    @Override // th.AbstractC5783O
    public final int b(Object obj) {
        return Arrays.hashCode((String[]) obj);
    }

    @Override // th.EnumC5772D
    public final Object e(Object obj) {
        return ((String[]) obj).clone();
    }

    @Override // th.EnumC5772D
    public final String f(int i10, Object obj) {
        return EnumC5782N.f46181n0.c(Array.get(obj, i10));
    }
}
