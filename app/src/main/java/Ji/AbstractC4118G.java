package ji;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ji.G  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4118G {

    /* renamed from: a  reason: collision with root package name */
    public static final C4117F f36681a = new C4117F(new byte[0], 0, 0, false, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f36682b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference[] f36683c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f36682b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f36683c = atomicReferenceArr;
    }

    public static final void a(C4117F c4117f) {
        int i10;
        if (c4117f.f36679f == null && c4117f.f36680g == null) {
            if (c4117f.f36677d) {
                return;
            }
            AtomicReference atomicReference = f36683c[(int) (Thread.currentThread().getId() & (f36682b - 1))];
            C4117F c4117f2 = f36681a;
            C4117F c4117f3 = (C4117F) atomicReference.getAndSet(c4117f2);
            if (c4117f3 == c4117f2) {
                return;
            }
            if (c4117f3 != null) {
                i10 = c4117f3.f36676c;
            } else {
                i10 = 0;
            }
            if (i10 >= 65536) {
                atomicReference.set(c4117f3);
                return;
            }
            c4117f.f36679f = c4117f3;
            c4117f.f36675b = 0;
            c4117f.f36676c = i10 + 8192;
            atomicReference.set(c4117f);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final C4117F b() {
        AtomicReference atomicReference = f36683c[(int) (Thread.currentThread().getId() & (f36682b - 1))];
        C4117F c4117f = f36681a;
        C4117F c4117f2 = (C4117F) atomicReference.getAndSet(c4117f);
        if (c4117f2 == c4117f) {
            return new C4117F();
        }
        if (c4117f2 == null) {
            atomicReference.set(null);
            return new C4117F();
        }
        atomicReference.set(c4117f2.f36679f);
        c4117f2.f36679f = null;
        c4117f2.f36676c = 0;
        return c4117f2;
    }
}
