package x8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import z.AbstractC6708l;

/* renamed from: x8.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6358b extends com.google.android.gms.internal.play_billing.C {

    /* renamed from: Z  reason: collision with root package name */
    public int f49543Z = 2;

    /* renamed from: h0  reason: collision with root package name */
    public Object f49544h0;

    public AbstractC6358b() {
        super(1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i10 = this.f49543Z;
        if (i10 != 4) {
            int f6 = AbstractC6708l.f(i10);
            if (f6 == 0) {
                return true;
            }
            if (f6 == 2) {
                return false;
            }
            this.f49543Z = 4;
            T t10 = (T) this;
            int i11 = t10.f49532i0;
            Object obj = null;
            Object obj2 = t10.f49534k0;
            Iterator it = t10.f49533j0;
            switch (i11) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((w8.g) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    t10.f49543Z = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((t0) obj2).f49615h0.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    t10.f49543Z = 3;
                    break;
            }
            this.f49544h0 = obj;
            if (this.f49543Z == 3) {
                return false;
            }
            this.f49543Z = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f49543Z = 2;
            Object obj = this.f49544h0;
            this.f49544h0 = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
