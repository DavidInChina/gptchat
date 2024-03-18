package w8;

/* renamed from: w8.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6141b extends AbstractC6140a {

    /* renamed from: Y  reason: collision with root package name */
    public final char f48216Y;

    public C6141b(char c10) {
        this.f48216Y = c10;
    }

    @Override // w8.AbstractC6140a
    public final boolean b(char c10) {
        if (c10 == this.f48216Y) {
            return true;
        }
        return false;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        char c10 = this.f48216Y;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb2.append("CharMatcher.is('");
        sb2.append(copyValueOf);
        sb2.append("')");
        return sb2.toString();
    }
}
