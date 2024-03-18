package s0;

import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: s0.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5505g extends C5506h {

    /* renamed from: h  reason: collision with root package name */
    public final C5515q f45047h;

    /* renamed from: i  reason: collision with root package name */
    public final C5515q f45048i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f45049j;

    public C5505g(C5515q c5515q, C5515q c5515q2, int i10) {
        super(c5515q2, c5515q, c5515q2, null);
        float[] fArr;
        this.f45047h = c5515q;
        this.f45048i = c5515q2;
        C5517s c5517s = c5515q2.f45075d;
        C5517s c5517s2 = c5515q.f45075d;
        boolean s10 = kotlin.jvm.internal.m.s(c5517s2, c5517s);
        float[] fArr2 = c5515q.f45080i;
        float[] fArr3 = c5515q2.f45081j;
        if (s10) {
            fArr = kotlin.jvm.internal.m.y(fArr3, fArr2);
        } else {
            float[] a5 = c5517s2.a();
            C5517s c5517s3 = c5515q2.f45075d;
            float[] a10 = c5517s3.a();
            C5517s c5517s4 = AbstractC5508j.f45058b;
            boolean s11 = kotlin.jvm.internal.m.s(c5517s2, c5517s4);
            float[] fArr4 = AbstractC5508j.f45061e;
            C5499a c5499a = AbstractC5500b.f45016b;
            if (!s11) {
                float[] copyOf = Arrays.copyOf(fArr4, 3);
                AbstractC3557B.b0("copyOf(this, size)", copyOf);
                fArr2 = kotlin.jvm.internal.m.y(kotlin.jvm.internal.m.r(c5499a.f45017a, a5, copyOf), fArr2);
            }
            if (!kotlin.jvm.internal.m.s(c5517s3, c5517s4)) {
                float[] copyOf2 = Arrays.copyOf(fArr4, 3);
                AbstractC3557B.b0("copyOf(this, size)", copyOf2);
                fArr3 = kotlin.jvm.internal.m.x(kotlin.jvm.internal.m.y(kotlin.jvm.internal.m.r(c5499a.f45017a, a10, copyOf2), c5515q2.f45080i));
            }
            fArr = kotlin.jvm.internal.m.y(fArr3, i10 == 3 ? kotlin.jvm.internal.m.z(new float[]{a5[0] / a10[0], a5[1] / a10[1], a5[2] / a10[2]}, fArr2) : fArr2);
        }
        this.f45049j = fArr;
    }

    @Override // s0.C5506h
    public final long a(float f6, float f10, float f11, float f12) {
        C5515q c5515q = this.f45047h;
        float c10 = (float) c5515q.f45087p.c(f6);
        double d10 = f10;
        C5511m c5511m = c5515q.f45087p;
        float c11 = (float) c5511m.c(d10);
        float c12 = (float) c5511m.c(f11);
        float[] fArr = this.f45049j;
        float B10 = kotlin.jvm.internal.m.B(fArr, c10, c11, c12);
        float C10 = kotlin.jvm.internal.m.C(fArr, c10, c11, c12);
        float D6 = kotlin.jvm.internal.m.D(fArr, c10, c11, c12);
        C5515q c5515q2 = this.f45048i;
        float c13 = (float) c5515q2.f45084m.c(B10);
        double d11 = C10;
        C5511m c5511m2 = c5515q2.f45084m;
        return androidx.compose.ui.graphics.a.a(c13, (float) c5511m2.c(d11), (float) c5511m2.c(D6), f12, c5515q2);
    }
}
