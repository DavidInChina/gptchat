package j$.time.format;

import android.gov.nist.core.Separators;
import j$.time.DateTimeException;

/* loaded from: classes3.dex */
final class n implements AbstractC3713g {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC3713g f35030a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35031b;

    /* renamed from: c  reason: collision with root package name */
    private final char f35032c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(AbstractC3713g abstractC3713g, int i10, char c10) {
        this.f35030a = abstractC3713g;
        this.f35031b = i10;
        this.f35032c = c10;
    }

    @Override // j$.time.format.AbstractC3713g
    public final boolean g(A a5, StringBuilder sb2) {
        int length = sb2.length();
        if (!this.f35030a.g(a5, sb2)) {
            return false;
        }
        int length2 = sb2.length() - length;
        int i10 = this.f35031b;
        if (length2 <= i10) {
            for (int i11 = 0; i11 < i10 - length2; i11++) {
                sb2.insert(length, this.f35032c);
            }
            return true;
        }
        throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i10);
    }

    @Override // j$.time.format.AbstractC3713g
    public final int p(y yVar, CharSequence charSequence, int i10) {
        boolean l10 = yVar.l();
        if (i10 <= charSequence.length()) {
            if (i10 == charSequence.length()) {
                return ~i10;
            }
            int i11 = this.f35031b + i10;
            if (i11 > charSequence.length()) {
                if (l10) {
                    return ~i10;
                }
                i11 = charSequence.length();
            }
            int i12 = i10;
            while (i12 < i11 && yVar.b(charSequence.charAt(i12), this.f35032c)) {
                i12++;
            }
            int p10 = this.f35030a.p(yVar, charSequence.subSequence(0, i11), i12);
            return (p10 == i11 || !l10) ? p10 : ~(i10 + i12);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        String str;
        char c10 = this.f35032c;
        if (c10 == ' ') {
            str = Separators.RPAREN;
        } else {
            str = ",'" + c10 + "')";
        }
        return "Pad(" + this.f35030a + Separators.COMMA + this.f35031b + str;
    }
}
