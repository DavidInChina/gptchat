package w3;

import android.graphics.Rect;
import android.view.View;

/* renamed from: w3.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6117y {

    /* renamed from: a  reason: collision with root package name */
    public final K f48009a;

    /* renamed from: b  reason: collision with root package name */
    public int f48010b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f48011c = new Rect();

    public AbstractC6117y(K k10) {
        this.f48009a = k10;
    }

    public static C6116x a(K k10, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return new C6116x(k10, 1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C6116x(k10, 0);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public final int h() {
        if (Integer.MIN_VALUE == this.f48010b) {
            return 0;
        }
        return g() - this.f48010b;
    }

    public abstract int i(View view);

    public abstract int j(View view);

    public abstract void k(int i10);
}
