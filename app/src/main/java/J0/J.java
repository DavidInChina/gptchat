package j0;

import java.util.List;
import java.util.ListIterator;
import kf.C4269E;
import kf.C4270F;
import l8.AbstractC4344b;
import xf.AbstractC6438a;

/* loaded from: classes.dex */
public final class J implements ListIterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f35856Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f35857Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f35858h0;

    public J(C4270F c4270f, int i10) {
        this.f35858h0 = c4270f;
        this.f35857Z = ((List) c4270f.f37442Z).listIterator(kf.s.M1(i10, c4270f));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f35856Y) {
            case 0:
                Object obj2 = v.f35934a;
                throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
            case 1:
                ListIterator listIterator = (ListIterator) this.f35857Z;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f35856Y;
        Object obj = this.f35857Z;
        switch (i10) {
            case 0:
                if (((kotlin.jvm.internal.z) obj).f37647Y < ((K) this.f35858h0).f35862i0 - 1) {
                    return true;
                }
                return false;
            case 1:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((ListIterator) obj).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i10 = this.f35856Y;
        Object obj = this.f35857Z;
        switch (i10) {
            case 0:
                if (((kotlin.jvm.internal.z) obj).f37647Y >= 0) {
                    return true;
                }
                return false;
            case 1:
                return ((ListIterator) obj).hasNext();
            default:
                return ((ListIterator) obj).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f35856Y;
        Object obj = this.f35857Z;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) obj;
                int i11 = zVar.f37647Y + 1;
                K k10 = (K) this.f35858h0;
                v.a(i11, k10.f35862i0);
                zVar.f37647Y = i11;
                return k10.get(i11);
            case 1:
                return ((ListIterator) obj).previous();
            default:
                return ((ListIterator) obj).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        Object obj = this.f35858h0;
        int i10 = this.f35856Y;
        Object obj2 = this.f35857Z;
        switch (i10) {
            case 0:
                return ((kotlin.jvm.internal.z) obj2).f37647Y + 1;
            case 1:
                return AbstractC4344b.u0((C4269E) obj) - ((ListIterator) obj2).previousIndex();
            default:
                return AbstractC4344b.u0((C4270F) obj) - ((ListIterator) obj2).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f35856Y;
        Object obj = this.f35857Z;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) obj;
                int i11 = zVar.f37647Y;
                K k10 = (K) this.f35858h0;
                v.a(i11, k10.f35862i0);
                zVar.f37647Y = i11 - 1;
                return k10.get(i11);
            case 1:
                return ((ListIterator) obj).next();
            default:
                return ((ListIterator) obj).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        Object obj = this.f35858h0;
        int i10 = this.f35856Y;
        Object obj2 = this.f35857Z;
        switch (i10) {
            case 0:
                return ((kotlin.jvm.internal.z) obj2).f37647Y;
            case 1:
                return AbstractC4344b.u0((C4269E) obj) - ((ListIterator) obj2).nextIndex();
            default:
                return AbstractC4344b.u0((C4270F) obj) - ((ListIterator) obj2).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f35856Y) {
            case 0:
                Object obj = v.f35934a;
                throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
            case 1:
                ((ListIterator) this.f35857Z).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f35856Y) {
            case 0:
                Object obj2 = v.f35934a;
                throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
            case 1:
                ((ListIterator) this.f35857Z).set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public J(C4269E c4269e, int i10) {
        this.f35858h0 = c4269e;
        this.f35857Z = c4269e.f37440Y.listIterator(kf.s.M1(i10, c4269e));
    }

    public J(kotlin.jvm.internal.z zVar, K k10) {
        this.f35857Z = zVar;
        this.f35858h0 = k10;
    }
}
