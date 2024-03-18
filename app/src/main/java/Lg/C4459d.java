package lg;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: lg.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4459d extends OutputStream {

    /* renamed from: k0  reason: collision with root package name */
    public static final byte[] f38372k0 = new byte[0];

    /* renamed from: h0  reason: collision with root package name */
    public int f38375h0;

    /* renamed from: j0  reason: collision with root package name */
    public int f38377j0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f38373Y = 128;

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f38374Z = new ArrayList();

    /* renamed from: i0  reason: collision with root package name */
    public byte[] f38376i0 = new byte[128];

    public final void a(int i10) {
        this.f38374Z.add(new w(this.f38376i0));
        int length = this.f38375h0 + this.f38376i0.length;
        this.f38375h0 = length;
        this.f38376i0 = new byte[Math.max(this.f38373Y, Math.max(i10, length >>> 1))];
        this.f38377j0 = 0;
    }

    public final void h() {
        int i10 = this.f38377j0;
        byte[] bArr = this.f38376i0;
        int length = bArr.length;
        ArrayList arrayList = this.f38374Z;
        if (i10 < length) {
            if (i10 > 0) {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
                arrayList.add(new w(bArr2));
            }
        } else {
            arrayList.add(new w(this.f38376i0));
            this.f38376i0 = f38372k0;
        }
        this.f38375h0 += this.f38377j0;
        this.f38377j0 = 0;
    }

    public final synchronized AbstractC4460e i() {
        AbstractC4460e abstractC4460e;
        h();
        ArrayList arrayList = this.f38374Z;
        if (!(arrayList instanceof Collection)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC4460e) it.next());
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            abstractC4460e = AbstractC4460e.f38378Y;
        } else {
            abstractC4460e = AbstractC4460e.f(arrayList.iterator(), arrayList.size());
        }
        return abstractC4460e;
    }

    public final String toString() {
        int i10;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i10 = this.f38375h0 + this.f38377j0;
        }
        objArr[1] = Integer.valueOf(i10);
        return String.format("<ByteString.Output@%s size=%d>", objArr);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        try {
            if (this.f38377j0 == this.f38376i0.length) {
                a(1);
            }
            byte[] bArr = this.f38376i0;
            int i11 = this.f38377j0;
            this.f38377j0 = i11 + 1;
            bArr[i11] = (byte) i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        try {
            byte[] bArr2 = this.f38376i0;
            int length = bArr2.length;
            int i12 = this.f38377j0;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f38377j0 += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                a(i13);
                System.arraycopy(bArr, i10 + length2, this.f38376i0, 0, i13);
                this.f38377j0 = i13;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
