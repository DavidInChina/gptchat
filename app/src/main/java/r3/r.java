package r3;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f44425a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f44426b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f44427c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f44428d = new ArrayList();

    public r() {
        new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            ArrayList arrayList2 = this.f44427c;
            if (arrayList2.size() > 0) {
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f44428d;
                    if (i10 < size2) {
                        if (!arrayList3.contains(Integer.valueOf(i10))) {
                            AbstractC2469q0.p(arrayList2.get(i10));
                            int i11 = i10 + 1;
                            if (i11 < arrayList2.size()) {
                                AbstractC2469q0.p(arrayList2.get(i11));
                                throw null;
                            }
                        }
                        i10++;
                    } else {
                        for (int size3 = arrayList3.size() - 1; -1 < size3; size3--) {
                            arrayList2.remove(((Number) arrayList3.get(size3)).intValue());
                        }
                        if (arrayList2.size() <= 0) {
                            arrayList2.clear();
                            arrayList3.clear();
                            return;
                        }
                        AbstractC2469q0.p(arrayList2.get(0));
                        throw null;
                    }
                }
            }
        } else {
            AbstractC2469q0.p(arrayList.get(size));
            throw null;
        }
    }

    public final void b() {
        synchronized (this.f44426b) {
            int size = this.f44426b.size() - 1;
            if (-1 < size) {
                AbstractC2469q0.p(this.f44426b.get(size));
                throw null;
            }
        }
    }

    public final void c(long j6, long j10, ArrayList arrayList) {
        AbstractC3557B.c0("frameStates", arrayList);
        synchronized (this.f44426b) {
            arrayList.clear();
            a(this.f44425a);
            a(this.f44426b);
        }
    }
}
