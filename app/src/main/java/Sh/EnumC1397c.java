package Sh;

import java.lang.reflect.Constructor;
import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Sh.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1397c extends Enum implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1397c f16712Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC1397c[] f16713Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Sh.c] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f16712Y = r12;
        f16713Z = new EnumC1397c[]{r12};
    }

    public static EnumC1397c valueOf(String str) {
        return (EnumC1397c) Enum.valueOf(EnumC1397c.class, str);
    }

    public static EnumC1397c[] values() {
        return (EnumC1397c[]) f16713Z.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Constructor constructor = (Constructor) obj;
        Constructor constructor2 = (Constructor) obj2;
        if (constructor == constructor2) {
            return 0;
        }
        int compareTo = constructor.getName().compareTo(constructor2.getName());
        if (compareTo == 0) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
            if (parameterTypes.length < parameterTypes2.length) {
                return -1;
            }
            if (parameterTypes.length > parameterTypes2.length) {
                return 1;
            }
            for (int i10 = 0; i10 < parameterTypes.length; i10++) {
                int compareTo2 = parameterTypes[i10].getName().compareTo(parameterTypes2[i10].getName());
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            return 0;
        }
        return compareTo;
    }
}
