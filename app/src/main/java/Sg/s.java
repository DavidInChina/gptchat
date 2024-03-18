package Sg;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16677e = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next$volatile");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16678f = AtomicLongFieldUpdater.newUpdater(s.class, "_state$volatile");

    /* renamed from: g  reason: collision with root package name */
    public static final Q1.u f16679g = new Q1.u("REMOVE_FROZEN", 9, 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final int f16680a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16681b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16682c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f16683d;

    public s(int i10, boolean z10) {
        this.f16680a = i10;
        this.f16681b = z10;
        int i11 = i10 - 1;
        this.f16682c = i11;
        this.f16683d = new AtomicReferenceArray(i10);
        if (i11 <= 1073741823) {
            if ((i10 & i11) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16678f;
            long j6 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j6) != 0) {
                if ((2305843009213693952L & j6) == 0) {
                    return 1;
                }
                return 2;
            }
            int i10 = (int) (1073741823 & j6);
            int i11 = (int) ((1152921503533105152L & j6) >> 30);
            int i12 = this.f16682c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            boolean z10 = this.f16681b;
            AtomicReferenceArray atomicReferenceArray = this.f16683d;
            if (!z10 && atomicReferenceArray.get(i11 & i12) != null) {
                int i13 = this.f16680a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    break;
                }
            } else {
                if (f16678f.compareAndSet(this, j6, ((-1152921503533105153L) & j6) | (((i11 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i11 & i12, obj);
                    s sVar = this;
                    while ((atomicLongFieldUpdater.get(sVar) & 1152921504606846976L) != 0) {
                        sVar = sVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = sVar.f16683d;
                        int i14 = sVar.f16682c & i11;
                        Object obj2 = atomicReferenceArray2.get(i14);
                        if ((obj2 instanceof r) && ((r) obj2).f16676a == i11) {
                            atomicReferenceArray2.set(i14, obj);
                            continue;
                        } else {
                            sVar = null;
                            continue;
                        }
                        if (sVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        do {
            atomicLongFieldUpdater = f16678f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j6) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, 2305843009213693952L | j6));
        return true;
    }

    public final s c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        while (true) {
            atomicLongFieldUpdater = f16678f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 1152921504606846976L) == 0) {
                long j10 = j6 | 1152921504606846976L;
                if (atomicLongFieldUpdater.compareAndSet(this, j6, j10)) {
                    j6 = j10;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16677e;
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar != null) {
                return sVar;
            }
            s sVar2 = new s(this.f16680a * 2, this.f16681b);
            int i10 = (int) (1073741823 & j6);
            int i11 = (int) ((1152921503533105152L & j6) >> 30);
            while (true) {
                int i12 = this.f16682c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = this.f16683d.get(i13);
                if (obj == null) {
                    obj = new r(i10);
                }
                sVar2.f16683d.set(sVar2.f16682c & i10, obj);
                i10++;
            }
            atomicLongFieldUpdater.set(sVar2, (-1152921504606846977L) & j6);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, sVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16678f;
            long j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 1152921504606846976L) != 0) {
                return f16679g;
            }
            int i10 = (int) (j6 & 1073741823);
            int i11 = this.f16682c;
            int i12 = i10 & i11;
            if ((((int) ((1152921503533105152L & j6) >> 30)) & i11) == i12) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f16683d;
            Object obj = atomicReferenceArray.get(i12);
            boolean z10 = this.f16681b;
            if (obj == null) {
                if (z10) {
                    return null;
                }
            } else if (obj instanceof r) {
                return null;
            } else {
                long j10 = (i10 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j6, (j6 & (-1073741824)) | j10)) {
                    atomicReferenceArray.set(i12, null);
                    return obj;
                } else if (z10) {
                    s sVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16678f;
                        long j11 = atomicLongFieldUpdater2.get(sVar);
                        int i13 = (int) (j11 & 1073741823);
                        if ((j11 & 1152921504606846976L) != 0) {
                            sVar = sVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(sVar, j11, (j11 & (-1073741824)) | j10)) {
                                sVar.f16683d.set(sVar.f16682c & i13, null);
                                sVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (sVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
