package Kg;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jf.y;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4832l;
import of.EnumC5000a;
import xf.AbstractC6438a;

/* loaded from: classes2.dex */
public final class l implements Iterator, AbstractC4825e, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public int f9838Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f9839Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC4825e f9840h0;

    public final RuntimeException b() {
        int i10 = this.f9838Y;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f9838Y);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void c(Object obj, AbstractC4825e abstractC4825e) {
        this.f9839Z = obj;
        this.f9838Y = 3;
        this.f9840h0 = abstractC4825e;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.k0(abstractC4825e);
    }

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        return C4832l.f40334Y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f9838Y;
            if (i10 != 0) {
                break;
            }
            this.f9838Y = 5;
            AbstractC4825e abstractC4825e = this.f9840h0;
            AbstractC3557B.Z(abstractC4825e);
            this.f9840h0 = null;
            abstractC4825e.resumeWith(y.f36177a);
        }
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            throw b();
        }
        AbstractC3557B.Z(null);
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f9838Y;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f9838Y = 0;
                    Object obj = this.f9839Z;
                    this.f9839Z = null;
                    return obj;
                }
                throw b();
            }
            this.f9838Y = 1;
            AbstractC3557B.Z(null);
            throw null;
        } else if (hasNext()) {
            return next();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        N.B0(obj);
        this.f9838Y = 4;
    }
}
