package v0;

import com.google.android.gms.internal.play_billing.N;
import java.util.Iterator;
import xf.AbstractC6438a;

/* renamed from: v0.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5942F implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46858Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final Iterator f46859Z;

    public C5942F(Object[] objArr) {
        this.f46859Z = N.f0(objArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f46858Y;
        Iterator it = this.f46859Z;
        switch (i10) {
            case 0:
                return it.hasNext();
            default:
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f46858Y;
        Iterator it = this.f46859Z;
        switch (i10) {
            case 0:
                return (AbstractC5945I) it.next();
            default:
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f46858Y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C5942F(C5943G c5943g) {
        this.f46859Z = c5943g.f46869o0.iterator();
    }
}
