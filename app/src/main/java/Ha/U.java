package ha;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class U extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final R4.a f32035Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final U f32036Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final U f32037h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final U f32038i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final U f32039j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ U[] f32040k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [R4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [ha.U, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ha.U, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ha.U, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ha.U, java.lang.Enum] */
    static {
        ?? r42 = new Enum("Search", 0);
        f32036Z = r42;
        ?? r52 = new Enum("Quote", 1);
        f32037h0 = r52;
        ?? r62 = new Enum("Back", 2);
        f32038i0 = r62;
        ?? r72 = new Enum("Click", 3);
        f32039j0 = r72;
        U[] uArr = {r42, r52, r62, r72};
        f32040k0 = uArr;
        AbstractC3557B.C0(uArr);
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f32040k0.clone();
    }
}
