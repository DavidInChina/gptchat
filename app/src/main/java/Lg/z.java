package lg;

import androidx.datastore.preferences.protobuf.r0;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class z implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public final r0 f38420Y;

    /* renamed from: Z  reason: collision with root package name */
    public C4458c f38421Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f38422h0;

    public z(C4443A c4443a) {
        r0 r0Var = new r0(c4443a, 0);
        this.f38420Y = r0Var;
        w b10 = r0Var.b();
        b10.getClass();
        this.f38421Z = new C4458c(b10, 0);
        this.f38422h0 = c4443a.f38331Z;
    }

    public final byte a() {
        if (!this.f38421Z.hasNext()) {
            w b10 = this.f38420Y.b();
            b10.getClass();
            this.f38421Z = new C4458c(b10, 0);
        }
        this.f38422h0--;
        return this.f38421Z.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f38422h0 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
