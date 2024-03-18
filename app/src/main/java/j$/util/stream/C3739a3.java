package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3739a3 extends AbstractC3755e implements Consumer, Iterable {

    /* renamed from: e  reason: collision with root package name */
    protected Object[] f35588e = new Object[1 << 4];

    /* renamed from: f  reason: collision with root package name */
    protected Object[][] f35589f;

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long j6;
        int i10 = this.f35614b;
        Object[] objArr = this.f35588e;
        if (i10 == objArr.length) {
            if (this.f35589f == null) {
                Object[][] objArr2 = new Object[8];
                this.f35589f = objArr2;
                this.f35616d = new long[8];
                objArr2[0] = objArr;
            }
            int i11 = this.f35615c;
            int i12 = i11 + 1;
            Object[][] objArr3 = this.f35589f;
            if (i12 >= objArr3.length || objArr3[i12] == null) {
                if (i11 == 0) {
                    j6 = objArr.length;
                } else {
                    j6 = objArr3[i11].length + this.f35616d[i11];
                }
                r(j6 + 1);
            }
            this.f35614b = 0;
            int i13 = this.f35615c + 1;
            this.f35615c = i13;
            this.f35588e = this.f35589f[i13];
        }
        Object[] objArr4 = this.f35588e;
        int i14 = this.f35614b;
        this.f35614b = i14 + 1;
        objArr4[i14] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.AbstractC3755e
    public final void clear() {
        Object[][] objArr = this.f35589f;
        if (objArr != null) {
            this.f35588e = objArr[0];
            int i10 = 0;
            while (true) {
                Object[] objArr2 = this.f35588e;
                if (i10 >= objArr2.length) {
                    break;
                }
                objArr2[i10] = null;
                i10++;
            }
            this.f35589f = null;
            this.f35616d = null;
        } else {
            for (int i11 = 0; i11 < this.f35614b; i11++) {
                this.f35588e[i11] = null;
            }
        }
        this.f35614b = 0;
        this.f35615c = 0;
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.f35615c; i10++) {
            for (Object obj : this.f35589f[i10]) {
                consumer.accept(obj);
            }
        }
        for (int i11 = 0; i11 < this.f35614b; i11++) {
            consumer.accept(this.f35588e[i11]);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(long j6) {
        Object[][] objArr;
        int i10;
        int i11 = this.f35615c;
        long length = i11 == 0 ? this.f35588e.length : this.f35616d[i11] + this.f35589f[i11].length;
        if (j6 > length) {
            if (this.f35589f == null) {
                Object[][] objArr2 = new Object[8];
                this.f35589f = objArr2;
                this.f35616d = new long[8];
                objArr2[0] = this.f35588e;
            }
            int i12 = i11 + 1;
            while (j6 > length) {
                Object[][] objArr3 = this.f35589f;
                if (i12 >= objArr3.length) {
                    int length2 = objArr3.length * 2;
                    this.f35589f = (Object[][]) Arrays.copyOf(objArr3, length2);
                    this.f35616d = Arrays.copyOf(this.f35616d, length2);
                }
                int i13 = this.f35613a;
                if (i12 != 0 && i12 != 1) {
                    i13 = Math.min((i13 + i12) - 1, 30);
                }
                int i14 = 1 << i13;
                this.f35589f[i12] = new Object[i14];
                long[] jArr = this.f35616d;
                jArr[i12] = jArr[i12 - 1] + objArr[i10].length;
                length += i14;
                i12++;
            }
        }
    }

    @Override // java.lang.Iterable
    public Spliterator spliterator() {
        return new R2(this, 0, this.f35615c, 0, this.f35614b);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new C3735a(arrayList, 10));
        String obj = arrayList.toString();
        return "SpinedBuffer:" + obj;
    }
}
