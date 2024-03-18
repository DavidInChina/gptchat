package th;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: th.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5816x extends EnumC5772D {
    public C5816x() {
        super("CHARACTER", 3);
    }

    @Override // th.AbstractC5783O
    public final boolean a(Object obj, Object obj2) {
        if ((obj2 instanceof char[]) && Arrays.equals((char[]) obj, (char[]) obj2)) {
            return true;
        }
        return false;
    }

    @Override // th.AbstractC5783O
    public final int b(Object obj) {
        return Arrays.hashCode((char[]) obj);
    }

    @Override // th.EnumC5772D
    public final Object e(Object obj) {
        return ((char[]) obj).clone();
    }

    @Override // th.EnumC5772D
    public final String f(int i10, Object obj) {
        return EnumC5782N.f46176i0.c(Character.valueOf(Array.getChar(obj, i10)));
    }
}
