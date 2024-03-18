package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import i1.C3458c;
import i1.d;
import i1.e;
import i1.f;
import i1.g;
import i1.h;
import i1.j;
import j1.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import k1.r;
import k1.s;

/* loaded from: classes.dex */
public class Flow extends s {

    /* renamed from: p0  reason: collision with root package name */
    public g f24869p0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36774h0 = new int[32];
        this.f36779m0 = new HashMap();
        this.f36776j0 = context;
        e(attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i1.g, i1.j] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, j1.b] */
    @Override // k1.s, k1.c
    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        ?? jVar = new j();
        jVar.f32563f0 = 0;
        jVar.f32564g0 = 0;
        jVar.f32565h0 = 0;
        jVar.f32566i0 = 0;
        jVar.f32567j0 = 0;
        jVar.f32568k0 = 0;
        jVar.f32569l0 = false;
        jVar.f32570m0 = 0;
        jVar.f32571n0 = 0;
        jVar.f32572o0 = new Object();
        jVar.f32573p0 = null;
        jVar.f32574q0 = -1;
        jVar.f32575r0 = -1;
        jVar.f32576s0 = -1;
        jVar.f32577t0 = -1;
        jVar.f32578u0 = -1;
        jVar.f32579v0 = -1;
        jVar.f32580w0 = 0.5f;
        jVar.f32581x0 = 0.5f;
        jVar.f32582y0 = 0.5f;
        jVar.f32583z0 = 0.5f;
        jVar.f32548A0 = 0.5f;
        jVar.f32549B0 = 0.5f;
        jVar.f32550C0 = 0;
        jVar.f32551D0 = 0;
        jVar.f32552E0 = 2;
        jVar.f32553F0 = 2;
        jVar.f32554G0 = 0;
        jVar.f32555H0 = -1;
        jVar.f32556I0 = 0;
        jVar.f32557J0 = new ArrayList();
        jVar.f32558K0 = null;
        jVar.f32559L0 = null;
        jVar.f32560M0 = null;
        jVar.f32562O0 = 0;
        this.f24869p0 = jVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f36946b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f24869p0.f32556I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f24869p0;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f32563f0 = dimensionPixelSize;
                    gVar.f32564g0 = dimensionPixelSize;
                    gVar.f32565h0 = dimensionPixelSize;
                    gVar.f32566i0 = dimensionPixelSize;
                } else if (index == 11) {
                    g gVar2 = this.f24869p0;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f32565h0 = dimensionPixelSize2;
                    gVar2.f32567j0 = dimensionPixelSize2;
                    gVar2.f32568k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f24869p0.f32566i0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f24869p0.f32567j0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f24869p0.f32563f0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f24869p0.f32568k0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f24869p0.f32564g0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f24869p0.f32554G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f24869p0.f32574q0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f24869p0.f32575r0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f24869p0.f32576s0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f24869p0.f32578u0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f24869p0.f32577t0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f24869p0.f32579v0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f24869p0.f32580w0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f24869p0.f32582y0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f24869p0.f32548A0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f24869p0.f32583z0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f24869p0.f32549B0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f24869p0.f32581x0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f24869p0.f32552E0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f24869p0.f32553F0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f24869p0.f32550C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f24869p0.f32551D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f24869p0.f32555H0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f36777k0 = this.f24869p0;
        g();
    }

    @Override // k1.c
    public final void f(d dVar, boolean z10) {
        g gVar = this.f24869p0;
        int i10 = gVar.f32565h0;
        if (i10 > 0 || gVar.f32566i0 > 0) {
            if (z10) {
                gVar.f32567j0 = gVar.f32566i0;
                gVar.f32568k0 = i10;
                return;
            }
            gVar.f32567j0 = i10;
            gVar.f32568k0 = gVar.f32566i0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:297:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05ed  */
    @Override // k1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(g gVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int[] iArr;
        int i23;
        char c10;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z11;
        f fVar;
        boolean z12;
        int i28;
        int i29;
        int i30;
        boolean z13;
        d[] dVarArr;
        int i31;
        boolean z14;
        C3458c c3458c;
        boolean z15;
        int i32;
        int i33;
        d dVar;
        int i34;
        int i35;
        int i36;
        boolean z16;
        boolean z17;
        int i37;
        d dVar2;
        k1.f fVar2;
        boolean z18;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (gVar != null) {
            if (gVar.f32590e0 > 0) {
                d dVar3 = gVar.f32472I;
                if (dVar3 != null) {
                    fVar2 = ((e) dVar3).f32518g0;
                } else {
                    fVar2 = null;
                }
                if (fVar2 == null) {
                    gVar.f32570m0 = 0;
                    gVar.f32571n0 = 0;
                    gVar.f32569l0 = false;
                    setMeasuredDimension(gVar.f32570m0, gVar.f32571n0);
                    return;
                }
                for (int i38 = 0; i38 < gVar.f32590e0; i38++) {
                    d dVar4 = gVar.f32589d0[i38];
                    if (dVar4 != null && !(dVar4 instanceof h)) {
                        int i39 = dVar4.i(0);
                        int i40 = dVar4.i(1);
                        if (i39 != 3 || dVar4.f32498j == 1 || i40 != 3 || dVar4.f32499k == 1) {
                            if (i39 == 3) {
                                i39 = 2;
                            }
                            if (i40 == 3) {
                                i40 = 2;
                            }
                            b bVar = gVar.f32572o0;
                            bVar.f35954a = i39;
                            bVar.f35955b = i40;
                            bVar.f35956c = dVar4.m();
                            gVar.f32572o0.f35957d = dVar4.j();
                            fVar2.a(dVar4, gVar.f32572o0);
                            dVar4.z(gVar.f32572o0.f35958e);
                            dVar4.w(gVar.f32572o0.f35959f);
                            int i41 = gVar.f32572o0.f35960g;
                            dVar4.P = i41;
                            if (i41 > 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            dVar4.f32511w = z18;
                        }
                    }
                }
            }
            int i42 = gVar.f32567j0;
            int i43 = gVar.f32568k0;
            int i44 = gVar.f32563f0;
            int i45 = gVar.f32564g0;
            int[] iArr2 = new int[2];
            int i46 = (size - i42) - i43;
            int i47 = gVar.f32556I0;
            if (i47 == 1) {
                i46 = (size2 - i44) - i45;
            }
            if (i47 == 0) {
                if (gVar.f32574q0 == -1) {
                    gVar.f32574q0 = 0;
                }
                if (gVar.f32575r0 == -1) {
                    gVar.f32575r0 = 0;
                }
            } else {
                if (gVar.f32574q0 == -1) {
                    gVar.f32574q0 = 0;
                }
                if (gVar.f32575r0 == -1) {
                    gVar.f32575r0 = 0;
                }
            }
            d[] dVarArr2 = gVar.f32589d0;
            int i48 = 0;
            int i49 = 0;
            while (true) {
                i12 = gVar.f32590e0;
                if (i48 >= i12) {
                    break;
                }
                if (gVar.f32589d0[i48].f32481V == 8) {
                    i49++;
                }
                i48++;
            }
            if (i49 > 0) {
                dVarArr2 = new d[i12 - i49];
                int i50 = 0;
                i15 = 0;
                while (i50 < gVar.f32590e0) {
                    d dVar5 = gVar.f32589d0[i50];
                    int i51 = i45;
                    int i52 = i44;
                    if (dVar5.f32481V != 8) {
                        dVarArr2[i15] = dVar5;
                        i15++;
                    }
                    i50++;
                    i45 = i51;
                    i44 = i52;
                }
                i13 = i45;
                i14 = i44;
            } else {
                i13 = i45;
                i14 = i44;
                i15 = i12;
            }
            d[] dVarArr3 = dVarArr2;
            gVar.f32561N0 = dVarArr3;
            gVar.f32562O0 = i15;
            int i53 = gVar.f32554G0;
            ArrayList arrayList = gVar.f32557J0;
            if (i53 != 0) {
                if (i53 != 1) {
                    if (i53 != 2) {
                        iArr = iArr2;
                        i20 = i43;
                        i19 = i42;
                        i16 = mode;
                        i17 = size;
                        i18 = mode2;
                        i23 = size2;
                        i22 = i13;
                        i21 = i14;
                        c10 = 0;
                        z10 = true;
                        int i54 = iArr[c10] + i19 + i20;
                        char c11 = z10 ? 1 : 0;
                        char c12 = z10 ? 1 : 0;
                        char c13 = z10 ? 1 : 0;
                        char c14 = z10 ? 1 : 0;
                        char c15 = z10 ? 1 : 0;
                        int i55 = iArr[c11] + i21 + i22;
                        i24 = i16;
                        if (i24 == 1073741824) {
                            i26 = i18;
                            i25 = i17;
                        } else {
                            if (i24 == Integer.MIN_VALUE) {
                                i25 = Math.min(i54, i17);
                            } else if (i24 == 0) {
                                i25 = i54;
                            } else {
                                i26 = i18;
                                i25 = 0;
                            }
                            i26 = i18;
                        }
                        if (i26 == 1073741824) {
                            i27 = i23;
                        } else if (i26 == Integer.MIN_VALUE) {
                            i27 = Math.min(i55, i23);
                        } else if (i26 == 0) {
                            i27 = i55;
                        } else {
                            i27 = 0;
                        }
                        gVar.f32570m0 = i25;
                        gVar.f32571n0 = i27;
                        gVar.z(i25);
                        gVar.w(i27);
                        if (gVar.f32590e0 > 0) {
                            boolean z19 = z10 ? 1 : 0;
                            Object[] objArr = z10 ? 1 : 0;
                            Object[] objArr2 = z10 ? 1 : 0;
                            Object[] objArr3 = z10 ? 1 : 0;
                            Object[] objArr4 = z10 ? 1 : 0;
                            z11 = z19;
                        } else {
                            z11 = false;
                        }
                        gVar.f32569l0 = z11;
                    } else {
                        int i56 = gVar.f32556I0;
                        if (i56 == 0) {
                            int i57 = gVar.f32555H0;
                            if (i57 <= 0) {
                                int i58 = 0;
                                int i59 = 0;
                                i35 = 0;
                                while (true) {
                                    i28 = i43;
                                    if (i58 >= i15) {
                                        break;
                                    }
                                    if (i58 > 0) {
                                        i59 += gVar.f32550C0;
                                    }
                                    d dVar6 = dVarArr3[i58];
                                    if (dVar6 != null) {
                                        int D6 = gVar.D(dVar6, i46) + i59;
                                        if (D6 > i46) {
                                            break;
                                        }
                                        i35++;
                                        i59 = D6;
                                    }
                                    i58++;
                                    i43 = i28;
                                }
                            } else {
                                i28 = i43;
                                i35 = i57;
                            }
                            i36 = 0;
                        } else {
                            i28 = i43;
                            i36 = gVar.f32555H0;
                            if (i36 <= 0) {
                                int i60 = 0;
                                int i61 = 0;
                                for (int i62 = 0; i62 < i15; i62++) {
                                    if (i62 > 0) {
                                        i60 += gVar.f32551D0;
                                    }
                                    d dVar7 = dVarArr3[i62];
                                    if (dVar7 != null) {
                                        int C10 = gVar.C(dVar7, i46) + i60;
                                        if (C10 > i46) {
                                            break;
                                        }
                                        i61++;
                                        i60 = C10;
                                    }
                                }
                                i36 = i61;
                            }
                            i35 = 0;
                        }
                        if (gVar.f32560M0 == null) {
                            gVar.f32560M0 = new int[2];
                        }
                        if ((i36 == 0 && i56 == 1) || (i35 == 0 && i56 == 0)) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        while (!z16) {
                            if (i56 == 0) {
                                z17 = z16;
                                i36 = (int) Math.ceil(i15 / i35);
                            } else {
                                z17 = z16;
                                i35 = (int) Math.ceil(i15 / i36);
                            }
                            d[] dVarArr4 = gVar.f32559L0;
                            if (dVarArr4 != null && dVarArr4.length >= i35) {
                                Arrays.fill(dVarArr4, (Object) null);
                            } else {
                                gVar.f32559L0 = new d[i35];
                            }
                            d[] dVarArr5 = gVar.f32558K0;
                            if (dVarArr5 != null && dVarArr5.length >= i36) {
                                Arrays.fill(dVarArr5, (Object) null);
                            } else {
                                gVar.f32558K0 = new d[i36];
                            }
                            for (int i63 = 0; i63 < i35; i63++) {
                                int i64 = 0;
                                while (i64 < i36) {
                                    int i65 = (i64 * i35) + i63;
                                    int i66 = i42;
                                    if (i56 == 1) {
                                        i65 = (i63 * i36) + i64;
                                    }
                                    int i67 = i65;
                                    if (i67 >= dVarArr3.length || (dVar2 = dVarArr3[i67]) == null) {
                                        i37 = size2;
                                    } else {
                                        int D10 = gVar.D(dVar2, i46);
                                        i37 = size2;
                                        d dVar8 = gVar.f32559L0[i63];
                                        if (dVar8 == null || dVar8.m() < D10) {
                                            gVar.f32559L0[i63] = dVar2;
                                        }
                                        int C11 = gVar.C(dVar2, i46);
                                        d dVar9 = gVar.f32558K0[i64];
                                        if (dVar9 == null || dVar9.j() < C11) {
                                            gVar.f32558K0[i64] = dVar2;
                                        }
                                    }
                                    i64++;
                                    i42 = i66;
                                    size2 = i37;
                                }
                            }
                            int i68 = i42;
                            int i69 = size2;
                            int i70 = 0;
                            for (int i71 = 0; i71 < i35; i71++) {
                                d dVar10 = gVar.f32559L0[i71];
                                if (dVar10 != null) {
                                    if (i71 > 0) {
                                        i70 += gVar.f32550C0;
                                    }
                                    i70 = gVar.D(dVar10, i46) + i70;
                                }
                            }
                            int i72 = 0;
                            for (int i73 = 0; i73 < i36; i73++) {
                                d dVar11 = gVar.f32558K0[i73];
                                if (dVar11 != null) {
                                    if (i73 > 0) {
                                        i72 += gVar.f32551D0;
                                    }
                                    i72 = gVar.C(dVar11, i46) + i72;
                                }
                            }
                            iArr2[0] = i70;
                            iArr2[1] = i72;
                            if (i56 == 0) {
                                if (i70 > i46 && i35 > 1) {
                                    i35--;
                                    z16 = z17;
                                }
                                z16 = true;
                            } else {
                                if (i72 > i46 && i36 > 1) {
                                    i36--;
                                    z16 = z17;
                                }
                                z16 = true;
                            }
                            i42 = i68;
                            size2 = i69;
                        }
                        i29 = i42;
                        i23 = size2;
                        z12 = true;
                        int[] iArr3 = gVar.f32560M0;
                        iArr3[0] = i35;
                        iArr3[1] = i36;
                    }
                } else {
                    z12 = true;
                    i28 = i43;
                    i29 = i42;
                    i23 = size2;
                    int i74 = gVar.f32556I0;
                    if (i15 != 0) {
                        arrayList.clear();
                        int i75 = i46;
                        iArr = iArr2;
                        i22 = i13;
                        i21 = i14;
                        i20 = i28;
                        i19 = i29;
                        i18 = mode2;
                        z10 = true;
                        f fVar3 = new f(gVar, i74, gVar.f32512x, gVar.f32513y, gVar.f32514z, gVar.f32464A, i75);
                        arrayList.add(fVar3);
                        if (i74 == 0) {
                            f fVar4 = fVar3;
                            int i76 = 0;
                            i30 = 0;
                            int i77 = 0;
                            while (i76 < i15) {
                                d dVar12 = dVarArr3[i76];
                                int i78 = i75;
                                int D11 = gVar.D(dVar12, i78);
                                if (dVar12.f32491c0[0] == 3) {
                                    i30++;
                                }
                                int i79 = i30;
                                if ((i77 == i78 || gVar.f32550C0 + i77 + D11 > i78) && fVar4.f32531b != null) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if ((!z15 && i76 > 0 && (i34 = gVar.f32555H0) > 0 && i76 % i34 == 0) || z15) {
                                    i75 = i78;
                                    i33 = size;
                                    i32 = mode;
                                    dVar = dVar12;
                                    f fVar5 = new f(gVar, i74, gVar.f32512x, gVar.f32513y, gVar.f32514z, gVar.f32464A, i75);
                                    fVar5.f32543n = i76;
                                    arrayList.add(fVar5);
                                    fVar4 = fVar5;
                                } else {
                                    i75 = i78;
                                    i32 = mode;
                                    i33 = size;
                                    dVar = dVar12;
                                    if (i76 > 0) {
                                        i77 = gVar.f32550C0 + D11 + i77;
                                        fVar4.a(dVar);
                                        i76++;
                                        i30 = i79;
                                        size = i33;
                                        mode = i32;
                                    }
                                }
                                i77 = D11;
                                fVar4.a(dVar);
                                i76++;
                                i30 = i79;
                                size = i33;
                                mode = i32;
                            }
                            i16 = mode;
                            i17 = size;
                        } else {
                            i16 = mode;
                            i17 = size;
                            f fVar6 = fVar3;
                            int i80 = 0;
                            i30 = 0;
                            int i81 = 0;
                            while (i80 < i15) {
                                d dVar13 = dVarArr3[i80];
                                int i82 = i75;
                                int C12 = gVar.C(dVar13, i82);
                                if (dVar13.f32491c0[1] == 3) {
                                    i30++;
                                }
                                int i83 = i30;
                                if ((i81 == i82 || gVar.f32551D0 + i81 + C12 > i82) && fVar6.f32531b != null) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if ((!z13 && i80 > 0 && (i31 = gVar.f32555H0) > 0 && i80 % i31 == 0) || z13) {
                                    dVarArr = dVarArr3;
                                    f fVar7 = new f(gVar, i74, gVar.f32512x, gVar.f32513y, gVar.f32514z, gVar.f32464A, i82);
                                    fVar7.f32543n = i80;
                                    arrayList.add(fVar7);
                                    fVar6 = fVar7;
                                } else {
                                    dVarArr = dVarArr3;
                                    if (i80 > 0) {
                                        i81 = gVar.f32551D0 + C12 + i81;
                                        fVar6.a(dVar13);
                                        i80++;
                                        i30 = i83;
                                        dVarArr3 = dVarArr;
                                        i75 = i82;
                                    }
                                }
                                i81 = C12;
                                fVar6.a(dVar13);
                                i80++;
                                i30 = i83;
                                dVarArr3 = dVarArr;
                                i75 = i82;
                            }
                        }
                        int i84 = i75;
                        int size3 = arrayList.size();
                        int i85 = gVar.f32567j0;
                        int i86 = gVar.f32563f0;
                        int i87 = gVar.f32568k0;
                        int i88 = gVar.f32564g0;
                        int[] iArr4 = gVar.f32491c0;
                        if (iArr4[0] != 2 && iArr4[1] != 2) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (i30 > 0 && z14) {
                            for (int i89 = 0; i89 < size3; i89++) {
                                f fVar8 = (f) arrayList.get(i89);
                                if (i74 == 0) {
                                    fVar8.e(i84 - fVar8.d());
                                } else {
                                    fVar8.e(i84 - fVar8.c());
                                }
                            }
                        }
                        C3458c c3458c2 = gVar.f32464A;
                        C3458c c3458c3 = gVar.f32514z;
                        C3458c c3458c4 = gVar.f32512x;
                        C3458c c3458c5 = gVar.f32513y;
                        C3458c c3458c6 = c3458c2;
                        C3458c c3458c7 = c3458c3;
                        int i90 = 0;
                        int i91 = 0;
                        int i92 = 0;
                        while (i90 < size3) {
                            C3458c c3458c8 = c3458c2;
                            f fVar9 = (f) arrayList.get(i90);
                            if (i74 == 0) {
                                if (i90 < size3 - 1) {
                                    c3458c6 = ((f) arrayList.get(i90 + 1)).f32531b.f32513y;
                                    c3458c = c3458c3;
                                    i88 = 0;
                                } else {
                                    i88 = gVar.f32564g0;
                                    c3458c6 = c3458c8;
                                    c3458c = c3458c3;
                                }
                                C3458c c3458c9 = fVar9.f32531b.f32464A;
                                fVar9.f(i74, c3458c4, c3458c5, c3458c7, c3458c6, i85, i86, i87, i88, i84);
                                int max = Math.max(i91, fVar9.d());
                                int c16 = fVar9.c() + i92;
                                if (i90 > 0) {
                                    c16 += gVar.f32551D0;
                                }
                                i92 = c16;
                                i91 = max;
                                c3458c5 = c3458c9;
                                i86 = 0;
                            } else {
                                c3458c = c3458c3;
                                if (i90 < size3 - 1) {
                                    c3458c7 = ((f) arrayList.get(i90 + 1)).f32531b.f32512x;
                                    i87 = 0;
                                } else {
                                    i87 = gVar.f32568k0;
                                    c3458c7 = c3458c;
                                }
                                C3458c c3458c10 = fVar9.f32531b.f32514z;
                                fVar9.f(i74, c3458c4, c3458c5, c3458c7, c3458c6, i85, i86, i87, i88, i84);
                                int d10 = fVar9.d() + i91;
                                int max2 = Math.max(i92, fVar9.c());
                                if (i90 > 0) {
                                    d10 += gVar.f32550C0;
                                }
                                i92 = max2;
                                i91 = d10;
                                c3458c4 = c3458c10;
                                i85 = 0;
                            }
                            i90++;
                            c3458c2 = c3458c8;
                            c3458c3 = c3458c;
                        }
                        iArr[0] = i91;
                        iArr[1] = i92;
                        c10 = 0;
                        int i542 = iArr[c10] + i19 + i20;
                        char c112 = z10 ? 1 : 0;
                        char c122 = z10 ? 1 : 0;
                        char c132 = z10 ? 1 : 0;
                        char c142 = z10 ? 1 : 0;
                        char c152 = z10 ? 1 : 0;
                        int i552 = iArr[c112] + i21 + i22;
                        i24 = i16;
                        if (i24 == 1073741824) {
                        }
                        if (i26 == 1073741824) {
                        }
                        gVar.f32570m0 = i25;
                        gVar.f32571n0 = i27;
                        gVar.z(i25);
                        gVar.w(i27);
                        if (gVar.f32590e0 > 0) {
                        }
                        gVar.f32569l0 = z11;
                    }
                }
                z10 = z12;
                iArr = iArr2;
                i16 = mode;
                i17 = size;
                i18 = mode2;
                i20 = i28;
                i22 = i13;
                i21 = i14;
                i19 = i29;
                c10 = 0;
                int i5422 = iArr[c10] + i19 + i20;
                char c1122 = z10 ? 1 : 0;
                char c1222 = z10 ? 1 : 0;
                char c1322 = z10 ? 1 : 0;
                char c1422 = z10 ? 1 : 0;
                char c1522 = z10 ? 1 : 0;
                int i5522 = iArr[c1122] + i21 + i22;
                i24 = i16;
                if (i24 == 1073741824) {
                }
                if (i26 == 1073741824) {
                }
                gVar.f32570m0 = i25;
                gVar.f32571n0 = i27;
                gVar.z(i25);
                gVar.w(i27);
                if (gVar.f32590e0 > 0) {
                }
                gVar.f32569l0 = z11;
            } else {
                iArr = iArr2;
                i20 = i43;
                i19 = i42;
                i16 = mode;
                i17 = size;
                i18 = mode2;
                i23 = size2;
                i22 = i13;
                i21 = i14;
                z10 = true;
                z10 = true;
                int i93 = i46;
                int i94 = gVar.f32556I0;
                if (i15 != 0) {
                    if (arrayList.size() == 0) {
                        fVar = new f(gVar, i94, gVar.f32512x, gVar.f32513y, gVar.f32514z, gVar.f32464A, i93);
                        arrayList.add(fVar);
                    } else {
                        fVar = (f) arrayList.get(0);
                        fVar.f32532c = 0;
                        fVar.f32531b = null;
                        fVar.f32541l = 0;
                        fVar.f32542m = 0;
                        fVar.f32543n = 0;
                        fVar.f32544o = 0;
                        fVar.f32545p = 0;
                        fVar.f(i94, gVar.f32512x, gVar.f32513y, gVar.f32514z, gVar.f32464A, gVar.f32567j0, gVar.f32563f0, gVar.f32568k0, gVar.f32564g0, i93);
                    }
                    for (int i95 = 0; i95 < i15; i95++) {
                        fVar.a(dVarArr3[i95]);
                    }
                    c10 = 0;
                    iArr[0] = fVar.d();
                    iArr[1] = fVar.c();
                    int i54222 = iArr[c10] + i19 + i20;
                    char c11222 = z10 ? 1 : 0;
                    char c12222 = z10 ? 1 : 0;
                    char c13222 = z10 ? 1 : 0;
                    char c14222 = z10 ? 1 : 0;
                    char c15222 = z10 ? 1 : 0;
                    int i55222 = iArr[c11222] + i21 + i22;
                    i24 = i16;
                    if (i24 == 1073741824) {
                    }
                    if (i26 == 1073741824) {
                    }
                    gVar.f32570m0 = i25;
                    gVar.f32571n0 = i27;
                    gVar.z(i25);
                    gVar.w(i27);
                    if (gVar.f32590e0 > 0) {
                    }
                    gVar.f32569l0 = z11;
                }
                c10 = 0;
                int i542222 = iArr[c10] + i19 + i20;
                char c112222 = z10 ? 1 : 0;
                char c122222 = z10 ? 1 : 0;
                char c132222 = z10 ? 1 : 0;
                char c142222 = z10 ? 1 : 0;
                char c152222 = z10 ? 1 : 0;
                int i552222 = iArr[c112222] + i21 + i22;
                i24 = i16;
                if (i24 == 1073741824) {
                }
                if (i26 == 1073741824) {
                }
                gVar.f32570m0 = i25;
                gVar.f32571n0 = i27;
                gVar.z(i25);
                gVar.w(i27);
                if (gVar.f32590e0 > 0) {
                }
                gVar.f32569l0 = z11;
            }
            setMeasuredDimension(gVar.f32570m0, gVar.f32571n0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // k1.c, android.view.View
    public final void onMeasure(int i10, int i11) {
        h(this.f24869p0, i10, i11);
    }

    public void setFirstHorizontalBias(float f6) {
        this.f24869p0.f32582y0 = f6;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f24869p0.f32576s0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f6) {
        this.f24869p0.f32583z0 = f6;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f24869p0.f32577t0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f24869p0.f32552E0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f6) {
        this.f24869p0.f32580w0 = f6;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f24869p0.f32550C0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f24869p0.f32574q0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f24869p0.f32555H0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f24869p0.f32556I0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        g gVar = this.f24869p0;
        gVar.f32563f0 = i10;
        gVar.f32564g0 = i10;
        gVar.f32565h0 = i10;
        gVar.f32566i0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f24869p0.f32564g0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f24869p0.f32567j0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f24869p0.f32568k0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f24869p0.f32563f0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f24869p0.f32553F0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f6) {
        this.f24869p0.f32581x0 = f6;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f24869p0.f32551D0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f24869p0.f32575r0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f24869p0.f32554G0 = i10;
        requestLayout();
    }
}
