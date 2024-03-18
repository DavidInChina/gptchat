package Ah;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class b0 extends ClassLoader {
    static {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("registerAsParallelCapable", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused) {
        }
    }
}   public static final o f865h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ o[] f866i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Ag.o] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Ag.o] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Ag.o] */
    static {
        ?? r32 = new Enum("NOT_COMPUTED", 0);
        f863Y = r32;
        ?? r42 = new Enum("COMPUTING", 1);
        f864Z = r42;
        ?? r52 = new Enum("RECURSION_WAS_DETECTED", 2);
        f865h0 = r52;
        f866i0 = new o[]{r32, r42, r52};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f866i0.clone();
    }
}
