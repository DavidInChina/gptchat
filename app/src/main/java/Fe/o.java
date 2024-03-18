package Fe;

import java.util.Iterator;
import xf.AbstractC6438a;

/* loaded from: classes2.dex */
public final class o implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5338Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final Iterator f5339Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f5340h0;

    public o(p pVar) {
        this.f5340h0 = pVar;
        this.f5339Z = pVar.f5341Y.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f5338Y;
        Iterator it = this.f5339Z;
        switch (i10) {
            case 0:
                return it.hasNext();
            default:
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f5338Y;
        Iterator it = this.f5339Z;
        Object obj = this.f5340h0;
        switch (i10) {
            case 0:
                return ((p) obj).f5342Z.invoke(it.next());
            default:
                return ((Kg.s) obj).f9851b.invoke(it.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5338Y) {
            case 0:
                this.f5339Z.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o(Kg.s sVar) {
        this.f5340h0 = sVar;
        this.f5339Z = sVar.f9850a.iterator();
    }
}
