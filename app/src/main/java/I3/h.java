package i3;

import T0.m;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import g3.AbstractC3162e;
import g3.AbstractC3170m;
import g3.C3158a;
import g3.C3169l;
import java.util.ArrayList;
import java.util.List;
import s2.AbstractC5530A;
import s2.AbstractC5535e;
import s2.p;
import s2.t;
import s2.u;
import x8.L;
import x8.N;
import x8.k0;

/* loaded from: classes2.dex */
public final class h implements AbstractC3170m {

    /* renamed from: m0  reason: collision with root package name */
    public static final byte[] f32649m0 = {0, 7, 8, 15};

    /* renamed from: n0  reason: collision with root package name */
    public static final byte[] f32650n0 = {0, 119, -120, -1};

    /* renamed from: o0  reason: collision with root package name */
    public static final byte[] f32651o0 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: Y  reason: collision with root package name */
    public final Paint f32652Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Paint f32653Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Canvas f32654h0 = new Canvas();

    /* renamed from: i0  reason: collision with root package name */
    public final C3466b f32655i0 = new C3466b(719, 575, 0, 719, 0, 575);

    /* renamed from: j0  reason: collision with root package name */
    public final C3465a f32656j0 = new C3465a(0, new int[]{0, -1, -16777216, -8421505}, c(), d());

    /* renamed from: k0  reason: collision with root package name */
    public final g f32657k0;

    /* renamed from: l0  reason: collision with root package name */
    public Bitmap f32658l0;

    public h(List list) {
        u uVar = new u((byte[]) list.get(0));
        int z10 = uVar.z();
        int z11 = uVar.z();
        Paint paint = new Paint();
        this.f32652Y = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f32653Z = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f32657k0 = new g(z10, z11);
    }

