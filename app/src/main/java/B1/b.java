package B1;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f1707e = new byte[1792];

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f1708a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1709b;

    /* renamed from: c  reason: collision with root package name */
    public int f1710c;

    /* renamed from: d  reason: collision with root package name */
    public char f1711d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f1707e[i10] = Character.getDirectionality(i10);
        }
    }

    public b(CharSequence charSequence) {
        this.f1708a = charSequence;
        this.f1709b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f1708a;
        char charAt = charSequence.charAt(this.f1710c - 1);
        this.f1711d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f1710c);
            this.f1710c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f1710c--;
        char c10 = this.f1711d;
        if (c10 < '\u0700') {
            return f1707e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
