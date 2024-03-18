package p5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: p5.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5090b extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5090b f42738Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC5090b f42739Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC5090b f42740h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC5090b[] f42741i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, p5.b] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, p5.b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, p5.b] */
    static {
        ?? r32 = new Enum("USER", 0);
        f42738Y = r32;
        ?? r42 = new Enum("MAINTAINER", 1);
        f42739Z = r42;
        ?? r52 = new Enum("TELEMETRY", 2);
        f42740h0 = r52;
        f42741i0 = new EnumC5090b[]{r32, r42, r52};
    }

    public static EnumC5090b valueOf(String str) {
        return (EnumC5090b) Enum.valueOf(EnumC5090b.class, str);
    }

    public static EnumC5090b[] values() {
        return (EnumC5090b[]) f42741i0.clone();
    }
}
