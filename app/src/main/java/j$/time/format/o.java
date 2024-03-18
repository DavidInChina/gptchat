package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class o extends p {
    @Override // j$.time.format.p
    protected final boolean c(char c10, char c11) {
        return y.c(c10, c11);
    }

    @Override // j$.time.format.p
    protected final p e(String str, String str2, p pVar) {
        return new p(str, str2, pVar, 0);
    }

    @Override // j$.time.format.p
    protected final boolean h(CharSequence charSequence, int i10, int i11) {
        int length = this.f35033a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!y.c(this.f35033a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }
}
