package w;

import b0.C2099c;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jf.C3966p;
import jf.C3968r;
import jf.C3970t;
import kf.AbstractC4280e;
import xf.AbstractC6438a;

/* renamed from: w.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6053E implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f47568Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f47569Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f47570h0;

    public /* synthetic */ C6053E(int i10, Object obj) {
        this.f47568Y = i10;
        this.f47570h0 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f47568Y;
        Object obj = this.f47570h0;
        switch (i10) {
            case 0:
                if (this.f47569Z >= ((C6050B) obj).f()) {
                    return false;
                }
                return true;
            case 1:
                if (this.f47569Z >= ((C2099c) obj).f25558Y) {
                    return false;
                }
                return true;
            case 2:
                if (this.f47569Z >= ((byte[]) obj).length) {
                    return false;
                }
                return true;
            case 3:
                if (this.f47569Z >= ((int[]) obj).length) {
                    return false;
                }
                return true;
            case 4:
                if (this.f47569Z >= ((long[]) obj).length) {
                    return false;
                }
                return true;
            case 5:
                if (this.f47569Z >= ((short[]) obj).length) {
                    return false;
                }
                return true;
            case 6:
                if (this.f47569Z >= ((AbstractC4280e) obj).r()) {
                    return false;
                }
                return true;
            default:
                if (this.f47569Z >= ((Object[]) obj).length) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f47568Y;
        Object obj = this.f47570h0;
        switch (i10) {
            case 0:
                int i11 = this.f47569Z;
                this.f47569Z = i11 + 1;
                return ((C6050B) obj).g(i11);
            case 1:
                Object[] objArr = ((C2099c) obj).f25559Z;
                int i12 = this.f47569Z;
                this.f47569Z = i12 + 1;
                Object obj2 = objArr[i12];
                AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj2);
                return obj2;
            case 2:
                int i13 = this.f47569Z;
                byte[] bArr = (byte[]) obj;
                if (i13 < bArr.length) {
                    this.f47569Z = i13 + 1;
                    return new C3966p(bArr[i13]);
                }
                throw new NoSuchElementException(String.valueOf(this.f47569Z));
            case 3:
                int i14 = this.f47569Z;
                int[] iArr = (int[]) obj;
                if (i14 < iArr.length) {
                    this.f47569Z = i14 + 1;
                    return new C3968r(iArr[i14]);
                }
                throw new NoSuchElementException(String.valueOf(this.f47569Z));
            case 4:
                int i15 = this.f47569Z;
                long[] jArr = (long[]) obj;
                if (i15 < jArr.length) {
                    this.f47569Z = i15 + 1;
                    return new C3970t(jArr[i15]);
                }
                throw new NoSuchElementException(String.valueOf(this.f47569Z));
            case 5:
                int i16 = this.f47569Z;
                short[] sArr = (short[]) obj;
                if (i16 < sArr.length) {
                    this.f47569Z = i16 + 1;
                    return new jf.w(sArr[i16]);
                }
                throw new NoSuchElementException(String.valueOf(this.f47569Z));
            case 6:
                if (hasNext()) {
                    int i17 = this.f47569Z;
                    this.f47569Z = i17 + 1;
                    return ((AbstractC4280e) obj).get(i17);
                }
                throw new NoSuchElementException();
            default:
                try {
                    int i18 = this.f47569Z;
                    this.f47569Z = i18 + 1;
                    return ((Object[]) obj)[i18];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f47569Z--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f47568Y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6053E(Object[] objArr) {
        this.f47568Y = 7;
        AbstractC3557B.c0("array", objArr);
        this.f47570h0 = objArr;
    }

    public C6053E(byte[] bArr) {
        this.f47568Y = 2;
        AbstractC3557B.c0("array", bArr);
        this.f47570h0 = bArr;
    }

    public C6053E(int[] iArr) {
        this.f47568Y = 3;
        AbstractC3557B.c0("array", iArr);
        this.f47570h0 = iArr;
    }

    public C6053E(long[] jArr) {
        this.f47568Y = 4;
        AbstractC3557B.c0("array", jArr);
        this.f47570h0 = jArr;
    }

    public C6053E(short[] sArr) {
        this.f47568Y = 5;
        AbstractC3557B.c0("array", sArr);
        this.f47570h0 = sArr;
    }
}
