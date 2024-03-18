package w3;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.datastore.preferences.protobuf.C2017e;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: w3.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6118z extends C6115w {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f48012q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f48013r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6118z(Object obj, Context context, int i10) {
        super(context);
        this.f48012q = i10;
        this.f48013r = obj;
    }

    @Override // w3.C6115w
    public final int b(View view, int i10) {
        switch (this.f48012q) {
            case 1:
                ((CarouselLayoutManager) this.f48013r).getClass();
                return 0;
            default:
                return super.b(view, i10);
        }
    }

    @Override // w3.C6115w
    public final int c(View view, int i10) {
        switch (this.f48012q) {
            case 1:
                ((CarouselLayoutManager) this.f48013r).getClass();
                return 0;
            default:
                return super.c(view, i10);
        }
    }

    @Override // w3.C6115w
    public final float d(DisplayMetrics displayMetrics) {
        switch (this.f48012q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            case 1:
            default:
                return super.d(displayMetrics);
            case 2:
                return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // w3.C6115w
    public final int e(int i10) {
        switch (this.f48012q) {
            case 0:
                return Math.min(100, super.e(i10));
            default:
                return super.e(i10);
        }
    }

    @Override // w3.C6115w
    public final PointF f(int i10) {
        switch (this.f48012q) {
            case 1:
                ((CarouselLayoutManager) this.f48013r).getClass();
                return null;
            default:
                return super.f(i10);
        }
    }

    @Override // w3.C6115w
    public final void h(View view, V v10, C2017e c2017e) {
        switch (this.f48012q) {
            case 0:
                C6085A c6085a = (C6085A) this.f48013r;
                int[] a5 = c6085a.a(c6085a.f47734a.getLayoutManager(), view);
                int i10 = a5[0];
                int i11 = a5[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i10), Math.abs(i11))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f48001j;
                    c2017e.f25038a = i10;
                    c2017e.f25039b = i11;
                    c2017e.f25040c = ceil;
                    c2017e.f25044g = decelerateInterpolator;
                    c2017e.f25042e = true;
                    return;
                }
                return;
            default:
                super.h(view, v10, c2017e);
                return;
        }
    }
}
