package Sg;

import Ng.Y;
import Ng.Z;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class D {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16636b = AtomicIntegerFieldUpdater.newUpdater(D.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a  reason: collision with root package name */
    public Y[] f16637a;

    public final void a(Y y10) {
        y10.d((Z) this);
        Y[] yArr = this.f16637a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16636b;
        if (yArr == null) {
            yArr = new Y[4];
            this.f16637a = yArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= yArr.length) {
            Object[] copyOf = Arrays.copyOf(yArr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            yArr = (Y[]) copyOf;
            this.f16637a = yArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        yArr[i10] = y10;
        y10.f12917Z = i10;
        e(i10);
    }

    public final Y b() {
        Y y10;
        synchronized (this) {
            Y[] yArr = this.f16637a;
            if (yArr != null) {
                y10 = yArr[0];
            } else {
                y10 = null;
            }
        }
        return y10;
    }

    public final void c(Y y10) {
        synchronized (this) {
            if (y10.a() != null) {
                d(y10.f12917Z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
        if (r6.compareTo(r7) < 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Y d(int i10) {
        Y[] yArr = this.f16637a;
        AbstractC3557B.Z(yArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16636b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            f(i10, atomicIntegerFieldUpdater.get(this));
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                Y y10 = yArr[i10];
                AbstractC3557B.Z(y10);
                Y y11 = yArr[i11];
                AbstractC3557B.Z(y11);
                if (y10.compareTo(y11) < 0) {
                    f(i10, i11);
                    e(i11);
                }
            }
            while (true) {
                int i12 = i10 * 2;
                int i13 = i12 + 1;
                if (i13 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Y[] yArr2 = this.f16637a;
                AbstractC3557B.Z(yArr2);
                int i14 = i12 + 2;
                if (i14 < atomicIntegerFieldUpdater.get(this)) {
                    Y y12 = yArr2[i14];
                    AbstractC3557B.Z(y12);
                    Y y13 = yArr2[i13];
                    AbstractC3557B.Z(y13);
                }
                i14 = i13;
                Y y14 = yArr2[i10];
                AbstractC3557B.Z(y14);
                Y y15 = yArr2[i14];
                AbstractC3557B.Z(y15);
                if (y14.compareTo(y15) <= 0) {
                    break;
                }
                f(i10, i14);
                i10 = i14;
            }
        }
        Y y16 = yArr[atomicIntegerFieldUpdater.get(this)];
        AbstractC3557B.Z(y16);
        y16.d(null);
        y16.f12917Z = -1;
        yArr[atomicIntegerFieldUpdater.get(this)] = null;
        return y16;
    }

    public final void e(int i10) {
        while (i10 > 0) {
            Y[] yArr = this.f16637a;
            AbstractC3557B.Z(yArr);
            int i11 = (i10 - 1) / 2;
            Y y10 = yArr[i11];
            AbstractC3557B.Z(y10);
            Y y11 = yArr[i10];
            AbstractC3557B.Z(y11);
            if (y10.compareTo(y11) <= 0) {
                return;
            }
            f(i10, i11);
            i10 = i11;
        }
    }

    public final void f(int i10, int i11) {
        Y[] yArr = this.f16637a;
        AbstractC3557B.Z(yArr);
        Y y10 = yArr[i11];
        AbstractC3557B.Z(y10);
        Y y11 = yArr[i10];
        AbstractC3557B.Z(y11);
        yArr[i10] = y10;
        yArr[i11] = y11;
        y10.f12917Z = i10;
        y11.f12917Z = i11;
    }
}
