package b4;

import G0.C0571a;
import com.google.android.gms.internal.play_billing.N;
import d4.AbstractC2597f;
import d4.C2595d;
import e4.C2797e;
import e4.C2801i;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n9.C4723b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wf.AbstractC6216a;
import wf.n;

/* renamed from: b4.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2125f {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2597f f25632a;

    public AbstractC2125f(C2801i c2801i) {
        this.f25632a = c2801i;
    }

    public final void a(int i10, C4723b c4723b) {
        C2801i c2801i = (C2801i) this.f25632a;
        C2797e c2797e = (C2797e) c2801i.f28968h0.get();
        if (c2797e != null) {
            if (c2797e.f28955d.add(Integer.valueOf(i10))) {
                c4723b.invoke(new C0571a(16, c2797e));
                return;
            }
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c4723b.invoke(new C2120a(linkedHashSet, 0));
        String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
        c2801i.k((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void b(C2797e c2797e, C2797e c2797e2, Throwable th2, Object obj) {
        AbstractC3557B.c0("transaction", c2797e);
        LinkedHashSet linkedHashSet = c2797e.f28955d;
        ArrayList arrayList = c2797e.f28954c;
        ArrayList arrayList2 = c2797e.f28953b;
        LinkedHashSet linkedHashSet2 = c2797e.f28956e;
        boolean z10 = false;
        if (c2797e2 == null) {
            if (c2797e.f28957f && c2797e.f28958g) {
                if (!linkedHashSet2.isEmpty()) {
                    String[] strArr = (String[]) linkedHashSet2.toArray(new String[0]);
                    ((C2801i) this.f25632a).k((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                linkedHashSet2.clear();
                linkedHashSet.clear();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC6216a) it.next()).mo122invoke();
                }
                arrayList2.clear();
            } else {
                try {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC6216a) it2.next()).mo122invoke();
                    }
                    arrayList.clear();
                } catch (Throwable th3) {
                    if (th2 != null) {
                        throw new Throwable("Exception while rolling back from an exception.\nOriginal exception: " + th2 + "\nwith cause " + th2.getCause() + "\n\nRollback exception: " + th3, th3);
                    }
                    throw th3;
                }
            }
        } else {
            if (c2797e.f28957f && c2797e.f28958g) {
                z10 = true;
            }
            c2797e2.f28958g = z10;
            c2797e2.f28953b.addAll(arrayList2);
            c2797e2.f28954c.addAll(arrayList);
            c2797e2.f28955d.addAll(linkedHashSet);
            c2797e2.f28956e.addAll(linkedHashSet2);
        }
        if (th2 == null) {
            return;
        }
        throw th2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:2|(2:4|(5:6|8|(1:(1:(1:(1:(2:14|(2:16|17)(2:18|19))(3:20|60|61))(3:21|50|51))(9:22|66|23|24|25|62|45|46|(1:48)(3:49|50|51)))(1:28))(4:29|(1:31)|32|(1:34)(1:35))|36|(3:64|41|(1:43)(6:44|25|62|45|46|(0)(0)))(2:39|40)))|7|8|(0)(0)|36|(0)|64|41|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010b, code lost:
        r13 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(boolean z10, n nVar, AbstractC4825e abstractC4825e) {
        C2124e c2124e;
        EnumC5000a enumC5000a;
        int i10;
        Throwable th2;
        Object obj;
        C2797e c2797e;
        C2797e c2797e2;
        AbstractC2125f abstractC2125f;
        C2797e c2797e3;
        C2797e c2797e4;
        AbstractC2125f abstractC2125f2;
        C2595d a5;
        C2797e c2797e5;
        Object obj2;
        C2797e c2797e6;
        AbstractC2125f abstractC2125f3;
        Object invoke;
        C2797e c2797e7;
        C2797e c2797e8;
        C2595d a10;
        if (abstractC4825e instanceof C2124e) {
            c2124e = (C2124e) abstractC4825e;
            int i11 = c2124e.f25631n0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2124e.f25631n0 = i11 - Integer.MIN_VALUE;
                Object obj3 = c2124e.f25629l0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c2124e.f25631n0;
                Object obj4 = null;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5) {
                                        Object obj5 = c2124e.f25626i0;
                                        C2797e c2797e9 = c2124e.f25625h0;
                                        AbstractC2125f abstractC2125f4 = c2124e.f25623Y;
                                        N.B0(obj3);
                                        abstractC2125f4.b((C2797e) c2124e.f25624Z, c2797e9, null, obj5);
                                        return obj5;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c2124e.f25627j0;
                                th2 = (Throwable) c2124e.f25626i0;
                                c2797e2 = c2124e.f25625h0;
                                c2797e = (C2797e) c2124e.f25624Z;
                                abstractC2125f = c2124e.f25623Y;
                                N.B0(obj3);
                                abstractC2125f.b(c2797e, c2797e2, th2, obj);
                                return obj;
                            }
                            obj2 = c2124e.f25626i0;
                            c2797e5 = c2124e.f25625h0;
                            c2797e6 = (C2797e) c2124e.f25624Z;
                            abstractC2125f3 = c2124e.f25623Y;
                            N.B0(obj3);
                            abstractC2125f3.b(c2797e6, c2797e5, null, obj2);
                            return obj2;
                        }
                        C2797e c2797e10 = c2124e.f25625h0;
                        C2797e c2797e11 = (C2797e) c2124e.f25624Z;
                        abstractC2125f2 = c2124e.f25623Y;
                        try {
                            N.B0(obj3);
                            c2797e7 = c2797e11;
                            c2797e5 = c2797e10;
                            c2797e8 = c2797e7;
                            try {
                                c2797e8.f28957f = true;
                                a10 = c2797e8.a();
                                c2124e.f25623Y = abstractC2125f2;
                                c2124e.f25624Z = c2797e8;
                                c2124e.f25625h0 = c2797e5;
                                c2124e.f25626i0 = obj3;
                                c2124e.f25631n0 = 3;
                                if (a10.f27991b != enumC5000a) {
                                    return enumC5000a;
                                }
                                c2797e6 = c2797e8;
                                obj2 = obj3;
                                abstractC2125f3 = abstractC2125f2;
                                abstractC2125f3.b(c2797e6, c2797e5, null, obj2);
                                return obj2;
                            } catch (Throwable th3) {
                                c2797e4 = c2797e5;
                                obj4 = obj3;
                                th2 = th3;
                                c2797e3 = c2797e8;
                                a5 = c2797e3.a();
                                c2124e.f25623Y = abstractC2125f2;
                                c2124e.f25624Z = c2797e3;
                                c2124e.f25625h0 = c2797e4;
                                c2124e.f25626i0 = th2;
                                c2124e.f25627j0 = obj4;
                                c2124e.f25631n0 = 4;
                                if (a5.f27991b == enumC5000a) {
                                    return enumC5000a;
                                }
                                abstractC2125f = abstractC2125f2;
                                obj = obj4;
                                c2797e2 = c2797e4;
                                c2797e = c2797e3;
                                abstractC2125f.b(c2797e, c2797e2, th2, obj);
                                return obj;
                            }
                        } catch (Throwable th4) {
                            c2797e4 = c2797e10;
                            c2797e3 = c2797e11;
                            th2 = th4;
                            a5 = c2797e3.a();
                            c2124e.f25623Y = abstractC2125f2;
                            c2124e.f25624Z = c2797e3;
                            c2124e.f25625h0 = c2797e4;
                            c2124e.f25626i0 = th2;
                            c2124e.f25627j0 = obj4;
                            c2124e.f25631n0 = 4;
                            if (a5.f27991b == enumC5000a) {
                            }
                        }
                    } else {
                        z10 = c2124e.f25628k0;
                        nVar = (n) c2124e.f25624Z;
                        abstractC2125f2 = c2124e.f25623Y;
                        N.B0(obj3);
                    }
                } else {
                    N.B0(obj3);
                    C2801i c2801i = (C2801i) this.f25632a;
                    ThreadLocal threadLocal = c2801i.f28968h0;
                    C2797e c2797e12 = (C2797e) threadLocal.get();
                    C2797e c2797e13 = new C2797e(c2801i, c2797e12);
                    threadLocal.set(c2797e13);
                    if (c2797e12 == null) {
                        c2801i.j().X();
                    }
                    c2124e.f25623Y = this;
                    c2124e.f25624Z = nVar;
                    c2124e.f25628k0 = z10;
                    c2124e.f25631n0 = 1;
                    if (c2797e13 == enumC5000a) {
                        return enumC5000a;
                    }
                    abstractC2125f2 = this;
                    obj3 = c2797e13;
                }
                c2797e3 = (C2797e) obj3;
                c2797e4 = c2797e3.f28959h;
                if (c2797e4 == null && z10) {
                    throw new IllegalStateException("Already in a transaction".toString());
                }
                Object obj6 = new Object();
                c2124e.f25623Y = abstractC2125f2;
                c2124e.f25624Z = c2797e3;
                c2124e.f25625h0 = c2797e4;
                c2124e.f25631n0 = 2;
                invoke = nVar.invoke(obj6, c2124e);
                if (invoke != enumC5000a) {
                    return enumC5000a;
                }
                c2797e5 = c2797e4;
                c2797e7 = c2797e3;
                obj3 = invoke;
                c2797e8 = c2797e7;
                c2797e8.f28957f = true;
                a10 = c2797e8.a();
                c2124e.f25623Y = abstractC2125f2;
                c2124e.f25624Z = c2797e8;
                c2124e.f25625h0 = c2797e5;
                c2124e.f25626i0 = obj3;
                c2124e.f25631n0 = 3;
                if (a10.f27991b != enumC5000a) {
                }
            }
        }
        c2124e = new C2124e(this, abstractC4825e);
        Object obj32 = c2124e.f25629l0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c2124e.f25631n0;
        Object obj42 = null;
        if (i10 == 0) {
        }
        c2797e3 = (C2797e) obj32;
        c2797e4 = c2797e3.f28959h;
        if (c2797e4 == null) {
        }
        Object obj62 = new Object();
        c2124e.f25623Y = abstractC2125f2;
        c2124e.f25624Z = c2797e3;
        c2124e.f25625h0 = c2797e4;
        c2124e.f25631n0 = 2;
        invoke = nVar.invoke(obj62, c2124e);
        if (invoke != enumC5000a) {
        }
    }
}
