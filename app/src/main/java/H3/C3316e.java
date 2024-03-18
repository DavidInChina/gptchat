package h3;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* renamed from: h3.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3316e {

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f31819C;

    /* renamed from: F  reason: collision with root package name */
    public static final int[] f31822F;

    /* renamed from: x  reason: collision with root package name */
    public static final int f31824x;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f31827a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final SpannableStringBuilder f31828b = new SpannableStringBuilder();

    /* renamed from: c  reason: collision with root package name */
    public boolean f31829c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f31830d;

    /* renamed from: e  reason: collision with root package name */
    public int f31831e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f31832f;

    /* renamed from: g  reason: collision with root package name */
    public int f31833g;

    /* renamed from: h  reason: collision with root package name */
    public int f31834h;

    /* renamed from: i  reason: collision with root package name */
    public int f31835i;

    /* renamed from: j  reason: collision with root package name */
    public int f31836j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f31837k;

    /* renamed from: l  reason: collision with root package name */
    public int f31838l;

    /* renamed from: m  reason: collision with root package name */
    public int f31839m;

    /* renamed from: n  reason: collision with root package name */
    public int f31840n;

    /* renamed from: o  reason: collision with root package name */
    public int f31841o;

    /* renamed from: p  reason: collision with root package name */
    public int f31842p;

    /* renamed from: q  reason: collision with root package name */
    public int f31843q;

    /* renamed from: r  reason: collision with root package name */
    public int f31844r;

    /* renamed from: s  reason: collision with root package name */
    public int f31845s;

    /* renamed from: t  reason: collision with root package name */
    public int f31846t;

    /* renamed from: u  reason: collision with root package name */
    public int f31847u;

    /* renamed from: v  reason: collision with root package name */
    public int f31848v;

    /* renamed from: w  reason: collision with root package name */
    public static final int f31823w = c(2, 2, 2, 0);

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f31825y = {0, 0, 0, 0, 0, 2, 0};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f31826z = {0, 0, 0, 0, 0, 0, 2};

    /* renamed from: A  reason: collision with root package name */
    public static final int[] f31817A = {3, 3, 3, 3, 3, 3, 1};

    /* renamed from: B  reason: collision with root package name */
    public static final boolean[] f31818B = {false, false, false, true, true, true, false};

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f31820D = {0, 1, 2, 3, 4, 3, 4};

    /* renamed from: E  reason: collision with root package name */
    public static final int[] f31821E = {0, 0, 0, 0, 0, 3, 3};

    static {
        int c10 = c(0, 0, 0, 0);
        f31824x = c10;
        int c11 = c(0, 0, 0, 3);
        f31819C = new int[]{c10, c11, c10, c10, c11, c10, c10};
        f31822F = new int[]{c10, c10, c10, c10, c10, c11, c11};
    }

    public C3316e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        Gi.e.m(i10, 4);
        Gi.e.m(i11, 4);
        Gi.e.m(i12, 4);
        Gi.e.m(i13, 4);
        int i17 = 0;
        if (i13 != 0 && i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    i14 = 0;
                }
            } else {
                i14 = 127;
            }
            if (i10 <= 1) {
                i15 = 255;
            } else {
                i15 = 0;
            }
            if (i11 <= 1) {
                i16 = 255;
            } else {
                i16 = 0;
            }
            if (i12 > 1) {
                i17 = 255;
            }
            return Color.argb(i14, i15, i16, i17);
        }
        i14 = 255;
        if (i10 <= 1) {
        }
        if (i11 <= 1) {
        }
        if (i12 > 1) {
        }
        return Color.argb(i14, i15, i16, i17);
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f31828b;
        if (c10 == '\n') {
            ArrayList arrayList = this.f31827a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.f31842p != -1) {
                this.f31842p = 0;
            }
            if (this.f31843q != -1) {
                this.f31843q = 0;
            }
            if (this.f31844r != -1) {
                this.f31844r = 0;
            }
            if (this.f31846t != -1) {
                this.f31846t = 0;
            }
            while (true) {
                if ((this.f31837k && arrayList.size() >= this.f31836j) || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f31828b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f31842p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f31842p, length, 33);
            }
            if (this.f31843q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f31843q, length, 33);
            }
            if (this.f31844r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f31845s), this.f31844r, length, 33);
            }
            if (this.f31846t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f31847u), this.f31846t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f31827a.clear();
        this.f31828b.clear();
        this.f31842p = -1;
        this.f31843q = -1;
        this.f31844r = -1;
        this.f31846t = -1;
        this.f31848v = 0;
        this.f31829c = false;
        this.f31830d = false;
        this.f31831e = 4;
        this.f31832f = false;
        this.f31833g = 0;
        this.f31834h = 0;
        this.f31835i = 0;
        this.f31836j = 15;
        this.f31837k = true;
        this.f31838l = 0;
        this.f31839m = 0;
        this.f31840n = 0;
        int i10 = f31824x;
        this.f31841o = i10;
        this.f31845s = f31823w;
        this.f31847u = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f31842p;
        SpannableStringBuilder spannableStringBuilder = this.f31828b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f31842p, spannableStringBuilder.length(), 33);
                this.f31842p = -1;
            }
        } else if (z10) {
            this.f31842p = spannableStringBuilder.length();
        }
        if (this.f31843q != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f31843q, spannableStringBuilder.length(), 33);
                this.f31843q = -1;
            }
        } else if (z11) {
            this.f31843q = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f31844r;
        SpannableStringBuilder spannableStringBuilder = this.f31828b;
        if (i12 != -1 && this.f31845s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f31845s), this.f31844r, spannableStringBuilder.length(), 33);
        }
        if (i10 != f31823w) {
            this.f31844r = spannableStringBuilder.length();
            this.f31845s = i10;
        }
        if (this.f31846t != -1 && this.f31847u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f31847u), this.f31846t, spannableStringBuilder.length(), 33);
        }
        if (i11 != f31824x) {
            this.f31846t = spannableStringBuilder.length();
            this.f31847u = i11;
        }
    }
}
