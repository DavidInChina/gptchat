package o3;

import android.text.Layout;
import r2.C5357a;

/* renamed from: o3.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4911g {

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f40560c;

    /* renamed from: a  reason: collision with root package name */
    public long f40558a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f40559b = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f40561d = 2;

    /* renamed from: e  reason: collision with root package name */
    public float f40562e = -3.4028235E38f;

    /* renamed from: f  reason: collision with root package name */
    public int f40563f = 1;

    /* renamed from: g  reason: collision with root package name */
    public int f40564g = 0;

    /* renamed from: h  reason: collision with root package name */
    public float f40565h = -3.4028235E38f;

    /* renamed from: i  reason: collision with root package name */
    public int f40566i = Integer.MIN_VALUE;

    /* renamed from: j  reason: collision with root package name */
    public float f40567j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public int f40568k = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
        if (r7 == 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5357a a() {
        Layout.Alignment alignment;
        int i10;
        CharSequence charSequence;
        float f6 = this.f40565h;
        float f10 = -3.4028235E38f;
        if (f6 == -3.4028235E38f) {
            int i11 = this.f40561d;
            if (i11 != 4) {
                if (i11 != 5) {
                    f6 = 0.5f;
                } else {
                    f6 = 1.0f;
                }
            } else {
                f6 = 0.0f;
            }
        }
        int i12 = this.f40566i;
        if (i12 == Integer.MIN_VALUE) {
            int i13 = this.f40561d;
            if (i13 != 1) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        if (i13 != 5) {
                            i12 = 1;
                        }
                    }
                }
                i12 = 2;
            }
            i12 = 0;
        }
        C5357a c5357a = new C5357a();
        int i14 = this.f40561d;
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    if (i14 != 4) {
                        if (i14 != 5) {
                            android.gov.nist.core.a.v("Unknown textAlignment: ", i14, "WebvttCueParser");
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            c5357a.f44322c = alignment;
            float f11 = this.f40562e;
            int i15 = this.f40563f;
            i10 = (f11 > (-3.4028235E38f) ? 1 : (f11 == (-3.4028235E38f) ? 0 : -1));
            if (i10 != 0 || i15 != 0 || (f11 >= 0.0f && f11 <= 1.0f)) {
                if (i10 == 0) {
                    f10 = f11;
                }
                c5357a.f44324e = f10;
                c5357a.f44325f = i15;
                c5357a.f44326g = this.f40564g;
                c5357a.f44327h = f6;
                c5357a.f44328i = i12;
                float f12 = this.f40567j;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException(String.valueOf(i12));
                        }
                    } else if (f6 <= 0.5f) {
                        f6 *= 2.0f;
                    } else {
                        f6 = (1.0f - f6) * 2.0f;
                    }
                } else {
                    f6 = 1.0f - f6;
                }
                c5357a.f44331l = Math.min(f12, f6);
                c5357a.f44335p = this.f40568k;
                charSequence = this.f40560c;
                if (charSequence != null) {
                    c5357a.f44320a = charSequence;
                }
                return c5357a;
            }
            f10 = 1.0f;
            c5357a.f44324e = f10;
            c5357a.f44325f = i15;
            c5357a.f44326g = this.f40564g;
            c5357a.f44327h = f6;
            c5357a.f44328i = i12;
            float f122 = this.f40567j;
            if (i12 != 0) {
            }
            c5357a.f44331l = Math.min(f122, f6);
            c5357a.f44335p = this.f40568k;
            charSequence = this.f40560c;
            if (charSequence != null) {
            }
            return c5357a;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        c5357a.f44322c = alignment;
        float f112 = this.f40562e;
        int i152 = this.f40563f;
        i10 = (f112 > (-3.4028235E38f) ? 1 : (f112 == (-3.4028235E38f) ? 0 : -1));
        if (i10 != 0) {
        }
        if (i10 == 0) {
        }
        c5357a.f44324e = f10;
        c5357a.f44325f = i152;
        c5357a.f44326g = this.f40564g;
        c5357a.f44327h = f6;
        c5357a.f44328i = i12;
        float f1222 = this.f40567j;
        if (i12 != 0) {
        }
        c5357a.f44331l = Math.min(f1222, f6);
        c5357a.f44335p = this.f40568k;
        charSequence = this.f40560c;
        if (charSequence != null) {
        }
        return c5357a;
    }
}
