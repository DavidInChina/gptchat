package Sh;

import java.lang.reflect.Field;
import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Sh.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1398d extends Enum implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1398d f16714Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC1398d[] f16715Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Sh.d] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f16714Y = r12;
        f16715Z = new EnumC1398d[]{r12};
    }

    public static EnumC1398d valueOf(String str) {
        return (EnumC1398d) Enum.valueOf(EnumC1398d.class, str);
    }

    public static EnumC1398d[] values() {
        return (EnumC1398d[]) f16715Z.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Field field = (Field) obj;
        Field field2 = (Field) obj2;
        if (field == field2) {
            return 0;
        }
        int compareTo = field.getName().compareTo(field2.getName());
        if (compareTo == 0) {
            return field.getType().getName().compareTo(field2.getType().getName());
        }
        return compareTo;
    }
}
