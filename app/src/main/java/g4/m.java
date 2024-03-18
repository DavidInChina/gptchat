package G4;

import Bh.AbstractC0267r0;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m implements J, AbstractC0267r0 {

    /* renamed from: Y  reason: collision with root package name */
    public int f6018Y;

    public m(int i10) {
        if (i10 == 2) {
            this.f6018Y = 20;
        } else if (i10 == 4) {
        } else {
            this.f6018Y = 1;
        }
    }

    @Override // Bh.AbstractC0267r0
    public final void a(Nh.l lVar) {
        int i10 = this.f6018Y;
        Object[] objArr = AbstractC0267r0.f2377e;
        if (i10 == 0) {
            lVar.l(3, 0, 0, objArr, objArr);
        } else if (i10 > 3) {
            lVar.l(0, 0, 0, objArr, objArr);
        } else {
            lVar.l(2, i10, 0, objArr, objArr);
        }
        lVar.n(0);
        this.f6018Y = 0;
    }

    @Override // Bh.AbstractC0267r0
    public final void b(int i10, int i11) {
        if (i10 != -1 && i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3 && i10 != 4) {
                        throw new IllegalStateException(android.gov.nist.core.a.e("Unexpected frame type: ", i10));
                    }
                    return;
                }
                this.f6018Y -= i11;
                return;
            }
            this.f6018Y += i11;
            return;
        }
        this.f6018Y = i11;
    }

    @Override // G4.J
    public final Object c(H4.a aVar, float f6) {
        boolean z10;
        int i10;
        int i11;
        int argb;
        int i12;
        float d10;
        float f10;
        ArrayList arrayList = new ArrayList();
        int i13 = 1;
        if (aVar.P() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            aVar.a();
        }
        while (aVar.m()) {
            arrayList.add(Float.valueOf((float) aVar.r()));
        }
        int i14 = 4;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f6018Y = 2;
        }
        if (z10) {
            aVar.i();
        }
        if (this.f6018Y == -1) {
            this.f6018Y = arrayList.size() / 4;
        }
        int i15 = this.f6018Y;
        float[] fArr = new float[i15];
        int[] iArr = new int[i15];
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i10 = this.f6018Y * i14;
            if (i16 >= i10) {
                break;
            }
            int i19 = i16 / 4;
            double floatValue = ((Float) arrayList.get(i16)).floatValue();
            int i20 = i16 % 4;
            if (i20 != 0) {
                if (i20 != i13) {
                    if (i20 != 2) {
                        if (i20 == 3) {
                            iArr[i19] = Color.argb(255, i17, i18, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i18 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i17 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i19 > 0) {
                    float f11 = (float) floatValue;
                    if (fArr[i19 - 1] >= f11) {
                        fArr[i19] = f11 + 0.01f;
                    }
                }
                fArr[i19] = (float) floatValue;
            }
            i16++;
            i13 = 1;
            i14 = 4;
        }
        D4.c cVar = new D4.c(fArr, iArr);
        if (arrayList.size() > i10) {
            int size = (arrayList.size() - i10) / 2;
            float[] fArr2 = new float[size];
            float[] fArr3 = new float[size];
            int i21 = 0;
            while (i10 < arrayList.size()) {
                if (i10 % 2 == 0) {
                    fArr2[i21] = ((Float) arrayList.get(i10)).floatValue();
                } else {
                    fArr3[i21] = ((Float) arrayList.get(i10)).floatValue();
                    i21++;
                }
                i10++;
            }
            float[] fArr4 = cVar.f3345a;
            if (fArr4.length == 0) {
                fArr4 = fArr2;
            } else if (size != 0) {
                int length = fArr4.length + size;
                float[] fArr5 = new float[length];
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                for (int i25 = 0; i25 < length; i25++) {
                    float f12 = Float.NaN;
                    if (i23 < fArr4.length) {
                        f10 = fArr4[i23];
                    } else {
                        f10 = Float.NaN;
                    }
                    if (i24 < size) {
                        f12 = fArr2[i24];
                    }
                    if (!Float.isNaN(f12) && f10 >= f12) {
                        if (!Float.isNaN(f10) && f12 >= f10) {
                            fArr5[i25] = f10;
                            i23++;
                            i24++;
                            i22++;
                        } else {
                            fArr5[i25] = f12;
                            i24++;
                        }
                    } else {
                        fArr5[i25] = f10;
                        i23++;
                    }
                }
                if (i22 == 0) {
                    fArr4 = fArr5;
                } else {
                    fArr4 = Arrays.copyOf(fArr5, length - i22);
                }
            }
            int length2 = fArr4.length;
            int[] iArr2 = new int[length2];
            for (int i26 = 0; i26 < length2; i26++) {
                float f13 = fArr4[i26];
                int binarySearch = Arrays.binarySearch(fArr, f13);
                int binarySearch2 = Arrays.binarySearch(fArr2, f13);
                int[] iArr3 = cVar.f3346b;
                if (binarySearch >= 0 && binarySearch2 <= 0) {
                    int i27 = iArr3[binarySearch];
                    if (size >= 2 && f13 > fArr2[0]) {
                        for (int i28 = 1; i28 < size; i28++) {
                            float f14 = fArr2[i28];
                            int i29 = (f14 > f13 ? 1 : (f14 == f13 ? 0 : -1));
                            if (i29 >= 0 || i28 == size - 1) {
                                if (i29 <= 0) {
                                    d10 = fArr3[i28];
                                } else {
                                    int i30 = i28 - 1;
                                    float f15 = fArr2[i30];
                                    d10 = I4.f.d(fArr3[i30], fArr3[i28], (f13 - f15) / (f14 - f15));
                                }
                                i12 = Color.argb((int) (d10 * 255.0f), Color.red(i27), Color.green(i27), Color.blue(i27));
                            }
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    i12 = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i27), Color.green(i27), Color.blue(i27));
                    iArr2[i26] = i12;
                } else {
                    if (binarySearch2 < 0) {
                        binarySearch2 = -(binarySearch2 + 1);
                    }
                    float f16 = fArr3[binarySearch2];
                    if (iArr3.length >= 2 && f13 != fArr[0]) {
                        for (int i31 = 1; i31 < i15; i31++) {
                            float f17 = fArr[i31];
                            if (f17 >= f13 || i31 == i15 - 1) {
                                if (i31 == i15 - 1 && f13 >= f17) {
                                    argb = Color.argb((int) (f16 * 255.0f), Color.red(iArr3[i31]), Color.green(iArr3[i31]), Color.blue(iArr3[i31]));
                                } else {
                                    int i32 = i31 - 1;
                                    float f18 = fArr[i32];
                                    int g02 = r9.y.g0((f13 - f18) / (f17 - f18), iArr3[i32], iArr3[i31]);
                                    argb = Color.argb((int) (f16 * 255.0f), Color.red(g02), Color.green(g02), Color.blue(g02));
                                }
                                i11 = argb;
                            }
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    i11 = iArr3[0];
                    iArr2[i26] = i11;
                }
            }
            return new D4.c(fArr4, iArr2);
        }
        return cVar;
    }

    public /* synthetic */ m(int i10, int i11) {
        this.f6018Y = i10;
    }
}
