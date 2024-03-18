package w3;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.datastore.preferences.protobuf.C2017e;
import androidx.recyclerview.widget.RecyclerView;
import com.statsig.androidsdk.ErrorBoundaryKt;
import io.sentry.android.core.AbstractC3612c;

/* renamed from: w3.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6115w {

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f47993b;

    /* renamed from: c  reason: collision with root package name */
    public K f47994c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f47995d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f47996e;

    /* renamed from: f  reason: collision with root package name */
    public View f47997f;

    /* renamed from: g  reason: collision with root package name */
    public final C2017e f47998g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f47999h;

    /* renamed from: k  reason: collision with root package name */
    public PointF f48002k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f48003l;

    /* renamed from: n  reason: collision with root package name */
    public float f48005n;

    /* renamed from: a  reason: collision with root package name */
    public int f47992a = -1;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f48000i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f48001j = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    public boolean f48004m = false;

    /* renamed from: o  reason: collision with root package name */
    public int f48006o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f48007p = 0;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, androidx.datastore.preferences.protobuf.e] */
    public C6115w(Context context) {
        ?? obj = new Object();
        obj.f25041d = -1;
        obj.f25042e = false;
        obj.f25043f = 0;
        obj.f25038a = 0;
        obj.f25039b = 0;
        obj.f25040c = Integer.MIN_VALUE;
        obj.f25044g = null;
        this.f47998g = obj;
        this.f48003l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        }
        return i12 - i10;
    }

    public int b(View view, int i10) {
        K k10 = this.f47994c;
        if (k10 != null && k10.d()) {
            L l10 = (L) view.getLayoutParams();
            return a((view.getLeft() - ((L) view.getLayoutParams()).f47768b.left) - ((ViewGroup.MarginLayoutParams) l10).leftMargin, view.getRight() + ((L) view.getLayoutParams()).f47768b.right + ((ViewGroup.MarginLayoutParams) l10).rightMargin, k10.C(), k10.f47765n - k10.D(), i10);
        }
        return 0;
    }

    public int c(View view, int i10) {
        K k10 = this.f47994c;
        if (k10 != null && k10.e()) {
            L l10 = (L) view.getLayoutParams();
            return a((view.getTop() - ((L) view.getLayoutParams()).f47768b.top) - ((ViewGroup.MarginLayoutParams) l10).topMargin, view.getBottom() + ((L) view.getLayoutParams()).f47768b.bottom + ((ViewGroup.MarginLayoutParams) l10).bottomMargin, k10.E(), k10.f47766o - k10.B(), i10);
        }
        return 0;
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i10) {
        float abs = Math.abs(i10);
        if (!this.f48004m) {
            this.f48005n = d(this.f48003l);
            this.f48004m = true;
        }
        return (int) Math.ceil(abs * this.f48005n);
    }

    public PointF f(int i10) {
        K k10 = this.f47994c;
        if (k10 instanceof U) {
            return ((U) k10).a(i10);
        }
        AbstractC3612c.r("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + U.class.getCanonicalName());
        return null;
    }

    public final void g(int i10, int i11) {
        float f6;
        PointF f10;
        RecyclerView recyclerView = this.f47993b;
        int i12 = -1;
        if (this.f47992a == -1 || recyclerView == null) {
            i();
        }
        if (this.f47995d && this.f47997f == null && this.f47994c != null && (f10 = f(this.f47992a)) != null) {
            float f11 = f10.x;
            if (f11 != 0.0f || f10.y != 0.0f) {
                recyclerView.Z((int) Math.signum(f11), (int) Math.signum(f10.y), null);
            }
        }
        boolean z10 = false;
        this.f47995d = false;
        View view = this.f47997f;
        C2017e c2017e = this.f47998g;
        if (view != null) {
            this.f47993b.getClass();
            Y I10 = RecyclerView.I(view);
            if (I10 != null) {
                i12 = I10.c();
            }
            if (i12 == this.f47992a) {
                h(this.f47997f, recyclerView.g1, c2017e);
                c2017e.Z(recyclerView);
                i();
            } else {
                AbstractC3612c.c("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f47997f = null;
            }
        }
        if (this.f47996e) {
            V v10 = recyclerView.g1;
            if (this.f47993b.f25475s0.v() == 0) {
                i();
            } else {
                int i13 = this.f48006o;
                int i14 = i13 - i10;
                if (i13 * i14 <= 0) {
                    i14 = 0;
                }
                this.f48006o = i14;
                int i15 = this.f48007p;
                int i16 = i15 - i11;
                if (i15 * i16 <= 0) {
                    i16 = 0;
                }
                this.f48007p = i16;
                if (i14 == 0 && i16 == 0) {
                    PointF f12 = f(this.f47992a);
                    if (f12 != null) {
                        if (f12.x != 0.0f || f12.y != 0.0f) {
                            float f13 = f12.y;
                            float sqrt = (float) Math.sqrt((f13 * f13) + (f6 * f6));
                            float f14 = f12.x / sqrt;
                            f12.x = f14;
                            float f15 = f12.y / sqrt;
                            f12.y = f15;
                            this.f48002k = f12;
                            this.f48006o = (int) (f14 * 10000.0f);
                            this.f48007p = (int) (f15 * 10000.0f);
                            int e10 = e(ErrorBoundaryKt.SAMPLING_RATE);
                            LinearInterpolator linearInterpolator = this.f48000i;
                            c2017e.f25038a = (int) (this.f48006o * 1.2f);
                            c2017e.f25039b = (int) (this.f48007p * 1.2f);
                            c2017e.f25040c = (int) (e10 * 1.2f);
                            c2017e.f25044g = linearInterpolator;
                            c2017e.f25042e = true;
                        }
                    }
                    c2017e.f25041d = this.f47992a;
                    i();
                }
            }
            if (c2017e.f25041d >= 0) {
                z10 = true;
            }
            c2017e.Z(recyclerView);
            if (z10 && this.f47996e) {
                this.f47995d = true;
                recyclerView.f25450d1.a();
            }
        }
    }

    public void h(View view, V v10, C2017e c2017e) {
        int i10;
        int i11;
        int i12;
        PointF pointF = this.f48002k;
        int i13 = 0;
        if (pointF != null && pointF.x != 0.0f) {
            if (i12 > 0) {
                i10 = 1;
            } else {
                i10 = -1;
            }
        } else {
            i10 = 0;
        }
        int b10 = b(view, i10);
        PointF pointF2 = this.f48002k;
        if (pointF2 != null && pointF2.y != 0.0f) {
            i13 = i11 > 0 ? 1 : -1;
        }
        int c10 = c(view, i13);
        int ceil = (int) Math.ceil(e((int) Math.sqrt((c10 * c10) + (b10 * b10))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f48001j;
            c2017e.f25038a = -b10;
            c2017e.f25039b = -c10;
            c2017e.f25040c = ceil;
            c2017e.f25044g = decelerateInterpolator;
            c2017e.f25042e = true;
        }
    }

    public final void i() {
        if (this.f47996e) {
            this.f47996e = false;
            this.f48007p = 0;
            this.f48006o = 0;
            this.f48002k = null;
            this.f47993b.g1.f47778a = -1;
            this.f47997f = null;
            this.f47992a = -1;
            this.f47995d = false;
            K k10 = this.f47994c;
            if (k10.f47756e == this) {
                k10.f47756e = null;
            }
            this.f47994c = null;
            this.f47993b = null;
        }
    }
}
