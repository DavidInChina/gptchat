package Q1;

/* loaded from: classes2.dex */
public final class t implements s {

    /* renamed from: Y  reason: collision with root package name */
    public final int f14346Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f14347Z = -1;

    /* renamed from: h0  reason: collision with root package name */
    public int f14348h0 = -1;

    public t(int i10) {
        this.f14346Y = i10;
    }

    @Override // Q1.s
    public final boolean a(CharSequence charSequence, int i10, int i11, D d10) {
        int i12 = this.f14346Y;
        if (i10 <= i12 && i12 < i11) {
            this.f14347Z = i10;
            this.f14348h0 = i11;
            return false;
        } else if (i11 > i12) {
            return false;
        } else {
            return true;
        }
    }

    @Override // Q1.s
    public final Object b() {
        return this;
    }
}
