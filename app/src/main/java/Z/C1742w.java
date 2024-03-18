package Z;

import android.os.Trace;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import w.C6074u;

/* renamed from: Z.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1742w {

    /* renamed from: a  reason: collision with root package name */
    public final Set f22743a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f22744b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f22745c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f22746d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public C6074u f22747e;

    public C1742w(HashSet hashSet) {
        this.f22743a = hashSet;
    }

    public final void a() {
        Set set = this.f22743a;
        if (!set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((G0) it.next()).a();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f22745c;
        boolean z10 = !arrayList.isEmpty();
        Set set = this.f22743a;
        if (z10) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C6074u c6074u = this.f22747e;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(size);
                    Ad.l.H(set).remove(obj);
                    if (obj instanceof G0) {
                        ((G0) obj).c();
                    }
                    if (obj instanceof AbstractC1719k) {
                        if (c6074u != null && c6074u.a(obj)) {
                            ((AbstractC1719k) obj).a();
                        } else {
                            ((AbstractC1719k) obj).b();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList2 = this.f22744b;
        if (!arrayList2.isEmpty()) {
            Trace.beginSection("Compose:onRemembered");
            try {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    G0 g02 = (G0) arrayList2.get(i10);
                    set.remove(g02);
                    g02.d();
                }
            } finally {
                Trace.endSection();
            }
        }
    }
}
