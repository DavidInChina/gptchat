package Q6;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import ff.AbstractC3029a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class a implements ff.b {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal f14436e = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f14437a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f14438b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final int f14439c;

    /* renamed from: d  reason: collision with root package name */
    public final O6.b f14440d;

    public a(int i10, O6.b bVar) {
        this.f14439c = i10;
        this.f14440d = bVar;
    }

    public final AbstractC3029a a() {
        synchronized (this.f14437a) {
            Iterator it = this.f14437a.iterator();
            if (it.hasNext()) {
                AbstractC2469q0.p(it.next());
                throw null;
            }
        }
        return (AbstractC3029a) f14436e.get();
    }

    public final ff.c b() {
        synchronized (this.f14437a) {
            Iterator it = this.f14437a.iterator();
            if (it.hasNext()) {
                AbstractC2469q0.p(it.next());
                throw null;
            }
        }
        c cVar = (c) f14436e.get();
        if (cVar == null) {
            return null;
        }
        return cVar.r0();
    }
}
