package w;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: w.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6057d implements Iterator, Map.Entry {

    /* renamed from: Y  reason: collision with root package name */
    public int f47576Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f47577Z = -1;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f47578h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C6059f f47579i0;

    public C6057d(C6059f c6059f) {
        this.f47579i0 = c6059f;
        this.f47576Y = c6059f.f47560h0 - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.f47578h0) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i10 = this.f47577Z;
            C6059f c6059f = this.f47579i0;
            if (!AbstractC3557B.K(key, c6059f.g(i10)) || !AbstractC3557B.K(entry.getValue(), c6059f.j(this.f47577Z))) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f47578h0) {
            return this.f47579i0.g(this.f47577Z);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f47578h0) {
            return this.f47579i0.j(this.f47577Z);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f47577Z < this.f47576Y) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i10;
        if (this.f47578h0) {
            int i11 = this.f47577Z;
            C6059f c6059f = this.f47579i0;
            Object g10 = c6059f.g(i11);
            Object j6 = c6059f.j(this.f47577Z);
            int i12 = 0;
            if (g10 == null) {
                i10 = 0;
            } else {
                i10 = g10.hashCode();
            }
            if (j6 != null) {
                i12 = j6.hashCode();
            }
            return i10 ^ i12;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f47577Z++;
            this.f47578h0 = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f47578h0) {
            this.f47579i0.h(this.f47577Z);
            this.f47577Z--;
            this.f47576Y--;
            this.f47578h0 = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f47578h0) {
            return this.f47579i0.i(this.f47577Z, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + Separators.EQUALS + getValue();
    }
}
