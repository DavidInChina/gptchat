package w3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: w3.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6116x extends AbstractC6117y {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f48008d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6116x(K k10, int i10) {
        super(k10);
        this.f48008d = i10;
    }

    @Override // w3.AbstractC6117y
    public final int b(View view) {
        int i10 = this.f48008d;
        K k10 = this.f48009a;
        switch (i10) {
            case 0:
                k10.getClass();
                return view.getRight() + ((L) view.getLayoutParams()).f47768b.right + ((ViewGroup.MarginLayoutParams) ((L) view.getLayoutParams())).rightMargin;
            default:
                k10.getClass();
                return view.getBottom() + ((L) view.getLayoutParams()).f47768b.bottom + ((ViewGroup.MarginLayoutParams) ((L) view.getLayoutParams())).bottomMargin;
        }
    }

    @Override // w3.AbstractC6117y
    public final int c(View view) {
        int i10 = this.f48008d;
        K k10 = this.f48009a;
        switch (i10) {
            case 0:
                L l10 = (L) view.getLayoutParams();
                k10.getClass();
                Rect rect = ((L) view.getLayoutParams()).f47768b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) l10).leftMargin + ((ViewGroup.MarginLayoutParams) l10).rightMargin;
            default:
                L l11 = (L) view.getLayoutParams();
                k10.getClass();
                Rect rect2 = ((L) view.getLayoutParams()).f47768b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) l11).topMargin + ((ViewGroup.MarginLayoutParams) l11).bottomMargin;
        }
    }

    @Override // w3.AbstractC6117y
    public final int d(View view) {
        int i10 = this.f48008d;
        K k10 = this.f48009a;
        switch (i10) {
            case 0:
                k10.getClass();
                return (view.getLeft() - ((L) view.getLayoutParams()).f47768b.left) - ((ViewGroup.MarginLayoutParams) ((L) view.getLayoutParams())).leftMargin;
            default:
                k10.getClass();
                return (view.getTop() - ((L) view.getLayoutParams()).f47768b.top) - ((ViewGroup.MarginLayoutParams) ((L) view.getLayoutParams())).topMargin;
        }
    }

    @Override // w3.AbstractC6117y
    public final int e() {
        int i10 = this.f48008d;
        K k10 = this.f48009a;
        switch (i10) {
            case 0:
                return k10.f47765n - k10.D();
            default:
                return k10.f47766o - k10.B();
        }
    }

    @Override // w3.AbstractC6117y
    public final int f() {
        int i10 = this.f48008d;
        K k10 = this.f48009a;
        switch (i10) {
            case 0:
                return k10.C();
            default:
                return k10.E();
        }
    }

    @Override // w3.AbstractC6117y
    public final int g() {
        int i10 = this.f48008d;
        K k10 = this.f48009a;
        switch (i10) {
            case 0:
                return (k10.f47765n - k10.C()) - k10.D();
            default:
                return (k10.f47766o - k10.E()) - k10.B();
        }
    }

    @Override // w3.AbstractC6117y
    public final int i(View view) {
        int i10 = this.f48008d;
        Rect rect = this.f48011c;
        K k10 = this.f48009a;
        switch (i10) {
            case 0:
                k10.I(view, rect);
                return rect.right;
            default:
                k10.I(view, rect);
                return rect.bottom;
        }
    }

    @Override // w3.AbstractC6117y
    public final int j(View view) {
        int i10 = this.f48008d;
        Rect rect = this.f48011c;
        K k10 = this.f48009a;
        switch (i10) {
            case 0:
                k10.I(view, rect);
                return rect.left;
            default:
                k10.I(view, rect);
                return rect.top;
        }
    }

    @Override // w3.AbstractC6117y
    public final void k(int i10) {
        int i11 = this.f48008d;
        K k10 = this.f48009a;
        switch (i11) {
            case 0:
                k10.M(i10);
                return;
            default:
                k10.N(i10);
                return;
        }
    }

    public final int l(View view) {
        int i10 = this.f48008d;
        K k10 = this.f48009a;
        switch (i10) {
            case 0:
                L l10 = (L) view.getLayoutParams();
                k10.getClass();
                Rect rect = ((L) view.getLayoutParams()).f47768b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) l10).topMargin + ((ViewGroup.MarginLayoutParams) l10).bottomMargin;
            default:
                L l11 = (L) view.getLayoutParams();
                k10.getClass();
                Rect rect2 = ((L) view.getLayoutParams()).f47768b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) l11).leftMargin + ((ViewGroup.MarginLayoutParams) l11).rightMargin;
        }
    }
}
