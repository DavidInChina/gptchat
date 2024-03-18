package lg;

import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.r0;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: lg.G  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4449G extends AbstractList implements RandomAccess, v {

    /* renamed from: Y  reason: collision with root package name */
    public final v f38348Y;

    public C4449G(v vVar) {
        this.f38348Y = vVar;
    }

    @Override // lg.v
    public final AbstractC4460e G0(int i10) {
        return this.f38348Y.G0(i10);
    }

    @Override // lg.v
    public final List d() {
        return this.f38348Y.d();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f38348Y.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new r0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new q0(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38348Y.size();
    }

    @Override // lg.v
    public final void w(w wVar) {
        throw new UnsupportedOperationException();
    }

    @Override // lg.v
    public final C4449G e() {
        return this;
    }
}
