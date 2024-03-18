package w3;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import s3.C5547J;

/* renamed from: w3.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6087C {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f47739a;

    public /* synthetic */ C6087C(RecyclerView recyclerView) {
        this.f47739a = recyclerView;
    }

    public final void a(C6094a c6094a) {
        int i10 = c6094a.f47820a;
        RecyclerView recyclerView = this.f47739a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        recyclerView.f25475s0.W(c6094a.f47821b, c6094a.f47823d);
                        return;
                    }
                    return;
                }
                recyclerView.f25475s0.Y(c6094a.f47821b, c6094a.f47823d);
                return;
            }
            recyclerView.f25475s0.X(c6094a.f47821b, c6094a.f47823d);
            return;
        }
        recyclerView.f25475s0.U(c6094a.f47821b, c6094a.f47823d);
    }

    public final Y b(int i10) {
        RecyclerView recyclerView = this.f47739a;
        int h10 = recyclerView.f25461l0.h();
        int i11 = 0;
        Y y10 = null;
        while (true) {
            if (i11 >= h10) {
                break;
            }
            Y I10 = RecyclerView.I(recyclerView.f25461l0.g(i11));
            if (I10 != null && !I10.j() && I10.f47802c == i10) {
                if (recyclerView.f25461l0.j(I10.f47800a)) {
                    y10 = I10;
                } else {
                    y10 = I10;
                    break;
                }
            }
            i11++;
        }
        if (y10 == null || recyclerView.f25461l0.j(y10.f47800a)) {
            return null;
        }
        return y10;
    }

    public final void c(int i10, Object obj, int i11) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f47739a;
        int h10 = recyclerView.f25461l0.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < h10; i15++) {
            View g10 = recyclerView.f25461l0.g(i15);
            Y I10 = RecyclerView.I(g10);
            if (I10 != null && !I10.q() && (i13 = I10.f47802c) >= i10 && i13 < i14) {
                I10.b(2);
                I10.a(obj);
                ((L) g10.getLayoutParams()).f47769c = true;
            }
        }
        i3.g gVar = recyclerView.f25455i0;
        ArrayList arrayList = (ArrayList) gVar.f32644e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Y y10 = (Y) arrayList.get(size);
            if (y10 != null && (i12 = y10.f47802c) >= i10 && i12 < i14) {
                y10.b(2);
                gVar.e(size);
            }
        }
        recyclerView.f25460k1 = true;
    }

    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.f47739a;
        int h10 = recyclerView.f25461l0.h();
        for (int i12 = 0; i12 < h10; i12++) {
            Y I10 = RecyclerView.I(recyclerView.f25461l0.g(i12));
            if (I10 != null && !I10.q() && I10.f47802c >= i10) {
                I10.n(i11, false);
                recyclerView.g1.f47783f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f25455i0.f32644e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Y y10 = (Y) arrayList.get(i13);
            if (y10 != null && y10.f47802c >= i10) {
                y10.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f25458j1 = true;
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f47739a;
        int h10 = recyclerView.f25461l0.h();
        int i19 = -1;
        if (i10 < i11) {
            i14 = i10;
            i13 = i11;
            i12 = -1;
        } else {
            i13 = i10;
            i14 = i11;
            i12 = 1;
        }
        for (int i20 = 0; i20 < h10; i20++) {
            Y I10 = RecyclerView.I(recyclerView.f25461l0.g(i20));
            if (I10 != null && (i18 = I10.f47802c) >= i14 && i18 <= i13) {
                if (i18 == i10) {
                    I10.n(i11 - i10, false);
                } else {
                    I10.n(i12, false);
                }
                recyclerView.g1.f47783f = true;
            }
        }
        i3.g gVar = recyclerView.f25455i0;
        gVar.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        ArrayList arrayList = (ArrayList) gVar.f32644e;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            Y y10 = (Y) arrayList.get(i21);
            if (y10 != null && (i17 = y10.f47802c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    y10.n(i11 - i10, false);
                } else {
                    y10.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f25458j1 = true;
    }

    public final void f(Y y10, C5547J c5547j, C5547J c5547j2) {
        RecyclerView recyclerView = this.f47739a;
        recyclerView.getClass();
        y10.p(false);
        C6103j c6103j = (C6103j) recyclerView.f25436O0;
        if (c5547j != null) {
            c6103j.getClass();
            int i10 = c5547j.f45241a;
            int i11 = c5547j2.f45241a;
            if (i10 != i11 || c5547j.f45242b != c5547j2.f45242b) {
                if (!c6103j.g(y10, i10, c5547j.f45242b, i11, c5547j2.f45242b)) {
                    return;
                }
                recyclerView.S();
            }
        }
        c6103j.l(y10);
        y10.f47800a.setAlpha(0.0f);
        c6103j.f47901i.add(y10);
        recyclerView.S();
    }

    public final void g(Y y10, C5547J c5547j, C5547J c5547j2) {
        int i10;
        int i11;
        RecyclerView recyclerView = this.f47739a;
        recyclerView.f25455i0.j(y10);
        recyclerView.f(y10);
        y10.p(false);
        C6103j c6103j = (C6103j) recyclerView.f25436O0;
        c6103j.getClass();
        int i12 = c5547j.f45241a;
        int i13 = c5547j.f45242b;
        View view = y10.f47800a;
        if (c5547j2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = c5547j2.f45241a;
        }
        int i14 = i10;
        if (c5547j2 == null) {
            i11 = view.getTop();
        } else {
            i11 = c5547j2.f45242b;
        }
        int i15 = i11;
        if (!y10.j() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            if (!c6103j.g(y10, i12, i13, i14, i15)) {
                return;
            }
        } else {
            c6103j.l(y10);
            c6103j.f47900h.add(y10);
        }
        recyclerView.S();
    }

    public final void h(int i10) {
        RecyclerView recyclerView = this.f47739a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
