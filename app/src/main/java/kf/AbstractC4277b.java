package kf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import xf.AbstractC6438a;

/* renamed from: kf.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4277b implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public EnumC4275K f37465Y = EnumC4275K.f37461Z;

    /* renamed from: Z  reason: collision with root package name */
    public Object f37466Z;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        EnumC4275K enumC4275K = this.f37465Y;
        EnumC4275K enumC4275K2 = EnumC4275K.f37463i0;
        if (enumC4275K != enumC4275K2) {
            int ordinal = enumC4275K.ordinal();
            if (ordinal == 0) {
                return true;
            }
            if (ordinal != 2) {
                this.f37465Y = enumC4275K2;
                a();
                if (this.f37465Y == EnumC4275K.f37460Y) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f37465Y = EnumC4275K.f37461Z;
            return this.f37466Z;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
