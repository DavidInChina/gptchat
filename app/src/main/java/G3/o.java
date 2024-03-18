package G3;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import s1.C5527i;

/* loaded from: classes2.dex */
public final class o implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5935a;

    /* renamed from: b  reason: collision with root package name */
    public C5527i[] f5936b;

    public /* synthetic */ o(int i10) {
        this.f5935a = i10;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f6, Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f5935a) {
            case 0:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i14 = rect.left + ((int) ((rect2.left - i10) * f6));
                int i15 = rect.top + ((int) ((rect2.top - i11) * f6));
                int i16 = rect.right + ((int) ((rect2.right - i12) * f6));
                int i17 = rect.bottom + ((int) ((rect2.bottom - i13) * f6));
                Rect rect3 = (Rect) this.f5936b;
                if (rect3 == null) {
                    return new Rect(i14, i15, i16, i17);
                }
                rect3.set(i14, i15, i16, i17);
                return (Rect) this.f5936b;
            default:
                C5527i[] c5527iArr = (C5527i[]) obj;
                C5527i[] c5527iArr2 = (C5527i[]) obj2;
                if (R4.b.P(c5527iArr, c5527iArr2)) {
                    if (!R4.b.P(this.f5936b, c5527iArr)) {
                        this.f5936b = R4.b.o0(c5527iArr);
                    }
                    for (int i18 = 0; i18 < c5527iArr.length; i18++) {
                        C5527i c5527i = this.f5936b[i18];
                        C5527i c5527i2 = c5527iArr[i18];
                        C5527i c5527i3 = c5527iArr2[i18];
                        c5527i.getClass();
                        c5527i.f45111a = c5527i2.f45111a;
                        int i19 = 0;
                        while (true) {
                            float[] fArr = c5527i2.f45112b;
                            if (i19 < fArr.length) {
                                c5527i.f45112b[i19] = (c5527i3.f45112b[i19] * f6) + ((1.0f - f6) * fArr[i19]);
                                i19++;
                            }
                        }
                    }
                    return this.f5936b;
                }
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}
