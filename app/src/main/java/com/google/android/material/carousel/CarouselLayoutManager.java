package com.google.android.material.carousel;

import U7.a;
import U7.c;
import U7.d;
import U7.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import i3.g;
import j7.RunnableC3921k;
import java.util.List;
import w3.C6118z;
import w3.K;
import w3.L;
import w3.U;
import w3.V;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends K implements U {

    /* renamed from: p  reason: collision with root package name */
    public d f27098p;

    /* renamed from: q  reason: collision with root package name */
    public final a f27099q = new View.OnLayoutChangeListener(this) { // from class: U7.a

        /* renamed from: Z  reason: collision with root package name */
        public final /* synthetic */ CarouselLayoutManager f17502Z;

        {
            this.f17502Z = this;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = r2;
            CarouselLayoutManager carouselLayoutManager = this.f17502Z;
            carouselLayoutManager.getClass();
            switch (i18) {
                case 0:
                    if (i10 != i14 || i11 != i15 || i12 != i16 || i13 != i17) {
                        view.post(new RunnableC3921k(1, carouselLayoutManager));
                        return;
                    }
                    return;
                default:
                    if (i10 != i14 || i11 != i15 || i12 != i16 || i13 != i17) {
                        view.post(new RunnableC3921k(1, carouselLayoutManager));
                        return;
                    }
                    return;
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [U7.a] */
    public CarouselLayoutManager() {
        new c();
        j0();
        E0(0);
    }

    public static float A0(float f6, U3.c cVar) {
        e eVar = (e) cVar.f17396Z;
        eVar.getClass();
        e eVar2 = (e) cVar.f17397h0;
        eVar2.getClass();
        eVar.getClass();
        eVar2.getClass();
        return P7.a.b(0.0f, 0.0f, 0.0f, 0.0f, f6);
    }

    public static U3.c B0(float f6, List list, boolean z10) {
        float f10 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f11 = -3.4028235E38f;
        float f12 = Float.MAX_VALUE;
        float f13 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((e) list.get(i14)).getClass();
            float abs = Math.abs(0.0f - f6);
            if (0.0f <= f6 && abs <= f10) {
                i10 = i14;
                f10 = abs;
            }
            if (0.0f > f6 && abs <= f12) {
                i12 = i14;
                f12 = abs;
            }
            if (0.0f <= f13) {
                f13 = 0.0f;
                i11 = i14;
            }
            if (0.0f > f11) {
                f11 = 0.0f;
                i13 = i14;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new U3.c((e) list.get(i10), (e) list.get(i12));
    }

    public final boolean C0() {
        if (this.f27098p.f48626Z == 0) {
            return true;
        }
        return false;
    }

    public final boolean D0() {
        if (C0() && A() == 1) {
            return true;
        }
        return false;
    }

    public final void E0(int i10) {
        d dVar;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(android.gov.nist.core.a.e("invalid orientation:", i10));
        }
        c(null);
        d dVar2 = this.f27098p;
        if (dVar2 == null || i10 != dVar2.f48626Z) {
            if (i10 != 0) {
                if (i10 == 1) {
                    dVar = new d(1, this, 0);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
            } else {
                dVar = new d(0, this, 1);
            }
            this.f27098p = dVar;
            j0();
        }
    }

    @Override // w3.K
    public final void O(RecyclerView recyclerView) {
        j0();
        recyclerView.addOnLayoutChangeListener(this.f27099q);
    }

    @Override // w3.K
    public final void P(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f27099q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r10 == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (D0() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r10 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
        if (D0() != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    @Override // w3.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View Q(View view, int i10, g gVar, V v10) {
        boolean z10;
        if (v() == 0) {
            return null;
        }
        int i11 = this.f27098p.f48626Z;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 != 130) {
                                Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
                            }
                            z10 = true;
                        } else {
                            if (i11 == 0) {
                            }
                            z10 = true;
                        }
                    }
                } else {
                    if (i11 == 0) {
                    }
                    z10 = true;
                }
                if (z10) {
                    return null;
                }
                int i12 = 0;
                if (z10) {
                    if (K.F(view) == 0) {
                        return null;
                    }
                    int F10 = K.F(u(0)) - 1;
                    if (F10 >= 0 && F10 < z()) {
                        y0(F10);
                        View view2 = gVar.i(F10, Long.MAX_VALUE).f47800a;
                        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                    }
                    if (D0()) {
                        i12 = v() - 1;
                    }
                    return u(i12);
                } else if (K.F(view) == z() - 1) {
                    return null;
                } else {
                    int F11 = K.F(u(v() - 1)) + 1;
                    if (F11 >= 0 && F11 < z()) {
                        y0(F11);
                        View view3 = gVar.i(F11, Long.MAX_VALUE).f47800a;
                        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                    }
                    if (!D0()) {
                        i12 = v() - 1;
                    }
                    return u(i12);
                }
            }
            z10 = true;
            if (z10) {
            }
        }
        z10 = true;
        if (z10) {
        }
    }

    @Override // w3.K
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(K.F(u(0)));
            accessibilityEvent.setToIndex(K.F(u(v() - 1)));
        }
    }

    @Override // w3.K
    public final void U(int i10, int i11) {
        z();
    }

    @Override // w3.K
    public final void X(int i10, int i11) {
        z();
    }

    @Override // w3.K
    public final void Z(g gVar, V v10) {
        if (v10.b() > 0 && z0() > 0.0f) {
            D0();
            View view = gVar.i(0, Long.MAX_VALUE).f47800a;
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        e0(gVar);
    }

    @Override // w3.U
    public final PointF a(int i10) {
        return null;
    }

    @Override // w3.K
    public final void a0(V v10) {
        if (v() != 0) {
            K.F(u(0));
        }
    }

    @Override // w3.K
    public final boolean d() {
        return C0();
    }

    @Override // w3.K
    public final boolean e() {
        return !C0();
    }

    @Override // w3.K
    public final boolean i0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        return false;
    }

    @Override // w3.K
    public final int j(V v10) {
        v();
        return 0;
    }

    @Override // w3.K
    public final int k(V v10) {
        return 0;
    }

    @Override // w3.K
    public final int k0(int i10, g gVar, V v10) {
        if (!C0() || v() == 0 || i10 == 0) {
            return 0;
        }
        View view = gVar.i(0, Long.MAX_VALUE).f47800a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // w3.K
    public final int l(V v10) {
        return 0;
    }

    @Override // w3.K
    public final void l0(int i10) {
    }

    @Override // w3.K
    public final int m(V v10) {
        v();
        return 0;
    }

    @Override // w3.K
    public final int m0(int i10, g gVar, V v10) {
        if (!e() || v() == 0 || i10 == 0) {
            return 0;
        }
        View view = gVar.i(0, Long.MAX_VALUE).f47800a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // w3.K
    public final int n(V v10) {
        return 0;
    }

    @Override // w3.K
    public final int o(V v10) {
        return 0;
    }

    @Override // w3.K
    public final L r() {
        return new L(-2, -2);
    }

    @Override // w3.K
    public final void v0(RecyclerView recyclerView, int i10) {
        C6118z c6118z = new C6118z(this, recyclerView.getContext(), 1);
        c6118z.f47992a = i10;
        w0(c6118z);
    }

    @Override // w3.K
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    public final float y0(int i10) {
        this.f27098p.k();
        throw null;
    }

    public final int z0() {
        if (C0()) {
            return this.f47765n;
        }
        return this.f47766o;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [U7.a] */
    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        new c();
        j0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O7.a.f13403b);
            obtainStyledAttributes.getInt(0, 0);
            j0();
            E0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
