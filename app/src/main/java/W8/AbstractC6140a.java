package w8;

/* renamed from: w8.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6140a implements g {
    public int a(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        P4.a.u(i10, length);
        while (i10 < length) {
            if (!b(charSequence.charAt(i10))) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    @Override // w8.g
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c10);
}
