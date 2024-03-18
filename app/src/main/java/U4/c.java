package U4;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f17496a;

    /* renamed from: b  reason: collision with root package name */
    public int f17497b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f17498c = null;

    public c(byte[] bArr) {
        this.f17496a = bArr;
    }

    public final void a(int i10) {
        int i11 = i10 - 1;
        if (i10 >= 0 && (i10 & i11) == 0) {
            int i12 = this.f17497b;
            int i13 = (~i11) & (i12 + i11);
            byte[] bArr = this.f17496a;
            if (i13 <= bArr.length) {
                Arrays.fill(bArr, i12, i13, (byte) 0);
                this.f17497b = i13;
                return;
            }
            throw new IndexOutOfBoundsException("attempt to write past the end");
        }
        throw new IllegalArgumentException("bogus alignment");
    }

    public final void b(int i10, String str) {
        int i11;
        int size;
        ArrayList arrayList = this.f17498c;
        if (arrayList == null) {
            return;
        }
        if (arrayList != null && (size = arrayList.size()) != 0) {
            b bVar = (b) this.f17498c.get(size - 1);
            int i12 = this.f17497b;
            if (bVar.f17495a == Integer.MAX_VALUE) {
                bVar.f17495a = i12;
            }
        }
        int size2 = this.f17498c.size();
        if (size2 == 0) {
            i11 = 0;
        } else {
            i11 = ((b) this.f17498c.get(size2 - 1)).f17495a;
        }
        int i13 = this.f17497b;
        if (i11 <= i13) {
            i11 = i13;
        }
        this.f17498c.add(new b(i11, i10 + i11, str));
    }

    public final boolean c() {
        if (this.f17498c != null) {
            return true;
        }
        return false;
    }

    public final void d(int i10) {
        int i11 = this.f17497b;
        int i12 = i11 + 4;
        byte[] bArr = this.f17496a;
        if (i12 <= bArr.length) {
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f17497b = i12;
            return;
        }
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    public final void e(int i10) {
        int i11 = this.f17497b;
        int i12 = i11 + 2;
        byte[] bArr = this.f17496a;
        if (i12 <= bArr.length) {
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            this.f17497b = i12;
            return;
        }
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    public final void f(int i10) {
        if (i10 >= 0) {
            int i11 = this.f17497b;
            int i12 = i10 + i11;
            byte[] bArr = this.f17496a;
            if (i12 <= bArr.length) {
                Arrays.fill(bArr, i11, i12, (byte) 0);
                this.f17497b = i12;
                return;
            }
            throw new IndexOutOfBoundsException("attempt to write past the end");
        }
        throw new IllegalArgumentException("count < 0");
    }
}
