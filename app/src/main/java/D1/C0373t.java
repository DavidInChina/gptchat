package D1;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: D1.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373t implements T0.s {

    /* renamed from: a  reason: collision with root package name */
    public int f3302a;

    /* renamed from: b  reason: collision with root package name */
    public int f3303b;

    public /* synthetic */ C0373t(int i10, int i11) {
        this.f3302a = i10;
        this.f3303b = i11;
    }

    @Override // T0.s
    public int a(int i10) {
        if (i10 >= 0 && i10 <= this.f3303b) {
            int i11 = this.f3302a;
            if (i10 < 0 || i10 > i11) {
                throw new IllegalStateException(AbstractC2469q0.j(E9.f.A("OffsetMapping.transformedToOriginal returned invalid mapping: ", i10, " -> ", i10, " is not in range of original text [0, "), i11, ']').toString());
            }
        }
        return i10;
    }

    @Override // T0.s
    public int b(int i10) {
        if (i10 >= 0 && i10 <= this.f3302a) {
            int i11 = this.f3303b;
            if (i10 < 0 || i10 > i11) {
                throw new IllegalStateException(AbstractC2469q0.j(E9.f.A("OffsetMapping.originalToTransformed returned invalid mapping: ", i10, " -> ", i10, " is not in range of transformed text [0, "), i11, ']').toString());
            }
        }
        return i10;
    }

    public int c() {
        int i10 = this.f3303b;
        if (i10 != 2) {
            if (i10 != 5) {
                if (i10 != 29) {
                    if (i10 != 42) {
                        if (i10 != 22) {
                            if (i10 != 23) {
                                return 0;
                            }
                            return 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }
}
