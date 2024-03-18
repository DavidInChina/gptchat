package j0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: j0.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3881F {

    /* renamed from: Y  reason: collision with root package name */
    public final x f35848Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Iterator f35849Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f35850h0;

    /* renamed from: i0  reason: collision with root package name */
    public Map.Entry f35851i0;

    /* renamed from: j0  reason: collision with root package name */
    public Map.Entry f35852j0;

    public AbstractC3881F(x xVar, Iterator it) {
        this.f35848Y = xVar;
        this.f35849Z = it;
        this.f35850h0 = xVar.a().f35936d;
        a();
    }

    public final void a() {
        Map.Entry entry;
        this.f35851i0 = this.f35852j0;
        Iterator it = this.f35849Z;
        if (it.hasNext()) {
            entry = (Map.Entry) it.next();
        } else {
            entry = null;
        }
        this.f35852j0 = entry;
    }

    public final boolean hasNext() {
        if (this.f35852j0 != null) {
            return true;
        }
        return false;
    }

    public final void remove() {
        x xVar = this.f35848Y;
        if (xVar.a().f35936d == this.f35850h0) {
            Map.Entry entry = this.f35851i0;
            if (entry != null) {
                xVar.remove(entry.getKey());
                this.f35851i0 = null;
                this.f35850h0 = xVar.a().f35936d;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
