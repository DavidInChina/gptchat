package w3;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import s3.C5547J;

/* renamed from: w3.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6092H {

    /* renamed from: a  reason: collision with root package name */
    public C6087C f47742a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f47743b;

    /* renamed from: c  reason: collision with root package name */
    public long f47744c;

    /* renamed from: d  reason: collision with root package name */
    public long f47745d;

    /* renamed from: e  reason: collision with root package name */
    public long f47746e;

    /* renamed from: f  reason: collision with root package name */
    public long f47747f;

    public static void b(Y y10) {
        RecyclerView recyclerView;
        int i10 = y10.f47809j;
        if (!y10.h() && (i10 & 4) == 0 && (recyclerView = y10.f47817r) != null) {
            recyclerView.F(y10);
        }
    }

    public abstract boolean a(Y y10, Y y11, C5547J c5547j, C5547J c5547j2);

    public final void c(Y y10) {
        C6087C c6087c = this.f47742a;
        if (c6087c != null) {
            boolean z10 = true;
            y10.p(true);
            if (y10.f47807h != null && y10.f47808i == null) {
                y10.f47807h = null;
            }
            y10.f47808i = null;
            if ((y10.f47809j & 16) == 0) {
                RecyclerView recyclerView = c6087c.f47739a;
                recyclerView.c0();
                C6096c c6096c = recyclerView.f25461l0;
                C6087C c6087c2 = c6096c.f47833a;
                RecyclerView recyclerView2 = c6087c2.f47739a;
                View view = y10.f47800a;
                int indexOfChild = recyclerView2.indexOfChild(view);
                if (indexOfChild == -1) {
                    c6096c.k(view);
                } else {
                    S2.c cVar = c6096c.f47834b;
                    if (cVar.d(indexOfChild)) {
                        cVar.f(indexOfChild);
                        c6096c.k(view);
                        c6087c2.h(indexOfChild);
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    Y I10 = RecyclerView.I(view);
                    i3.g gVar = recyclerView.f25455i0;
                    gVar.j(I10);
                    gVar.g(I10);
                }
                recyclerView.d0(!z10);
                if (!z10 && y10.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public abstract void d(Y y10);

    public abstract void e();

    public abstract boolean f();
}
