package i6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class g extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final g f32731Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final g f32732Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final g f32733h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ g[] f32734i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, i6.g] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, i6.g] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, i6.g] */
    static {
        ?? r32 = new Enum("FLUTTER_BUILD_TIME", 0);
        f32731Y = r32;
        ?? r42 = new Enum("FLUTTER_RASTER_TIME", 1);
        f32732Z = r42;
        ?? r52 = new Enum("JS_FRAME_TIME", 2);
        f32733h0 = r52;
        f32734i0 = new g[]{r32, r42, r52};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f32734i0.clone();
    }
}
