package A;

import N0.C1042a;
import Sg.C1394f;
import Z.l1;
import android.graphics.Matrix;
import android.graphics.Path;
import android.text.Layout;
import cf.C2402a;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import q0.C5251c;
import q0.C5252d;
import r0.C5344h;
import t0.AbstractC5648g;
import t0.AbstractC5650i;
import t0.C5643b;
import t0.C5654m;

/* renamed from: A.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0045u extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f298Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f299Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f300h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f301i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f302j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0045u(long j6, float[] fArr, kotlin.jvm.internal.z zVar, kotlin.jvm.internal.y yVar) {
        super(1);
        this.f298Y = 2;
        this.f299Z = j6;
        this.f300h0 = fArr;
        this.f301i0 = zVar;
        this.f302j0 = yVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        float f6;
        float f10;
        boolean z12;
        jf.y yVar = jf.y.f36177a;
        int i12 = this.f298Y;
        Object obj2 = this.f302j0;
        Object obj3 = this.f300h0;
        Object obj4 = this.f301i0;
        switch (i12) {
            case 1:
                AbstractC5650i abstractC5650i = (AbstractC5650i) obj;
                U.n nVar = (U.n) obj3;
                float a5 = nVar.a() / nVar.b();
                float f11 = U.f.f17342a;
                float max = (Math.max(Math.min(1.0f, a5) - 0.4f, 0.0f) * 5) / 3;
                float o10 = com.google.android.gms.internal.play_billing.N.o(Math.abs(a5) - 1.0f, 0.0f, 2.0f);
                float pow = (((0.4f * max) - 0.25f) + (o10 - (((float) Math.pow(o10, 2)) / 4))) * 0.5f;
                float f12 = 360;
                float f13 = pow * f12;
                float f14 = f12 * ((0.8f * max) + pow);
                float min = Math.min(1.0f, max);
                float floatValue = ((Number) ((l1) obj4).getValue()).floatValue();
                long c02 = abstractC5650i.c0();
                C5643b V10 = abstractC5650i.V();
                long b10 = V10.b();
                V10.a().h();
                V10.f45609a.c(pow, c02);
                float R10 = abstractC5650i.R(U.f.f17344c);
                float f15 = U.f.f17345d;
                float R11 = (abstractC5650i.R(f15) / 2.0f) + R10;
                C5252d c5252d = new C5252d(C5251c.d(AbstractC4828h.L(abstractC5650i.g())) - R11, C5251c.e(AbstractC4828h.L(abstractC5650i.g())) - R11, C5251c.d(AbstractC4828h.L(abstractC5650i.g())) + R11, C5251c.e(AbstractC4828h.L(abstractC5650i.g())) + R11);
                long e10 = c5252d.e();
                long d10 = c5252d.d();
                C5654m c5654m = new C5654m(abstractC5650i.R(f15), 0.0f, 2, 0, 26);
                long j6 = this.f299Z;
                AbstractC5648g.b(abstractC5650i, j6, f13, f14 - f13, e10, d10, floatValue, c5654m, 768);
                C5344h c5344h = (C5344h) ((r0.E) obj2);
                c5344h.d();
                Path path = c5344h.f44241a;
                path.moveTo(0.0f, 0.0f);
                float f16 = U.f.f17346e;
                c5344h.b(abstractC5650i.R(f16) * min, 0.0f);
                c5344h.b((abstractC5650i.R(f16) * min) / 2, abstractC5650i.R(U.f.f17347f) * min);
                long r10 = R4.b.r((C5251c.d(c5252d.b()) + (Math.min(c5252d.f(), c5252d.c()) / 2.0f)) - ((abstractC5650i.R(f16) * min) / 2.0f), (abstractC5650i.R(f15) / 2.0f) + C5251c.e(c5252d.b()));
                Matrix matrix = c5344h.f44244d;
                if (matrix == null) {
                    c5344h.f44244d = new Matrix();
                } else {
                    matrix.reset();
                }
                Matrix matrix2 = c5344h.f44244d;
                AbstractC3557B.Z(matrix2);
                matrix2.setTranslate(C5251c.d(r10), C5251c.e(r10));
                Matrix matrix3 = c5344h.f44244d;
                AbstractC3557B.Z(matrix3);
                path.transform(matrix3);
                path.close();
                long c03 = abstractC5650i.c0();
                C5643b V11 = abstractC5650i.V();
                long b11 = V11.b();
                V11.a().h();
                V11.f45609a.c(f14, c03);
                AbstractC5648g.i(abstractC5650i, c5344h, j6, floatValue, null, 56);
                V11.a().q();
                V11.c(b11);
                V10.a().q();
                V10.c(b10);
                return yVar;
            case 2:
                N0.m mVar = (N0.m) obj;
                float[] fArr = (float[]) obj3;
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) obj4;
                kotlin.jvm.internal.y yVar2 = (kotlin.jvm.internal.y) obj2;
                int i13 = mVar.f12540b;
                long j10 = this.f299Z;
                if (i13 > N0.D.e(j10)) {
                    i10 = mVar.f12540b;
                } else {
                    i10 = N0.D.e(j10);
                }
                int d11 = N0.D.d(j10);
                int i14 = mVar.f12541c;
                if (i14 >= d11) {
                    i14 = N0.D.d(j10);
                }
                long e11 = U3.f.e(mVar.a(i10), mVar.a(i14));
                int i15 = zVar.f37647Y;
                C1042a c1042a = (C1042a) mVar.f12539a;
                c1042a.getClass();
                int e12 = N0.D.e(e11);
                int d12 = N0.D.d(e11);
                O0.s sVar = c1042a.f12495d;
                Layout layout = sVar.f13320d;
                int length = layout.getText().length();
                if (e12 >= 0) {
                    if (e12 < length) {
                        if (d12 > e12) {
                            if (d12 <= length) {
                                if (fArr.length - i15 >= (d12 - e12) * 4) {
                                    int lineForOffset = layout.getLineForOffset(e12);
                                    int lineForOffset2 = layout.getLineForOffset(d12 - 1);
                                    O0.d dVar = new O0.d(sVar);
                                    if (lineForOffset <= lineForOffset2) {
                                        int i16 = i15;
                                        while (true) {
                                            int lineStart = layout.getLineStart(lineForOffset);
                                            int e13 = sVar.e(lineForOffset);
                                            int max2 = Math.max(e12, lineStart);
                                            int min2 = Math.min(d12, e13);
                                            float f17 = sVar.f(lineForOffset);
                                            float d13 = sVar.d(lineForOffset);
                                            int i17 = e12;
                                            int i18 = d12;
                                            boolean z13 = false;
                                            if (layout.getParagraphDirection(lineForOffset) == 1) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            boolean z14 = !z10;
                                            int i19 = max2;
                                            int i20 = i16;
                                            while (i19 < min2) {
                                                boolean isRtlCharAt = layout.isRtlCharAt(i19);
                                                if (z10 && !isRtlCharAt) {
                                                    i11 = min2;
                                                    f6 = dVar.a(i19, z13, z13, true);
                                                    z11 = z10;
                                                    f10 = dVar.a(i19 + 1, true, true, true);
                                                    z12 = false;
                                                } else {
                                                    i11 = min2;
                                                    if (z10 && isRtlCharAt) {
                                                        z12 = false;
                                                        float a10 = dVar.a(i19, false, false, false);
                                                        z11 = z10;
                                                        f6 = dVar.a(i19 + 1, true, true, false);
                                                        f10 = a10;
                                                    } else {
                                                        z11 = z10;
                                                        z12 = false;
                                                        if (z14 && isRtlCharAt) {
                                                            f10 = dVar.a(i19, false, false, true);
                                                            f6 = dVar.a(i19 + 1, true, true, true);
                                                            z12 = false;
                                                        } else {
                                                            f6 = dVar.a(i19, false, false, false);
                                                            f10 = dVar.a(i19 + 1, true, true, false);
                                                        }
                                                    }
                                                }
                                                fArr[i20] = f6;
                                                fArr[i20 + 1] = f17;
                                                fArr[i20 + 2] = f10;
                                                fArr[i20 + 3] = d13;
                                                i20 += 4;
                                                i19++;
                                                z13 = z12;
                                                min2 = i11;
                                                z10 = z11;
                                            }
                                            if (lineForOffset != lineForOffset2) {
                                                lineForOffset++;
                                                i16 = i20;
                                                e12 = i17;
                                                d12 = i18;
                                            }
                                        }
                                    }
                                    int c10 = (N0.D.c(e11) * 4) + zVar.f37647Y;
                                    for (int i21 = zVar.f37647Y; i21 < c10; i21 += 4) {
                                        int i22 = i21 + 1;
                                        float f18 = fArr[i22];
                                        float f19 = yVar2.f37646Y;
                                        fArr[i22] = f18 + f19;
                                        int i23 = i21 + 3;
                                        fArr[i23] = fArr[i23] + f19;
                                    }
                                    zVar.f37647Y = c10;
                                    yVar2.f37646Y = c1042a.b() + yVar2.f37646Y;
                                    return yVar;
                                }
                                throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
                            }
                            throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
                        }
                        throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
                    }
                    throw new IllegalArgumentException("startOffset must be less than text length".toString());
                }
                throw new IllegalArgumentException("startOffset must be > 0".toString());
            default:
                kotlin.jvm.internal.B b12 = (kotlin.jvm.internal.B) obj4;
                Ng.K k10 = (Ng.K) b12.f37622Y;
                if (k10 != null) {
                    ((Ng.v0) k10).k(null);
                }
                b12.f37622Y = Ad.l.L((Ng.F) obj3, null, new C2402a(this.f299Z, (wf.n) obj2, obj, null), 3);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0045u(Object obj, l1 l1Var, long j6, r0.E e10) {
        super(1);
        this.f298Y = 1;
        this.f300h0 = obj;
        this.f301i0 = l1Var;
        this.f299Z = j6;
        this.f302j0 = e10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0045u(kotlin.jvm.internal.B b10, C1394f c1394f, wf.n nVar) {
        super(1);
        this.f298Y = 3;
        this.f301i0 = b10;
        this.f300h0 = c1394f;
        this.f299Z = 100L;
        this.f302j0 = nVar;
    }
}
