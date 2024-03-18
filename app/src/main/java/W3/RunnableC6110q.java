package w3;

import G0.C0588q;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import w.C6061h;

/* renamed from: w3.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6110q implements Runnable {

    /* renamed from: j0  reason: collision with root package name */
    public static final ThreadLocal f47956j0 = new ThreadLocal();

    /* renamed from: k0  reason: collision with root package name */
    public static final C0588q f47957k0 = new C0588q(3);

    /* renamed from: Y  reason: collision with root package name */
    public ArrayList f47958Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f47959Z;

    /* renamed from: h0  reason: collision with root package name */
    public long f47960h0;

    /* renamed from: i0  reason: collision with root package name */
    public ArrayList f47961i0;

    public static Y c(RecyclerView recyclerView, int i10, long j6) {
        int h10 = recyclerView.f25461l0.h();
        for (int i11 = 0; i11 < h10; i11++) {
            Y I10 = RecyclerView.I(recyclerView.f25461l0.g(i11));
            if (I10.f47802c == i10 && !I10.h()) {
                return null;
            }
        }
        i3.g gVar = recyclerView.f25455i0;
        try {
            recyclerView.P();
            Y i12 = gVar.i(i10, j6);
            if (i12 != null) {
                if (i12.g() && !i12.h()) {
                    gVar.f(i12.f47800a);
                } else {
                    gVar.a(i12, false);
                }
            }
            recyclerView.Q(false);
            return i12;
        } catch (Throwable th2) {
            recyclerView.Q(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.f25483w0 && this.f47959Z == 0) {
            this.f47959Z = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C6061h c6061h = recyclerView.f25452f1;
        c6061h.f47587a = i10;
        c6061h.f47588b = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j6) {
        C6109p c6109p;
        RecyclerView recyclerView;
        long j10;
        RecyclerView recyclerView2;
        C6109p c6109p2;
        boolean z10;
        ArrayList arrayList = this.f47958Y;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                C6061h c6061h = recyclerView3.f25452f1;
                c6061h.c(recyclerView3, false);
                i10 += c6061h.f47590d;
            }
        }
        ArrayList arrayList2 = this.f47961i0;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                C6061h c6061h2 = recyclerView4.f25452f1;
                int abs = Math.abs(c6061h2.f47588b) + Math.abs(c6061h2.f47587a);
                for (int i14 = 0; i14 < c6061h2.f47590d * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        c6109p2 = obj;
                    } else {
                        c6109p2 = (C6109p) arrayList2.get(i12);
                    }
                    int[] iArr = c6061h2.f47589c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c6109p2.f47951a = z10;
                    c6109p2.f47952b = abs;
                    c6109p2.f47953c = i15;
                    c6109p2.f47954d = recyclerView4;
                    c6109p2.f47955e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f47957k0);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (c6109p = (C6109p) arrayList2.get(i16)).f47954d) != null; i16++) {
            if (c6109p.f47951a) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j6;
            }
            Y c10 = c(recyclerView, c6109p.f47955e, j10);
            if (c10 != null && c10.f47801b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.f47801b.get()) != null) {
                if (recyclerView2.f25427F0 && recyclerView2.f25461l0.h() != 0) {
                    AbstractC6092H abstractC6092H = recyclerView2.f25436O0;
                    if (abstractC6092H != null) {
                        abstractC6092H.e();
                    }
                    K k10 = recyclerView2.f25475s0;
                    i3.g gVar = recyclerView2.f25455i0;
                    if (k10 != null) {
                        k10.e0(gVar);
                        recyclerView2.f25475s0.f0(gVar);
                    }
                    ((ArrayList) gVar.f32642c).clear();
                    gVar.d();
                }
                C6061h c6061h3 = recyclerView2.f25452f1;
                c6061h3.c(recyclerView2, true);
                if (c6061h3.f47590d != 0) {
                    try {
                        int i17 = y1.q.f50332a;
                        y1.p.a("RV Nested Prefetch");
                        V v10 = recyclerView2.g1;
                        AbstractC6088D abstractC6088D = recyclerView2.f25473r0;
                        v10.f47781d = 1;
                        v10.f47782e = abstractC6088D.a();
                        v10.f47784g = false;
                        v10.f47785h = false;
                        v10.f47786i = false;
                        for (int i18 = 0; i18 < c6061h3.f47590d * 2; i18 += 2) {
                            c(recyclerView2, c6061h3.f47589c[i18], j6);
                        }
                        y1.p.b();
                        c6109p.f47951a = false;
                        c6109p.f47952b = 0;
                        c6109p.f47953c = 0;
                        c6109p.f47954d = null;
                        c6109p.f47955e = 0;
                    } catch (Throwable th2) {
                        int i19 = y1.q.f50332a;
                        y1.p.b();
                        throw th2;
                    }
                }
            }
            c6109p.f47951a = false;
            c6109p.f47952b = 0;
            c6109p.f47953c = 0;
            c6109p.f47954d = null;
            c6109p.f47955e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = y1.q.f50332a;
            y1.p.a("RV Prefetch");
            ArrayList arrayList = this.f47958Y;
            if (arrayList.isEmpty()) {
                this.f47959Z = 0L;
                y1.p.b();
                return;
            }
            int size = arrayList.size();
            long j6 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j6 = Math.max(recyclerView.getDrawingTime(), j6);
                }
            }
            if (j6 == 0) {
                this.f47959Z = 0L;
                y1.p.b();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j6) + this.f47960h0);
            this.f47959Z = 0L;
            y1.p.b();
        } catch (Throwable th2) {
            this.f47959Z = 0L;
            int i12 = y1.q.f50332a;
            y1.p.b();
            throw th2;
        }
    }
}
