package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class r extends l {

    /* renamed from: h  reason: collision with root package name */
    private static final j$.sun.misc.a f35314h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f35315i;

    /* renamed from: e  reason: collision with root package name */
    s f35316e;

    /* renamed from: f  reason: collision with root package name */
    volatile s f35317f;

    /* renamed from: g  reason: collision with root package name */
    volatile Thread f35318g;
    volatile int lockState;

    static {
        j$.sun.misc.a h10 = j$.sun.misc.a.h();
        f35314h = h10;
        f35315i = h10.j(r.class, "lockState");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar) {
        super(-2, null, null);
        int i10;
        this.f35317f = sVar;
        s sVar2 = null;
        while (sVar != null) {
            s sVar3 = (s) sVar.f35301d;
            sVar.f35321g = null;
            sVar.f35320f = null;
            if (sVar2 == null) {
                sVar.f35319e = null;
                sVar.f35323i = false;
            } else {
                Object obj = sVar.f35299b;
                int i11 = sVar.f35298a;
                s sVar4 = sVar2;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = sVar4.f35299b;
                    int i12 = sVar4.f35298a;
                    if (i12 > i11) {
                        i10 = -1;
                    } else if (i12 < i11) {
                        i10 = 1;
                    } else {
                        if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                            int i13 = ConcurrentHashMap.f35264g;
                            int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                            if (compareTo != 0) {
                                i10 = compareTo;
                            }
                        }
                        i10 = i(obj, obj2);
                    }
                    s sVar5 = i10 <= 0 ? sVar4.f35320f : sVar4.f35321g;
                    if (sVar5 == null) {
                        break;
                    }
                    sVar4 = sVar5;
                }
                sVar.f35319e = sVar4;
                if (i10 <= 0) {
                    sVar4.f35320f = sVar;
                } else {
                    sVar4.f35321g = sVar;
                }
                sVar = c(sVar2, sVar);
            }
            sVar2 = sVar;
            sVar = sVar3;
        }
        this.f35316e = sVar2;
    }

    static s b(s sVar, s sVar2) {
        while (sVar2 != null && sVar2 != sVar) {
            s sVar3 = sVar2.f35319e;
            if (sVar3 == null) {
                sVar2.f35323i = false;
                return sVar2;
            } else if (sVar2.f35323i) {
                sVar2.f35323i = false;
                return sVar;
            } else {
                s sVar4 = sVar3.f35320f;
                s sVar5 = null;
                if (sVar4 == sVar2) {
                    sVar4 = sVar3.f35321g;
                    if (sVar4 != null && sVar4.f35323i) {
                        sVar4.f35323i = false;
                        sVar3.f35323i = true;
                        sVar = g(sVar, sVar3);
                        sVar3 = sVar2.f35319e;
                        sVar4 = sVar3 == null ? null : sVar3.f35321g;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        s sVar6 = sVar4.f35320f;
                        s sVar7 = sVar4.f35321g;
                        if ((sVar7 != null && sVar7.f35323i) || (sVar6 != null && sVar6.f35323i)) {
                            if (sVar7 == null || !sVar7.f35323i) {
                                if (sVar6 != null) {
                                    sVar6.f35323i = false;
                                }
                                sVar4.f35323i = true;
                                sVar = h(sVar, sVar4);
                                sVar3 = sVar2.f35319e;
                                if (sVar3 != null) {
                                    sVar5 = sVar3.f35321g;
                                }
                                sVar4 = sVar5;
                            }
                            if (sVar4 != null) {
                                sVar4.f35323i = sVar3 == null ? false : sVar3.f35323i;
                                s sVar8 = sVar4.f35321g;
                                if (sVar8 != null) {
                                    sVar8.f35323i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f35323i = false;
                                sVar = g(sVar, sVar3);
                            }
                            sVar2 = sVar;
                        }
                        sVar4.f35323i = true;
                        sVar2 = sVar3;
                    }
                } else {
                    if (sVar4 != null && sVar4.f35323i) {
                        sVar4.f35323i = false;
                        sVar3.f35323i = true;
                        sVar = h(sVar, sVar3);
                        sVar3 = sVar2.f35319e;
                        sVar4 = sVar3 == null ? null : sVar3.f35320f;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        s sVar9 = sVar4.f35320f;
                        s sVar10 = sVar4.f35321g;
                        if ((sVar9 != null && sVar9.f35323i) || (sVar10 != null && sVar10.f35323i)) {
                            if (sVar9 == null || !sVar9.f35323i) {
                                if (sVar10 != null) {
                                    sVar10.f35323i = false;
                                }
                                sVar4.f35323i = true;
                                sVar = g(sVar, sVar4);
                                sVar3 = sVar2.f35319e;
                                if (sVar3 != null) {
                                    sVar5 = sVar3.f35320f;
                                }
                                sVar4 = sVar5;
                            }
                            if (sVar4 != null) {
                                sVar4.f35323i = sVar3 == null ? false : sVar3.f35323i;
                                s sVar11 = sVar4.f35320f;
                                if (sVar11 != null) {
                                    sVar11.f35323i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f35323i = false;
                                sVar = h(sVar, sVar3);
                            }
                            sVar2 = sVar;
                        }
                        sVar4.f35323i = true;
                        sVar2 = sVar3;
                    }
                }
            }
        }
        return sVar;
    }

    static s c(s sVar, s sVar2) {
        s sVar3;
        sVar2.f35323i = true;
        while (true) {
            s sVar4 = sVar2.f35319e;
            if (sVar4 == null) {
                sVar2.f35323i = false;
                return sVar2;
            } else if (!sVar4.f35323i || (sVar3 = sVar4.f35319e) == null) {
                break;
            } else {
                s sVar5 = sVar3.f35320f;
                if (sVar4 == sVar5) {
                    sVar5 = sVar3.f35321g;
                    if (sVar5 == null || !sVar5.f35323i) {
                        if (sVar2 == sVar4.f35321g) {
                            sVar = g(sVar, sVar4);
                            s sVar6 = sVar4.f35319e;
                            sVar3 = sVar6 == null ? null : sVar6.f35319e;
                            sVar4 = sVar6;
                            sVar2 = sVar4;
                        }
                        if (sVar4 != null) {
                            sVar4.f35323i = false;
                            if (sVar3 != null) {
                                sVar3.f35323i = true;
                                sVar = h(sVar, sVar3);
                            }
                        }
                    } else {
                        sVar5.f35323i = false;
                        sVar4.f35323i = false;
                        sVar3.f35323i = true;
                        sVar2 = sVar3;
                    }
                } else if (sVar5 == null || !sVar5.f35323i) {
                    if (sVar2 == sVar4.f35320f) {
                        sVar = h(sVar, sVar4);
                        s sVar7 = sVar4.f35319e;
                        sVar3 = sVar7 == null ? null : sVar7.f35319e;
                        sVar4 = sVar7;
                        sVar2 = sVar4;
                    }
                    if (sVar4 != null) {
                        sVar4.f35323i = false;
                        if (sVar3 != null) {
                            sVar3.f35323i = true;
                            sVar = g(sVar, sVar3);
                        }
                    }
                } else {
                    sVar5.f35323i = false;
                    sVar4.f35323i = false;
                    sVar3.f35323i = true;
                    sVar2 = sVar3;
                }
            }
        }
        return sVar;
    }

    private final void d() {
        if (!f35314h.c(this, f35315i, 0, 1)) {
            boolean z10 = false;
            while (true) {
                int i10 = this.lockState;
                if ((i10 & (-3)) == 0) {
                    if (f35314h.c(this, f35315i, i10, 1)) {
                        break;
                    }
                } else if ((i10 & 2) == 0) {
                    if (f35314h.c(this, f35315i, i10, i10 | 2)) {
                        this.f35318g = Thread.currentThread();
                        z10 = true;
                    }
                } else if (z10) {
                    LockSupport.park(this);
                }
            }
            if (!z10) {
                return;
            }
            this.f35318g = null;
        }
    }

    static s g(s sVar, s sVar2) {
        s sVar3 = sVar2.f35321g;
        if (sVar3 != null) {
            s sVar4 = sVar3.f35320f;
            sVar2.f35321g = sVar4;
            if (sVar4 != null) {
                sVar4.f35319e = sVar2;
            }
            s sVar5 = sVar2.f35319e;
            sVar3.f35319e = sVar5;
            if (sVar5 == null) {
                sVar3.f35323i = false;
                sVar = sVar3;
            } else if (sVar5.f35320f == sVar2) {
                sVar5.f35320f = sVar3;
            } else {
                sVar5.f35321g = sVar3;
            }
            sVar3.f35320f = sVar2;
            sVar2.f35319e = sVar3;
        }
        return sVar;
    }

    static s h(s sVar, s sVar2) {
        s sVar3 = sVar2.f35320f;
        if (sVar3 != null) {
            s sVar4 = sVar3.f35321g;
            sVar2.f35320f = sVar4;
            if (sVar4 != null) {
                sVar4.f35319e = sVar2;
            }
            s sVar5 = sVar2.f35319e;
            sVar3.f35319e = sVar5;
            if (sVar5 == null) {
                sVar3.f35323i = false;
                sVar = sVar3;
            } else if (sVar5.f35321g == sVar2) {
                sVar5.f35321g = sVar3;
            } else {
                sVar5.f35320f = sVar3;
            }
            sVar3.f35321g = sVar2;
            sVar2.f35319e = sVar3;
        }
        return sVar;
    }

    static int i(Object obj, Object obj2) {
        int compareTo;
        if (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return compareTo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(Object obj, int i10) {
        Object obj2;
        Thread thread;
        Thread thread2;
        s sVar = null;
        if (obj != null) {
            l lVar = this.f35317f;
            while (lVar != null) {
                int i11 = this.lockState;
                if ((i11 & 3) == 0) {
                    j$.sun.misc.a aVar = f35314h;
                    long j6 = f35315i;
                    if (aVar.c(this, j6, i11, i11 + 4)) {
                        try {
                            s sVar2 = this.f35316e;
                            if (sVar2 != null) {
                                sVar = sVar2.b(i10, obj, null);
                            }
                            if (aVar.f(this, j6) == 6 && (thread2 = this.f35318g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return sVar;
                        } catch (Throwable th2) {
                            if (f35314h.f(this, f35315i) == 6 && (thread = this.f35318g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th2;
                        }
                    }
                } else if (lVar.f35298a == i10 && ((obj2 = lVar.f35299b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVar;
                } else {
                    lVar = lVar.f35301d;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ba, code lost:
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7 A[LOOP:0: B:3:0x000c->B:59:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s e(int i10, Object obj, Object obj2) {
        int i11;
        s sVar;
        int i12;
        s sVar2;
        s sVar3 = this.f35316e;
        Class<?> cls = null;
        boolean z10 = false;
        while (true) {
            if (sVar3 == null) {
                s sVar4 = new s(i10, obj, obj2, null, null);
                this.f35316e = sVar4;
                this.f35317f = sVar4;
                break;
            }
            int i13 = sVar3.f35298a;
            if (i13 > i10) {
                i12 = -1;
            } else {
                if (i13 < i10) {
                    i11 = 1;
                } else {
                    Object obj3 = sVar3.f35299b;
                    if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                        break;
                    }
                    if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                        int i14 = ConcurrentHashMap.f35264g;
                        int compareTo = (obj3 == null || obj3.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj3);
                        if (compareTo != 0) {
                            i11 = compareTo;
                        }
                    }
                    if (!z10) {
                        s sVar5 = sVar3.f35320f;
                        if ((sVar5 == null || (r3 = sVar5.b(i10, obj, cls)) == null) && ((sVar2 = sVar3.f35321g) == null || (r3 = sVar2.b(i10, obj, cls)) == null)) {
                            z10 = true;
                        }
                    }
                    i12 = i(obj, obj3);
                }
                sVar = i11 > 0 ? sVar3.f35320f : sVar3.f35321g;
                if (sVar != null) {
                    s sVar6 = this.f35317f;
                    s sVar7 = new s(i10, obj, obj2, sVar6, sVar3);
                    this.f35317f = sVar7;
                    if (sVar6 != null) {
                        sVar6.f35322h = sVar7;
                    }
                    if (i11 <= 0) {
                        sVar3.f35320f = sVar7;
                    } else {
                        sVar3.f35321g = sVar7;
                    }
                    if (!sVar3.f35323i) {
                        sVar7.f35323i = true;
                    } else {
                        d();
                        try {
                            this.f35316e = c(this.f35316e, sVar7);
                        } finally {
                            this.lockState = 0;
                        }
                    }
                } else {
                    sVar3 = sVar;
                }
            }
            i11 = i12;
            if (i11 > 0) {
            }
            if (sVar != null) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:33:0x0055, B:35:0x005b, B:37:0x005f, B:38:0x0062, B:39:0x0064, B:40:0x0068, B:42:0x006e, B:43:0x0070, B:46:0x007a, B:48:0x007e, B:49:0x0081, B:58:0x0091, B:61:0x0099, B:63:0x009d, B:64:0x00a0, B:65:0x00a2, B:66:0x00a8, B:69:0x00ad, B:70:0x00b1, B:72:0x00b5, B:74:0x00b9, B:76:0x00bd, B:77:0x00c0, B:79:0x00c4, B:80:0x00c6), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ad A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:33:0x0055, B:35:0x005b, B:37:0x005f, B:38:0x0062, B:39:0x0064, B:40:0x0068, B:42:0x006e, B:43:0x0070, B:46:0x007a, B:48:0x007e, B:49:0x0081, B:58:0x0091, B:61:0x0099, B:63:0x009d, B:64:0x00a0, B:65:0x00a2, B:66:0x00a8, B:69:0x00ad, B:70:0x00b1, B:72:0x00b5, B:74:0x00b9, B:76:0x00bd, B:77:0x00c0, B:79:0x00c4, B:80:0x00c6), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b5 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:33:0x0055, B:35:0x005b, B:37:0x005f, B:38:0x0062, B:39:0x0064, B:40:0x0068, B:42:0x006e, B:43:0x0070, B:46:0x007a, B:48:0x007e, B:49:0x0081, B:58:0x0091, B:61:0x0099, B:63:0x009d, B:64:0x00a0, B:65:0x00a2, B:66:0x00a8, B:69:0x00ad, B:70:0x00b1, B:72:0x00b5, B:74:0x00b9, B:76:0x00bd, B:77:0x00c0, B:79:0x00c4, B:80:0x00c6), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bd A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:33:0x0055, B:35:0x005b, B:37:0x005f, B:38:0x0062, B:39:0x0064, B:40:0x0068, B:42:0x006e, B:43:0x0070, B:46:0x007a, B:48:0x007e, B:49:0x0081, B:58:0x0091, B:61:0x0099, B:63:0x009d, B:64:0x00a0, B:65:0x00a2, B:66:0x00a8, B:69:0x00ad, B:70:0x00b1, B:72:0x00b5, B:74:0x00b9, B:76:0x00bd, B:77:0x00c0, B:79:0x00c4, B:80:0x00c6), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c0 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:33:0x0055, B:35:0x005b, B:37:0x005f, B:38:0x0062, B:39:0x0064, B:40:0x0068, B:42:0x006e, B:43:0x0070, B:46:0x007a, B:48:0x007e, B:49:0x0081, B:58:0x0091, B:61:0x0099, B:63:0x009d, B:64:0x00a0, B:65:0x00a2, B:66:0x00a8, B:69:0x00ad, B:70:0x00b1, B:72:0x00b5, B:74:0x00b9, B:76:0x00bd, B:77:0x00c0, B:79:0x00c4, B:80:0x00c6), top: B:86:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(s sVar) {
        s sVar2;
        s sVar3;
        s sVar4 = (s) sVar.f35301d;
        s sVar5 = sVar.f35322h;
        if (sVar5 == null) {
            this.f35317f = sVar4;
        } else {
            sVar5.f35301d = sVar4;
        }
        if (sVar4 != null) {
            sVar4.f35322h = sVar5;
        }
        if (this.f35317f == null) {
            this.f35316e = null;
            return true;
        }
        s sVar6 = this.f35316e;
        if (sVar6 == null || sVar6.f35321g == null || (sVar2 = sVar6.f35320f) == null || sVar2.f35320f == null) {
            return true;
        }
        d();
        try {
            s sVar7 = sVar.f35320f;
            s sVar8 = sVar.f35321g;
            if (sVar7 == null || sVar8 == null) {
                if (sVar7 == null) {
                    if (sVar8 != null) {
                        sVar7 = sVar8;
                    }
                    sVar7 = sVar;
                }
                if (sVar7 != sVar) {
                    s sVar9 = sVar.f35319e;
                    sVar7.f35319e = sVar9;
                    if (sVar9 == null) {
                        sVar6 = sVar7;
                    } else if (sVar == sVar9.f35320f) {
                        sVar9.f35320f = sVar7;
                    } else {
                        sVar9.f35321g = sVar7;
                    }
                    sVar.f35319e = null;
                    sVar.f35321g = null;
                    sVar.f35320f = null;
                }
                if (!sVar.f35323i) {
                    sVar6 = b(sVar6, sVar7);
                }
                this.f35316e = sVar6;
                if (sVar == sVar7 && (sVar3 = sVar.f35319e) != null) {
                    if (sVar != sVar3.f35320f) {
                        sVar3.f35320f = null;
                    } else if (sVar == sVar3.f35321g) {
                        sVar3.f35321g = null;
                    }
                    sVar.f35319e = null;
                }
                this.lockState = 0;
                return false;
            }
            s sVar10 = sVar8;
            while (true) {
                s sVar11 = sVar10.f35320f;
                if (sVar11 == null) {
                    break;
                }
                sVar10 = sVar11;
            }
            boolean z10 = sVar10.f35323i;
            sVar10.f35323i = sVar.f35323i;
            sVar.f35323i = z10;
            s sVar12 = sVar10.f35321g;
            s sVar13 = sVar.f35319e;
            if (sVar10 == sVar8) {
                sVar.f35319e = sVar10;
                sVar10.f35321g = sVar;
            } else {
                s sVar14 = sVar10.f35319e;
                sVar.f35319e = sVar14;
                if (sVar14 != null) {
                    if (sVar10 == sVar14.f35320f) {
                        sVar14.f35320f = sVar;
                    } else {
                        sVar14.f35321g = sVar;
                    }
                }
                sVar10.f35321g = sVar8;
                sVar8.f35319e = sVar10;
            }
            sVar.f35320f = null;
            sVar.f35321g = sVar12;
            if (sVar12 != null) {
                sVar12.f35319e = sVar;
            }
            sVar10.f35320f = sVar7;
            sVar7.f35319e = sVar10;
            sVar10.f35319e = sVar13;
            if (sVar13 == null) {
                sVar6 = sVar10;
            } else if (sVar == sVar13.f35320f) {
                sVar13.f35320f = sVar10;
            } else {
                sVar13.f35321g = sVar10;
            }
            if (sVar12 != null) {
                sVar7 = sVar12;
                if (sVar7 != sVar) {
                }
                if (!sVar.f35323i) {
                }
                this.f35316e = sVar6;
                if (sVar == sVar7) {
                    if (sVar != sVar3.f35320f) {
                    }
                    sVar.f35319e = null;
                }
                this.lockState = 0;
                return false;
            }
            sVar7 = sVar;
            if (sVar7 != sVar) {
            }
            if (!sVar.f35323i) {
            }
            this.f35316e = sVar6;
            if (sVar == sVar7) {
            }
            this.lockState = 0;
            return false;
        } catch (Throwable th2) {
            this.lockState = 0;
            throw th2;
        }
        this.lockState = 0;
        throw th2;
    }
}
