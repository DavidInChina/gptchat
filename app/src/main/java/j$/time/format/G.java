package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes3.dex */
public final class G extends Enum {
    public static final G ALWAYS;
    public static final G EXCEEDS_PAD;
    public static final G NEVER;
    public static final G NORMAL;
    public static final G NOT_NEGATIVE;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ G[] f34997a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [j$.time.format.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [j$.time.format.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [j$.time.format.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [j$.time.format.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [j$.time.format.G, java.lang.Enum] */
    static {
        ?? r52 = new Enum("NORMAL", 0);
        NORMAL = r52;
        ?? r62 = new Enum("ALWAYS", 1);
        ALWAYS = r62;
        ?? r72 = new Enum("NEVER", 2);
        NEVER = r72;
        ?? r82 = new Enum("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = r82;
        ?? r92 = new Enum("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = r92;
        f34997a = new G[]{r52, r62, r72, r82, r92};
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) f34997a.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(boolean z10, boolean z11, boolean z12) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return !z10 || !z11;
        } else if (ordinal == 1 || ordinal == 4) {
            return true;
        } else {
            return !z11 && !z12;
        }
    }
}
