package n;

import android.animation.TimeInterpolator;

/* renamed from: n.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4693d implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    public int[] f39521a;

    /* renamed from: b  reason: collision with root package name */
    public int f39522b;

    /* renamed from: c  reason: collision with root package name */
    public int f39523c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        float f10;
        int i10 = (int) ((f6 * this.f39523c) + 0.5f);
        int i11 = this.f39522b;
        int[] iArr = this.f39521a;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr[i12];
            if (i10 < i13) {
                break;
            }
            i10 -= i13;
            i12++;
        }
        if (i12 < i11) {
            f10 = i10 / this.f39523c;
        } else {
            f10 = 0.0f;
        }
        return (i12 / i11) + f10;
    }
}
