package G3;

import D1.Z;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: G3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599c extends Property {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5904a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0599c(int i10, Class cls, String str) {
        super(cls, str);
        this.f5904a = i10;
    }

    public final Float a(View view) {
        switch (this.f5904a) {
            case 5:
                return Float.valueOf(A.f5879a.B(view));
            case 6:
            default:
                WeakHashMap weakHashMap = Z.f3247a;
                return Float.valueOf(D1.I.e(view));
            case 7:
                return Float.valueOf(view.getLayoutParams().width);
            case 8:
                return Float.valueOf(view.getLayoutParams().height);
            case 9:
                WeakHashMap weakHashMap2 = Z.f3247a;
                return Float.valueOf(D1.I.f(view));
        }
    }

    public final void b(C0602f c0602f, PointF pointF) {
        switch (this.f5904a) {
            case 0:
                c0602f.getClass();
                c0602f.f5907a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0602f.f5908b = round;
                int i10 = c0602f.f5912f + 1;
                c0602f.f5912f = i10;
                if (i10 == c0602f.f5913g) {
                    A.a(c0602f.f5911e, c0602f.f5907a, round, c0602f.f5909c, c0602f.f5910d);
                    c0602f.f5912f = 0;
                    c0602f.f5913g = 0;
                    return;
                }
                return;
            default:
                c0602f.getClass();
                c0602f.f5909c = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                c0602f.f5910d = round2;
                int i11 = c0602f.f5913g + 1;
                c0602f.f5913g = i11;
                if (c0602f.f5912f == i11) {
                    A.a(c0602f.f5911e, c0602f.f5907a, c0602f.f5908b, c0602f.f5909c, round2);
                    c0602f.f5912f = 0;
                    c0602f.f5913g = 0;
                    return;
                }
                return;
        }
    }

    public final void c(View view, PointF pointF) {
        switch (this.f5904a) {
            case 2:
                A.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                return;
            case 3:
                A.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                return;
            default:
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                A.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
                return;
        }
    }

    public final void d(View view, Float f6) {
        switch (this.f5904a) {
            case 5:
                A.f5879a.C(view, f6.floatValue());
                return;
            case 6:
            default:
                WeakHashMap weakHashMap = Z.f3247a;
                D1.I.k(view, D1.I.f(view), view.getPaddingTop(), f6.intValue(), view.getPaddingBottom());
                return;
            case 7:
                view.getLayoutParams().width = f6.intValue();
                view.requestLayout();
                return;
            case 8:
                view.getLayoutParams().height = f6.intValue();
                view.requestLayout();
                return;
            case 9:
                int intValue = f6.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap2 = Z.f3247a;
                D1.I.k(view, intValue, paddingTop, D1.I.e(view), view.getPaddingBottom());
                return;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f5904a) {
            case 0:
                C0602f c0602f = (C0602f) obj;
                return null;
            case 1:
                C0602f c0602f2 = (C0602f) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case 5:
                return a((View) obj);
            case 6:
                WeakHashMap weakHashMap = Z.f3247a;
                return D1.J.a((View) obj);
            case 7:
                return a((View) obj);
            case 8:
                return a((View) obj);
            case 9:
                return a((View) obj);
            default:
                return a((View) obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f5904a) {
            case 0:
                b((C0602f) obj, (PointF) obj2);
                return;
            case 1:
                b((C0602f) obj, (PointF) obj2);
                return;
            case 2:
                c((View) obj, (PointF) obj2);
                return;
            case 3:
                c((View) obj, (PointF) obj2);
                return;
            case 4:
                c((View) obj, (PointF) obj2);
                return;
            case 5:
                d((View) obj, (Float) obj2);
                return;
            case 6:
                WeakHashMap weakHashMap = Z.f3247a;
                D1.J.c((View) obj, (Rect) obj2);
                return;
            case 7:
                d((View) obj, (Float) obj2);
                return;
            case 8:
                d((View) obj, (Float) obj2);
                return;
            case 9:
                d((View) obj, (Float) obj2);
                return;
            default:
                d((View) obj, (Float) obj2);
                return;
        }
    }
}
