package th;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: th.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5815w extends EnumC5772D {
    public C5815w() {
        super("SHORT", 2);
    }

    @Override // th.AbstractC5783O
    public final boolean a(Object obj, Object obj2) {
        if ((obj2 instanceof short[]) && Arrays.equals((short[]) obj, (short[]) obj2)) {
            return true;
        }
        return false;
    }

    @Override // th.AbstractC5783O
    public final int b(Object obj) {
        return Arrays.hashCode((short[]) obj);
    }

    @Override // th.EnumC5772D
    public final Object e(Object obj) {
        return ((short[]) obj).clone();
    }

    @Override // th.EnumC5772D
    public final String f(int i10, Object obj) {
        return EnumC5782N.f46175h0.c(Short.valueOf(Array.getShort(obj, i10)));
    }
}
