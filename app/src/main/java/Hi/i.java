package Hi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class i extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final i f7878Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final i f7879Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ i[] f7880h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Hi.i] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Hi.i] */
    static {
        ?? r22 = new Enum("VISIBLE", 0);
        f7878Y = r22;
        ?? r32 = new Enum("INVISIBLE", 1);
        f7879Z = r32;
        f7880h0 = new i[]{r22, r32};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f7880h0.clone();
    }
}
