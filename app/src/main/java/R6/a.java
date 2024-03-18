package R6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f15051Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final a f15052Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final a f15053h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final a f15054i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final a f15055j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ a[] f15056k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [R6.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [R6.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [R6.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [R6.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [R6.a, java.lang.Enum] */
    static {
        ?? r52 = new Enum("DATADOG", 0);
        f15051Y = r52;
        ?? r62 = new Enum("B3", 1);
        f15052Z = r62;
        ?? r72 = new Enum("B3MULTI", 2);
        f15053h0 = r72;
        ?? r82 = new Enum("TRACECONTEXT", 3);
        f15054i0 = r82;
        ?? r92 = new Enum("HAYSTACK", 4);
        f15055j0 = r92;
        f15056k0 = new a[]{r52, r62, r72, r82, r92};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f15056k0.clone();
    }
}
