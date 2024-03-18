package H2;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;
import p2.l0;
import s2.AbstractC5530A;
import x8.N;

/* loaded from: classes2.dex */
public final class h extends l0 {

    /* renamed from: A  reason: collision with root package name */
    public boolean f7232A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f7233B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f7234C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f7235D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f7236E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f7237F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f7238G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f7239H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f7240I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f7241J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f7242K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f7243L;

    /* renamed from: M  reason: collision with root package name */
    public final SparseArray f7244M = new SparseArray();

    /* renamed from: N  reason: collision with root package name */
    public final SparseBooleanArray f7245N = new SparseBooleanArray();

    /* renamed from: x  reason: collision with root package name */
    public boolean f7246x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f7247y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7248z;

    public h(Context context) {
        c(context);
        d(context);
        b();
    }

    @Override // p2.l0
    public final l0 a(int i10, int i11) {
        super.a(i10, i11);
        return this;
    }

    public final void b() {
        this.f7246x = true;
        this.f7247y = false;
        this.f7248z = true;
        this.f7232A = false;
        this.f7233B = true;
        this.f7234C = false;
        this.f7235D = false;
        this.f7236E = false;
        this.f7237F = false;
        this.f7238G = true;
        this.f7239H = true;
        this.f7240I = true;
        this.f7241J = false;
        this.f7242K = true;
        this.f7243L = false;
    }

    public final void c(Context context) {
        CaptioningManager captioningManager;
        String str;
        int i10 = AbstractC5530A.f45131a;
        if (i10 >= 19) {
            if ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f42127q = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    if (i10 >= 21) {
                        str = locale.toLanguageTag();
                    } else {
                        str = locale.toString();
                    }
                    this.f42126p = N.u0(str);
                }
            }
        }
    }

    public final void d(Context context) {
        Display display;
        Point point;
        String str;
        String[] split;
        DisplayManager displayManager;
        int i10 = AbstractC5530A.f45131a;
        if (i10 >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && AbstractC5530A.B(context)) {
            if (i10 < 28) {
                str = AbstractC5530A.w("sys.display-size");
            } else {
                str = AbstractC5530A.w("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    split = str.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        a(point.x, point.y);
                    }
                }
                s2.p.c("Util", "Invalid display size: " + str);
            }
            if ("Sony".equals(AbstractC5530A.f45133c) && AbstractC5530A.f45134d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                a(point.x, point.y);
            }
        }
        point = new Point();
        if (i10 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (i10 >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        a(point.x, point.y);
    }

    public h() {
        b();
    }
}
