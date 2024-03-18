package H0;

/* renamed from: H0.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0677f extends AbstractC0669b {

    /* renamed from: c  reason: collision with root package name */
    public static C0677f f6950c;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        return null;
     */
    @Override // H0.AbstractC0679g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && d().charAt(i10) == '\n' && !f(i10)) {
            i10++;
        }
        int i11 = i10 + 1;
        while (i11 < length && !e(i11)) {
            i11++;
        }
        return c(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        return null;
     */
    @Override // H0.AbstractC0679g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && d().charAt(i10 - 1) == '\n' && !e(i10)) {
            i10--;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && !f(i11)) {
            i11--;
        }
        return c(i11, i10);
    }

    public final boolean e(int i10) {
        if (i10 > 0 && d().charAt(i10 - 1) != '\n' && (i10 == d().length() || d().charAt(i10) == '\n')) {
            return true;
        }
        return false;
    }

    public final boolean f(int i10) {
        if (d().charAt(i10) != '\n' && (i10 == 0 || d().charAt(i10 - 1) == '\n')) {
            return true;
        }
        return false;
    }
}
