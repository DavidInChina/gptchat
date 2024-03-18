package O0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final s f13273a;

    /* renamed from: b  reason: collision with root package name */
    public int f13274b = -1;

    /* renamed from: c  reason: collision with root package name */
    public float f13275c;

    public d(s sVar) {
        this.f13273a = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i10, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i11;
        float f6;
        int i12 = 1;
        s sVar = this.f13273a;
        if (z10) {
            int S02 = A7.b.S0(sVar.f13320d, i10, z10);
            int lineStart = sVar.f13320d.getLineStart(S02);
            int e10 = sVar.e(S02);
            if (i10 == lineStart || i10 == e10) {
                z13 = true;
                int i13 = i10 * 4;
                if (!z12) {
                    if (z13) {
                        i12 = 0;
                    }
                } else if (z13) {
                    i12 = 2;
                } else {
                    i12 = 3;
                }
                i11 = i13 + i12;
                if (this.f13274b != i11) {
                    return this.f13275c;
                }
                if (z12) {
                    f6 = sVar.g(i10, z10);
                } else {
                    f6 = sVar.h(i10, z10);
                }
                if (z11) {
                    this.f13274b = i11;
                    this.f13275c = f6;
                }
                return f6;
            }
        }
        z13 = false;
        int i132 = i10 * 4;
        if (!z12) {
        }
        i11 = i132 + i12;
        if (this.f13274b != i11) {
        }
    }
}
