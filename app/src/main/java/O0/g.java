package O0;

import android.text.Layout;
import android.text.TextUtils;
import id.AbstractC3557B;
import java.text.Bidi;
import java.util.ArrayList;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Layout f13280a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f13281b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f13282c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean[] f13283d;

    /* renamed from: e  reason: collision with root package name */
    public char[] f13284e;

    public g(Layout layout) {
        this.f13280a = layout;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            int k22 = Lg.n.k2(this.f13280a.getText(), '\n', i10, false, 4);
            if (k22 < 0) {
                i10 = this.f13280a.getText().length();
            } else {
                i10 = k22 + 1;
            }
            arrayList.add(Integer.valueOf(i10));
        } while (i10 < this.f13280a.getText().length());
        this.f13281b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(null);
        }
        this.f13282c = arrayList2;
        this.f13283d = new boolean[this.f13281b.size()];
        this.f13281b.size();
    }

    public final float a(int i10, boolean z10) {
        Layout layout = this.f13280a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i10));
        if (i10 > lineEnd) {
            i10 = lineEnd;
        }
        if (z10) {
            return layout.getPrimaryHorizontal(i10);
        }
        return layout.getSecondaryHorizontal(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0115, code lost:
        if (r4.getRunCount() == 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a0, code lost:
        if (r2 == r1.f13279c) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float b(int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        int i15;
        int i16;
        Bidi bidi;
        int i17;
        boolean z14;
        boolean z15;
        boolean z16;
        int i18;
        int i19;
        boolean z17;
        boolean z18;
        int i20;
        boolean z19;
        int i21;
        int i22;
        int i23 = i10;
        if (!z11) {
            return a(i10, z10);
        }
        Layout layout = this.f13280a;
        int S02 = A7.b.S0(layout, i23, z11);
        int lineStart = layout.getLineStart(S02);
        int lineEnd = layout.getLineEnd(S02);
        if (i23 != lineStart && i23 != lineEnd) {
            return a(i10, z10);
        }
        if (i23 != 0 && i23 != layout.getText().length()) {
            ArrayList arrayList = this.f13281b;
            int P = AbstractC4344b.P(arrayList, Integer.valueOf(i10));
            if (P < 0) {
                i11 = -(P + 1);
            } else {
                i11 = P + 1;
            }
            if (z11 && i11 > 0) {
                int i24 = i11 - 1;
                if (i23 == ((Number) arrayList.get(i24)).intValue()) {
                    i11 = i24;
                }
            }
            if (i11 == 0) {
                i12 = 0;
            } else {
                i12 = ((Number) arrayList.get(i11 - 1)).intValue();
            }
            if (layout.getParagraphDirection(layout.getLineForOffset(i12)) == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            int c10 = c(lineEnd, lineStart);
            if (i11 == 0) {
                i13 = 0;
            } else {
                i13 = ((Number) arrayList.get(i11 - 1)).intValue();
            }
            int i25 = lineStart - i13;
            int i26 = c10 - i13;
            boolean[] zArr = this.f13283d;
            boolean z20 = zArr[i11];
            ArrayList arrayList2 = this.f13282c;
            Bidi bidi2 = null;
            if (z20) {
                i14 = S02;
                i15 = c10;
                bidi = (Bidi) arrayList2.get(i11);
                z13 = z12;
                i16 = -1;
            } else {
                if (i11 == 0) {
                    i20 = 0;
                } else {
                    i20 = ((Number) arrayList.get(i11 - 1)).intValue();
                }
                int intValue = ((Number) arrayList.get(i11)).intValue();
                int i27 = intValue - i20;
                i15 = c10;
                char[] cArr = this.f13284e;
                i14 = S02;
                if (cArr == null || cArr.length < i27) {
                    cArr = new char[i27];
                }
                z13 = z12;
                TextUtils.getChars(layout.getText(), i20, intValue, cArr, 0);
                if (Bidi.requiresBidi(cArr, 0, i27)) {
                    if (i11 == 0) {
                        i21 = 0;
                    } else {
                        i21 = ((Number) arrayList.get(i11 - 1)).intValue();
                    }
                    i16 = -1;
                    if (layout.getParagraphDirection(layout.getLineForOffset(i21)) == -1) {
                        i22 = 1;
                    } else {
                        i22 = 0;
                    }
                    bidi = new Bidi(cArr, 0, null, 0, i27, i22);
                    z19 = true;
                } else {
                    i16 = -1;
                    z19 = true;
                }
                bidi = null;
                arrayList2.set(i11, bidi);
                zArr[i11] = z19;
                if (bidi != null) {
                    char[] cArr2 = this.f13284e;
                    if (cArr == cArr2) {
                        cArr = null;
                    } else {
                        cArr = cArr2;
                    }
                }
                this.f13284e = cArr;
            }
            if (bidi != null) {
                bidi2 = bidi.createLineBidi(i25, i26);
            }
            Bidi bidi3 = bidi2;
            if (bidi3 != null) {
                if (bidi3.getRunCount() == 1) {
                    z15 = true;
                    i17 = i14;
                    z14 = z13;
                } else {
                    int runCount = bidi3.getRunCount();
                    f[] fVarArr = new f[runCount];
                    for (int i28 = 0; i28 < runCount; i28++) {
                        int runStart = bidi3.getRunStart(i28) + lineStart;
                        int runLimit = bidi3.getRunLimit(i28) + lineStart;
                        if (bidi3.getRunLevel(i28) % 2 == 1) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        fVarArr[i28] = new f(runStart, runLimit, z18);
                    }
                    int runCount2 = bidi3.getRunCount();
                    byte[] bArr = new byte[runCount2];
                    for (int i29 = 0; i29 < runCount2; i29++) {
                        bArr[i29] = (byte) bidi3.getRunLevel(i29);
                    }
                    Bidi.reorderVisually(bArr, 0, fVarArr, 0, runCount);
                    if (i23 == lineStart) {
                        int i30 = 0;
                        while (true) {
                            if (i30 < runCount) {
                                if (fVarArr[i30].f13277a == i23) {
                                    i19 = i30;
                                    break;
                                }
                                i30++;
                            } else {
                                i19 = i16;
                                break;
                            }
                        }
                        f fVar = fVarArr[i19];
                        if (!z10) {
                            z17 = z13;
                        } else {
                            z17 = z13;
                        }
                        if (!z17) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (i19 == 0 && z17) {
                            return layout.getLineLeft(i14);
                        }
                        int i31 = i14;
                        if (i19 == kf.q.l3(fVarArr) && !z17) {
                            return layout.getLineRight(i31);
                        }
                        if (z17) {
                            return layout.getPrimaryHorizontal(fVarArr[i19 - 1].f13277a);
                        }
                        return layout.getPrimaryHorizontal(fVarArr[i19 + 1].f13277a);
                    }
                    int i32 = i14;
                    boolean z21 = z13;
                    if (i23 > i15) {
                        i23 = c(i23, lineStart);
                    }
                    int i33 = 0;
                    while (true) {
                        if (i33 < runCount) {
                            if (fVarArr[i33].f13278b == i23) {
                                i18 = i33;
                                break;
                            }
                            i33++;
                        } else {
                            i18 = i16;
                            break;
                        }
                    }
                    f fVar2 = fVarArr[i18];
                    if (!z10 && z21 != fVar2.f13279c) {
                        z21 = !z21;
                    }
                    if (i18 == 0 && z21) {
                        return layout.getLineLeft(i32);
                    }
                    if (i18 == kf.q.l3(fVarArr) && !z21) {
                        return layout.getLineRight(i32);
                    }
                    if (z21) {
                        return layout.getPrimaryHorizontal(fVarArr[i18 - 1].f13278b);
                    }
                    return layout.getPrimaryHorizontal(fVarArr[i18 + 1].f13278b);
                }
            } else {
                i17 = i14;
                z14 = z13;
                z15 = true;
            }
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (!z10 && z14 != isRtlCharAt) {
                z16 = z14;
            } else if (!z14) {
                z16 = z15;
            } else {
                z16 = false;
            }
            if (i23 != lineStart ? !z16 : z16) {
                return layout.getLineLeft(i17);
            }
            return layout.getLineRight(i17);
        }
        return a(i10, z10);
    }

    public final int c(int i10, int i11) {
        while (i10 > i11) {
            char charAt = this.f13280a.getText().charAt(i10 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != '\u1680' && ((AbstractC3557B.e0(charAt, 8192) < 0 || AbstractC3557B.e0(charAt, 8202) > 0 || charAt == '\u2007') && charAt != '\u205f' && charAt != '\u3000')) {
                break;
            }
            i10--;
        }
        return i10;
    }
}
