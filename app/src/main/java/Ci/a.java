package Ci;

import io.sentry.android.core.z;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class a implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public final CharSequence f3163Y;

    /* renamed from: Z  reason: collision with root package name */
    public Di.a f3164Z = null;

    /* renamed from: h0  reason: collision with root package name */
    public int f3165h0 = 0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3166i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ z f3167j0;

    public a(z zVar, CharSequence charSequence) {
        this.f3167j0 = zVar;
        this.f3163Y = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Di.b bVar;
        if (this.f3164Z == null) {
            CharSequence charSequence = this.f3163Y;
            int length = charSequence.length();
            while (true) {
                int i10 = this.f3165h0;
                if (i10 >= length) {
                    break;
                }
                char charAt = charSequence.charAt(i10);
                z zVar = this.f3167j0;
                if (charAt != ':') {
                    if (charAt != '@') {
                        if (charAt != 'w') {
                            zVar.getClass();
                            bVar = null;
                        } else {
                            bVar = (Di.b) zVar.f34264Z;
                        }
                    } else {
                        bVar = (Di.b) zVar.f34265h0;
                    }
                } else {
                    bVar = (Di.b) zVar.f34263Y;
                }
                if (bVar != null) {
                    Di.a b10 = bVar.b(this.f3165h0, this.f3166i0, charSequence);
                    if (b10 != null) {
                        this.f3164Z = b10;
                        int i11 = b10.f3730c;
                        this.f3165h0 = i11;
                        this.f3166i0 = i11;
                        break;
                    }
                    this.f3165h0++;
                } else {
                    this.f3165h0++;
                }
            }
        }
        if (this.f3164Z != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Di.a aVar = this.f3164Z;
            this.f3164Z = null;
            return aVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
