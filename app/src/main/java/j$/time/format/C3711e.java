package j$.time.format;

import android.gov.nist.core.Separators;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.e  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3711e implements AbstractC3713g {

    /* renamed from: a  reason: collision with root package name */
    private final char f35009a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3711e(char c10) {
        this.f35009a = c10;
    }

    @Override // j$.time.format.AbstractC3713g
    public final boolean g(A a5, StringBuilder sb2) {
        sb2.append(this.f35009a);
        return true;
    }

    @Override // j$.time.format.AbstractC3713g
    public final int p(y yVar, CharSequence charSequence, int i10) {
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        char charAt = charSequence.charAt(i10);
        char c10 = this.f35009a;
        return (charAt == c10 || (!yVar.k() && (Character.toUpperCase(charAt) == Character.toUpperCase(c10) || Character.toLowerCase(charAt) == Character.toLowerCase(c10)))) ? i10 + 1 : ~i10;
    }

    public final String toString() {
        char c10 = this.f35009a;
        if (c10 == '\'') {
            return "''";
        }
        return Separators.QUOTE + c10 + Separators.QUOTE;
    }
}
