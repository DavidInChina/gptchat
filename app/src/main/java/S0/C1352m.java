package S0;

import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: S0.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1352m {

    /* renamed from: b  reason: collision with root package name */
    public final R0.c f16040b;

    /* renamed from: a  reason: collision with root package name */
    public final R0.b f16039a = new R0.b();

    /* renamed from: c  reason: collision with root package name */
    public final P5.c f16041c = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [R0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, P5.c] */
    public C1352m() {
        ?? obj = new Object();
        obj.f15017a = R0.a.f15009a;
        obj.f15018b = R0.a.f15010b;
        obj.f15019c = 0;
        this.f16040b = obj;
    }

    public static void b(C1352m c1352m, AbstractC1356q abstractC1356q, G g10, Object obj) {
        C1350k c1350k = new C1350k(abstractC1356q);
        synchronized (c1352m.f16041c) {
            try {
                if (obj == null) {
                    C1349j c1349j = (C1349j) c1352m.f16040b.d(c1350k, new C1349j(null));
                } else {
                    C1349j c1349j2 = (C1349j) c1352m.f16039a.b(c1350k, new C1349j(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C1349j a(AbstractC1356q abstractC1356q, G g10) {
        C1349j c1349j;
        g10.getClass();
        C1350k c1350k = new C1350k(abstractC1356q);
        synchronized (this.f16041c) {
            c1349j = (C1349j) this.f16039a.a(c1350k);
            if (c1349j == null) {
                c1349j = (C1349j) this.f16040b.a(c1350k);
            }
        }
        return c1349j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC1356q abstractC1356q, G g10, C1345f c1345f, AbstractC4825e abstractC4825e) {
        C1351l c1351l;
        int i10;
        C1352m c1352m;
        C1350k c1350k;
        boolean z10;
        if (abstractC4825e instanceof C1351l) {
            c1351l = (C1351l) abstractC4825e;
            int i11 = c1351l.f16038k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1351l.f16038k0 = i11 - Integer.MIN_VALUE;
                Object obj = c1351l.f16036i0;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = c1351l.f16038k0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        z10 = c1351l.f16035h0;
                        c1350k = c1351l.f16034Z;
                        c1352m = c1351l.f16033Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    g10.getClass();
                    C1350k c1350k2 = new C1350k(abstractC1356q);
                    synchronized (this.f16041c) {
                        try {
                            C1349j c1349j = (C1349j) this.f16039a.a(c1350k2);
                            if (c1349j == null) {
                                c1349j = (C1349j) this.f16040b.a(c1350k2);
                            }
                            if (c1349j != null) {
                                return c1349j.f16031a;
                            }
                            c1351l.f16033Y = this;
                            c1351l.f16034Z = c1350k2;
                            z10 = false;
                            c1351l.f16035h0 = false;
                            c1351l.f16038k0 = 1;
                            Object invoke = c1345f.invoke(c1351l);
                            if (invoke == obj2) {
                                return obj2;
                            }
                            c1352m = this;
                            obj = invoke;
                            c1350k = c1350k2;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                synchronized (c1352m.f16041c) {
                    try {
                        if (obj == null) {
                            c1352m.f16040b.d(c1350k, new C1349j(null));
                        } else if (z10) {
                            c1352m.f16040b.d(c1350k, new C1349j(obj));
                        } else {
                            c1352m.f16039a.b(c1350k, new C1349j(obj));
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return obj;
            }
        }
        c1351l = new C1351l(this, abstractC4825e);
        Object obj3 = c1351l.f16036i0;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = c1351l.f16038k0;
        if (i10 == 0) {
        }
        synchronized (c1352m.f16041c) {
        }
    }
}
