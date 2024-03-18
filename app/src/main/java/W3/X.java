package w3;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import w.C6061h;

/* loaded from: classes.dex */
public final class X implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public int f47792Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f47793Z;

    /* renamed from: h0  reason: collision with root package name */
    public OverScroller f47794h0;

    /* renamed from: i0  reason: collision with root package name */
    public Interpolator f47795i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f47796j0 = false;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f47797k0 = false;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f47798l0;

    public X(RecyclerView recyclerView) {
        this.f47798l0 = recyclerView;
        L1.d dVar = RecyclerView.f25421y1;
        this.f47795i0 = dVar;
        this.f47794h0 = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f47796j0) {
            this.f47797k0 = true;
            return;
        }
        RecyclerView recyclerView = this.f47798l0;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = D1.Z.f3247a;
        D1.H.m(recyclerView, this);
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        boolean z10;
        int i13;
        int i14;
        RecyclerView recyclerView = this.f47798l0;
        if (i12 == Integer.MIN_VALUE) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            if (abs > abs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i11 * i11) + (i10 * i10));
            if (z10) {
                i13 = recyclerView.getWidth();
            } else {
                i13 = recyclerView.getHeight();
            }
            int i15 = i13 / 2;
            float f6 = i13;
            float f10 = i15;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f6) - 0.5f) * 0.47123894f)) * f10) + f10;
            if (sqrt > 0) {
                i14 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    abs = abs2;
                }
                i14 = (int) (((abs / f6) + 1.0f) * 300.0f);
            }
            i12 = Math.min(i14, 2000);
        }
        int i16 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.f25421y1;
        }
        if (this.f47795i0 != interpolator) {
            this.f47795i0 = interpolator;
            this.f47794h0 = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f47793Z = 0;
        this.f47792Y = 0;
        recyclerView.setScrollState(2);
        this.f47794h0.startScroll(0, 0, i10, i11, i16);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean awakenScrollBars;
        boolean z10;
        boolean z11;
        boolean z12;
        int i14;
        RecyclerView recyclerView = this.f47798l0;
        if (recyclerView.f25475s0 == null) {
            recyclerView.removeCallbacks(this);
            this.f47794h0.abortAnimation();
            return;
        }
        this.f47797k0 = false;
        this.f47796j0 = true;
        recyclerView.m();
        OverScroller overScroller = this.f47794h0;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f47792Y;
            int i16 = currY - this.f47793Z;
            this.f47792Y = currX;
            this.f47793Z = currY;
            int[] iArr = recyclerView.f25476s1;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean r10 = recyclerView.r(i15, i16, 1, iArr, null);
            int[] iArr2 = recyclerView.f25476s1;
            if (r10) {
                i15 -= iArr2[0];
                i16 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i15, i16);
            }
            if (recyclerView.f25473r0 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.Z(i15, i16, iArr2);
                int i17 = iArr2[0];
                int i18 = iArr2[1];
                int i19 = i15 - i17;
                int i20 = i16 - i18;
                C6115w c6115w = recyclerView.f25475s0.f47756e;
                if (c6115w != null && !c6115w.f47995d && c6115w.f47996e) {
                    int b10 = recyclerView.g1.b();
                    if (b10 == 0) {
                        c6115w.i();
                    } else if (c6115w.f47992a >= b10) {
                        c6115w.f47992a = b10 - 1;
                        c6115w.g(i17, i18);
                    } else {
                        c6115w.g(i17, i18);
                    }
                }
                i12 = i17;
                i11 = i19;
                i10 = i20;
                i13 = i18;
            } else {
                i11 = i15;
                i10 = i16;
                i13 = 0;
                i12 = 0;
            }
            if (!recyclerView.f25477t0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f25476s1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i21 = i13;
            recyclerView.s(i12, i13, i11, i10, null, 1, iArr3);
            int i22 = i11 - iArr2[0];
            int i23 = i10 - iArr2[1];
            if (i12 != 0 || i21 != 0) {
                recyclerView.t(i12, i21);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!overScroller.isFinished() && ((!z10 && i22 == 0) || (!z11 && i23 == 0))) {
                z12 = false;
            } else {
                z12 = true;
            }
            C6115w c6115w2 = recyclerView.f25475s0.f47756e;
            if ((c6115w2 == null || !c6115w2.f47995d) && z12) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i22 < 0) {
                        i14 = -currVelocity;
                    } else if (i22 > 0) {
                        i14 = currVelocity;
                    } else {
                        i14 = 0;
                    }
                    if (i23 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i23 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.v();
                        if (recyclerView.f25432K0.isFinished()) {
                            recyclerView.f25432K0.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.w();
                        if (recyclerView.f25434M0.isFinished()) {
                            recyclerView.f25434M0.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f25433L0.isFinished()) {
                            recyclerView.f25433L0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f25435N0.isFinished()) {
                            recyclerView.f25435N0.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = D1.Z.f3247a;
                        D1.H.k(recyclerView);
                    }
                }
                C6061h c6061h = recyclerView.f25452f1;
                int[] iArr4 = c6061h.f47589c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c6061h.f47590d = 0;
            } else {
                a();
                RunnableC6110q runnableC6110q = recyclerView.f25451e1;
                if (runnableC6110q != null) {
                    runnableC6110q.a(recyclerView, i12, i21);
                }
            }
        }
        C6115w c6115w3 = recyclerView.f25475s0.f47756e;
        if (c6115w3 != null && c6115w3.f47995d) {
            c6115w3.g(0, 0);
        }
        this.f47796j0 = false;
        if (this.f47797k0) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = D1.Z.f3247a;
            D1.H.m(recyclerView, this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.e0(1);
    }
}