    public static byte[] a(int i10, int i11, t tVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) tVar.i(i11);
        }
        return bArr;
    }

    public static int[] c() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i15 = 1; i15 < 16; i15++) {
            if (i15 < 8) {
                if ((i15 & 1) != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if ((i15 & 2) != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                if ((i15 & 4) != 0) {
                    i14 = 255;
                } else {
                    i14 = 0;
                }
                iArr[i15] = g(255, i12, i13, i14);
            } else {
                int i16 = 127;
                if ((i15 & 1) != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if ((i15 & 2) != 0) {
                    i11 = 127;
                } else {
                    i11 = 0;
                }
                if ((i15 & 4) == 0) {
                    i16 = 0;
                }
                iArr[i15] = g(255, i10, i11, i16);
            }
        }
        return iArr;
    }

    public static int[] d() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i28 = 0; i28 < 256; i28++) {
            int i29 = 255;
            if (i28 < 8) {
                if ((i28 & 1) != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if ((i28 & 2) != 0) {
                    i27 = 255;
                } else {
                    i27 = 0;
                }
                if ((i28 & 4) == 0) {
                    i29 = 0;
                }
                iArr[i28] = g(63, i26, i27, i29);
            } else {
                int i30 = i28 & 136;
                int i31 = 170;
                int i32 = 85;
                if (i30 != 0) {
                    if (i30 != 8) {
                        int i33 = 43;
                        if (i30 != 128) {
                            if (i30 == 136) {
                                if ((i28 & 1) != 0) {
                                    i22 = 43;
                                } else {
                                    i22 = 0;
                                }
                                if ((i28 & 16) != 0) {
                                    i23 = 85;
                                } else {
                                    i23 = 0;
                                }
                                int i34 = i22 + i23;
                                if ((i28 & 2) != 0) {
                                    i24 = 43;
                                } else {
                                    i24 = 0;
                                }
                                if ((i28 & 32) != 0) {
                                    i25 = 85;
                                } else {
                                    i25 = 0;
                                }
                                int i35 = i24 + i25;
                                if ((i28 & 4) == 0) {
                                    i33 = 0;
                                }
                                if ((i28 & 64) == 0) {
                                    i32 = 0;
                                }
                                iArr[i28] = g(255, i34, i35, i33 + i32);
                            }
                        } else {
                            if ((i28 & 1) != 0) {
                                i18 = 43;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i18 + 127;
                            if ((i28 & 16) != 0) {
                                i19 = 85;
                            } else {
                                i19 = 0;
                            }
                            int i37 = i36 + i19;
                            if ((i28 & 2) != 0) {
                                i20 = 43;
                            } else {
                                i20 = 0;
                            }
                            int i38 = i20 + 127;
                            if ((i28 & 32) != 0) {
                                i21 = 85;
                            } else {
                                i21 = 0;
                            }
                            int i39 = i38 + i21;
                            if ((i28 & 4) == 0) {
                                i33 = 0;
                            }
                            int i40 = i33 + 127;
                            if ((i28 & 64) == 0) {
                                i32 = 0;
                            }
                            iArr[i28] = g(255, i37, i39, i40 + i32);
                        }
                    } else {
                        if ((i28 & 1) != 0) {
                            i14 = 85;
                        } else {
                            i14 = 0;
                        }
                        if ((i28 & 16) != 0) {
                            i15 = 170;
                        } else {
                            i15 = 0;
                        }
                        int i41 = i14 + i15;
                        if ((i28 & 2) != 0) {
                            i16 = 85;
                        } else {
                            i16 = 0;
                        }
                        if ((i28 & 32) != 0) {
                            i17 = 170;
                        } else {
                            i17 = 0;
                        }
                        int i42 = i16 + i17;
                        if ((i28 & 4) == 0) {
                            i32 = 0;
                        }
                        if ((i28 & 64) == 0) {
                            i31 = 0;
                        }
                        iArr[i28] = g(127, i41, i42, i32 + i31);
                    }
                } else {
                    if ((i28 & 1) != 0) {
                        i10 = 85;
                    } else {
                        i10 = 0;
                    }
                    if ((i28 & 16) != 0) {
                        i11 = 170;
                    } else {
                        i11 = 0;
                    }
                    int i43 = i10 + i11;
                    if ((i28 & 2) != 0) {
                        i12 = 85;
                    } else {
                        i12 = 0;
                    }
                    if ((i28 & 32) != 0) {
                        i13 = 170;
                    } else {
                        i13 = 0;
                    }
                    int i44 = i12 + i13;
                    if ((i28 & 4) == 0) {
                        i32 = 0;
                    }
                    if ((i28 & 64) == 0) {
                        i31 = 0;
                    }
                    iArr[i28] = g(255, i43, i44, i32 + i31);
                }
            }
        }
        return iArr;
    }

    public static int g(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0236 A[LOOP:3: B:87:0x0180->B:117:0x0236, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        int i13;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        char c10;
        char c11;
        byte b10;
        int i16;
        byte b11;
        byte b12;
        byte[] bArr3;
        byte[] bArr4;
        int i17;
        boolean z12;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        byte[] bArr5;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = 0;
        t tVar = new t(bArr, 0);
        int i28 = i11;
        int i29 = i12;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        while (tVar.b() != 0) {
            int i30 = 8;
            int i31 = tVar.i(8);
            if (i31 != 240) {
                int i32 = 2;
                int i33 = 1;
                int i34 = 3;
                int i35 = 4;
                switch (i31) {
                    case 16:
                        if (i10 == 3) {
                            if (bArr6 == null) {
                                bArr3 = f32650n0;
                            } else {
                                bArr3 = bArr6;
                            }
                        } else if (i10 == 2) {
                            if (bArr8 == null) {
                                bArr3 = f32649m0;
                            } else {
                                bArr3 = bArr8;
                            }
                        } else {
                            bArr2 = null;
                            i13 = i28;
                            z10 = false;
                            while (true) {
                                i14 = tVar.i(2);
                                if (i14 == 0) {
                                    z11 = z10;
                                    i15 = 1;
                                    b12 = i14;
                                } else if (tVar.h()) {
                                    i15 = tVar.i(3) + 3;
                                    b12 = tVar.i(2);
                                    z11 = z10;
                                } else if (tVar.h()) {
                                    z11 = z10;
                                    i15 = 1;
                                    b12 = 0;
                                } else {
                                    int i36 = tVar.i(2);
                                    if (i36 != 0) {
                                        if (i36 != 1) {
                                            if (i36 != 2) {
                                                if (i36 != 3) {
                                                    z11 = z10;
                                                    b11 = 0;
                                                    c11 = 4;
                                                    c10 = '\b';
                                                } else {
                                                    c10 = '\b';
                                                    i15 = tVar.i(8) + 29;
                                                    b10 = tVar.i(2);
                                                    z11 = z10;
                                                    c11 = 4;
                                                }
                                            } else {
                                                c11 = 4;
                                                c10 = '\b';
                                                i15 = tVar.i(4) + 12;
                                                b10 = tVar.i(2);
                                                z11 = z10;
                                            }
                                        } else {
                                            c11 = 4;
                                            c10 = '\b';
                                            z11 = z10;
                                            i15 = 2;
                                            b10 = 0;
                                        }
                                        if (i15 == 0 && paint != null) {
                                            if (bArr2 != null) {
                                                b10 = bArr2[b10];
                                            }
                                            paint.setColor(iArr[b10]);
                                            i16 = i13;
                                            canvas.drawRect(i13, i29, i13 + i15, i29 + 1, paint);
                                        } else {
                                            i16 = i13;
                                        }
                                        i13 = i16 + i15;
                                        if (!z11) {
                                            tVar.c();
                                            i28 = i13;
                                            break;
                                        } else {
                                            z10 = z11;
                                        }
                                    } else {
                                        c11 = 4;
                                        c10 = '\b';
                                        z11 = true;
                                        b11 = 0;
                                    }
                                    i15 = 0;
                                    b10 = b11;
                                    if (i15 == 0) {
                                    }
                                    i16 = i13;
                                    i13 = i16 + i15;
                                    if (!z11) {
                                    }
                                }
                                c11 = 4;
                                c10 = '\b';
                                b10 = b12;
                                if (i15 == 0) {
                                }
                                i16 = i13;
                                i13 = i16 + i15;
                                if (!z11) {
                                }
                            }
                        }
                        bArr2 = bArr3;
                        i13 = i28;
                        z10 = false;
                        while (true) {
                            i14 = tVar.i(2);
                            if (i14 == 0) {
                            }
                            c11 = 4;
                            c10 = '\b';
                            b10 = b12;
                            if (i15 == 0) {
                            }
                            i16 = i13;
                            i13 = i16 + i15;
                            if (!z11) {
                            }
                            z10 = z11;
                        }
                    case 17:
                        if (i10 == 3) {
                            if (bArr7 == null) {
                                bArr5 = f32651o0;
                            } else {
                                bArr5 = bArr7;
                            }
                            bArr4 = bArr5;
                        } else {
                            bArr4 = null;
                        }
                        int i37 = i28;
                        boolean z13 = false;
                        while (true) {
                            int i38 = tVar.i(i35);
                            if (i38 != 0) {
                                z12 = z13;
                                i17 = 1;
                            } else if (!tVar.h()) {
                                int i39 = tVar.i(i34);
                                if (i39 != 0) {
                                    z12 = z13;
                                    i17 = i39 + 2;
                                    i38 = 0;
                                } else {
                                    z12 = true;
                                    i38 = 0;
                                    i17 = 0;
                                }
                            } else {
                                if (!tVar.h()) {
                                    i21 = tVar.i(i32) + i35;
                                    i22 = tVar.i(i35);
                                } else {
                                    int i40 = tVar.i(i32);
                                    if (i40 != 0) {
                                        if (i40 != 1) {
                                            if (i40 != i32) {
                                                if (i40 != i34) {
                                                    z12 = z13;
                                                    i38 = 0;
                                                    i17 = 0;
                                                } else {
                                                    i21 = tVar.i(i30) + 25;
                                                    i22 = tVar.i(i35);
                                                }
                                            } else {
                                                i21 = tVar.i(i35) + 9;
                                                i22 = tVar.i(i35);
                                            }
                                        } else {
                                            z12 = z13;
                                            i17 = i32;
                                        }
                                    } else {
                                        z12 = z13;
                                        i17 = 1;
                                    }
                                    i38 = 0;
                                }
                                i17 = i21;
                                i38 = i22;
                                z12 = z13;
                            }
                            if (i17 != 0 && paint != null) {
                                if (bArr4 != null) {
                                    i38 = bArr4[i38];
                                }
                                paint.setColor(iArr[i38]);
                                i20 = 3;
                                i18 = i37;
                                i19 = i32;
                                canvas.drawRect(i37, i29, i37 + i17, i29 + 1, paint);
                            } else {
                                i20 = i34;
                                i18 = i37;
                                i19 = i32;
                            }
                            i37 = i18 + i17;
                            if (z12) {
                                tVar.c();
                                i28 = i37;
                                break;
                            } else {
                                i34 = i20;
                                i32 = i19;
                                z13 = z12;
                                i35 = 4;
                                i30 = 8;
                            }
                        }
                    case 18:
                        i13 = i28;
                        int i41 = i27;
                        while (true) {
                            int i42 = tVar.i(8);
                            if (i42 != 0) {
                                i24 = i41;
                                i23 = i33;
                            } else if (!tVar.h()) {
                                int i43 = tVar.i(7);
                                if (i43 != 0) {
                                    i24 = i41;
                                    i23 = i43;
                                    i42 = i27;
                                } else {
                                    i24 = i33;
                                    i42 = i27;
                                    i23 = i42;
                                }
                            } else {
                                i24 = i41;
                                i23 = tVar.i(7);
                                i42 = tVar.i(8);
                            }
                            if (i23 != 0 && paint != null) {
                                paint.setColor(iArr[i42]);
                                i26 = i33;
                                i25 = i13;
                                canvas.drawRect(i13, i29, i13 + i23, i29 + 1, paint);
                            } else {
                                i26 = i33;
                                i25 = i13;
                            }
                            i13 = i25 + i23;
                            if (i24 != 0) {
                                i28 = i13;
                                break;
                            } else {
                                i33 = i26;
                                i41 = i24;
                                i27 = 0;
                            }
                        }
                    default:
                        switch (i31) {
                            case 32:
                                bArr8 = a(4, 4, tVar);
                                continue;
                            case 33:
                                bArr6 = a(4, 8, tVar);
                                continue;
                            case 34:
                                bArr7 = a(16, 8, tVar);
                                continue;
                        }
                }
            } else {
                i29 += 2;
                i28 = i11;
            }
            i27 = 0;
        }
    }

    public static C3465a i(int i10, t tVar) {
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = tVar.i(8);
        tVar.s(8);
        int i18 = 2;
        int i19 = i10 - 2;
        int i20 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] c10 = c();
        int[] d10 = d();
        while (i19 > 0) {
            int i21 = tVar.i(i16);
            int i22 = tVar.i(i16);
            if ((i22 & 128) != 0) {
                iArr = iArr2;
            } else if ((i22 & 64) != 0) {
                iArr = c10;
            } else {
                iArr = d10;
            }
            if ((i22 & 1) != 0) {
                i14 = tVar.i(i16);
                i13 = tVar.i(i16);
                i12 = tVar.i(i16);
                i11 = tVar.i(i16);
                i15 = i19 - 6;
            } else {
                int i23 = tVar.i(4) << 4;
                i12 = tVar.i(4) << 4;
                i15 = i19 - 4;
                i11 = tVar.i(i18) << 6;
                i14 = tVar.i(6) << i18;
                i13 = i23;
            }
            if (i14 == 0) {
                i13 = i20;
                i12 = i13;
                i11 = 255;
            }
            double d11 = i14;
            double d12 = i13 - 128;
            double d13 = i12 - 128;
            iArr[i21] = g((byte) (255 - (i11 & 255)), AbstractC5530A.i((int) ((1.402d * d12) + d11), 0, 255), AbstractC5530A.i((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255), AbstractC5530A.i((int) ((d13 * 1.772d) + d11), 0, 255));
            i19 = i15;
            i20 = 0;
            i17 = i17;
            d10 = d10;
            i16 = 8;
            i18 = 2;
        }
        return new C3465a(i17, iArr2, c10, d10);
    }

    public static C3467c j(t tVar) {
        byte[] bArr;
        int i10 = tVar.i(16);
        tVar.s(4);
        int i11 = tVar.i(2);
        boolean h10 = tVar.h();
        tVar.s(1);
        byte[] bArr2 = AbstractC5530A.f45136f;
        if (i11 == 1) {
            tVar.s(tVar.i(8) * 16);
        } else if (i11 == 0) {
            int i12 = tVar.i(16);
            int i13 = tVar.i(16);
            if (i12 > 0) {
                bArr2 = new byte[i12];
                tVar.k(bArr2, i12);
            }
            if (i13 > 0) {
                bArr = new byte[i13];
                tVar.k(bArr, i13);
                return new C3467c(i10, h10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C3467c(i10, h10, bArr2, bArr);
    }

    @Override // g3.AbstractC3170m
    public final void b() {
        g gVar = this.f32657k0;
        ((SparseArray) gVar.f32642c).clear();
        ((SparseArray) gVar.f32643d).clear();
        ((SparseArray) gVar.f32644e).clear();
        ((SparseArray) gVar.f32645f).clear();
        ((SparseArray) gVar.f32646g).clear();
        gVar.f32647h = null;
        gVar.f32648i = null;
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ AbstractC3162e e(byte[] bArr, int i10, int i11) {
        return AbstractC2469q0.b(this, bArr, i10, i11);
    }

    @Override // g3.AbstractC3170m
    public final void f(byte[] bArr, int i10, int i11, C3169l c3169l, AbstractC5535e abstractC5535e) {
        g gVar;
        C3158a c3158a;
        char c10;
        char c11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C3466b c3466b;
        int i20;
        ArrayList arrayList;
        g gVar2;
        e eVar;
        Paint paint;
        int[] iArr;
        e eVar2;
        int i21;
        int i22;
        int i23;
        int i24;
        t tVar = new t(i10 + i11, bArr);
        tVar.p(i10);
        while (true) {
            int b10 = tVar.b();
            gVar = this.f32657k0;
            if (b10 >= 48 && tVar.i(8) == 15) {
                int i25 = tVar.i(8);
                int i26 = 16;
                int i27 = tVar.i(16);
                int i28 = tVar.i(16);
                int f6 = tVar.f() + i28;
                if (i28 * 8 > tVar.b()) {
                    p.g("DvbParser", "Data field length exceeds limit");
                    tVar.s(tVar.b());
                } else {
                    switch (i25) {
                        case 16:
                            if (i27 == gVar.f32640a) {
                                m mVar = (m) gVar.f32648i;
                                int i29 = tVar.i(8);
                                int i30 = tVar.i(4);
                                int i31 = tVar.i(2);
                                tVar.s(2);
                                int i32 = i28 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i32 > 0) {
                                    int i33 = tVar.i(8);
                                    tVar.s(8);
                                    i32 -= 6;
                                    sparseArray.put(i33, new d(tVar.i(16), tVar.i(16)));
                                }
                                m mVar2 = new m(i29, i30, i31, sparseArray);
                                if (mVar2.f16799d != 0) {
                                    gVar.f32648i = mVar2;
                                    ((SparseArray) gVar.f32642c).clear();
                                    ((SparseArray) gVar.f32643d).clear();
                                    ((SparseArray) gVar.f32644e).clear();
                                    break;
                                } else if (mVar != null && mVar.f16798c != mVar2.f16798c) {
                                    gVar.f32648i = mVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            m mVar3 = (m) gVar.f32648i;
                            if (i27 == gVar.f32640a && mVar3 != null) {
                                int i34 = tVar.i(8);
                                tVar.s(4);
                                boolean h10 = tVar.h();
                                tVar.s(3);
                                int i35 = tVar.i(16);
                                int i36 = tVar.i(16);
                                tVar.i(3);
                                int i37 = tVar.i(3);
                                tVar.s(2);
                                int i38 = tVar.i(8);
                                int i39 = tVar.i(8);
                                int i40 = tVar.i(4);
                                int i41 = tVar.i(2);
                                tVar.s(2);
                                int i42 = i28 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i42 > 0) {
                                    int i43 = tVar.i(i26);
                                    int i44 = tVar.i(2);
                                    tVar.i(2);
                                    int i45 = tVar.i(12);
                                    tVar.s(4);
                                    int i46 = tVar.i(12);
                                    int i47 = i42 - 6;
                                    if (i44 != 1 && i44 != 2) {
                                        i42 = i47;
                                    } else {
                                        tVar.i(8);
                                        tVar.i(8);
                                        i42 -= 8;
                                    }
                                    sparseArray2.put(i43, new f(i45, i46));
                                    i26 = 16;
                                }
                                e eVar3 = new e(i34, h10, i35, i36, i37, i38, i39, i40, i41, sparseArray2);
                                int i48 = mVar3.f16799d;
                                Cloneable cloneable = gVar.f32642c;
                                if (i48 == 0 && (eVar2 = (e) ((SparseArray) cloneable).get(i34)) != null) {
                                    int i49 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = eVar2.f32637j;
                                        if (i49 < sparseArray3.size()) {
                                            eVar3.f32637j.put(sparseArray3.keyAt(i49), (f) sparseArray3.valueAt(i49));
                                            i49++;
                                        }
                                    }
                                }
                                ((SparseArray) cloneable).put(eVar3.f32628a, eVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (i27 == gVar.f32640a) {
                                C3465a i50 = i(i28, tVar);
                                ((SparseArray) gVar.f32643d).put(i50.f32612a, i50);
                                break;
                            } else if (i27 == gVar.f32641b) {
                                C3465a i51 = i(i28, tVar);
                                ((SparseArray) gVar.f32645f).put(i51.f32612a, i51);
                                break;
                            }
                            break;
                        case 19:
                            if (i27 == gVar.f32640a) {
                                C3467c j6 = j(tVar);
                                ((SparseArray) gVar.f32644e).put(j6.f32622a, j6);
                                break;
                            } else if (i27 == gVar.f32641b) {
                                C3467c j10 = j(tVar);
                                ((SparseArray) gVar.f32646g).put(j10.f32622a, j10);
                                break;
                            }
                            break;
                        case 20:
                            if (i27 == gVar.f32640a) {
                                tVar.s(4);
                                boolean h11 = tVar.h();
                                tVar.s(3);
                                int i52 = tVar.i(16);
                                int i53 = tVar.i(16);
                                if (h11) {
                                    int i54 = tVar.i(16);
                                    i23 = tVar.i(16);
                                    i22 = tVar.i(16);
                                    i21 = tVar.i(16);
                                    i24 = i54;
                                } else {
                                    i23 = i52;
                                    i21 = i53;
                                    i24 = 0;
                                    i22 = 0;
                                }
                                gVar.f32647h = new C3466b(i52, i53, i24, i23, i22, i21);
                                break;
                            }
                            break;
                    }
                    tVar.t(f6 - tVar.f());
                }
            }
        }
        m mVar4 = (m) gVar.f32648i;
        if (mVar4 == null) {
            L l10 = N.f49523Z;
            c3158a = new C3158a(-9223372036854775807L, -9223372036854775807L, k0.f49573j0);
        } else {
            C3466b c3466b2 = (C3466b) gVar.f32647h;
            if (c3466b2 == null) {
                c3466b2 = this.f32655i0;
            }
            Bitmap bitmap = this.f32658l0;
            Canvas canvas = this.f32654h0;
            if (bitmap == null || c3466b2.f32616a + 1 != bitmap.getWidth() || c3466b2.f32617b + 1 != this.f32658l0.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(c3466b2.f32616a + 1, c3466b2.f32617b + 1, Bitmap.Config.ARGB_8888);
                this.f32658l0 = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray4 = (SparseArray) mVar4.f16800e;
            int i55 = 0;
            while (i55 < sparseArray4.size()) {
                canvas.save();
                d dVar = (d) sparseArray4.valueAt(i55);
                e eVar4 = (e) ((SparseArray) gVar.f32642c).get(sparseArray4.keyAt(i55));
                int i56 = dVar.f32626a + c3466b2.f32618c;
                int i57 = dVar.f32627b + c3466b2.f32620e;
                int min = Math.min(eVar4.f32630c + i56, c3466b2.f32619d);
                int i58 = eVar4.f32631d;
                int i59 = i57 + i58;
                canvas.clipRect(i56, i57, min, Math.min(i59, c3466b2.f32621f));
                int i60 = eVar4.f32633f;
                C3465a c3465a = (C3465a) ((SparseArray) gVar.f32643d).get(i60);
                if (c3465a == null && (c3465a = (C3465a) ((SparseArray) gVar.f32645f).get(i60)) == null) {
                    c3465a = this.f32656j0;
                }
                int i61 = 0;
                while (true) {
                    SparseArray sparseArray5 = eVar4.f32637j;
                    if (i61 < sparseArray5.size()) {
                        int keyAt = sparseArray5.keyAt(i61);
                        f fVar = (f) sparseArray5.valueAt(i61);
                        SparseArray sparseArray6 = sparseArray4;
                        C3467c c3467c = (C3467c) ((SparseArray) gVar.f32644e).get(keyAt);
                        if (c3467c == null) {
                            c3467c = (C3467c) ((SparseArray) gVar.f32646g).get(keyAt);
                        }
                        if (c3467c != null) {
                            if (c3467c.f32623b) {
                                paint = null;
                            } else {
                                paint = this.f32652Y;
                            }
                            gVar2 = gVar;
                            int i62 = fVar.f32638a + i56;
                            int i63 = fVar.f32639b + i57;
                            arrayList = arrayList2;
                            int i64 = eVar4.f32632e;
                            i20 = i61;
                            if (i64 == 3) {
                                iArr = c3465a.f32615d;
                            } else if (i64 == 2) {
                                iArr = c3465a.f32614c;
                            } else {
                                iArr = c3465a.f32613b;
                            }
                            int[] iArr2 = iArr;
                            c3466b = c3466b2;
                            i15 = i58;
                            i19 = i59;
                            i18 = i57;
                            i17 = i56;
                            eVar = eVar4;
                            Paint paint2 = paint;
                            i16 = i55;
                            h(c3467c.f32624c, iArr2, i64, i62, i63, paint2, canvas);
                            h(c3467c.f32625d, iArr2, i64, i62, i63 + 1, paint2, canvas);
                        } else {
                            c3466b = c3466b2;
                            arrayList = arrayList2;
                            gVar2 = gVar;
                            i20 = i61;
                            i19 = i59;
                            i15 = i58;
                            i18 = i57;
                            i17 = i56;
                            eVar = eVar4;
                            i16 = i55;
                        }
                        i61 = i20 + 1;
                        eVar4 = eVar;
                        sparseArray4 = sparseArray6;
                        gVar = gVar2;
                        arrayList2 = arrayList;
                        c3466b2 = c3466b;
                        i59 = i19;
                        i57 = i18;
                        i56 = i17;
                        i55 = i16;
                        i58 = i15;
                    } else {
                        SparseArray sparseArray7 = sparseArray4;
                        C3466b c3466b3 = c3466b2;
                        ArrayList arrayList3 = arrayList2;
                        g gVar3 = gVar;
                        int i65 = i59;
                        int i66 = i58;
                        int i67 = i57;
                        int i68 = i56;
                        e eVar5 = eVar4;
                        int i69 = i55;
                        boolean z10 = eVar5.f32629b;
                        int i70 = eVar5.f32630c;
                        if (z10) {
                            int i71 = eVar5.f32632e;
                            c11 = 3;
                            if (i71 == 3) {
                                i14 = c3465a.f32615d[eVar5.f32634g];
                                c10 = 2;
                            } else {
                                c10 = 2;
                                if (i71 == 2) {
                                    i14 = c3465a.f32614c[eVar5.f32635h];
                                } else {
                                    i14 = c3465a.f32613b[eVar5.f32636i];
                                }
                            }
                            Paint paint3 = this.f32653Z;
                            paint3.setColor(i14);
                            i13 = i68;
                            i12 = i67;
                            canvas.drawRect(i13, i12, i13 + i70, i65, paint3);
                        } else {
                            i12 = i67;
                            i13 = i68;
                            c11 = 3;
                            c10 = 2;
                        }
                        Bitmap createBitmap2 = Bitmap.createBitmap(this.f32658l0, i13, i12, i70, i66);
                        float f10 = c3466b3.f32616a;
                        float f11 = i13 / f10;
                        float f12 = i12;
                        float f13 = c3466b3.f32617b;
                        arrayList3.add(new r2.b(null, null, null, createBitmap2, f12 / f13, 0, 0, f11, 0, Integer.MIN_VALUE, -3.4028235E38f, i70 / f10, i66 / f13, false, -16777216, Integer.MIN_VALUE, 0.0f));
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.restore();
                        i55 = i69 + 1;
                        sparseArray4 = sparseArray7;
                        gVar = gVar3;
                        arrayList2 = arrayList3;
                        c3466b2 = c3466b3;
                    }
                }
            }
            c3158a = new C3158a(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        abstractC5535e.accept(c3158a);
    }
}
