package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: androidx.lifecycle.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2082q extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC2082q f25375Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC2082q f25376Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC2082q f25377h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC2082q f25378i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC2082q f25379j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ EnumC2082q[] f25380k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, androidx.lifecycle.q] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, androidx.lifecycle.q] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.lifecycle.q] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.lifecycle.q] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.lifecycle.q] */
    static {
        ?? r52 = new Enum("DESTROYED", 0);
        f25375Y = r52;
        ?? r62 = new Enum("INITIALIZED", 1);
        f25376Z = r62;
        ?? r72 = new Enum("CREATED", 2);
        f25377h0 = r72;
        ?? r82 = new Enum("STARTED", 3);
        f25378i0 = r82;
        ?? r92 = new Enum("RESUMED", 4);
        f25379j0 = r92;
        f25380k0 = new EnumC2082q[]{r52, r62, r72, r82, r92};
    }

    public static EnumC2082q valueOf(String str) {
        return (EnumC2082q) Enum.valueOf(EnumC2082q.class, str);
    }

    public static EnumC2082q[] values() {
        return (EnumC2082q[]) f25380k0.clone();
    }

    public final boolean a(EnumC2082q enumC2082q) {
        if (compareTo(enumC2082q) >= 0) {
            return true;
        }
        return false;
    }
}
