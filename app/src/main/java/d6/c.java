package d6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class c extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final c f28026Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final c f28027Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ c[] f28028h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, d6.c] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, d6.c] */
    static {
        ?? r22 = new Enum("RUM", 0);
        f28026Y = r22;
        ?? r32 = new Enum("LOGS", 1);
        f28027Z = r32;
        f28028h0 = new c[]{r22, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f28028h0.clone();
    }
}
