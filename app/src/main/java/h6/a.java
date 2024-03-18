package h6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f31916Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final a f31917Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final a f31918h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ a[] f31919i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [h6.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h6.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h6.a, java.lang.Enum] */
    static {
        ?? r32 = new Enum("GRANTED", 0);
        f31916Y = r32;
        ?? r42 = new Enum("NOT_GRANTED", 1);
        f31917Z = r42;
        ?? r52 = new Enum("PENDING", 2);
        f31918h0 = r52;
        f31919i0 = new a[]{r32, r42, r52};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f31919i0.clone();
    }
}
