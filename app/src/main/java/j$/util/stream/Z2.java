package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* loaded from: classes3.dex */
abstract class Z2 extends AbstractC3755e implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    Object f35575e = c(16);

    /* renamed from: f  reason: collision with root package name */
    Object[] f35576f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z2(int i10) {
        super(i10);
    }

    public abstract Object c(int i10);

    @Override // j$.util.stream.AbstractC3755e
    public final void clear() {
        Object[] objArr = this.f35576f;
        if (objArr != null) {
            this.f35575e = objArr[0];
            this.f35576f = null;
            this.f35616d = null;
        }
        this.f35614b = 0;
        this.f35615c = 0;
    }

    public void d(Object obj, int i10) {
        long j6 = i10;
        long count = count() + j6;
        if (count > s(obj) || count < j6) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f35615c == 0) {
            System.arraycopy(this.f35575e, 0, obj, i10, this.f35614b);
            return;
        }
        for (int i11 = 0; i11 < this.f35615c; i11++) {
            Object obj2 = this.f35576f[i11];
            System.arraycopy(obj2, 0, obj, i10, s(obj2));
            i10 += s(this.f35576f[i11]);
        }
        int i12 = this.f35614b;
        if (i12 <= 0) {
            return;
        }
        System.arraycopy(this.f35575e, 0, obj, i10, i12);
    }

    public Object e() {
        long count = count();
        if (count < 2147483639) {
            Object c10 = c((int) count);
            d(c10, 0);
            return c10;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public void f(Object obj) {
        for (int i10 = 0; i10 < this.f35615c; i10++) {
            Object obj2 = this.f35576f[i10];
            r(obj2, 0, s(obj2), obj);
        }
        r(this.f35575e, 0, this.f35614b, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void r(Object obj, int i10, int i11, Object obj2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int s(Object obj);

    /* renamed from: spliterator */
    public abstract Spliterator mo103spliterator();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int t(long j6) {
        if (this.f35615c == 0) {
            if (j6 >= this.f35614b) {
                throw new IndexOutOfBoundsException(Long.toString(j6));
            }
            return 0;
        } else if (j6 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j6));
        } else {
            for (int i10 = 0; i10 <= this.f35615c; i10++) {
                if (j6 < this.f35616d[i10] + s(this.f35576f[i10])) {
                    return i10;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j6));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(long j6) {
        long j10;
        int i10;
        int i11 = this.f35615c;
        if (i11 == 0) {
            j10 = s(this.f35575e);
        } else {
            j10 = s(this.f35576f[i11]) + this.f35616d[i11];
        }
        if (j6 > j10) {
            if (this.f35576f == null) {
                Object[] v10 = v();
                this.f35576f = v10;
                this.f35616d = new long[8];
                v10[0] = this.f35575e;
            }
            int i12 = this.f35615c + 1;
            while (j6 > j10) {
                Object[] objArr = this.f35576f;
                if (i12 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f35576f = Arrays.copyOf(objArr, length);
                    this.f35616d = Arrays.copyOf(this.f35616d, length);
                }
                int i13 = this.f35613a;
                if (i12 != 0 && i12 != 1) {
                    i13 = Math.min((i13 + i12) - 1, 30);
                }
                int i14 = 1 << i13;
                this.f35576f[i12] = c(i14);
                long[] jArr = this.f35616d;
                jArr[i12] = jArr[i12 - 1] + s(this.f35576f[i10]);
                j10 += i14;
                i12++;
            }
        }
    }

    protected abstract Object[] v();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w() {
        long j6;
        if (this.f35614b == s(this.f35575e)) {
            if (this.f35576f == null) {
                Object[] v10 = v();
                this.f35576f = v10;
                this.f35616d = new long[8];
                v10[0] = this.f35575e;
            }
            int i10 = this.f35615c;
            int i11 = i10 + 1;
            Object[] objArr = this.f35576f;
            if (i11 >= objArr.length || objArr[i11] == null) {
                if (i10 == 0) {
                    j6 = s(this.f35575e);
                } else {
                    j6 = s(objArr[i10]) + this.f35616d[i10];
                }
                u(j6 + 1);
            }
            this.f35614b = 0;
            int i12 = this.f35615c + 1;
            this.f35615c = i12;
            this.f35575e = this.f35576f[i12];
        }
    }
}
