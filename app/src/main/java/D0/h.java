package d0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends AbstractC2563a {

    /* renamed from: h0  reason: collision with root package name */
    public final f f27835h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f27836i0;

    /* renamed from: j0  reason: collision with root package name */
    public k f27837j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f27838k0 = -1;

    public h(f fVar, int i10) {
        super(i10, fVar.r());
        this.f27835h0 = fVar;
        this.f27836i0 = fVar.M();
        b();
    }

    public final void a() {
        if (this.f27836i0 == this.f27835h0.M()) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // d0.AbstractC2563a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i10 = this.f27816Y;
        f fVar = this.f27835h0;
        fVar.add(i10, obj);
        this.f27816Y++;
        this.f27817Z = fVar.r();
        this.f27836i0 = fVar.M();
        this.f27838k0 = -1;
        b();
    }

    public final void b() {
        f fVar = this.f27835h0;
        Object[] objArr = fVar.f27830k0;
        if (objArr == null) {
            this.f27837j0 = null;
            return;
        }
        int i10 = (fVar.f27832m0 - 1) & (-32);
        int i11 = this.f27816Y;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (fVar.f27828i0 / 5) + 1;
        k kVar = this.f27837j0;
        if (kVar == null) {
            this.f27837j0 = new k(objArr, i11, i10, i12);
            return;
        }
        kVar.f27816Y = i11;
        kVar.f27817Z = i10;
        kVar.f27842h0 = i12;
        if (kVar.f27843i0.length < i12) {
            kVar.f27843i0 = new Object[i12];
        }
        boolean z10 = false;
        kVar.f27843i0[0] = objArr;
        if (i11 == i10) {
            z10 = true;
        }
        kVar.f27844j0 = z10;
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        kVar.b(i11 - i13, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (hasNext()) {
            int i10 = this.f27816Y;
            this.f27838k0 = i10;
            k kVar = this.f27837j0;
            f fVar = this.f27835h0;
            if (kVar == null) {
                Object[] objArr = fVar.f27831l0;
                this.f27816Y = i10 + 1;
                return objArr[i10];
            } else if (kVar.hasNext()) {
                this.f27816Y++;
                return kVar.next();
            } else {
                Object[] objArr2 = fVar.f27831l0;
                int i11 = this.f27816Y;
                this.f27816Y = i11 + 1;
                return objArr2[i11 - kVar.f27817Z];
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (hasPrevious()) {
            int i10 = this.f27816Y;
            this.f27838k0 = i10 - 1;
            k kVar = this.f27837j0;
            f fVar = this.f27835h0;
            if (kVar == null) {
                Object[] objArr = fVar.f27831l0;
                int i11 = i10 - 1;
                this.f27816Y = i11;
                return objArr[i11];
            }
            int i12 = kVar.f27817Z;
            if (i10 > i12) {
                Object[] objArr2 = fVar.f27831l0;
                int i13 = i10 - 1;
                this.f27816Y = i13;
                return objArr2[i13 - i12];
            }
            this.f27816Y = i10 - 1;
            return kVar.previous();
        }
        throw new NoSuchElementException();
    }

    @Override // d0.AbstractC2563a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f27838k0;
        if (i10 != -1) {
            f fVar = this.f27835h0;
            fVar.s(i10);
            int i11 = this.f27838k0;
            if (i11 < this.f27816Y) {
                this.f27816Y = i11;
            }
            this.f27817Z = fVar.r();
            this.f27836i0 = fVar.M();
            this.f27838k0 = -1;
            b();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // d0.AbstractC2563a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i10 = this.f27838k0;
        if (i10 != -1) {
            f fVar = this.f27835h0;
            fVar.set(i10, obj);
            this.f27836i0 = fVar.M();
            b();
            return;
        }
        throw new IllegalStateException();
    }
}
