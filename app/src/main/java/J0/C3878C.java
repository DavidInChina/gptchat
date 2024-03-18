package j0;

import G0.C0593w;
import id.AbstractC3557B;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import l0.AbstractC4325q;
import lf.C4436a;
import xf.AbstractC6438a;

/* renamed from: j0.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3878C implements ListIterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f35839Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f35840Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f35841h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f35842i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Object f35843j0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3878C(C0593w c0593w, int i10, int i11) {
        this(c0593w, (i11 & 1) != 0 ? 0 : i10, 0, c0593w.f5837i0);
        this.f35839Y = 1;
    }

    public final void a() {
        int i10;
        i10 = ((AbstractList) ((C4436a) this.f35843j0)).modCount;
        if (i10 == this.f35842i0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i10;
        Object obj2 = this.f35843j0;
        switch (this.f35839Y) {
            case 0:
                b();
                u uVar = (u) obj2;
                uVar.add(this.f35840Z + 1, obj);
                this.f35841h0 = -1;
                this.f35840Z++;
                this.f35842i0 = uVar.M();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                a();
                C4436a c4436a = (C4436a) obj2;
                int i11 = this.f35840Z;
                this.f35840Z = i11 + 1;
                c4436a.add(i11, obj);
                this.f35841h0 = -1;
                i10 = ((AbstractList) c4436a).modCount;
                this.f35842i0 = i10;
                return;
        }
    }

    public final void b() {
        if (((u) this.f35843j0).M() == this.f35842i0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        Object obj = this.f35843j0;
        switch (this.f35839Y) {
            case 0:
                if (this.f35840Z >= ((u) obj).size() - 1) {
                    return false;
                }
                return true;
            case 1:
                if (this.f35840Z >= this.f35842i0) {
                    return false;
                }
                return true;
            default:
                if (this.f35840Z >= ((C4436a) obj).f38304h0) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f35839Y) {
            case 0:
                if (this.f35840Z < 0) {
                    return false;
                }
                return true;
            case 1:
                if (this.f35840Z <= this.f35841h0) {
                    return false;
                }
                return true;
            default:
                if (this.f35840Z <= 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        Object obj = this.f35843j0;
        switch (this.f35839Y) {
            case 0:
                b();
                int i10 = this.f35840Z + 1;
                this.f35841h0 = i10;
                u uVar = (u) obj;
                v.a(i10, uVar.size());
                Object obj2 = uVar.get(i10);
                this.f35840Z = i10;
                return obj2;
            case 1:
                Object[] objArr = ((C0593w) obj).f5834Y;
                int i11 = this.f35840Z;
                this.f35840Z = i11 + 1;
                Object obj3 = objArr[i11];
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj3);
                return (AbstractC4325q) obj3;
            default:
                a();
                int i12 = this.f35840Z;
                C4436a c4436a = (C4436a) obj;
                if (i12 < c4436a.f38304h0) {
                    this.f35840Z = i12 + 1;
                    this.f35841h0 = i12;
                    return c4436a.f38302Y[c4436a.f38303Z + i12];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f35839Y) {
            case 0:
                return this.f35840Z + 1;
            case 1:
                return this.f35840Z - this.f35841h0;
            default:
                return this.f35840Z;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Object obj = this.f35843j0;
        switch (this.f35839Y) {
            case 0:
                b();
                u uVar = (u) obj;
                v.a(this.f35840Z, uVar.size());
                int i10 = this.f35840Z;
                this.f35841h0 = i10;
                this.f35840Z--;
                return uVar.get(i10);
            case 1:
                Object[] objArr = ((C0593w) obj).f5834Y;
                int i11 = this.f35840Z - 1;
                this.f35840Z = i11;
                Object obj2 = objArr[i11];
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj2);
                return (AbstractC4325q) obj2;
            default:
                a();
                int i12 = this.f35840Z;
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    this.f35840Z = i13;
                    this.f35841h0 = i13;
                    C4436a c4436a = (C4436a) obj;
                    return c4436a.f38302Y[c4436a.f38303Z + i13];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f35839Y) {
            case 0:
                return this.f35840Z;
            case 1:
                return (this.f35840Z - this.f35841h0) - 1;
            default:
                return this.f35840Z - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10;
        Object obj = this.f35843j0;
        switch (this.f35839Y) {
            case 0:
                b();
                u uVar = (u) obj;
                uVar.remove(this.f35840Z);
                this.f35840Z--;
                this.f35841h0 = -1;
                this.f35842i0 = uVar.M();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                a();
                int i11 = this.f35841h0;
                if (i11 != -1) {
                    C4436a c4436a = (C4436a) obj;
                    c4436a.s(i11);
                    this.f35840Z = this.f35841h0;
                    this.f35841h0 = -1;
                    i10 = ((AbstractList) c4436a).modCount;
                    this.f35842i0 = i10;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        Object obj2 = this.f35843j0;
        switch (this.f35839Y) {
            case 0:
                b();
                int i10 = this.f35841h0;
                if (i10 >= 0) {
                    u uVar = (u) obj2;
                    uVar.set(i10, obj);
                    this.f35842i0 = uVar.M();
                    return;
                }
                Object obj3 = v.f35934a;
                throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString());
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                a();
                int i11 = this.f35841h0;
                if (i11 != -1) {
                    ((C4436a) obj2).set(i11, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public C3878C(C0593w c0593w, int i10, int i11, int i12) {
        this.f35839Y = 1;
        this.f35843j0 = c0593w;
        this.f35840Z = i10;
        this.f35841h0 = i11;
        this.f35842i0 = i12;
    }

    public C3878C(u uVar, int i10) {
        this.f35839Y = 0;
        this.f35843j0 = uVar;
        this.f35840Z = i10 - 1;
        this.f35841h0 = -1;
        this.f35842i0 = uVar.M();
    }

    public C3878C(C4436a c4436a, int i10) {
        int i11;
        this.f35839Y = 2;
        AbstractC3557B.c0("list", c4436a);
        this.f35843j0 = c4436a;
        this.f35840Z = i10;
        this.f35841h0 = -1;
        i11 = ((AbstractList) c4436a).modCount;
        this.f35842i0 = i11;
    }
}
