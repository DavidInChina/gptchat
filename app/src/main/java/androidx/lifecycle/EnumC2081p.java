package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: androidx.lifecycle.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2081p extends Enum {
    private static final /* synthetic */ EnumC2081p[] $VALUES;
    public static final C2079n Companion = new Object();
    public static final EnumC2081p ON_ANY;
    public static final EnumC2081p ON_CREATE;
    public static final EnumC2081p ON_DESTROY;
    public static final EnumC2081p ON_PAUSE;
    public static final EnumC2081p ON_RESUME;
    public static final EnumC2081p ON_START;
    public static final EnumC2081p ON_STOP;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.lifecycle.p] */
    static {
        ?? r72 = new Enum("ON_CREATE", 0);
        ON_CREATE = r72;
        ?? r82 = new Enum("ON_START", 1);
        ON_START = r82;
        ?? r92 = new Enum("ON_RESUME", 2);
        ON_RESUME = r92;
        ?? r10 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r10;
        ?? r11 = new Enum("ON_STOP", 4);
        ON_STOP = r11;
        ?? r12 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r12;
        ?? r13 = new Enum("ON_ANY", 6);
        ON_ANY = r13;
        $VALUES = new EnumC2081p[]{r72, r82, r92, r10, r11, r12, r13};
    }

    public static EnumC2081p valueOf(String str) {
        return (EnumC2081p) Enum.valueOf(EnumC2081p.class, str);
    }

    public static EnumC2081p[] values() {
        return (EnumC2081p[]) $VALUES.clone();
    }

    public final EnumC2082q a() {
        switch (AbstractC2080o.f25374a[ordinal()]) {
            case 1:
            case 2:
                return EnumC2082q.f25377h0;
            case 3:
            case 4:
                return EnumC2082q.f25378i0;
            case 5:
                return EnumC2082q.f25379j0;
            case 6:
                return EnumC2082q.f25375Y;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
