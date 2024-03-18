package i3;

import D1.C0339a;
import D1.C0343c;
import D1.H;
import android.gov.nist.core.Separators;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.WeakHashMap;
import w.C6061h;
import w3.AbstractC6088D;
import w3.AbstractC6092H;
import w3.C6096c;
import w3.C6103j;
import w3.L;
import w3.P;
import w3.Q;
import w3.V;
import w3.Y;
import w3.Z;
import w3.a0;
import y1.p;
import y1.q;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public int f32640a;

    /* renamed from: b  reason: collision with root package name */
    public int f32641b;

    /* renamed from: c  reason: collision with root package name */
    public final Cloneable f32642c;

    /* renamed from: d  reason: collision with root package name */
    public Cloneable f32643d;

    /* renamed from: e  reason: collision with root package name */
    public final Cloneable f32644e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f32645f;

    /* renamed from: g  reason: collision with root package name */
    public Object f32646g;

    /* renamed from: h  reason: collision with root package name */
    public Object f32647h;

    /* renamed from: i  reason: collision with root package name */
    public Object f32648i;

    public g(int i10, int i11) {
        this.f32640a = i10;
        this.f32641b = i11;
        this.f32642c = new SparseArray();
        this.f32643d = new SparseArray();
        this.f32644e = new SparseArray();
        this.f32645f = new SparseArray();
        this.f32646g = new SparseArray();
    }

    public final void a(Y y10, boolean z10) {
        C0343c c0343c;
        RecyclerView.j(y10);
        a0 a0Var = ((RecyclerView) this.f32648i).f25466n1;
        if (a0Var != null) {
            Z z11 = a0Var.f47825j0;
            boolean z12 = z11 instanceof Z;
            View view = y10.f47800a;
            if (z12) {
                c0343c = (C0343c) z11.f47819j0.remove(view);
            } else {
                c0343c = null;
            }
            D1.Z.l(view, c0343c);
        }
        if (z10) {
            ((RecyclerView) this.f32648i).getClass();
            Object obj = this.f32648i;
            AbstractC6088D abstractC6088D = ((RecyclerView) obj).f25473r0;
            RecyclerView recyclerView = (RecyclerView) obj;
            if (recyclerView.g1 != null) {
                recyclerView.f25463m0.m(y10);
            }
        }
        y10.f47817r = null;
        Q c10 = c();
        c10.getClass();
        int i10 = y10.f47805f;
        ArrayList arrayList = c10.a(i10).f47771a;
        if (((P) c10.f47775a.get(i10)).f47772b > arrayList.size()) {
            y10.o();
            arrayList.add(y10);
        }
    }

    public final int b(int i10) {
        if (i10 >= 0 && i10 < ((RecyclerView) this.f32648i).g1.b()) {
            Object obj = this.f32648i;
            if (!((RecyclerView) obj).g1.f47784g) {
                return i10;
            }
            return ((RecyclerView) obj).f25459k0.f(i10, 0);
        }
        StringBuilder q10 = android.gov.nist.core.a.q("invalid position ", i10, ". State item count is ");
        q10.append(((RecyclerView) this.f32648i).g1.b());
        throw new IndexOutOfBoundsException(AbstractC2469q0.h((RecyclerView) this.f32648i, q10));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [w3.Q, java.lang.Object] */
    public final Q c() {
        if (((Q) this.f32646g) == null) {
            ?? obj = new Object();
            obj.f47775a = new SparseArray();
            obj.f47776b = 0;
            this.f32646g = obj;
        }
        return (Q) this.f32646g;
    }

    public final void d() {
        ArrayList arrayList = (ArrayList) this.f32644e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f25419w1;
        C6061h c6061h = ((RecyclerView) this.f32648i).f25452f1;
        int[] iArr2 = c6061h.f47589c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c6061h.f47590d = 0;
    }

    public final void e(int i10) {
        Cloneable cloneable = this.f32644e;
        a((Y) ((ArrayList) cloneable).get(i10), true);
        ((ArrayList) cloneable).remove(i10);
    }

    public final void f(View view) {
        Y I10 = RecyclerView.I(view);
        if (I10.l()) {
            ((RecyclerView) this.f32648i).removeDetachedView(view, false);
        }
        if (I10.k()) {
            I10.f47813n.j(I10);
        } else if (I10.r()) {
            I10.f47809j &= -33;
        }
        g(I10);
        if (((RecyclerView) this.f32648i).f25436O0 != null && !I10.i()) {
            ((RecyclerView) this.f32648i).f25436O0.d(I10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
        r4 = r4 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Y y10) {
        boolean z10;
        AbstractC6088D abstractC6088D;
        boolean z11;
        boolean k10 = y10.k();
        boolean z12 = false;
        boolean z13 = true;
        View view = y10.f47800a;
        if (!k10 && view.getParent() == null) {
            if (!y10.l()) {
                if (!y10.q()) {
                    if ((y10.f47809j & 16) == 0) {
                        WeakHashMap weakHashMap = D1.Z.f3247a;
                        if (H.i(view)) {
                            z10 = true;
                            abstractC6088D = ((RecyclerView) this.f32648i).f25473r0;
                            if (abstractC6088D != null && z10) {
                                abstractC6088D.getClass();
                            }
                            if (!y10.i()) {
                                if (this.f32641b > 0 && !y10.e(526)) {
                                    ArrayList arrayList = (ArrayList) this.f32644e;
                                    int size = arrayList.size();
                                    if (size >= this.f32641b && size > 0) {
                                        e(0);
                                        size--;
                                    }
                                    int[] iArr = RecyclerView.f25419w1;
                                    if (size > 0) {
                                        C6061h c6061h = ((RecyclerView) this.f32648i).f25452f1;
                                        int i10 = y10.f47802c;
                                        if (c6061h.f47589c != null) {
                                            int i11 = c6061h.f47590d * 2;
                                            for (int i12 = 0; i12 < i11; i12 += 2) {
                                                if (c6061h.f47589c[i12] == i10) {
                                                    break;
                                                }
                                            }
                                        }
                                        int i13 = size - 1;
                                        loop1: while (i13 >= 0) {
                                            int i14 = ((Y) arrayList.get(i13)).f47802c;
                                            C6061h c6061h2 = ((RecyclerView) this.f32648i).f25452f1;
                                            if (c6061h2.f47589c == null) {
                                                break;
                                            }
                                            int i15 = c6061h2.f47590d * 2;
                                            for (int i16 = 0; i16 < i15; i16 += 2) {
                                                if (c6061h2.f47589c[i16] == i14) {
                                                    break;
                                                }
                                            }
                                            break loop1;
                                        }
                                        size = i13 + 1;
                                    }
                                    arrayList.add(size, y10);
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z11) {
                                    a(y10, true);
                                } else {
                                    z13 = false;
                                }
                                z12 = z11;
                            } else {
                                z13 = false;
                            }
                            ((RecyclerView) this.f32648i).f25463m0.m(y10);
                            if (z12 && !z13 && z10) {
                                y10.f47817r = null;
                                return;
                            }
                            return;
                        }
                    }
                    z10 = false;
                    abstractC6088D = ((RecyclerView) this.f32648i).f25473r0;
                    if (abstractC6088D != null) {
                        abstractC6088D.getClass();
                    }
                    if (!y10.i()) {
                    }
                    ((RecyclerView) this.f32648i).f25463m0.m(y10);
                    if (z12) {
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(AbstractC2469q0.h((RecyclerView) this.f32648i, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(y10);
            throw new IllegalArgumentException(AbstractC2469q0.h((RecyclerView) this.f32648i, sb2));
        }
        StringBuilder sb3 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb3.append(y10.k());
        sb3.append(" isAttached:");
        if (view.getParent() != null) {
            z12 = true;
        }
        sb3.append(z12);
        throw new IllegalArgumentException(AbstractC2469q0.h((RecyclerView) this.f32648i, sb3));
    }

    public final void h(View view) {
        AbstractC6092H abstractC6092H;
        Y I10 = RecyclerView.I(view);
        if (!I10.e(12) && I10.m() && (abstractC6092H = ((RecyclerView) this.f32648i).f25436O0) != null) {
            C6103j c6103j = (C6103j) abstractC6092H;
            if (I10.d().isEmpty() && c6103j.f47899g && !I10.h()) {
                if (((ArrayList) this.f32643d) == null) {
                    this.f32643d = new ArrayList();
                }
                I10.f47813n = this;
                I10.f47814o = true;
                ((ArrayList) this.f32643d).add(I10);
                return;
            }
        }
        if (I10.h() && !I10.j() && !((RecyclerView) this.f32648i).f25473r0.f47741b) {
            throw new IllegalArgumentException(AbstractC2469q0.h((RecyclerView) this.f32648i, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        I10.f47813n = this;
        I10.f47814o = false;
        ((ArrayList) this.f32642c).add(I10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01eb, code lost:
        if (((androidx.recyclerview.widget.RecyclerView) r20.f32648i).g1.f47784g == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020f, code lost:
        if (r8.f47805f != 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0226, code lost:
        if (r8.f47804e != r10.b(r8.f47802c)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0229, code lost:
        r8.b(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0231, code lost:
        if (r8.k() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0233, code lost:
        ((androidx.recyclerview.widget.RecyclerView) r20.f32648i).removeDetachedView(r8.f47800a, false);
        r8.f47813n.j(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0246, code lost:
        if (r8.r() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0248, code lost:
        r8.f47809j &= -33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024e, code lost:
        g(r8);
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0325, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04c1, code lost:
        if ((r9 + r11) >= r22) goto L225;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:271:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0170  */
    /* JADX WARN: Type inference failed for: r6v54, types: [s3.J, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Y i(int i10, long j6) {
        Y y10;
        boolean z10;
        boolean z11;
        ViewGroup.LayoutParams layoutParams;
        L l10;
        Y y11;
        View view;
        Y y12;
        int i11;
        int size;
        int f6;
        if (i10 >= 0 && i10 < ((RecyclerView) this.f32648i).g1.b()) {
            boolean z12 = false;
            C0343c c0343c = null;
            if (((RecyclerView) this.f32648i).g1.f47784g) {
                ArrayList arrayList = (ArrayList) this.f32643d;
                if (arrayList != null && (size = arrayList.size()) != 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            y10 = (Y) ((ArrayList) this.f32643d).get(i12);
                            if (!y10.r() && y10.c() == i10) {
                                y10.b(32);
                                break;
                            }
                            i12++;
                        } else {
                            RecyclerView recyclerView = (RecyclerView) this.f32648i;
                            if (recyclerView.f25473r0.f47741b && (f6 = recyclerView.f25459k0.f(i10, 0)) > 0 && f6 < ((RecyclerView) this.f32648i).f25473r0.a()) {
                                long b10 = ((RecyclerView) this.f32648i).f25473r0.b(f6);
                                for (int i13 = 0; i13 < size; i13++) {
                                    Y y13 = (Y) ((ArrayList) this.f32643d).get(i13);
                                    if (!y13.r() && y13.f47804e == b10) {
                                        y13.b(32);
                                        y10 = y13;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (y10 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                y10 = null;
                if (y10 == null) {
                }
            } else {
                z10 = false;
                y10 = null;
            }
            Cloneable cloneable = this.f32644e;
            Cloneable cloneable2 = this.f32642c;
            if (y10 == null) {
                ArrayList arrayList2 = (ArrayList) cloneable2;
                int size2 = arrayList2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    y12 = (Y) arrayList2.get(i14);
                    if (!y12.r() && y12.c() == i10 && !y12.h() && (((RecyclerView) this.f32648i).g1.f47784g || !y12.j())) {
                        y12.b(32);
                        break;
                    }
                }
                C6096c c6096c = ((RecyclerView) this.f32648i).f25461l0;
                ArrayList arrayList3 = c6096c.f47835c;
                int size3 = arrayList3.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size3) {
                        view = (View) arrayList3.get(i15);
                        c6096c.f47833a.getClass();
                        Y I10 = RecyclerView.I(view);
                        if (I10.c() == i10 && !I10.h() && !I10.j()) {
                            break;
                        }
                        i15++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    y10 = RecyclerView.I(view);
                    C6096c c6096c2 = ((RecyclerView) this.f32648i).f25461l0;
                    int indexOfChild = c6096c2.f47833a.f47739a.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        S2.c cVar = c6096c2.f47834b;
                        if (cVar.d(indexOfChild)) {
                            cVar.a(indexOfChild);
                            c6096c2.k(view);
                            C6096c c6096c3 = ((RecyclerView) this.f32648i).f25461l0;
                            int indexOfChild2 = c6096c3.f47833a.f47739a.indexOfChild(view);
                            if (indexOfChild2 != -1) {
                                S2.c cVar2 = c6096c3.f47834b;
                                if (!cVar2.d(indexOfChild2)) {
                                    i11 = indexOfChild2 - cVar2.b(indexOfChild2);
                                    if (i11 == -1) {
                                        ((RecyclerView) this.f32648i).f25461l0.c(i11);
                                        h(view);
                                        y10.b(8224);
                                    } else {
                                        StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                        sb2.append(y10);
                                        throw new IllegalStateException(AbstractC2469q0.h((RecyclerView) this.f32648i, sb2));
                                    }
                                }
                            }
                            i11 = -1;
                            if (i11 == -1) {
                            }
                        } else {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                    } else {
                        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                    }
                } else {
                    ArrayList arrayList4 = (ArrayList) cloneable;
                    int size4 = arrayList4.size();
                    for (int i16 = 0; i16 < size4; i16++) {
                        y12 = (Y) arrayList4.get(i16);
                        if (!y12.h() && y12.c() == i10 && !y12.f()) {
                            arrayList4.remove(i16);
                            y10 = y12;
                        }
                    }
                    y10 = null;
                }
                if (y10 != null) {
                    if (!y10.j()) {
                        int i17 = y10.f47802c;
                        if (i17 >= 0 && i17 < ((RecyclerView) this.f32648i).f25473r0.a()) {
                            RecyclerView recyclerView2 = (RecyclerView) this.f32648i;
                            if (!recyclerView2.g1.f47784g) {
                                recyclerView2.f25473r0.getClass();
                            }
                            AbstractC6088D abstractC6088D = ((RecyclerView) this.f32648i).f25473r0;
                            if (abstractC6088D.f47741b) {
                            }
                            z10 = true;
                        } else {
                            StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb3.append(y10);
                            throw new IndexOutOfBoundsException(AbstractC2469q0.h((RecyclerView) this.f32648i, sb3));
                        }
                    }
                }
            }
            if (y10 == null) {
                int f10 = ((RecyclerView) this.f32648i).f25459k0.f(i10, 0);
                if (f10 >= 0 && f10 < ((RecyclerView) this.f32648i).f25473r0.a()) {
                    ((RecyclerView) this.f32648i).f25473r0.getClass();
                    AbstractC6088D abstractC6088D2 = ((RecyclerView) this.f32648i).f25473r0;
                    if (abstractC6088D2.f47741b) {
                        long b11 = abstractC6088D2.b(f10);
                        ArrayList arrayList5 = (ArrayList) cloneable2;
                        int size5 = arrayList5.size() - 1;
                        while (true) {
                            if (size5 >= 0) {
                                Y y14 = (Y) arrayList5.get(size5);
                                if (y14.f47804e == b11 && !y14.r()) {
                                    if (y14.f47805f == 0) {
                                        y14.b(32);
                                        if (y14.j() && !((RecyclerView) this.f32648i).g1.f47784g) {
                                            y14.f47809j = (y14.f47809j & (-15)) | 2;
                                        }
                                        y10 = y14;
                                    } else {
                                        arrayList5.remove(size5);
                                        View view2 = y14.f47800a;
                                        ((RecyclerView) this.f32648i).removeDetachedView(view2, false);
                                        Y I11 = RecyclerView.I(view2);
                                        I11.f47813n = null;
                                        I11.f47814o = false;
                                        I11.f47809j &= -33;
                                        g(I11);
                                    }
                                }
                                size5--;
                            } else {
                                ArrayList arrayList6 = (ArrayList) cloneable;
                                int size6 = arrayList6.size() - 1;
                                while (true) {
                                    if (size6 < 0) {
                                        break;
                                    }
                                    y10 = (Y) arrayList6.get(size6);
                                    if (y10.f47804e != b11 || y10.f()) {
                                        size6--;
                                    } else if (y10.f47805f == 0) {
                                        arrayList6.remove(size6);
                                    } else {
                                        e(size6);
                                    }
                                }
                            }
                        }
                        if (y10 != null) {
                            y10.f47802c = f10;
                            z10 = true;
                        }
                    }
                    if (y10 == null) {
                        AbstractC2469q0.p(this.f32647h);
                    }
                    if (y10 == null) {
                        P p10 = (P) c().f47775a.get(0);
                        if (p10 != null) {
                            ArrayList arrayList7 = p10.f47771a;
                            if (!arrayList7.isEmpty()) {
                                for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                                    if (!((Y) arrayList7.get(size7)).f()) {
                                        y11 = (Y) arrayList7.remove(size7);
                                        break;
                                    }
                                }
                            }
                        }
                        y11 = null;
                        if (y11 != null) {
                            y11.o();
                            int[] iArr = RecyclerView.f25419w1;
                        }
                        y10 = y11;
                    }
                    if (y10 == null) {
                        long nanoTime = ((RecyclerView) this.f32648i).getNanoTime();
                        if (j6 != Long.MAX_VALUE) {
                            long j10 = ((Q) this.f32646g).a(0).f47773c;
                            if (j10 != 0 && j10 + nanoTime >= j6) {
                                return null;
                            }
                        }
                        RecyclerView recyclerView3 = (RecyclerView) this.f32648i;
                        AbstractC6088D abstractC6088D3 = recyclerView3.f25473r0;
                        abstractC6088D3.getClass();
                        try {
                            int i18 = q.f50332a;
                            p.a("RV CreateView");
                            y10 = abstractC6088D3.d(recyclerView3);
                            View view3 = y10.f47800a;
                            if (view3.getParent() == null) {
                                y10.f47805f = 0;
                                p.b();
                                int[] iArr2 = RecyclerView.f25419w1;
                                RecyclerView D6 = RecyclerView.D(view3);
                                if (D6 != null) {
                                    y10.f47801b = new WeakReference(D6);
                                }
                                long nanoTime2 = ((RecyclerView) this.f32648i).getNanoTime() - nanoTime;
                                P a5 = ((Q) this.f32646g).a(0);
                                long j11 = a5.f47773c;
                                if (j11 != 0) {
                                    nanoTime2 = (nanoTime2 / 4) + ((j11 / 4) * 3);
                                }
                                a5.f47773c = nanoTime2;
                            } else {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                        } catch (Throwable th2) {
                            int i19 = q.f50332a;
                            p.b();
                            throw th2;
                        }
                    }
                } else {
                    StringBuilder A10 = E9.f.A("Inconsistency detected. Invalid item position ", i10, "(offset:", f10, ").state:");
                    A10.append(((RecyclerView) this.f32648i).g1.b());
                    throw new IndexOutOfBoundsException(AbstractC2469q0.h((RecyclerView) this.f32648i, A10));
                }
            }
            if (z10 && !((RecyclerView) this.f32648i).g1.f47784g && y10.e(8192)) {
                y10.f47809j &= -8193;
                if (((RecyclerView) this.f32648i).g1.f47787j) {
                    AbstractC6092H.b(y10);
                    RecyclerView recyclerView4 = (RecyclerView) this.f32648i;
                    AbstractC6092H abstractC6092H = recyclerView4.f25436O0;
                    V v10 = recyclerView4.g1;
                    y10.d();
                    abstractC6092H.getClass();
                    ?? obj = new Object();
                    obj.a(y10);
                    ((RecyclerView) this.f32648i).V(y10, obj);
                }
            }
            boolean z13 = ((RecyclerView) this.f32648i).g1.f47784g;
            View view4 = y10.f47800a;
            if (z13 && y10.g()) {
                y10.f47806g = i10;
            } else if (!y10.g() || (y10.f47809j & 2) != 0 || y10.h()) {
                int f11 = ((RecyclerView) this.f32648i).f25459k0.f(i10, 0);
                RecyclerView recyclerView5 = (RecyclerView) this.f32648i;
                y10.f47817r = recyclerView5;
                int i20 = y10.f47805f;
                long nanoTime3 = recyclerView5.getNanoTime();
                if (j6 != Long.MAX_VALUE) {
                    long j12 = ((Q) this.f32646g).a(i20).f47774d;
                    if (j12 != 0) {
                    }
                }
                AbstractC6088D abstractC6088D4 = ((RecyclerView) this.f32648i).f25473r0;
                abstractC6088D4.getClass();
                y10.f47802c = f11;
                if (abstractC6088D4.f47741b) {
                    y10.f47804e = abstractC6088D4.b(f11);
                }
                y10.f47809j = (y10.f47809j & (-520)) | 1;
                int i21 = q.f50332a;
                p.a("RV OnBindView");
                y10.d();
                abstractC6088D4.c(y10, f11);
                ArrayList arrayList8 = y10.f47810k;
                if (arrayList8 != null) {
                    arrayList8.clear();
                }
                y10.f47809j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof L) {
                    ((L) layoutParams2).f47769c = true;
                }
                p.b();
                long nanoTime4 = ((RecyclerView) this.f32648i).getNanoTime() - nanoTime3;
                P a10 = ((Q) this.f32646g).a(y10.f47805f);
                long j13 = a10.f47774d;
                if (j13 != 0) {
                    nanoTime4 = (nanoTime4 / 4) + ((j13 / 4) * 3);
                }
                a10.f47774d = nanoTime4;
                AccessibilityManager accessibilityManager = ((RecyclerView) this.f32648i).f25426E0;
                if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                    WeakHashMap weakHashMap = D1.Z.f3247a;
                    if (H.c(view4) == 0) {
                        H.s(view4, 1);
                    }
                    a0 a0Var = ((RecyclerView) this.f32648i).f25466n1;
                    if (a0Var != null) {
                        Z z14 = a0Var.f47825j0;
                        if (z14 instanceof Z) {
                            z14.getClass();
                            View.AccessibilityDelegate c10 = D1.Z.c(view4);
                            if (c10 != null) {
                                if (c10 instanceof C0339a) {
                                    c0343c = ((C0339a) c10).f3253a;
                                } else {
                                    c0343c = new C0343c(c10);
                                }
                            }
                            if (c0343c != null && c0343c != z14) {
                                z14.f47819j0.put(view4, c0343c);
                            }
                        }
                        D1.Z.l(view4, z14);
                    }
                }
                if (((RecyclerView) this.f32648i).g1.f47784g) {
                    y10.f47806g = i10;
                }
                z11 = true;
                layoutParams = view4.getLayoutParams();
                if (layoutParams != null) {
                    l10 = (L) ((RecyclerView) this.f32648i).generateDefaultLayoutParams();
                    view4.setLayoutParams(l10);
                } else if (!((RecyclerView) this.f32648i).checkLayoutParams(layoutParams)) {
                    l10 = (L) ((RecyclerView) this.f32648i).generateLayoutParams(layoutParams);
                    view4.setLayoutParams(l10);
                } else {
                    l10 = (L) layoutParams;
                }
                l10.f47767a = y10;
                if (z10 && z11) {
                    z12 = true;
                }
                l10.f47770d = z12;
                return y10;
            }
            z11 = false;
            layoutParams = view4.getLayoutParams();
            if (layoutParams != null) {
            }
            l10.f47767a = y10;
            if (z10) {
                z12 = true;
            }
            l10.f47770d = z12;
            return y10;
        }
        StringBuilder A11 = E9.f.A("Invalid item position ", i10, Separators.LPAREN, i10, "). Item count:");
        A11.append(((RecyclerView) this.f32648i).g1.b());
        throw new IndexOutOfBoundsException(AbstractC2469q0.h((RecyclerView) this.f32648i, A11));
    }

    public final void j(Y y10) {
        if (y10.f47814o) {
            ((ArrayList) this.f32643d).remove(y10);
        } else {
            ((ArrayList) this.f32642c).remove(y10);
        }
        y10.f47813n = null;
        y10.f47814o = false;
        y10.f47809j &= -33;
    }

    public final void k() {
        int i10;
        Object obj = this.f32648i;
        if (((RecyclerView) obj).f25475s0 != null) {
            i10 = ((RecyclerView) obj).f25475s0.f47761j;
        } else {
            i10 = 0;
        }
        this.f32641b = this.f32640a + i10;
        Cloneable cloneable = this.f32644e;
        for (int size = ((ArrayList) cloneable).size() - 1; size >= 0 && ((ArrayList) cloneable).size() > this.f32641b; size--) {
            e(size);
        }
    }

    public g(RecyclerView recyclerView) {
        this.f32648i = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f32642c = arrayList;
        this.f32643d = null;
        this.f32644e = new ArrayList();
        this.f32645f = Collections.unmodifiableList(arrayList);
        this.f32640a = 2;
        this.f32641b = 2;
    }
}
