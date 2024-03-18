package C0;

import Z.C1724m0;
import com.google.android.gms.internal.play_billing.N;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2485a = false;

    /* renamed from: b  reason: collision with root package name */
    public final int f2486b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final int f2487c;

    /* renamed from: d  reason: collision with root package name */
    public final a[] f2488d;

    /* renamed from: e  reason: collision with root package name */
    public int f2489e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f2490f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f2491g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f2492h;

    public c() {
        int i10;
        int f6 = AbstractC6708l.f(1);
        if (f6 != 0) {
            if (f6 == 1) {
                i10 = 2;
            } else {
                throw new RuntimeException();
            }
        } else {
            i10 = 3;
        }
        this.f2487c = i10;
        this.f2488d = new a[20];
        this.f2490f = new float[20];
        this.f2491g = new float[20];
        this.f2492h = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, C0.a] */
    public final void a(float f6, long j6) {
        int i10 = (this.f2489e + 1) % 20;
        this.f2489e = i10;
        C1724m0 c1724m0 = e.f2497a;
        a[] aVarArr = this.f2488d;
        a aVar = aVarArr[i10];
        if (aVar == 0) {
            ?? obj = new Object();
            obj.f2481a = j6;
            obj.f2482b = f6;
            aVarArr[i10] = obj;
            return;
        }
        aVar.f2481a = j6;
        aVar.f2482b = f6;
    }

    public final float b(float f6) {
        float f10;
        float[] fArr;
        float[] fArr2;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14 = 0.0f;
        if (f6 > 0.0f) {
            int i11 = this.f2489e;
            a[] aVarArr = this.f2488d;
            a aVar = aVarArr[i11];
            if (aVar == null) {
                f10 = 0.0f;
            } else {
                a aVar2 = aVar;
                int i12 = 0;
                while (true) {
                    a aVar3 = aVarArr[i11];
                    fArr = this.f2490f;
                    fArr2 = this.f2491g;
                    if (aVar3 == null) {
                        break;
                    }
                    long j6 = aVar.f2481a;
                    int i13 = i11;
                    long j10 = aVar3.f2481a;
                    float f15 = (float) (j6 - j10);
                    float abs = (float) Math.abs(j10 - aVar2.f2481a);
                    if (f15 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i12] = aVar3.f2482b;
                    fArr2[i12] = -f15;
                    if (i13 == 0) {
                        i10 = 20;
                    } else {
                        i10 = i13;
                    }
                    i11 = i10 - 1;
                    i12++;
                    if (i12 >= 20) {
                        break;
                    }
                    aVar2 = aVar3;
                }
                if (i12 >= this.f2487c) {
                    int f16 = AbstractC6708l.f(this.f2486b);
                    if (f16 != 0) {
                        if (f16 == 1) {
                            C1724m0 c1724m0 = e.f2497a;
                            if (i12 >= 2) {
                                boolean z10 = this.f2485a;
                                if (i12 == 2) {
                                    float f17 = fArr2[0];
                                    float f18 = fArr2[1];
                                    if (f17 != f18) {
                                        if (z10) {
                                            f13 = fArr[0];
                                        } else {
                                            f13 = fArr[0] - fArr[1];
                                        }
                                        f11 = f13 / (f17 - f18);
                                    }
                                } else {
                                    int i14 = i12 - 1;
                                    float f19 = 0.0f;
                                    for (int i15 = i14; i15 > 0; i15--) {
                                        int i16 = i15 - 1;
                                        if (fArr2[i15] != fArr2[i16]) {
                                            float signum = Math.signum(f19) * ((float) Math.sqrt(Math.abs(f19) * 2));
                                            if (z10) {
                                                f12 = -fArr[i16];
                                            } else {
                                                f12 = fArr[i15] - fArr[i16];
                                            }
                                            float f20 = f12 / (fArr2[i15] - fArr2[i16]);
                                            f19 += Math.abs(f20) * (f20 - signum);
                                            if (i15 == i14) {
                                                f19 *= 0.5f;
                                            }
                                        }
                                    }
                                    f11 = Math.signum(f19) * ((float) Math.sqrt(Math.abs(f19) * 2));
                                }
                            }
                            f11 = 0.0f;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        try {
                            float[] fArr3 = this.f2492h;
                            e.c(fArr2, fArr, i12, fArr3);
                            f11 = fArr3[1];
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    f10 = f11 * 1000;
                    f14 = 0.0f;
                } else {
                    f14 = 0.0f;
                    f10 = 0.0f;
                }
            }
            if (f10 != f14) {
                if (f10 > f14) {
                    return N.l(f10, f6);
                }
                return N.j(f10, -f6);
            }
            return f14;
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + f6).toString());
    }
}
