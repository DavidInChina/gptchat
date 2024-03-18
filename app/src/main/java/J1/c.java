package j1;

import android.gov.nist.core.Separators;
import i1.C3458c;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f35964k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public int f35965l;

    public c(i1.d dVar, int i10) {
        super(dVar);
        i1.d dVar2;
        Object obj;
        int i11;
        Object obj2;
        this.f35998f = i10;
        i1.d dVar3 = this.f35994b;
        i1.d l10 = dVar3.l(i10);
        while (true) {
            i1.d dVar4 = l10;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            }
            l10 = dVar3.l(this.f35998f);
        }
        this.f35994b = dVar2;
        int i12 = this.f35998f;
        if (i12 == 0) {
            obj = dVar2.f32492d;
        } else if (i12 == 1) {
            obj = dVar2.f32493e;
        } else {
            obj = null;
        }
        ArrayList arrayList = this.f35964k;
        arrayList.add(obj);
        i1.d k10 = dVar2.k(this.f35998f);
        while (k10 != null) {
            int i13 = this.f35998f;
            if (i13 == 0) {
                obj2 = k10.f32492d;
            } else if (i13 == 1) {
                obj2 = k10.f32493e;
            } else {
                obj2 = null;
            }
            arrayList.add(obj2);
            k10 = k10.k(this.f35998f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            int i14 = this.f35998f;
            if (i14 == 0) {
                mVar.f35994b.f32488b = this;
            } else if (i14 == 1) {
                mVar.f35994b.f32490c = this;
            }
        }
        if (this.f35998f == 0 && ((i1.e) this.f35994b.f32472I).f32519h0 && arrayList.size() > 1) {
            this.f35994b = ((m) arrayList.get(arrayList.size() - 1)).f35994b;
        }
        if (this.f35998f == 0) {
            i11 = this.f35994b.f32483X;
        } else {
            i11 = this.f35994b.f32484Y;
        }
        this.f35965l = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a0, code lost:
        if (r2 != r3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c0, code lost:
        if (r2 != r3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c2, code lost:
        r13 = r13 + 1;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c5, code lost:
        r1.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x03c8, code lost:
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc  */
    @Override // j1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        boolean z10;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        int i15;
        float f6;
        boolean z11;
        int i16;
        ArrayList arrayList2;
        int i17;
        int i18;
        int i19;
        float f10;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        float f11;
        boolean z12;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z13;
        boolean z14;
        int i32;
        f fVar = this.f36000h;
        if (fVar.f35984j) {
            f fVar2 = this.f36001i;
            if (fVar2.f35984j) {
                i1.d dVar2 = this.f35994b.f32472I;
                if (dVar2 != null && (dVar2 instanceof i1.e)) {
                    z10 = ((i1.e) dVar2).f32519h0;
                } else {
                    z10 = false;
                }
                int i33 = fVar2.f35981g - fVar.f35981g;
                ArrayList arrayList3 = this.f35964k;
                int size = arrayList3.size();
                int i34 = 0;
                while (true) {
                    i10 = -1;
                    i11 = 8;
                    if (i34 < size) {
                        if (((m) arrayList3.get(i34)).f35994b.f32481V != 8) {
                            break;
                        }
                        i34++;
                    } else {
                        i34 = -1;
                        break;
                    }
                }
                int i35 = size - 1;
                int i36 = i35;
                while (true) {
                    if (i36 < 0) {
                        break;
                    } else if (((m) arrayList3.get(i36)).f35994b.f32481V != 8) {
                        i10 = i36;
                        break;
                    } else {
                        i36--;
                    }
                }
                int i37 = 0;
                while (i37 < 2) {
                    int i38 = 0;
                    i15 = 0;
                    int i39 = 0;
                    int i40 = 0;
                    f6 = 0.0f;
                    while (i38 < size) {
                        m mVar = (m) arrayList3.get(i38);
                        i1.d dVar3 = mVar.f35994b;
                        ArrayList arrayList4 = arrayList3;
                        if (dVar3.f32481V == i11) {
                            i31 = i34;
                        } else {
                            i40++;
                            if (i38 > 0 && i38 >= i34) {
                                i15 += mVar.f36000h.f35980f;
                            }
                            g gVar = mVar.f35997e;
                            int i41 = gVar.f35981g;
                            i31 = i34;
                            if (mVar.f35996d != 3) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                int i42 = this.f35998f;
                                if (i42 == 0 && !dVar3.f32492d.f35997e.f35984j) {
                                    return;
                                }
                                if (i42 == 1 && !dVar3.f32493e.f35997e.f35984j) {
                                    return;
                                }
                                z14 = z13;
                            } else {
                                z14 = z13;
                                if (mVar.f35993a == 1 && i37 == 0) {
                                    i32 = gVar.f35987m;
                                    i39++;
                                } else if (gVar.f35984j) {
                                    i32 = i41;
                                }
                                z14 = true;
                                if (z14) {
                                    i39++;
                                    float f12 = dVar3.f32485Z[this.f35998f];
                                    if (f12 >= 0.0f) {
                                        f6 += f12;
                                    }
                                } else {
                                    i15 += i32;
                                }
                                if (i38 < i35 && i38 < i10) {
                                    i15 += -mVar.f36001i.f35980f;
                                }
                            }
                            i32 = i41;
                            if (z14) {
                            }
                            if (i38 < i35) {
                                i15 += -mVar.f36001i.f35980f;
                            }
                        }
                        i38++;
                        arrayList3 = arrayList4;
                        i34 = i31;
                        i11 = 8;
                    }
                    arrayList = arrayList3;
                    i12 = i34;
                    if (i15 >= i33 && i39 != 0) {
                        i37++;
                        arrayList3 = arrayList;
                        i34 = i12;
                        i11 = 8;
                    } else {
                        i13 = i39;
                        i14 = i40;
                        break;
                    }
                }
                arrayList = arrayList3;
                i12 = i34;
                i13 = 0;
                i14 = 0;
                i15 = 0;
                f6 = 0.0f;
                int i43 = fVar.f35981g;
                if (z10) {
                    i43 = fVar2.f35981g;
                }
                if (i15 > i33) {
                    if (z10) {
                        i43 += (int) (((i15 - i33) / 2.0f) + 0.5f);
                    } else {
                        i43 -= (int) (((i15 - i33) / 2.0f) + 0.5f);
                    }
                }
                if (i13 > 0) {
                    float f13 = i33 - i15;
                    int i44 = (int) ((f13 / i13) + 0.5f);
                    int i45 = 0;
                    int i46 = 0;
                    while (i45 < size) {
                        ArrayList arrayList5 = arrayList;
                        m mVar2 = (m) arrayList5.get(i45);
                        int i47 = i44;
                        i1.d dVar4 = mVar2.f35994b;
                        int i48 = i15;
                        int i49 = i43;
                        if (dVar4.f32481V != 8 && mVar2.f35996d == 3) {
                            g gVar2 = mVar2.f35997e;
                            if (!gVar2.f35984j) {
                                if (f6 > 0.0f) {
                                    z12 = z10;
                                    i27 = (int) (((dVar4.f32485Z[this.f35998f] * f13) / f6) + 0.5f);
                                } else {
                                    z12 = z10;
                                    i27 = i47;
                                }
                                if (this.f35998f == 0) {
                                    int i50 = dVar4.f32502n;
                                    int i51 = dVar4.f32501m;
                                    f11 = f13;
                                    if (mVar2.f35993a == 1) {
                                        i30 = Math.min(i27, gVar2.f35987m);
                                    } else {
                                        i30 = i27;
                                    }
                                    i28 = Math.max(i51, i30);
                                    if (i50 > 0) {
                                        i28 = Math.min(i50, i28);
                                    }
                                } else {
                                    f11 = f13;
                                    int i52 = dVar4.f32505q;
                                    int i53 = dVar4.f32504p;
                                    if (mVar2.f35993a == 1) {
                                        i29 = Math.min(i27, gVar2.f35987m);
                                    } else {
                                        i29 = i27;
                                    }
                                    i28 = Math.max(i53, i29);
                                    if (i52 > 0) {
                                        i28 = Math.min(i52, i28);
                                    }
                                }
                                i45++;
                                i44 = i47;
                                i15 = i48;
                                i43 = i49;
                                z10 = z12;
                                f13 = f11;
                                arrayList = arrayList5;
                            }
                        }
                        z12 = z10;
                        f11 = f13;
                        i45++;
                        i44 = i47;
                        i15 = i48;
                        i43 = i49;
                        z10 = z12;
                        f13 = f11;
                        arrayList = arrayList5;
                    }
                    i16 = i43;
                    z11 = z10;
                    arrayList2 = arrayList;
                    int i54 = i15;
                    if (i46 > 0) {
                        i13 -= i46;
                        int i55 = 0;
                        i15 = 0;
                        while (i55 < size) {
                            m mVar3 = (m) arrayList2.get(i55);
                            if (mVar3.f35994b.f32481V == 8) {
                                i26 = i12;
                            } else {
                                i26 = i12;
                                if (i55 > 0 && i55 >= i26) {
                                    i15 += mVar3.f36000h.f35980f;
                                }
                                i15 += mVar3.f35997e.f35981g;
                                if (i55 < i35 && i55 < i10) {
                                    i15 += -mVar3.f36001i.f35980f;
                                }
                            }
                            i55++;
                            i12 = i26;
                        }
                        i17 = i12;
                    } else {
                        i17 = i12;
                        i15 = i54;
                    }
                    i18 = 2;
                    if (this.f35965l == 2 && i46 == 0) {
                        i19 = 0;
                        this.f35965l = 0;
                    } else {
                        i19 = 0;
                    }
                } else {
                    i16 = i43;
                    z11 = z10;
                    arrayList2 = arrayList;
                    i17 = i12;
                    i19 = 0;
                    i18 = 2;
                }
                if (i15 > i33) {
                    this.f35965l = i18;
                }
                if (i14 > 0 && i13 == 0 && i17 == i10) {
                    this.f35965l = i18;
                }
                int i56 = this.f35965l;
                if (i56 == 1) {
                    if (i14 > 1) {
                        i24 = (i33 - i15) / (i14 - 1);
                    } else if (i14 == 1) {
                        i24 = (i33 - i15) / 2;
                    } else {
                        i24 = i19;
                    }
                    if (i13 > 0) {
                        i24 = i19;
                    }
                    int i57 = i16;
                    for (int i58 = i19; i58 < size; i58++) {
                        if (z11) {
                            i25 = size - (i58 + 1);
                        } else {
                            i25 = i58;
                        }
                        m mVar4 = (m) arrayList2.get(i25);
                        int i59 = mVar4.f35994b.f32481V;
                        f fVar3 = mVar4.f36001i;
                        f fVar4 = mVar4.f36000h;
                        if (i59 == 8) {
                            fVar4.d(i57);
                            fVar3.d(i57);
                        } else {
                            if (i58 > 0) {
                                if (z11) {
                                    i57 -= i24;
                                } else {
                                    i57 += i24;
                                }
                            }
                            if (i58 > 0 && i58 >= i17) {
                                if (z11) {
                                    i57 -= fVar4.f35980f;
                                } else {
                                    i57 += fVar4.f35980f;
                                }
                            }
                            if (z11) {
                                fVar3.d(i57);
                            } else {
                                fVar4.d(i57);
                            }
                            g gVar3 = mVar4.f35997e;
                            int i60 = gVar3.f35981g;
                            if (mVar4.f35996d == 3 && mVar4.f35993a == 1) {
                                i60 = gVar3.f35987m;
                            }
                            if (z11) {
                                i57 -= i60;
                            } else {
                                i57 += i60;
                            }
                            if (z11) {
                                fVar4.d(i57);
                            } else {
                                fVar3.d(i57);
                            }
                            mVar4.f35999g = true;
                            if (i58 < i35 && i58 < i10) {
                                if (z11) {
                                    i57 -= -fVar3.f35980f;
                                } else {
                                    i57 += -fVar3.f35980f;
                                }
                            }
                        }
                    }
                } else if (i56 == 0) {
                    int i61 = (i33 - i15) / (i14 + 1);
                    if (i13 > 0) {
                        i61 = i19;
                    }
                    int i62 = i16;
                    for (int i63 = i19; i63 < size; i63++) {
                        if (z11) {
                            i22 = size - (i63 + 1);
                        } else {
                            i22 = i63;
                        }
                        m mVar5 = (m) arrayList2.get(i22);
                        int i64 = mVar5.f35994b.f32481V;
                        f fVar5 = mVar5.f36001i;
                        f fVar6 = mVar5.f36000h;
                        if (i64 == 8) {
                            fVar6.d(i62);
                            fVar5.d(i62);
                        } else {
                            if (z11) {
                                i23 = i62 - i61;
                            } else {
                                i23 = i62 + i61;
                            }
                            if (i63 > 0 && i63 >= i17) {
                                if (z11) {
                                    i23 -= fVar6.f35980f;
                                } else {
                                    i23 += fVar6.f35980f;
                                }
                            }
                            if (z11) {
                                fVar5.d(i23);
                            } else {
                                fVar6.d(i23);
                            }
                            g gVar4 = mVar5.f35997e;
                            int i65 = gVar4.f35981g;
                            if (mVar5.f35996d == 3 && mVar5.f35993a == 1) {
                                i65 = Math.min(i65, gVar4.f35987m);
                            }
                            if (z11) {
                                i62 = i23 - i65;
                            } else {
                                i62 = i23 + i65;
                            }
                            if (z11) {
                                fVar6.d(i62);
                            } else {
                                fVar5.d(i62);
                            }
                            if (i63 < i35 && i63 < i10) {
                                if (z11) {
                                    i62 -= -fVar5.f35980f;
                                } else {
                                    i62 += -fVar5.f35980f;
                                }
                            }
                        }
                    }
                } else if (i56 == 2) {
                    if (this.f35998f == 0) {
                        f10 = this.f35994b.S;
                    } else {
                        f10 = this.f35994b.T;
                    }
                    if (z11) {
                        f10 = 1.0f - f10;
                    }
                    int i66 = (int) (((i33 - i15) * f10) + 0.5f);
                    if (i66 < 0 || i13 > 0) {
                        i66 = i19;
                    }
                    if (z11) {
                        i20 = i16 - i66;
                    } else {
                        i20 = i16 + i66;
                    }
                    for (int i67 = i19; i67 < size; i67++) {
                        if (z11) {
                            i21 = size - (i67 + 1);
                        } else {
                            i21 = i67;
                        }
                        m mVar6 = (m) arrayList2.get(i21);
                        int i68 = mVar6.f35994b.f32481V;
                        f fVar7 = mVar6.f36001i;
                        f fVar8 = mVar6.f36000h;
                        if (i68 == 8) {
                            fVar8.d(i20);
                            fVar7.d(i20);
                        } else {
                            if (i67 > 0 && i67 >= i17) {
                                if (z11) {
                                    i20 -= fVar8.f35980f;
                                } else {
                                    i20 += fVar8.f35980f;
                                }
                            }
                            if (z11) {
                                fVar7.d(i20);
                            } else {
                                fVar8.d(i20);
                            }
                            g gVar5 = mVar6.f35997e;
                            int i69 = gVar5.f35981g;
                            if (mVar6.f35996d == 3 && mVar6.f35993a == 1) {
                                i69 = gVar5.f35987m;
                            }
                            i20 += i69;
                            if (z11) {
                                fVar8.d(i20);
                            } else {
                                fVar7.d(i20);
                            }
                            if (i67 < i35 && i67 < i10) {
                                if (z11) {
                                    i20 -= -fVar7.f35980f;
                                } else {
                                    i20 += -fVar7.f35980f;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // j1.m
    public final void d() {
        ArrayList arrayList = this.f35964k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((m) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        i1.d dVar = ((m) arrayList.get(0)).f35994b;
        i1.d dVar2 = ((m) arrayList.get(size - 1)).f35994b;
        int i10 = this.f35998f;
        f fVar = this.f36001i;
        f fVar2 = this.f36000h;
        if (i10 == 0) {
            C3458c c3458c = dVar.f32512x;
            C3458c c3458c2 = dVar2.f32514z;
            f i11 = m.i(c3458c, 0);
            int c10 = c3458c.c();
            i1.d m10 = m();
            if (m10 != null) {
                c10 = m10.f32512x.c();
            }
            if (i11 != null) {
                m.b(fVar2, i11, c10);
            }
            f i12 = m.i(c3458c2, 0);
            int c11 = c3458c2.c();
            i1.d n10 = n();
            if (n10 != null) {
                c11 = n10.f32514z.c();
            }
            if (i12 != null) {
                m.b(fVar, i12, -c11);
            }
        } else {
            C3458c c3458c3 = dVar.f32513y;
            C3458c c3458c4 = dVar2.f32464A;
            f i13 = m.i(c3458c3, 1);
            int c12 = c3458c3.c();
            i1.d m11 = m();
            if (m11 != null) {
                c12 = m11.f32513y.c();
            }
            if (i13 != null) {
                m.b(fVar2, i13, c12);
            }
            f i14 = m.i(c3458c4, 1);
            int c13 = c3458c4.c();
            i1.d n11 = n();
            if (n11 != null) {
                c13 = n11.f32464A.c();
            }
            if (i14 != null) {
                m.b(fVar, i14, -c13);
            }
        }
        fVar2.f35975a = this;
        fVar.f35975a = this;
    }

    @Override // j1.m
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f35964k;
            if (i10 < arrayList.size()) {
                ((m) arrayList.get(i10)).e();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // j1.m
    public final void f() {
        this.f35995c = null;
        Iterator it = this.f35964k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    @Override // j1.m
    public final long j() {
        ArrayList arrayList = this.f35964k;
        int size = arrayList.size();
        long j6 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            j6 = mVar.f36001i.f35980f + mVar.j() + j6 + mVar.f36000h.f35980f;
        }
        return j6;
    }

    @Override // j1.m
    public final boolean k() {
        ArrayList arrayList = this.f35964k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((m) arrayList.get(i10)).k()) {
                return false;
            }
        }
        return true;
    }

    public final i1.d m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f35964k;
            if (i10 < arrayList.size()) {
                i1.d dVar = ((m) arrayList.get(i10)).f35994b;
                if (dVar.f32481V != 8) {
                    return dVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final i1.d n() {
        ArrayList arrayList = this.f35964k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i1.d dVar = ((m) arrayList.get(size)).f35994b;
            if (dVar.f32481V != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        if (this.f35998f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        String concat = "ChainRun ".concat(str);
        Iterator it = this.f35964k.iterator();
        while (it.hasNext()) {
            String g10 = android.gov.nist.core.a.g(concat, Separators.LESS_THAN);
            concat = android.gov.nist.core.a.g(g10 + ((m) it.next()), "> ");
        }
        return concat;
    }
}
