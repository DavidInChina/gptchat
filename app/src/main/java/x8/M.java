package x8;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class M extends N {

    /* renamed from: h0  reason: collision with root package name */
    public final transient int f49520h0;

    /* renamed from: i0  reason: collision with root package name */
    public final transient int f49521i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ N f49522j0;

    public M(N n10, int i10, int i11) {
        this.f49522j0 = n10;
        this.f49520h0 = i10;
        this.f49521i0 = i11;
    }

    @Override // x8.N
    /* renamed from: D0 */
    public final N subList(int i10, int i11) {
        P4.a.v(i10, i11, this.f49521i0);
        int i12 = this.f49520h0;
        return this.f49522j0.subList(i10 + i12, i11 + i12);
    }

    @Override // x8.I
    public final int I() {
        return this.f49522j0.I() + this.f49520h0;
    }

    @Override // x8.I
    public final boolean M() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        P4.a.r(i10, this.f49521i0);
        return this.f49522j0.get(i10 + this.f49520h0);
    }

    @Override // x8.N, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // x8.N, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // x8.I
    public final Object[] s() {
        return this.f49522j0.s();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49521i0;
    }

    @Override // x8.I
    public final int y() {
        return this.f49522j0.I() + this.f49520h0 + this.f49521i0;
    }

    @Override // x8.N, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
