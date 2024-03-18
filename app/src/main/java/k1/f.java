package k1;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import i1.C3458c;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f36840a;

    /* renamed from: b  reason: collision with root package name */
    public int f36841b;

    /* renamed from: c  reason: collision with root package name */
    public int f36842c;

    /* renamed from: d  reason: collision with root package name */
    public int f36843d;

    /* renamed from: e  reason: collision with root package name */
    public int f36844e;

    /* renamed from: f  reason: collision with root package name */
    public int f36845f;

    /* renamed from: g  reason: collision with root package name */
    public int f36846g;

    public f(ConstraintLayout constraintLayout) {
        this.f36840a = constraintLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(i1.d dVar, j1.b bVar) {
        boolean z10;
        int i10;
        int f6;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        e eVar;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z18;
        boolean z19;
        int measuredWidth;
        int measuredHeight;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z20;
        boolean z21;
        int i23;
        boolean z22;
        boolean z23;
        int i24;
        if (dVar == null) {
            return;
        }
        if (dVar.f32481V == 8) {
            bVar.f35958e = 0;
            bVar.f35959f = 0;
            bVar.f35960g = 0;
            return;
        }
        int i25 = bVar.f35954a;
        int i26 = bVar.f35955b;
        int i27 = bVar.f35956c;
        int i28 = bVar.f35957d;
        int i29 = this.f36841b + this.f36842c;
        int i30 = this.f36843d;
        View view = (View) dVar.f32480U;
        int f10 = AbstractC6708l.f(i25);
        C3458c c3458c = dVar.f32514z;
        C3458c c3458c2 = dVar.f32512x;
        int[] iArr = dVar.f32495g;
        if (f10 != 0) {
            if (f10 != 1) {
                if (f10 != 2) {
                    if (f10 != 3) {
                        i10 = 0;
                    } else {
                        int i31 = this.f36845f;
                        if (c3458c2 != null) {
                            i24 = c3458c2.f32461e;
                        } else {
                            i24 = 0;
                        }
                        if (c3458c != null) {
                            i24 += c3458c.f32461e;
                        }
                        i10 = ViewGroup.getChildMeasureSpec(i31, i30 + i24, -1);
                        iArr[2] = -1;
                    }
                } else {
                    i10 = ViewGroup.getChildMeasureSpec(this.f36845f, i30, -2);
                    if (dVar.f32498j == 1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    iArr[2] = 0;
                    if (bVar.f35963j) {
                        if (z22 && iArr[3] != 0 && iArr[0] != dVar.m()) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        if (!z22 || z23) {
                            i10 = View.MeasureSpec.makeMeasureSpec(dVar.m(), 1073741824);
                        }
                    }
                }
            } else {
                i10 = ViewGroup.getChildMeasureSpec(this.f36845f, i30, -2);
                iArr[2] = -2;
            }
            z10 = true;
            f6 = AbstractC6708l.f(i26);
            if (f6 == 0) {
                if (f6 != 1) {
                    if (f6 != 2) {
                        if (f6 != 3) {
                            i12 = 3;
                            z11 = false;
                            i11 = 0;
                        } else {
                            int i32 = this.f36846g;
                            if (c3458c2 != null) {
                                i23 = dVar.f32513y.f32461e;
                            } else {
                                i23 = 0;
                            }
                            if (c3458c != null) {
                                i23 += dVar.f32464A.f32461e;
                            }
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i32, i29 + i23, -1);
                            iArr[3] = -1;
                            i11 = childMeasureSpec;
                            i12 = 3;
                        }
                    } else {
                        i11 = ViewGroup.getChildMeasureSpec(this.f36846g, i29, -2);
                        if (dVar.f32499k == 1) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        iArr[3] = 0;
                        if (bVar.f35963j) {
                            if (z20 && iArr[2] != 0 && iArr[1] != dVar.j()) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if (!z20 || z21) {
                                i11 = View.MeasureSpec.makeMeasureSpec(dVar.j(), 1073741824);
                                z11 = false;
                                i12 = 3;
                            }
                        }
                        z11 = true;
                        i12 = 3;
                    }
                } else {
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f36846g, i29, -2);
                    i12 = 3;
                    iArr[3] = -2;
                    i11 = childMeasureSpec2;
                    z11 = true;
                }
                if (i25 == i12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i26 == i12) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i26 == 4 && i26 != 1) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (i25 == 4 && i25 != 1) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (!z12 && dVar.f32475L > 0.0f) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (!z13 && dVar.f32475L > 0.0f) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                eVar = (e) view.getLayoutParams();
                if (bVar.f35963j && z12 && dVar.f32498j == 0 && z13 && dVar.f32499k == 0) {
                    i16 = -1;
                    i15 = 0;
                    i14 = 0;
                    i13 = 0;
                } else {
                    if (!(view instanceof s) && (dVar instanceof i1.g)) {
                        ((s) view).h((i1.g) dVar, i10, i11);
                    } else {
                        view.measure(i10, i11);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline = view.getBaseline();
                    if (z10) {
                        i17 = 0;
                        iArr[0] = measuredWidth;
                        iArr[2] = measuredHeight;
                    } else {
                        i17 = 0;
                        iArr[0] = 0;
                        iArr[2] = 0;
                    }
                    if (z11) {
                        iArr[1] = measuredHeight;
                        iArr[3] = measuredWidth;
                    } else {
                        iArr[1] = i17;
                        iArr[3] = i17;
                    }
                    i18 = dVar.f32501m;
                    if (i18 > 0) {
                        i15 = Math.max(i18, measuredWidth);
                    } else {
                        i15 = measuredWidth;
                    }
                    i19 = dVar.f32502n;
                    if (i19 > 0) {
                        i15 = Math.min(i19, i15);
                    }
                    i20 = dVar.f32504p;
                    if (i20 > 0) {
                        i13 = Math.max(i20, measuredHeight);
                    } else {
                        i13 = measuredHeight;
                    }
                    i21 = dVar.f32505q;
                    if (i21 > 0) {
                        i13 = Math.min(i21, i13);
                    }
                    if (!z16 && z14) {
                        i15 = (int) ((i13 * dVar.f32475L) + 0.5f);
                    } else if (z17 && z15) {
                        i13 = (int) ((i15 / dVar.f32475L) + 0.5f);
                    }
                    if (measuredWidth != i15 && measuredHeight == i13) {
                        i14 = baseline;
                        i16 = -1;
                    } else {
                        if (measuredWidth != i15) {
                            i22 = 1073741824;
                            i10 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                        } else {
                            i22 = 1073741824;
                        }
                        if (measuredHeight != i13) {
                            i11 = View.MeasureSpec.makeMeasureSpec(i13, i22);
                        }
                        view.measure(i10, i11);
                        int measuredWidth2 = view.getMeasuredWidth();
                        i13 = view.getMeasuredHeight();
                        i15 = measuredWidth2;
                        i16 = -1;
                        i14 = view.getBaseline();
                    }
                }
                if (i14 != i16) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (i15 != bVar.f35956c && i13 == bVar.f35957d) {
                    z19 = false;
                } else {
                    z19 = true;
                }
                bVar.f35962i = z19;
                if (eVar.f36800X) {
                    z18 = true;
                }
                if (z18 && i14 != -1 && dVar.P != i14) {
                    bVar.f35962i = true;
                }
                bVar.f35958e = i15;
                bVar.f35959f = i13;
                bVar.f35961h = z18;
                bVar.f35960g = i14;
            }
            i12 = 3;
            i11 = View.MeasureSpec.makeMeasureSpec(i28, 1073741824);
            iArr[3] = i28;
            z11 = false;
            if (i25 == i12) {
            }
            if (i26 == i12) {
            }
            if (i26 == 4) {
            }
            z14 = true;
            if (i25 == 4) {
            }
            z15 = true;
            if (!z12) {
            }
            z16 = false;
            if (!z13) {
            }
            z17 = false;
            eVar = (e) view.getLayoutParams();
            if (bVar.f35963j) {
            }
            if (!(view instanceof s)) {
            }
            view.measure(i10, i11);
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            if (z10) {
            }
            if (z11) {
            }
            i18 = dVar.f32501m;
            if (i18 > 0) {
            }
            i19 = dVar.f32502n;
            if (i19 > 0) {
            }
            i20 = dVar.f32504p;
            if (i20 > 0) {
            }
            i21 = dVar.f32505q;
            if (i21 > 0) {
            }
            if (!z16) {
            }
            if (z17) {
                i13 = (int) ((i15 / dVar.f32475L) + 0.5f);
            }
            if (measuredWidth != i15) {
            }
            if (measuredWidth != i15) {
            }
            if (measuredHeight != i13) {
            }
            view.measure(i10, i11);
            int measuredWidth22 = view.getMeasuredWidth();
            i13 = view.getMeasuredHeight();
            i15 = measuredWidth22;
            i16 = -1;
            i14 = view.getBaseline();
            if (i14 != i16) {
            }
            if (i15 != bVar.f35956c) {
            }
            z19 = true;
            bVar.f35962i = z19;
            if (eVar.f36800X) {
            }
            if (z18) {
                bVar.f35962i = true;
            }
            bVar.f35958e = i15;
            bVar.f35959f = i13;
            bVar.f35961h = z18;
            bVar.f35960g = i14;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27, 1073741824);
        iArr[2] = i27;
        i10 = makeMeasureSpec;
        z10 = false;
        f6 = AbstractC6708l.f(i26);
        if (f6 == 0) {
        }
        z11 = false;
        if (i25 == i12) {
        }
        if (i26 == i12) {
        }
        if (i26 == 4) {
        }
        z14 = true;
        if (i25 == 4) {
        }
        z15 = true;
        if (!z12) {
        }
        z16 = false;
        if (!z13) {
        }
        z17 = false;
        eVar = (e) view.getLayoutParams();
        if (bVar.f35963j) {
        }
        if (!(view instanceof s)) {
        }
        view.measure(i10, i11);
        measuredWidth = view.getMeasuredWidth();
        measuredHeight = view.getMeasuredHeight();
        int baseline22 = view.getBaseline();
        if (z10) {
        }
        if (z11) {
        }
        i18 = dVar.f32501m;
        if (i18 > 0) {
        }
        i19 = dVar.f32502n;
        if (i19 > 0) {
        }
        i20 = dVar.f32504p;
        if (i20 > 0) {
        }
        i21 = dVar.f32505q;
        if (i21 > 0) {
        }
        if (!z16) {
        }
        if (z17) {
        }
        if (measuredWidth != i15) {
        }
        if (measuredWidth != i15) {
        }
        if (measuredHeight != i13) {
        }
        view.measure(i10, i11);
        int measuredWidth222 = view.getMeasuredWidth();
        i13 = view.getMeasuredHeight();
        i15 = measuredWidth222;
        i16 = -1;
        i14 = view.getBaseline();
        if (i14 != i16) {
        }
        if (i15 != bVar.f35956c) {
        }
        z19 = true;
        bVar.f35962i = z19;
        if (eVar.f36800X) {
        }
        if (z18) {
        }
        bVar.f35958e = i15;
        bVar.f35959f = i13;
        bVar.f35961h = z18;
        bVar.f35960g = i14;
    }
}
