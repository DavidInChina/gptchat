package w3;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: w3.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6108o extends AbstractC6093I implements N {

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f47921C = {16842919};

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f47922D = new int[0];

    /* renamed from: B  reason: collision with root package name */
    public final RunnableC6104k f47924B;

    /* renamed from: a  reason: collision with root package name */
    public final int f47925a;

    /* renamed from: b  reason: collision with root package name */
    public final int f47926b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f47927c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f47928d;

    /* renamed from: e  reason: collision with root package name */
    public final int f47929e;

    /* renamed from: f  reason: collision with root package name */
    public final int f47930f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f47931g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f47932h;

    /* renamed from: i  reason: collision with root package name */
    public final int f47933i;

    /* renamed from: j  reason: collision with root package name */
    public final int f47934j;

    /* renamed from: k  reason: collision with root package name */
    public int f47935k;

    /* renamed from: l  reason: collision with root package name */
    public int f47936l;

    /* renamed from: m  reason: collision with root package name */
    public float f47937m;

    /* renamed from: n  reason: collision with root package name */
    public int f47938n;

    /* renamed from: o  reason: collision with root package name */
    public int f47939o;

    /* renamed from: p  reason: collision with root package name */
    public float f47940p;

    /* renamed from: s  reason: collision with root package name */
    public final RecyclerView f47943s;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f47950z;

    /* renamed from: q  reason: collision with root package name */
    public int f47941q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f47942r = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f47944t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f47945u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f47946v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f47947w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f47948x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f47949y = new int[2];

    /* renamed from: A  reason: collision with root package name */
    public int f47923A = 0;

    public C6108o(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        boolean z10 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f47950z = ofFloat;
        RunnableC6104k runnableC6104k = new RunnableC6104k(0, this);
        this.f47924B = runnableC6104k;
        C6105l c6105l = new C6105l(this);
        this.f47927c = stateListDrawable;
        this.f47928d = drawable;
        this.f47931g = stateListDrawable2;
        this.f47932h = drawable2;
        this.f47929e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f47930f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f47933i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f47934j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f47925a = i11;
        this.f47926b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C6106m(this));
        ofFloat.addUpdateListener(new C6107n(this));
        RecyclerView recyclerView2 = this.f47943s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                K k10 = recyclerView2.f25475s0;
                if (k10 != null) {
                    k10.c("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList arrayList = recyclerView2.f25477t0;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z10);
                }
                recyclerView2.N();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f47943s;
                recyclerView3.f25479u0.remove(this);
                if (recyclerView3.f25481v0 == this) {
                    recyclerView3.f25481v0 = null;
                }
                ArrayList arrayList2 = this.f47943s.f25456i1;
                if (arrayList2 != null) {
                    arrayList2.remove(c6105l);
                }
                this.f47943s.removeCallbacks(runnableC6104k);
            }
            this.f47943s = recyclerView;
            if (recyclerView != null) {
                recyclerView.g(this);
                this.f47943s.f25479u0.add(this);
                this.f47943s.h(c6105l);
            }
        }
    }

    public static int e(float f6, float f10, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f10 - f6) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    @Override // w3.AbstractC6093I
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (this.f47941q == this.f47943s.getWidth() && this.f47942r == this.f47943s.getHeight()) {
            if (this.f47923A != 0) {
                if (this.f47944t) {
                    int i10 = this.f47941q;
                    int i11 = this.f47929e;
                    int i12 = i10 - i11;
                    int i13 = this.f47936l;
                    int i14 = this.f47935k;
                    int i15 = i13 - (i14 / 2);
                    StateListDrawable stateListDrawable = this.f47927c;
                    stateListDrawable.setBounds(0, 0, i11, i14);
                    int i16 = this.f47942r;
                    int i17 = this.f47930f;
                    Drawable drawable = this.f47928d;
                    drawable.setBounds(0, 0, i17, i16);
                    RecyclerView recyclerView2 = this.f47943s;
                    WeakHashMap weakHashMap = D1.Z.f3247a;
                    if (D1.I.d(recyclerView2) == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i11, i15);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i11, -i15);
                    } else {
                        canvas.translate(i12, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i15);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i12, -i15);
                    }
                }
                if (this.f47945u) {
                    int i18 = this.f47942r;
                    int i19 = this.f47933i;
                    int i20 = i18 - i19;
                    int i21 = this.f47939o;
                    int i22 = this.f47938n;
                    int i23 = i21 - (i22 / 2);
                    StateListDrawable stateListDrawable2 = this.f47931g;
                    stateListDrawable2.setBounds(0, 0, i22, i19);
                    int i24 = this.f47941q;
                    int i25 = this.f47934j;
                    Drawable drawable2 = this.f47932h;
                    drawable2.setBounds(0, 0, i24, i25);
                    canvas.translate(0.0f, i20);
                    drawable2.draw(canvas);
                    canvas.translate(i23, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i23, -i20);
                    return;
                }
                return;
            }
            return;
        }
        this.f47941q = this.f47943s.getWidth();
        this.f47942r = this.f47943s.getHeight();
        f(0);
    }

    public final boolean c(float f6, float f10) {
        if (f10 >= this.f47942r - this.f47933i) {
            int i10 = this.f47939o;
            int i11 = this.f47938n;
            if (f6 >= i10 - (i11 / 2) && f6 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f6, float f10) {
        boolean z10;
        RecyclerView recyclerView = this.f47943s;
        WeakHashMap weakHashMap = D1.Z.f3247a;
        if (D1.I.d(recyclerView) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f47929e;
        if (z10) {
            if (f6 > i10 / 2) {
                return false;
            }
        } else if (f6 < this.f47941q - i10) {
            return false;
        }
        int i11 = this.f47936l;
        int i12 = this.f47935k / 2;
        if (f10 < i11 - i12 || f10 > i12 + i11) {
            return false;
        }
        return true;
    }

    public final void f(int i10) {
        RunnableC6104k runnableC6104k = this.f47924B;
        StateListDrawable stateListDrawable = this.f47927c;
        if (i10 == 2 && this.f47946v != 2) {
            stateListDrawable.setState(f47921C);
            this.f47943s.removeCallbacks(runnableC6104k);
        }
        if (i10 == 0) {
            this.f47943s.invalidate();
        } else {
            g();
        }
        if (this.f47946v == 2 && i10 != 2) {
            stateListDrawable.setState(f47922D);
            this.f47943s.removeCallbacks(runnableC6104k);
            this.f47943s.postDelayed(runnableC6104k, 1200);
        } else if (i10 == 1) {
            this.f47943s.removeCallbacks(runnableC6104k);
            this.f47943s.postDelayed(runnableC6104k, 1500);
        }
        this.f47946v = i10;
    }

    public final void g() {
        int i10 = this.f47923A;
        ValueAnimator valueAnimator = this.f47950z;
        if (i10 != 0) {
            if (i10 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.f47923A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
