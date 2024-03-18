package Ah;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Ah.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0088g extends Enum implements AbstractC0089h {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0088g f940Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0088g[] f941Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Ah.g] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f940Y = r12;
        f941Z = new EnumC0088g[]{r12};
    }

    public static EnumC0088g valueOf(String str) {
        return (EnumC0088g) Enum.valueOf(EnumC0088g.class, str);
    }

    public static EnumC0088g[] values() {
        return (EnumC0088g[]) f941Z.clone();
    }

    @Override // Ah.AbstractC0089h
    public final Package a(C0103w c0103w, String str) {
        return C0103w.c(c0103w, str);
    }
}
