package Ii;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class m extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final m f8671Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final m f8672Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final m f8673h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ m[] f8674i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Ii.m] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Ii.m] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Ii.m] */
    static {
        ?? r32 = new Enum("CREATED_NO_STATE", 0);
        f8671Y = r32;
        ?? r42 = new Enum("CREATED_WITH_STATE", 1);
        f8672Z = r42;
        ?? r52 = new Enum("STARTED", 2);
        f8673h0 = r52;
        f8674i0 = new m[]{r32, r42, r52};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f8674i0.clone();
    }
}
