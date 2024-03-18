package fh;

/* renamed from: fh.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3078e implements CharSequence {

    /* renamed from: Y  reason: collision with root package name */
    public final char[] f30869Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f30870Z;

    public C3078e(char[] cArr) {
        this.f30869Y = cArr;
        this.f30870Z = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f30869Y[i10];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f30870Z;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return Lg.n.Y1(this.f30869Y, i10, Math.min(i11, this.f30870Z));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i10 = this.f30870Z;
        return Lg.n.Y1(this.f30869Y, 0, Math.min(i10, i10));
    }
}
