package lg;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: lg.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4458c implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38368Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f38369Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f38370h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ w f38371i0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4458c(w wVar, int i10) {
        this(wVar);
        this.f38368Y = 1;
    }

    public final byte a() {
        int i10 = this.f38368Y;
        w wVar = this.f38371i0;
        switch (i10) {
            case 0:
                if (this.f38369Z < this.f38370h0) {
                    AbstractC2469q0.p(wVar);
                    throw null;
                }
                throw new NoSuchElementException();
            default:
                try {
                    byte[] bArr = wVar.f38418Z;
                    int i11 = this.f38369Z;
                    this.f38369Z = i11 + 1;
                    return bArr[i11];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f38368Y;
        int i11 = this.f38370h0;
        switch (i10) {
            case 0:
                if (this.f38369Z >= i11) {
                    return false;
                }
                return true;
            default:
                if (this.f38369Z >= i11) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f38368Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Byte.valueOf(a());
                    default:
                        return Byte.valueOf(a());
                }
            default:
                switch (i10) {
                    case 0:
                        return Byte.valueOf(a());
                    default:
                        return Byte.valueOf(a());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f38368Y) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C4458c(w wVar) {
        this.f38368Y = 1;
        this.f38371i0 = wVar;
        this.f38369Z = 0;
        this.f38370h0 = wVar.size();
    }
}
