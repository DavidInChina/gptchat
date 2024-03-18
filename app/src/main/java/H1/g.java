package H1;

import D1.H;
import D1.Z;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import g.RunnableC3118k;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: w0  reason: collision with root package name */
    public static final int f7162w0 = ViewConfiguration.getTapTimeout();

    /* renamed from: Y  reason: collision with root package name */
    public final C0718a f7163Y;

    /* renamed from: h0  reason: collision with root package name */
    public final View f7165h0;

    /* renamed from: i0  reason: collision with root package name */
    public RunnableC3118k f7166i0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f7174q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f7175r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f7176s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f7177t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f7178u0;

    /* renamed from: v0  reason: collision with root package name */
    public final ListView f7179v0;

    /* renamed from: Z  reason: collision with root package name */
    public final AccelerateInterpolator f7164Z = new AccelerateInterpolator();

    /* renamed from: j0  reason: collision with root package name */
    public final float[] f7167j0 = {0.0f, 0.0f};

    /* renamed from: k0  reason: collision with root package name */
    public final float[] f7168k0 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: n0  reason: collision with root package name */
    public final float[] f7171n0 = {0.0f, 0.0f};

    /* renamed from: o0  reason: collision with root package name */
    public final float[] f7172o0 = {0.0f, 0.0f};

    /* renamed from: p0  reason: collision with root package name */
    public final float[] f7173p0 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l0  reason: collision with root package name */
    public final int f7169l0 = 1;

    /* renamed from: m0  reason: collision with root package name */
    public final int f7170m0 = f7162w0;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, H1.a] */
    public g(ListView listView) {
        ?? obj = new Object();
        obj.f7157e = Long.MIN_VALUE;
        obj.f7159g = -1L;
        obj.f7158f = 0L;
        this.f7163Y = obj;
        this.f7165h0 = listView;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f7173p0;
        float f10 = ((int) ((1575.0f * f6) + 0.5f)) / 1000.0f;
        fArr[0] = f10;
        fArr[1] = f10;
        float[] fArr2 = this.f7172o0;
        float f11 = ((int) ((f6 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f11;
        fArr2[1] = f11;
        float[] fArr3 = this.f7168k0;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f7167j0;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f7171n0;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        obj.f7153a = 500;
        obj.f7154b = 500;
        this.f7179v0 = listView;
    }

    public static float b(float f6, float f10, float f11) {
        if (f6 > f11) {
            return f11;
        }
        if (f6 < f10) {
            return f10;
        }
        return f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f6, float f10, float f11, int i10) {
        float f12;
        int i11;
        float f13;
        float b10 = b(this.f7167j0[i10] * f10, 0.0f, this.f7168k0[i10]);
        float c10 = c(f10 - f6, b10) - c(f6, b10);
        int i12 = (c10 > 0.0f ? 1 : (c10 == 0.0f ? 0 : -1));
        AccelerateInterpolator accelerateInterpolator = this.f7164Z;
        if (i12 < 0) {
            f13 = -accelerateInterpolator.getInterpolation(-c10);
        } else if (c10 > 0.0f) {
            f13 = accelerateInterpolator.getInterpolation(c10);
        } else {
            f12 = 0.0f;
            i11 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                return 0.0f;
            }
            float f14 = this.f7171n0[i10];
            float f15 = this.f7172o0[i10];
            float f16 = this.f7173p0[i10];
            float f17 = f14 * f11;
            if (i11 > 0) {
                return b(f12 * f17, f15, f16);
            }
            return -b((-f12) * f17, f15, f16);
        }
        f12 = b(f13, -1.0f, 1.0f);
        i11 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i11 != 0) {
        }
    }

    public final float c(float f6, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f7169l0;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2 || f6 >= 0.0f) {
                return 0.0f;
            }
            return f6 / (-f10);
        } else if (f6 >= f10) {
            return 0.0f;
        } else {
            if (f6 >= 0.0f) {
                return 1.0f - (f6 / f10);
            }
            if (!this.f7177t0 || i10 != 1) {
                return 0.0f;
            }
            return 1.0f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(View view, MotionEvent motionEvent) {
        int i10;
        if (!this.f7178u0) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            e();
            return false;
        }
        this.f7176s0 = true;
        this.f7174q0 = false;
        View view2 = this.f7165h0;
        float a5 = a(motionEvent.getX(), view.getWidth(), view2.getWidth(), 0);
        float a10 = a(motionEvent.getY(), view.getHeight(), view2.getHeight(), 1);
        C0718a c0718a = this.f7163Y;
        c0718a.f7155c = a5;
        c0718a.f7156d = a10;
        if (!this.f7177t0 && f()) {
            if (this.f7166i0 == null) {
                this.f7166i0 = new RunnableC3118k(5, this);
            }
            this.f7177t0 = true;
            this.f7175r0 = true;
            if (!this.f7174q0 && (i10 = this.f7170m0) > 0) {
                RunnableC3118k runnableC3118k = this.f7166i0;
                long j6 = i10;
                WeakHashMap weakHashMap = Z.f3247a;
                H.n(view2, runnableC3118k, j6);
            } else {
                this.f7166i0.run();
            }
            this.f7174q0 = true;
        }
        return false;
    }

    public final void e() {
        int i10 = 0;
        if (this.f7175r0) {
            this.f7177t0 = false;
            return;
        }
        C0718a c0718a = this.f7163Y;
        c0718a.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - c0718a.f7157e);
        int i12 = c0718a.f7154b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        c0718a.f7161i = i10;
        c0718a.f7160h = c0718a.a(currentAnimationTimeMillis);
        c0718a.f7159g = currentAnimationTimeMillis;
    }

    public final boolean f() {
        ListView listView;
        int count;
        C0718a c0718a = this.f7163Y;
        float f6 = c0718a.f7156d;
        int abs = (int) (f6 / Math.abs(f6));
        Math.abs(c0718a.f7155c);
        if (abs == 0 || (count = (listView = this.f7179v0).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i10 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i10 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (abs >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
