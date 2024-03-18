package Kg;

import ah.AbstractC1991b;
import eh.AbstractC2904d;
import fh.C3067J;
import fh.C3068K;
import fh.EnumC3073P;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import xf.AbstractC6438a;

/* loaded from: classes2.dex */
public final class g implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9824Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f9825Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f9826h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f9827i0;

    public g(AbstractC2904d abstractC2904d, C3067J c3067j, KSerializer kSerializer) {
        this.f9825Z = abstractC2904d;
        this.f9826h0 = c3067j;
        this.f9827i0 = kSerializer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        Iterator it = (Iterator) this.f9826h0;
        if (it != null && !it.hasNext()) {
            this.f9826h0 = null;
        }
        while (true) {
            if (((Iterator) this.f9826h0) != null) {
                break;
            }
            Object obj = this.f9825Z;
            if (!((Iterator) obj).hasNext()) {
                return false;
            }
            Object next = ((Iterator) obj).next();
            Object obj2 = this.f9827i0;
            Iterator it2 = (Iterator) ((h) obj2).f9830c.invoke(((h) obj2).f9829b.invoke(next));
            if (it2.hasNext()) {
                this.f9826h0 = it2;
                break;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9824Y) {
            case 0:
                return a();
            default:
                if (((C3067J) this.f9826h0).w() != 10) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9824Y) {
            case 0:
                if (a()) {
                    Iterator it = (Iterator) this.f9826h0;
                    AbstractC3557B.Z(it);
                    return it.next();
                }
                throw new NoSuchElementException();
            default:
                AbstractC2904d abstractC2904d = (AbstractC2904d) this.f9825Z;
                EnumC3073P enumC3073P = EnumC3073P.f30847h0;
                C3067J c3067j = (C3067J) this.f9826h0;
                AbstractC1991b abstractC1991b = (AbstractC1991b) this.f9827i0;
                return new C3068K(abstractC2904d, enumC3073P, c3067j, abstractC1991b.getDescriptor(), null).g(abstractC1991b);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9824Y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(h hVar) {
        this.f9827i0 = hVar;
        this.f9825Z = hVar.f9828a.iterator();
    }
}
