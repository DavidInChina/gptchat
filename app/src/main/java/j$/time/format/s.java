package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes3.dex */
public final class s extends Enum implements AbstractC3713g {
    public static final s INSENSITIVE;
    public static final s LENIENT;
    public static final s SENSITIVE;
    public static final s STRICT;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ s[] f35046a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, j$.time.format.s] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.time.format.s] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, j$.time.format.s] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.time.format.s] */
    static {
        ?? r42 = new Enum("SENSITIVE", 0);
        SENSITIVE = r42;
        ?? r52 = new Enum("INSENSITIVE", 1);
        INSENSITIVE = r52;
        ?? r62 = new Enum("STRICT", 2);
        STRICT = r62;
        ?? r72 = new Enum("LENIENT", 3);
        LENIENT = r72;
        f35046a = new s[]{r42, r52, r62, r72};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f35046a.clone();
    }

    @Override // j$.time.format.AbstractC3713g
    public final boolean g(A a5, StringBuilder sb2) {
        return true;
    }

    @Override // j$.time.format.AbstractC3713g
    public final int p(y yVar, CharSequence charSequence, int i10) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            yVar.m(true);
        } else if (ordinal == 1) {
            yVar.m(false);
        } else if (ordinal == 2) {
            yVar.q(true);
        } else if (ordinal == 3) {
            yVar.q(false);
        }
        return i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal != 3) {
                throw new IllegalStateException("Unreachable");
            }
            return "ParseStrict(false)";
        }
        return "ParseCaseSensitive(true)";
    }
}
