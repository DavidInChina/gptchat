package M0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f11366Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final a f11367Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ a[] f11368h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, M0.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, M0.a] */
    static {
        ?? r32 = new Enum("On", 0);
        f11366Y = r32;
        ?? r42 = new Enum("Off", 1);
        f11367Z = r42;
        f11368h0 = new a[]{r32, r42, new Enum("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f11368h0.clone();
    }
}
