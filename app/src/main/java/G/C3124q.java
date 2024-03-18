package g;

import java.util.ArrayList;
import java.util.Iterator;
import wf.AbstractC6216a;

/* renamed from: g.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3124q {

    /* renamed from: b  reason: collision with root package name */
    public boolean f30988b;

    /* renamed from: a  reason: collision with root package name */
    public final Object f30987a = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f30989c = new ArrayList();

    public C3124q(ExecutorC3121n executorC3121n, C3112e c3112e) {
    }

    public final void a() {
        synchronized (this.f30987a) {
            try {
                this.f30988b = true;
                Iterator it = this.f30989c.iterator();
                while (it.hasNext()) {
                    ((AbstractC6216a) it.next()).mo122invoke();
                }
                this.f30989c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
